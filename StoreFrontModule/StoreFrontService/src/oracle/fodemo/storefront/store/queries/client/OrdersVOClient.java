package oracle.fodemo.storefront.store.queries.client;

import oracle.fodemo.storefront.store.queries.common.OrdersVO;

import oracle.jbo.client.remote.ViewUsageImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OrdersVOClient extends ViewUsageImpl implements OrdersVO {
    /**This is the default constructor (do not remove).
     */
    public OrdersVOClient() {
    }

    public void cancelOrder() {
        Object _ret =
            getApplicationModuleProxy().riInvokeExportedMethod(this,"cancelOrder",null,null);
        return;
    }
}
