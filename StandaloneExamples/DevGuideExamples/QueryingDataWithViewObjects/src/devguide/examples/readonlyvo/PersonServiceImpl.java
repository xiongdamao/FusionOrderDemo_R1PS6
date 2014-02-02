package devguide.examples.readonlyvo;

import devguide.examples.readonlyvo.queries.PersonsImpl;

import java.util.HashMap;
import java.util.List;

import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri May 22 00:36:15 MDT 2009
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PersonServiceImpl extends ApplicationModuleImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public PersonServiceImpl() {
    }

    /**
     * Container's getter for AllPendingOrBackorderedOrders.
     * @return AllPendingOrBackorderedOrders
     */
    public ViewObjectImpl getAllPendingOrBackorderedOrders() {
        return (ViewObjectImpl)findViewObject("AllPendingOrBackorderedOrders");
    }

    /**
     * Container's getter for PersonList.
     * @return PersonList
     */
    public PersonsImpl getPersonList() {
        return (PersonsImpl)findViewObject("PersonList");
    }

    /**
     * Container's getter for OrdersToShipToCustomer.
     * @return OrdersToShipToCustomer
     */
    public ViewObjectImpl getOrdersToShipToCustomer() {
        return (ViewObjectImpl)findViewObject("OrdersToShipToCustomer");
    }

    /**
     * Container's getter for ViewLink1.
     * @return ViewLink1
     */
    public ViewLinkImpl getViewLink1() {
        return (ViewLinkImpl)findViewLink("ViewLink1");
    }

    /**
     * Sample exportable method.
     */
    public void samplePersonServiceImplExportable() {
    }

    /**
     * Sample exportable method.
     */
    public void samplePersonServiceImplExportable2(String testParam1) {
    }

    /**
     * Sample exportable method.
     */
    public List<String> samplePersonServiceImplExportable3(List<String> listParam,
                                                           String testParam1) {
        return listParam;
    }

    /**
     * Sample exportable method.
     */
    public HashMap<String, String> samplePersonServiceImplExportable4(HashMap<String, String> hashParam,
                                                                      String testParam1) {
        return hashParam;
    }
}