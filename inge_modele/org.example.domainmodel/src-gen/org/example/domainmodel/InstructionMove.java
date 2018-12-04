/**
 * generated by Xtext 2.14.0
 */
package org.example.domainmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.InstructionMove#getFrom <em>From</em>}</li>
 *   <li>{@link org.example.domainmodel.InstructionMove#getTo <em>To</em>}</li>
 *   <li>{@link org.example.domainmodel.InstructionMove#getQty <em>Qty</em>}</li>
 *   <li>{@link org.example.domainmodel.InstructionMove#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.DomainmodelPackage#getInstructionMove()
 * @model
 * @generated
 */
public interface InstructionMove extends Instruction
{
  /**
   * Returns the value of the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' attribute.
   * @see #setFrom(int)
   * @see org.example.domainmodel.DomainmodelPackage#getInstructionMove_From()
   * @model
   * @generated
   */
  int getFrom();

  /**
   * Sets the value of the '{@link org.example.domainmodel.InstructionMove#getFrom <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' attribute.
   * @see #getFrom()
   * @generated
   */
  void setFrom(int value);

  /**
   * Returns the value of the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' attribute.
   * @see #setTo(int)
   * @see org.example.domainmodel.DomainmodelPackage#getInstructionMove_To()
   * @model
   * @generated
   */
  int getTo();

  /**
   * Sets the value of the '{@link org.example.domainmodel.InstructionMove#getTo <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' attribute.
   * @see #getTo()
   * @generated
   */
  void setTo(int value);

  /**
   * Returns the value of the '<em><b>Qty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qty</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qty</em>' attribute.
   * @see #setQty(int)
   * @see org.example.domainmodel.DomainmodelPackage#getInstructionMove_Qty()
   * @model
   * @generated
   */
  int getQty();

  /**
   * Sets the value of the '{@link org.example.domainmodel.InstructionMove#getQty <em>Qty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qty</em>' attribute.
   * @see #getQty()
   * @generated
   */
  void setQty(int value);

  /**
   * Returns the value of the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter</em>' attribute.
   * @see #setFilter(int)
   * @see org.example.domainmodel.DomainmodelPackage#getInstructionMove_Filter()
   * @model
   * @generated
   */
  int getFilter();

  /**
   * Sets the value of the '{@link org.example.domainmodel.InstructionMove#getFilter <em>Filter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' attribute.
   * @see #getFilter()
   * @generated
   */
  void setFilter(int value);

} // InstructionMove