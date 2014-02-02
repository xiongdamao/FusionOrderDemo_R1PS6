package oracle.fodemo.storefront.store.queries;


import oracle.fodemo.storefront.store.queries.common.OrdersVO;

import oracle.jbo.JboException;
import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OrdersVOImpl extends ViewObjectImpl implements OrdersVO {
    /**This is the default constructor (do not remove).
     */
    public OrdersVOImpl() {
    }

    /**
     * @param orderId
     */
    public void showOrder(Long orderId){
        ViewCriteria vc = createViewCriteria();
        ViewCriteriaRow vcr = vc.createViewCriteriaRow();
        vcr.setAttribute("OrderId", "=" + orderId);
        vc.addElement(vcr);
        applyViewCriteria(vc);
        executeQuery();
    }

    /**
     * @param customerId
     * @return
     */
    public Long findShoppingCartIdForCustomer(Long customerId){
        Long shoppingCartId = null;
        Key key = new Key(new Object[]{new oracle.jbo.domain.Number(customerId),  "CART"}); 
        RowIterator ordersItr = findByAltKey("CustomerId_OrderStatusCode_AltKey", key , 1, true);
        Row row = ordersItr.first();
        if(row != null){
            shoppingCartId = ((DBSequence)row.getAttribute("OrderId")).getValue();
        }
        return shoppingCartId;
    }

    /**
     * Cancels the current order.
     * @throws JboException
     */
    public void cancelOrder() throws JboException {
        Row row = this.getCurrentRow();
        if(row != null){
            String statusCode = (String)row.getAttribute("OrderStatusCode");
            if(statusCode != null && statusCode.equalsIgnoreCase("PENDING")){
                row.setAttribute("OrderStatusCode", "CANCEL");
                this.getDBTransaction().commit();
            } else {
                throw new JboException( "You cannnot cancel and order that does not have a 'PENDING' status." );
            }
        }
    }


    /**Gets the variable value for orderCustomerId.
     * @return
     */
    public Number getorderCustomerId() {
        return (Number)ensureVariableManager().getVariableValue("orderCustomerId");
    }

    /**Sets <code>value</code> for variable orderCustomerId.
     * @param value
     */
    public void setorderCustomerId(Number value) {
        ensureVariableManager().setVariableValue("orderCustomerId", value);
    }

    /**Gets the variable value for bvOrderStatusCode.
     * @return
     */
    public String getbvOrderStatusCode() {
        return (String)ensureVariableManager().getVariableValue("bvOrderStatusCode");
    }

    /**Sets <code>value</code> for variable bvOrderStatusCode.
     * @param value
     */
    public void setbvOrderStatusCode(String value) {
        ensureVariableManager().setVariableValue("bvOrderStatusCode", value);
    }

    /**Gets the variable value for bvCustomerId.
     * @return
     */
    public Integer getbvCustomerId() {
        return (Integer)ensureVariableManager().getVariableValue("bvCustomerId");
    }

    /**Sets <code>value</code> for variable bvCustomerId.
     * @param value
     */
    public void setbvCustomerId(Integer value) {
        ensureVariableManager().setVariableValue("bvCustomerId", value);
    }
}
