/**
 * <copyright>
 *
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id$
 */

package ordersystem.impl;

import java.util.Date;

import ordersystem.InventoryItem;
import ordersystem.OrderSystemPackage;
import ordersystem.Product;
import ordersystem.Warehouse;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ordersystem.impl.InventoryItemImpl#getInStock <em>In Stock</em>}</li>
 *   <li>{@link ordersystem.impl.InventoryItemImpl#getRestockThreshold <em>Restock Threshold</em>}</li>
 *   <li>{@link ordersystem.impl.InventoryItemImpl#getNextStockDate <em>Next Stock Date</em>}</li>
 *   <li>{@link ordersystem.impl.InventoryItemImpl#getWarehouse <em>Warehouse</em>}</li>
 *   <li>{@link ordersystem.impl.InventoryItemImpl#getProduct <em>Product</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InventoryItemImpl extends EObjectImpl implements InventoryItem {
	/**
	 * The default value of the '{@link #getInStock() <em>In Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInStock()
	 * @generated
	 * @ordered
	 */
    protected static final int IN_STOCK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInStock() <em>In Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInStock()
	 * @generated
	 * @ordered
	 */
    protected int inStock = IN_STOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestockThreshold() <em>Restock Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRestockThreshold()
	 * @generated
	 * @ordered
	 */
    protected static final int RESTOCK_THRESHOLD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRestockThreshold() <em>Restock Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRestockThreshold()
	 * @generated
	 * @ordered
	 */
    protected int restockThreshold = RESTOCK_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextStockDate() <em>Next Stock Date</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNextStockDate()
	 * @generated
	 * @ordered
	 */
    protected static final Date NEXT_STOCK_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextStockDate() <em>Next Stock Date</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNextStockDate()
	 * @generated
	 * @ordered
	 */
    protected Date nextStockDate = NEXT_STOCK_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
    protected Product product = null;

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected InventoryItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected EClass eStaticClass() {
		return OrderSystemPackage.eINSTANCE.getInventoryItem();
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getInStock() {
		return inStock;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setInStock(int newInStock) {
		int oldInStock = inStock;
		inStock = newInStock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderSystemPackage.INVENTORY_ITEM__IN_STOCK, oldInStock, inStock));
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getRestockThreshold() {
		return restockThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRestockThreshold(int newRestockThreshold) {
		int oldRestockThreshold = restockThreshold;
		restockThreshold = newRestockThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderSystemPackage.INVENTORY_ITEM__RESTOCK_THRESHOLD, oldRestockThreshold, restockThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Date getNextStockDate() {
		return nextStockDate;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setNextStockDate(Date newNextStockDate) {
		Date oldNextStockDate = nextStockDate;
		nextStockDate = newNextStockDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderSystemPackage.INVENTORY_ITEM__NEXT_STOCK_DATE, oldNextStockDate, nextStockDate));
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Warehouse getWarehouse() {
		if (eContainerFeatureID != OrderSystemPackage.INVENTORY_ITEM__WAREHOUSE) return null;
		return (Warehouse)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setWarehouse(Warehouse newWarehouse) {
		if (newWarehouse != eContainer || (eContainerFeatureID != OrderSystemPackage.INVENTORY_ITEM__WAREHOUSE && newWarehouse != null)) {
			if (EcoreUtil.isAncestor(this, newWarehouse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWarehouse != null)
				msgs = ((InternalEObject)newWarehouse).eInverseAdd(this, OrderSystemPackage.WAREHOUSE__ITEM, Warehouse.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newWarehouse, OrderSystemPackage.INVENTORY_ITEM__WAREHOUSE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderSystemPackage.INVENTORY_ITEM__WAREHOUSE, newWarehouse, newWarehouse));
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Product getProduct() {
		if (product != null && product.eIsProxy()) {
			Product oldProduct = product;
			product = (Product)eResolveProxy((InternalEObject)product);
			if (product != oldProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderSystemPackage.INVENTORY_ITEM__PRODUCT, oldProduct, product));
			}
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Product basicGetProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setProduct(Product newProduct) {
		Product oldProduct = product;
		product = newProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderSystemPackage.INVENTORY_ITEM__PRODUCT, oldProduct, product));
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case OrderSystemPackage.INVENTORY_ITEM__WAREHOUSE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, OrderSystemPackage.INVENTORY_ITEM__WAREHOUSE, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case OrderSystemPackage.INVENTORY_ITEM__WAREHOUSE:
					return eBasicSetContainer(null, OrderSystemPackage.INVENTORY_ITEM__WAREHOUSE, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case OrderSystemPackage.INVENTORY_ITEM__WAREHOUSE:
					return (eContainer).eInverseRemove(this, OrderSystemPackage.WAREHOUSE__ITEM, Warehouse.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return (eContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case OrderSystemPackage.INVENTORY_ITEM__IN_STOCK:
				return new Integer(getInStock());
			case OrderSystemPackage.INVENTORY_ITEM__RESTOCK_THRESHOLD:
				return new Integer(getRestockThreshold());
			case OrderSystemPackage.INVENTORY_ITEM__NEXT_STOCK_DATE:
				return getNextStockDate();
			case OrderSystemPackage.INVENTORY_ITEM__WAREHOUSE:
				return getWarehouse();
			case OrderSystemPackage.INVENTORY_ITEM__PRODUCT:
				if (resolve) return getProduct();
				return basicGetProduct();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case OrderSystemPackage.INVENTORY_ITEM__IN_STOCK:
				setInStock(((Integer)newValue).intValue());
				return;
			case OrderSystemPackage.INVENTORY_ITEM__RESTOCK_THRESHOLD:
				setRestockThreshold(((Integer)newValue).intValue());
				return;
			case OrderSystemPackage.INVENTORY_ITEM__NEXT_STOCK_DATE:
				setNextStockDate((Date)newValue);
				return;
			case OrderSystemPackage.INVENTORY_ITEM__WAREHOUSE:
				setWarehouse((Warehouse)newValue);
				return;
			case OrderSystemPackage.INVENTORY_ITEM__PRODUCT:
				setProduct((Product)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case OrderSystemPackage.INVENTORY_ITEM__IN_STOCK:
				setInStock(IN_STOCK_EDEFAULT);
				return;
			case OrderSystemPackage.INVENTORY_ITEM__RESTOCK_THRESHOLD:
				setRestockThreshold(RESTOCK_THRESHOLD_EDEFAULT);
				return;
			case OrderSystemPackage.INVENTORY_ITEM__NEXT_STOCK_DATE:
				setNextStockDate(NEXT_STOCK_DATE_EDEFAULT);
				return;
			case OrderSystemPackage.INVENTORY_ITEM__WAREHOUSE:
				setWarehouse((Warehouse)null);
				return;
			case OrderSystemPackage.INVENTORY_ITEM__PRODUCT:
				setProduct((Product)null);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case OrderSystemPackage.INVENTORY_ITEM__IN_STOCK:
				return inStock != IN_STOCK_EDEFAULT;
			case OrderSystemPackage.INVENTORY_ITEM__RESTOCK_THRESHOLD:
				return restockThreshold != RESTOCK_THRESHOLD_EDEFAULT;
			case OrderSystemPackage.INVENTORY_ITEM__NEXT_STOCK_DATE:
				return NEXT_STOCK_DATE_EDEFAULT == null ? nextStockDate != null : !NEXT_STOCK_DATE_EDEFAULT.equals(nextStockDate);
			case OrderSystemPackage.INVENTORY_ITEM__WAREHOUSE:
				return getWarehouse() != null;
			case OrderSystemPackage.INVENTORY_ITEM__PRODUCT:
				return product != null;
		}
		return eDynamicIsSet(eFeature);
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     */
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(32);
        
        result.append("InventoryItem["); //$NON-NLS-1$
        result.append(inStock);
        
        if (product != null ) {
            result.append(' ');
            result.append(product.getName());
        }
        
        result.append(", min "); //$NON-NLS-1$
        result.append(restockThreshold);
        
        if (nextStockDate != null) {
            result.append(", re-stock on "); //$NON-NLS-1$
            result.append(nextStockDate);
        }
        
        result.append(']');
        
        return result.toString();
    }

} //InventoryItemImpl
