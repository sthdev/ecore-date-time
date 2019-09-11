/**
 */
package io.github.sthdev.ecoretime.core.ecoretime;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 *
 * @see       io.github.sthdev.ecoretime.core.ecoretime.EcoreTimePackage
 * @generated
 */
public interface EcoreTimeFactory extends EFactory {

	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	EcoreTimeFactory eINSTANCE = io.github.sthdev.ecoretime.core.ecoretime.impl.EcoreTimeFactoryImpl.init();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return    the package supported by this factory.
	 * @generated
	 */
	EcoreTimePackage getEcoreTimePackage();

} // EcoreTimeFactory
