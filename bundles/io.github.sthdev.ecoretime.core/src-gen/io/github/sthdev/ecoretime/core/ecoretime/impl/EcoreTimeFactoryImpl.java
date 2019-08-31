/**
 */
package io.github.sthdev.ecoretime.core.ecoretime.impl;

import io.github.sthdev.ecoretime.core.ecoretime.*;

import java.time.LocalDate;
import java.time.LocalTime;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class EcoreTimeFactoryImpl extends EFactoryImpl implements EcoreTimeFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static EcoreTimeFactory init() {
		try {
			EcoreTimeFactory theEcoreTimeFactory = (EcoreTimeFactory) EPackage.Registry.INSTANCE
					.getEFactory(EcoreTimePackage.eNS_URI);
			if (theEcoreTimeFactory != null) {
				return theEcoreTimeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcoreTimeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public EcoreTimeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case EcoreTimePackage.LOCAL_DATE:
			return createLocalDateFromString(eDataType, initialValue);
		case EcoreTimePackage.LOCAL_TIME:
			return createLocalTimeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case EcoreTimePackage.LOCAL_DATE:
			return convertLocalDateToString(eDataType, instanceValue);
		case EcoreTimePackage.LOCAL_TIME:
			return convertLocalTimeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public LocalDate createLocalDateFromString(EDataType eDataType, String initialValue) {
		return initialValue != null && !initialValue.isEmpty() ? LocalDate.parse(initialValue) : null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public String convertLocalDateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue != null ? ((LocalDate) instanceValue).toString() : null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not 
	 */
	public LocalTime createLocalTimeFromString(EDataType eDataType, String initialValue) {
		return initialValue != null && !initialValue.isEmpty() ? LocalTime.parse(initialValue) : null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public String convertLocalTimeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue != null ? ((LocalTime) instanceValue).toString() : null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EcoreTimePackage getEcoreTimePackage() {
		return (EcoreTimePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcoreTimePackage getPackage() {
		return EcoreTimePackage.eINSTANCE;
	}

} // EcoreTimeFactoryImpl
