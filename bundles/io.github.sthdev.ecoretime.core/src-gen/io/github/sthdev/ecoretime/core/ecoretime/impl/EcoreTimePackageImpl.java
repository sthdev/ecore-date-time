/**
 */
package io.github.sthdev.ecoretime.core.ecoretime.impl;

import java.time.LocalDate;
import java.time.LocalTime;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import io.github.sthdev.ecoretime.core.ecoretime.EcoreTimeFactory;
import io.github.sthdev.ecoretime.core.ecoretime.EcoreTimePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class EcoreTimePackageImpl extends EPackageImpl implements EcoreTimePackage {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EDataType localDateEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EDataType localTimeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method
	 * {@link #init init()}, which also performs initialization of the package, or
	 * returns the registered package, if one already exists. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see       org.eclipse.emf.ecore.EPackage.Registry
	 * @see       io.github.sthdev.ecoretime.core.ecoretime.EcoreTimePackage#eNS_URI
	 * @see       #init()
	 * @generated
	 */
	private EcoreTimePackageImpl() {
		super(eNS_URI, EcoreTimeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and
	 * for any others upon which it depends.
	 * <p>
	 * This method is used to initialize {@link EcoreTimePackage#eINSTANCE} when
	 * that field is accessed. Clients should not invoke it directly. Instead, they
	 * should simply access that field to obtain the package. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see       #eNS_URI
	 * @see       #createPackageContents()
	 * @see       #initializePackageContents()
	 * @generated
	 */
	public static EcoreTimePackage init() {
		if (isInited) {
			return (EcoreTimePackage) EPackage.Registry.INSTANCE.getEPackage(EcoreTimePackage.eNS_URI);
		}

		// Obtain or create and register package
		Object registeredEcoreTimePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EcoreTimePackageImpl theEcoreTimePackage = registeredEcoreTimePackage instanceof EcoreTimePackageImpl
				? (EcoreTimePackageImpl) registeredEcoreTimePackage
				: new EcoreTimePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEcoreTimePackage.createPackageContents();

		// Initialize created meta-data
		theEcoreTimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcoreTimePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcoreTimePackage.eNS_URI, theEcoreTimePackage);
		return theEcoreTimePackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EDataType getLocalDate() {
		return localDateEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EDataType getLocalTime() {
		return localTimeEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EcoreTimeFactory getEcoreTimeFactory() {
		return (EcoreTimeFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) {
			return;
		}
		isCreated = true;

		// Create data types
		localDateEDataType = createEDataType(LOCAL_DATE);
		localTimeEDataType = createEDataType(LOCAL_TIME);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This method is
	 * guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) {
			return;
		}
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Initialize data types
		initEDataType(localDateEDataType, LocalDate.class, "LocalDate", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(localTimeEDataType, LocalTime.class, "LocalTime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // EcoreTimePackageImpl
