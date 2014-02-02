package devguide.advanced.storedproc.common;

import devguide.advanced.storedproc.DateAndStringBean;

import oracle.jbo.ApplicationModule;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;

// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---------------------------------------------------------------------
public interface StoredProcTestModule extends ApplicationModule {
    void callProcWithThreeArgs(Number n, Date d, String v);

    DateAndStringBean callProcWithOutArgs(Number n, String v);

    void callProcWithNoArgs();

    String callFuncWithThreeArgs(Number n, Date d, String v);
}
