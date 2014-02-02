package oracle.fodemo.storefront.lookups;

import oracle.fodemo.storefront.adfextensions.FODApplicationModuleImpl;
import oracle.fodemo.storefront.lookups.common.LookupServiceAM;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Nov 12 17:00:23 MST 2008
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class LookupServiceAMImpl extends FODApplicationModuleImpl implements LookupServiceAM {
    /**
     * This is the default constructor (do not remove).
     */
    public LookupServiceAMImpl() {
    }
    
//    private Long theHelpId;

    /**
     * Container's getter for AddressOwnerTypes.
     * @return AddressOwnerTypes
     */
    public ViewObjectImpl getAddressOwnerTypes() {
        return (ViewObjectImpl)findViewObject("AddressOwnerTypes");
    }

    /**
     * Container's getter for AddressUsageTypes.
     * @return AddressUsageTypes
     */
    public ViewObjectImpl getAddressUsageTypes() {
        return (ViewObjectImpl)findViewObject("AddressUsageTypes");
    }

    /**
     * Container's getter for ContactMethodTypes.
     * @return ContactMethodTypes
     */
    public ViewObjectImpl getContactMethodTypes() {
        return (ViewObjectImpl)findViewObject("ContactMethodTypes");
    }

    /**
     * Container's getter for CreditCardTypes.
     * @return CreditCardTypes
     */
    public ViewObjectImpl getCreditCardTypes() {
        return (ViewObjectImpl)findViewObject("CreditCardTypes");
    }

    /**
     * Container's getter for DiscountTypes.
     * @return DiscountTypes
     */
    public ViewObjectImpl getDiscountTypes() {
        return (ViewObjectImpl)findViewObject("DiscountTypes");
    }

    /**
     * Container's getter for GenderTypes.
     * @return GenderTypes
     */
    public ViewObjectImpl getGenderTypes() {
        return (ViewObjectImpl)findViewObject("GenderTypes");
    }

    /**
     * Container's getter for IdentificationTypes.
     * @return IdentificationTypes
     */
    public ViewObjectImpl getIdentificationTypes() {
        return (ViewObjectImpl)findViewObject("IdentificationTypes");
    }

    /**
     * Container's getter for MaritalStatusTypes.
     * @return MaritalStatusTypes
     */
    public ViewObjectImpl getMaritalStatusTypes() {
        return (ViewObjectImpl)findViewObject("MaritalStatusTypes");
    }

    /**
     * Container's getter for MembershipTypes.
     * @return MembershipTypes
     */
    public ViewObjectImpl getMembershipTypes() {
        return (ViewObjectImpl)findViewObject("MembershipTypes");
    }

    /**
     * Container's getter for OrderStatusTypes.
     * @return OrderStatusTypes
     */
    public ViewObjectImpl getOrderStatusTypes() {
        return (ViewObjectImpl)findViewObject("OrderStatusTypes");
    }

    /**
     * Container's getter for PaymentTypes.
     * @return PaymentTypes
     */
    public ViewObjectImpl getPaymentTypes() {
        return (ViewObjectImpl)findViewObject("PaymentTypes");
    }

    /**
     * Container's getter for PersonTitleTypes.
     * @return PersonTitleTypes
     */
    public ViewObjectImpl getPersonTitleTypes() {
        return (ViewObjectImpl)findViewObject("PersonTitleTypes");
    }

    /**
     * Container's getter for PersonTypes.
     * @return PersonTypes
     */
    public ViewObjectImpl getPersonTypes() {
        return (ViewObjectImpl)findViewObject("PersonTypes");
    }

    /**
     * Container's getter for ShippingClassTypes.
     * @return ShippingClassTypes
     */
    public ViewObjectImpl getShippingClassTypes() {
        return (ViewObjectImpl)findViewObject("ShippingClassTypes");
    }

    /**
     * Container's getter for VerificationTypes.
     * @return VerificationTypes
     */
    public ViewObjectImpl getVerificationTypes() {
        return (ViewObjectImpl)findViewObject("VerificationTypes");
    }

    /**
     * Container's getter for AllAddresses.
     * @return AllAddresses
     */
    public ViewObjectImpl getAllAddresses() {
        return (ViewObjectImpl)findViewObject("AllAddresses");
    }

    /**
     * Container's getter for BillingAddresses.
     * @return BillingAddresses
     */
    public ViewObjectImpl getBillingAddresses() {
        return (ViewObjectImpl)findViewObject("BillingAddresses");
    }

    /**
     * Container's getter for ShippingAddresses.
     * @return ShippingAddresses
     */
    public ViewObjectImpl getShippingAddresses() {
        return (ViewObjectImpl)findViewObject("ShippingAddresses");
    }

    /**
     * Container's getter for Countries.
     * @return Countries
     */
    public ViewObjectImpl getCountries() {
        return (ViewObjectImpl)findViewObject("Countries");
    }

    /**
     * Container's getter for HelpTranslations.
     * @return HelpTranslations
     */
    public ViewObjectImpl getHelpTranslations() {
        return (ViewObjectImpl)findViewObject("HelpTranslations");
    }

    /**
     * @param helpId
     * @return
     */
    public String findHelpTextById(Long helpId){
        ViewObjectImpl helpVO = this.getHelpTranslations();
        ViewCriteria vc = helpVO.createViewCriteria();
        ViewCriteriaRow vcr = vc.createViewCriteriaRow();
        vcr.setAttribute("HelpTranslationsId", "=" + helpId);
        vc.addElement(vcr);
        RowIterator helpItr =
        helpVO.findByViewCriteria(vc, -1, ViewObject.QUERY_MODE_SCAN_DATABASE_TABLES);
        Row helpRow = helpItr.first();
        return helpRow.getAttribute("HelpText").toString();
    }

    /**
     * @param usage
     * @return
     */
    public Long setHelpId(String usage){
        ViewObjectImpl helpVO = this.getHelpTranslations();
        ViewCriteria vc = helpVO.createViewCriteria();
        ViewCriteriaRow vcr = vc.createViewCriteriaRow();
        vcr.setAttribute("HelpUsage", "=" + usage);
        vc.addElement(vcr);
        RowIterator helpItr =
        helpVO.findByViewCriteria(vc, -1, ViewObject.QUERY_MODE_SCAN_DATABASE_TABLES);
        Row helpRow = helpItr.first();
        return (Long)helpRow.getAttribute("HelpId");   
    }
}
