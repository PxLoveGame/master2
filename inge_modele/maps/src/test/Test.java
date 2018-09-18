package test;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;

import racine.maps.*;
import racine.maps.MapsPackage;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Je charge l'instance map.xmi du méta-modèle maps.ecore
		Resource resource = chargerModele("model/Map.xmi", MapsPackage.eINSTANCE);
		if (resource == null)
			System.err.println(" Erreur de chargement du modèle");

		// Instruction récupérant le modèle sous forme d'arbre à partir de la classe
		// racine "map"
		Map maMap = (Map) resource.getContents().get(0);

		System.out.println("Map : ");
		System.out.println(maMap.getName());
		
		
		System.out.println("====== 1 ======");
		printNameOfStreet(maMap);
		System.out.println("====== 2 ======");
		getPredestrianStreetOver1000m(maMap);
		System.out.println("====== 3 ======");
		getNameOfAdjacentStreets(maMap, "rue joffre");
		System.out.println("====== 4 ======");
		getBorderStreetsNameOfSquare(maMap, "Esplanade");
		

	}

	public static void printNameOfStreet(Map map) {
		EList<Road> roads = map.getRoad();

		for (Road road : roads) {
			System.out.println(road.getName());
		}
	}

	public static void getPredestrianStreetOver1000m(Map map){
		EList<Road> roads = map.getRoad();
		
		for(Road road : roads) {
			if(road instanceof Predestrian && road.getLenght() >= 1000) {
				System.out.println(road.getName());
			}
		}	
	}

	public static void getNameOfAdjacentStreets(Map map, String name) {
		
		EList<Road> roads = map.getRoad();		
		for(Road road : roads) {
			if(road.getName().equals(name)) {
				for(Road adjacentRoad : road.getMeet()) {
					System.out.println(adjacentRoad.getName());
				}
			}
		}
	}

	public static void getBorderStreetsNameOfSquare(Map map, String name) {
		EList<PublicSpace> publicSpaces = map.getPublicspace();		
		for(PublicSpace publicSpace : publicSpaces) {
			
			if(publicSpace instanceof Square && publicSpace.getName().equals(name)) {
				for(Road borderRoad : publicSpace.getBorderedBy()) {
					System.out.println(borderRoad.getName());
				}
			}
		}
	}

	public static Resource chargerModele(String uri, EPackage pack) {
		Resource resource = null;
		try {
			URI uriUri = URI.createURI(uri);
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
			resource = (new ResourceSetImpl()).createResource(uriUri);
			XMLResource.XMLMap xmlMap = new XMLMapImpl();
			xmlMap.setNoNamespacePackage(pack);
			java.util.Map options = new java.util.HashMap();
			options.put(XMLResource.OPTION_XML_MAP, xmlMap);
			resource.load(options);
		} catch (Exception e) {
			System.err.println("ERREUR chargement du modèle : " + e);
			e.printStackTrace();
		}
		return resource;
	}

}