package devguide.advanced.customprops.common;

import java.io.Serializable;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---------------------------------------------------------------------
public interface ProductModule extends ApplicationModule {
    void setAppModuleCustomProperty(String name, Serializable value);

    Products useProducts();
}