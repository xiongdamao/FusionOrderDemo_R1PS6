package devguide.advanced.baseproject.extsub.client;

import devguide.advanced.baseproject.extsub.common.ProductsByName;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ProductsByNameClient extends ProductsClient implements ProductsByName {
    /**This is the default constructor (do not remove).
     */
    public ProductsByNameClient() {
    }


    public void settheProductName(String value) {
        Object _ret = 
            getApplicationModuleProxy().riInvokeExportedMethod(this,"settheProductName",new String [] {"java.lang.String"},new Object[] {value});
        return;
    }

    public String gettheProductName() {
        Object _ret = 
            getApplicationModuleProxy().riInvokeExportedMethod(this,"gettheProductName",null,null);
        return (String)_ret;
    }
}
