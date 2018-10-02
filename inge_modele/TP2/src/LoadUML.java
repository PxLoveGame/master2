

import org.eclipse.emf.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;

import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Operation;
//import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;




public class LoadUML {

	private static UMLFactory factory = UMLFactory.eINSTANCE;
	
	public static void main(String[] args) {

			
		
		//Instruction récupérant le modèle sous forme d'arbre à partir de la classe racine "Model"
		Model umlP = chargerModele("model/model_papyrus.uml");
		
		// initial
		String nomModele=  umlP.getName();		
		System.out.println("Ton modèle se nomme: \""+nomModele+"\"");
		
		//Modifier le nom du modèle UML
		umlP.setName("NewModelName");
		System.out.println("\""+nomModele+"\" Changé ! Le modèle se nomme: \""+umlP.getName()+"\"");
			
		System.out.println("~~~~~~~~~");
		
		//Deplacer une classe d'un package à l'autre
		Package source_package = (Package) umlP.getPackagedElement("src1");
		Package dest_package = (Package) umlP.getPackagedElement("src2");
		Class c = findClassInPackage("Class1", source_package);
		System.out.println("~~ Avant ~~");
		System.out.println("Le dossier source est : " + source_package.getLabel());
		
		EList<Element> elements = source_package.getOwnedElements();
		System.out.println("Il contient : " + elements.toString());
		
		System.out.println("Le dossier de destination est  :" + dest_package.getLabel());
		System.out.println("Il contient : " + dest_package.getOwnedElements().toString());
		
		moveClassToPackage(c,dest_package);
		
		System.out.println("~~ Apres ~~");
		System.out.println("Le dossier source est : " + source_package.getLabel());
		System.out.println("Il contient : " + source_package.getOwnedElements().toString());
		
		System.out.println("Le dossier de destination est  :" + dest_package.getLabel());
		System.out.println("Il contient : " + dest_package.getOwnedElements().toString());
		
		System.out.println("~~~~~~~~~");
		
		//Changer visibilité attribut
		
		Property attribut = findProperty("attribut", c);
		System.out.println("~~ Avant ~~");
		printAttribut(attribut, c);
		
		replacePublicToPrivateAttribute(attribut);
		
		System.out.println("~~ Apres ~~");
		printAttribut(attribut,c);
		
		System.out.println("~~~~~~~~~");
		
		// Deplacer une methode d'une classe fille a une classe parent 
		
		Class parentClass = findClassInPackage("Class1_parent", source_package);
		System.out.println("~~ Avant ~~");
		printClass(c);
		printClass(parentClass);
		
		moveMethodToSuperClass(c,parentClass,"getattribut");
		
		System.out.println("~~ Apres ~~");
		printClass(c);
		printClass(parentClass);
		
		
		//Sauvegarder le modèle avec son nouveau nom
		sauverModele("model/changerNom.uml", umlP);
		
	}
	
	public static void moveClassToPackage(Class c, Package target) {
		target.getPackagedElements().add(c);
	}
	
	public static Class findClassInPackage(String name, Package p) {
		Class c  = null;
		for(PackageableElement pd:p.getPackagedElements()) {
			if(pd instanceof Class) {
				Class pdc = (Class) pd;
				if(pdc.getName().equals(name)) {
					return pdc;
				}
				else if(pd instanceof Package) {
					Package pdp = (Package) pd;
					c = findClassInPackage(name,pdp);
					if(c != null)
					{ 
						return c;
					}
				}
			}
		}
		return c;
	}

	public static void moveMethodToSuperClass(Class origineClass, Class superClass, String methodName) {
		EList<Operation> methods = origineClass.getOwnedOperations();
		Operation method = null;
		
		for(Operation m : methods) {
			if(m.getName().equals(methodName)) {
				method = m;
			}
		}
		
		EList<Generalization> generalizations = origineClass.getGeneralizations();
		
		for(Generalization g : generalizations) {
			Classifier general = g.getGeneral();
			if(general.equals(superClass)) {
				superClass.getOwnedOperations().add(method);
			}
		}
	}
	
	public static Package findPackageInPackage(String name, Package p) {
		Package result = null;
		for(PackageableElement pd: p.getPackagedElements()) {
			if(pd instanceof Package) {
				Package pdp = (Package) pd;
				if(pdp.getName().equals(name)) {
					return pdp;
				}
				result = findPackageInPackage(name,pdp);
				if(result != null) {
					return result;
				}
			}
		}
		return result;
	}
	
	public static Property findProperty(String name, Class c) {
		for(Property p : c.allAttributes()) {
			if(p.getName().equals(name)) {
				return p;
			}
		}
		return null;
	}
	
	public static void replacePublicToPrivateAttribute(Property p) {
		
		Class owningClass = (Class) p.getOwner();
		if(owningClass != null && p.getVisibility().equals(VisibilityKind.PUBLIC_LITERAL)) {
			p.setVisibility(VisibilityKind.PRIVATE_LITERAL);
			
			Parameter returnParam = factory.createParameter();
			Type returnType = p.getType();
			returnParam.setDirection(ParameterDirectionKind.RETURN_LITERAL);
			returnParam.setType(returnType);
			returnParam.setLower(p.getLower());
			returnParam.setUpper(p.getUpper());
			
			Operation getter = factory.createOperation();
			getter.setName("get" + p.getName());
			getter.getOwnedParameters().add(returnParam);
			getter.setVisibility(VisibilityKind.PUBLIC_LITERAL);
			
			
			Parameter param = factory.createParameter();
			param.setName(p.getName());
			param.setType(p.getType());
			param.setLower(p.getLower());
			param.setUpper(p.getUpper());
			param.setDirection(ParameterDirectionKind.IN_LITERAL);
			
			Operation setter = factory.createOperation();
			setter.getOwnedParameters().add(param);
			setter.setVisibility(VisibilityKind.PUBLIC_LITERAL);
			setter.setName("set" + p.getName());
			
			owningClass.getOwnedOperations().add(getter);
			owningClass.getOwnedOperations().add(setter);
		}
	}
	
	public static void sauverModele(String uri, EObject root) {
		   Resource resource = null;
		   try {
		      URI uriUri = URI.createURI(uri);
		      Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		      resource = (new ResourceSetImpl()).createResource(uriUri);
		      resource.getContents().add(root);
		      resource.save(null);
		   } catch (Exception e) {
		      System.err.println("ERREUR sauvegarde du modèle : "+e);
		      e.printStackTrace();
		   }
		}

	public static Model chargerModele(String uri) {
		   Resource resource = null;
		   EPackage pack=UMLPackage.eINSTANCE;
		   try {
		      URI uriUri = URI.createURI(uri);
		      Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("uml", new XMIResourceFactoryImpl());
		      resource = (new ResourceSetImpl()).createResource(uriUri);
		      XMLResource.XMLMap xmlMap = new XMLMapImpl();
		      xmlMap.setNoNamespacePackage(pack);
		      java.util.Map options = new java.util.HashMap();
		      options.put(XMLResource.OPTION_XML_MAP, xmlMap);
		      resource.load(options);
		   }
		   catch(Exception e) {
		      System.err.println("ERREUR chargement du modèle : "+e);
		      e.printStackTrace();
		   }
		   return (Model) resource.getContents().get(0);
		}

	public static void printAttribut(Property p, Class c) {
		System.out.println("L'attribut : " + p.getName() + " à pour visibilité : " + p.getVisibility());
		System.out.println("C'est un attribut de la classe : " + c.getName());
		System.out.println("Les methodes définie sur la classe sont : " + c.getOwnedOperations().toString());
	}
	
	public static void printClass(Class c) {
		System.out.println("Classe : " + c.getName());
		System.out.println("Les methodes définie sur la classe sont : " + c.getOwnedOperations().toString());
	}
}
