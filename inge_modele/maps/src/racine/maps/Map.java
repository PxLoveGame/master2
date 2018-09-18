/**
 */
package racine.maps;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link racine.maps.Map#getName <em>Name</em>}</li>
 *   <li>{@link racine.maps.Map#getRoad <em>Road</em>}</li>
 *   <li>{@link racine.maps.Map#getPublicspace <em>Publicspace</em>}</li>
 * </ul>
 *
 * @see racine.maps.MapsPackage#getMap()
 * @model
 * @generated
 */
public interface Map extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see racine.maps.MapsPackage#getMap_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link racine.maps.Map#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Road</b></em>' containment reference list.
	 * The list contents are of type {@link racine.maps.Road}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Road</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Road</em>' containment reference list.
	 * @see racine.maps.MapsPackage#getMap_Road()
	 * @model containment="true"
	 * @generated
	 */
	EList<Road> getRoad();

	/**
	 * Returns the value of the '<em><b>Publicspace</b></em>' containment reference list.
	 * The list contents are of type {@link racine.maps.PublicSpace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publicspace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publicspace</em>' containment reference list.
	 * @see racine.maps.MapsPackage#getMap_Publicspace()
	 * @model containment="true"
	 * @generated
	 */
	EList<PublicSpace> getPublicspace();

} // Map
