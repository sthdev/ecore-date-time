/**
 */
package io.github.sthdev.ecoretime.core.ecoretime;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see       io.github.sthdev.ecoretime.core.ecoretime.EcoreTimeFactory
 * @model     kind="package"
 * @generated
 */
public interface EcoreTimePackage extends EPackage {

	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "ecoretime";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.github.io/sthdev/ecoretime/1.0";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "io.github.sthdev.ecoretime";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	EcoreTimePackage eINSTANCE = io.github.sthdev.ecoretime.core.ecoretime.impl.EcoreTimePackageImpl.init();

	/**
	 * The meta object id for the '<em>Local Date</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see       java.time.LocalDate
	 * @see       io.github.sthdev.ecoretime.core.ecoretime.impl.EcoreTimePackageImpl#getLocalDate()
	 * @generated
	 */
	int LOCAL_DATE = 0;

	/**
	 * The meta object id for the '<em>Local Time</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see       java.time.LocalTime
	 * @see       io.github.sthdev.ecoretime.core.ecoretime.impl.EcoreTimePackageImpl#getLocalTime()
	 * @generated
	 */
	int LOCAL_TIME = 1;

	/**
	 * Returns the meta object for data type '{@link java.time.LocalDate <em>Local
	 * Date</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return    the meta object for data type '<em>Local Date</em>'.
	 * @see       java.time.LocalDate
	 * @model     instanceClass="java.time.LocalDate"
	 * @generated
	 */
	EDataType getLocalDate();

	/**
	 * Returns the meta object for data type '{@link java.time.LocalTime <em>Local
	 * Time</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return    the meta object for data type '<em>Local Time</em>'.
	 * @see       java.time.LocalTime
	 * @model     instanceClass="java.time.LocalTime"
	 * @generated
	 */
	EDataType getLocalTime();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return    the factory that creates the instances of the model.
	 * @generated
	 */
	EcoreTimeFactory getEcoreTimeFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	interface Literals {

		/**
		 * The meta object literal for the '<em>Local Date</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see       java.time.LocalDate
		 * @see       io.github.sthdev.ecoretime.core.ecoretime.impl.EcoreTimePackageImpl#getLocalDate()
		 * @generated
		 */
		EDataType LOCAL_DATE = eINSTANCE.getLocalDate();

		/**
		 * The meta object literal for the '<em>Local Time</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see       java.time.LocalTime
		 * @see       io.github.sthdev.ecoretime.core.ecoretime.impl.EcoreTimePackageImpl#getLocalTime()
		 * @generated
		 */
		EDataType LOCAL_TIME = eINSTANCE.getLocalTime();

	}

} // EcoreTimePackage
