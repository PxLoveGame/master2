import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;
import org.eclipse.uml2.uml.CallEvent;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.internal.impl.FinalStateImpl;
import org.eclipse.uml2.uml.internal.impl.PseudostateImpl;
import org.eclipse.uml2.uml.internal.impl.RegionImpl;
import org.eclipse.uml2.uml.internal.impl.StateImpl;

public class TPState {
	
	private static UMLFactory factory = UMLFactory.eINSTANCE;
	
	public static void main(String[] args) {
		//Instruction récupérant le modèle sous forme d'arbre à partir de la classe racine "Model"
				Model umlP = chargerModele("../TP_State/TP_State.uml");
				
				// initial
				String nomModele=  umlP.getName();		
				System.out.println("Ton modèle se nomme: \""+nomModele+"\"");
				
				Class searchedClass = null;
				 for (NamedElement namedElement : umlP.getMembers())
                     if (namedElement instanceof Class && namedElement.getName().equals("Poulet"))
                             searchedClass = (Class) namedElement;
				
				System.out.println("Ma classe : " + searchedClass.getLabel());
				
				Collection<StateMachine> stateMachines = getStateMachines(searchedClass);
				boolean verify = false;
				for(StateMachine sm : stateMachines) {
					verify = verifyStateMachineRegion(sm);
					if(verify) {
						System.out.println("la machine à état " + sm.getLabel() + " à bien qu'une seule région !");
						getStates(sm);
						getTriggers(sm);
					} else {
						System.err.println("La machine à état " + sm.getLabel() + "possède plusieurs région !!!");
					}
				}
				
	}
	
	public static Collection<StateMachine> getStateMachines(Class searchedClass){
		Collection<StateMachine> result = new ArrayList<StateMachine>();
		
        for(Element state : searchedClass.getOwnedBehaviors()) {
        	if(state instanceof StateMachine) {
        		result.add((StateMachine) state);
        	}
        }
        
		return result;
	}
	
	public static boolean verifyStateMachineRegion(StateMachine sm) {
		return sm.getRegions().size() == 1;
	}
	
	public static Collection<Vertex> getStates(StateMachine sm){
		
		Collection<Vertex> result = new ArrayList<Vertex>();
		Region region = sm.getRegions().get(0);
		
		System.out.println("Etats : " );
		for(Element e : region.getOwnedElements()) {
			if(e instanceof PseudostateImpl || e instanceof FinalStateImpl || e instanceof StateImpl) {
				System.out.println(((Vertex) e).getName());
				result.add((Vertex) e);
			}
		}
		System.out.println("");
		return result;
	}
	
	public static Collection<Operation> getTriggers(StateMachine sm){
		Collection<Operation> result = new ArrayList<Operation>();
		Region region = sm.getRegions().get(0);
		
		System.out.println("Opérations (Triggers) : ");
		for(Transition t : region.getTransitions()) {
			for(Trigger trigger : t.getTriggers()) {
				Event ev = trigger.getEvent();
				if(ev instanceof CallEvent) {
					result.add(((CallEvent) ev).getOperation());
					System.out.println(ev.getName());
				}
			}
		}	
		System.out.println("");
		return result;
	}
	
	 public static void applyStatePattern(Class classToApplyStatePatternTo)
     {
             Collection<StateMachine> stateMachines = getStateMachines(classToApplyStatePatternTo);
             
             //System.out.print(stateMachines.toString());        
             
             for(StateMachine stateMachine : stateMachines)
             {
                     //System.out.println(checkSingleRegion(stateMachine));
                     
                     Collection<Vertex> states = getStates(stateMachine);
                     
                     Class generateSuperClass = factory.createClass();
                     generateSuperClass.setName(classToApplyStatePatternTo.getName() + "State");
                     
                     for(Vertex state : states)
                     {
                             Class generatedClass = factory.createClass();
                             generatedClass.setName(state.getName() + "State");
                             generatedClass.createGeneralization(generateSuperClass);
                             
                             System.out.print(generatedClass.getSuperClasses());
                     }
                     
                     classToApplyStatePatternTo.createOwnedAttribute("currentState", generateSuperClass);

                     //System.out.println(states.toString());
                     
                     Collection<Operation> triggerOperations = getTriggers(stateMachine);
                     
                     for(Operation triggerOperation : triggerOperations)
                     {
                             Constraint constraint = factory.createConstraint();
                             //constraint.set
                             //triggerOperation.body
                     }
                     
                     //System.out.println(triggerOperations);
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