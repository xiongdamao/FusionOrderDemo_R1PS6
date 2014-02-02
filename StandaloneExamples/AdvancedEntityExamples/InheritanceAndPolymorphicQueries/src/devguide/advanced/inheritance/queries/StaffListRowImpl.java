package devguide.advanced.inheritance.queries;

import devguide.advanced.inheritance.PersonsImpl;
import devguide.advanced.inheritance.StaffImpl;
import devguide.advanced.inheritance.queries.common.PersonListRowImpl;

import devguide.advanced.inheritance.queries.common.StaffListRow;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class StaffListRowImpl extends PersonListRowImpl implements StaffListRow {
    public static final int MAXATTRCONST = oracle.jbo.server.ViewDefImpl.getMaxAttrConst("devguide.advanced.inheritance.queries.PersonList");
    public static final int DISCOUNTELIGIBLE = MAXATTRCONST;

    public void performStaffFunction() {
       StaffImpl staff = (StaffImpl)getThePerson();
       staff.performStaffFunction();
    }
    
    /**This is the default constructor (do not remove).
     */
    public StaffListRowImpl() {
    }

    /**Gets ThePerson entity object.
     */
    public PersonsImpl getThePerson() {
        return (StaffImpl)getEntity(0);
    }

    /**Gets the attribute value for PERSON_ID using the alias name PersonId.
     */
    public Number getPersonId() {
        return super.getPersonId();
    }

    /**Sets <code>value</code> as attribute value for PERSON_ID using the alias name PersonId.
     */
    public void setPersonId(Number value) {
        super.setPersonId(value);
    }

    /**Gets the attribute value for CREDIT_LIMIT using the alias name CreditLimit.
     */
    public Number getCreditLimit() {
        return super.getCreditLimit();
    }

    /**Sets <code>value</code> as attribute value for CREDIT_LIMIT using the alias name CreditLimit.
     */
    public void setCreditLimit(Number value) {
        super.setCreditLimit(value);
    }

    /**Gets the attribute value for PRINCIPAL_NAME using the alias name PrincipalName.
     */
    public String getPrincipalName() {
        return super.getPrincipalName();
    }

    /**Sets <code>value</code> as attribute value for PRINCIPAL_NAME using the alias name PrincipalName.
     */
    public void setPrincipalName(String value) {
        super.setPrincipalName(value);
    }

    /**Gets the attribute value for DATE_OF_BIRTH using the alias name DateOfBirth.
     */
    public Date getDateOfBirth() {
        return super.getDateOfBirth();
    }

    /**Sets <code>value</code> as attribute value for DATE_OF_BIRTH using the alias name DateOfBirth.
     */
    public void setDateOfBirth(Date value) {
        super.setDateOfBirth(value);
    }

    /**Gets the attribute value for TITLE using the alias name Title.
     */
    public String getTitle() {
        return super.getTitle();
    }

    /**Sets <code>value</code> as attribute value for TITLE using the alias name Title.
     */
    public void setTitle(String value) {
        super.setTitle(value);
    }

    /**Gets the attribute value for MARITAL_STATUS_CODE using the alias name MaritalStatusCode.
     */
    public String getMaritalStatusCode() {
        return super.getMaritalStatusCode();
    }

    /**Sets <code>value</code> as attribute value for MARITAL_STATUS_CODE using the alias name MaritalStatusCode.
     */
    public void setMaritalStatusCode(String value) {
        super.setMaritalStatusCode(value);
    }

    /**Gets the attribute value for FIRST_NAME using the alias name FirstName.
     */
    public String getFirstName() {
        return super.getFirstName();
    }

    /**Sets <code>value</code> as attribute value for FIRST_NAME using the alias name FirstName.
     */
    public void setFirstName(String value) {
        super.setFirstName(value);
    }

    /**Gets the attribute value for GENDER using the alias name Gender.
     */
    public String getGender() {
        return super.getGender();
    }

    /**Sets <code>value</code> as attribute value for GENDER using the alias name Gender.
     */
    public void setGender(String value) {
        super.setGender(value);
    }

    /**Gets the attribute value for LAST_NAME using the alias name LastName.
     */
    public String getLastName() {
        return super.getLastName();
    }

    /**Sets <code>value</code> as attribute value for LAST_NAME using the alias name LastName.
     */
    public void setLastName(String value) {
        super.setLastName(value);
    }

    /**Gets the attribute value for CHILDREN_UNDER_18 using the alias name ChildrenUnder18.
     */
    public Number getChildrenUnder18() {
        return super.getChildrenUnder18();
    }

    /**Sets <code>value</code> as attribute value for CHILDREN_UNDER_18 using the alias name ChildrenUnder18.
     */
    public void setChildrenUnder18(Number value) {
        super.setChildrenUnder18(value);
    }

    /**Gets the attribute value for PERSON_TYPE_CODE using the alias name PersonTypeCode.
     */
    public String getPersonTypeCode() {
        return super.getPersonTypeCode();
    }

    /**Sets <code>value</code> as attribute value for PERSON_TYPE_CODE using the alias name PersonTypeCode.
     */
    public void setPersonTypeCode(String value) {
        super.setPersonTypeCode(value);
    }

    /**Gets the attribute value for APPROXIMATE_INCOME using the alias name ApproximateIncome.
     */
    public Number getApproximateIncome() {
        return super.getApproximateIncome();
    }

    /**Sets <code>value</code> as attribute value for APPROXIMATE_INCOME using the alias name ApproximateIncome.
     */
    public void setApproximateIncome(Number value) {
        super.setApproximateIncome(value);
    }

    /**Gets the attribute value for SUPPLIER_ID using the alias name SupplierId.
     */
    public Number getSupplierId() {
        return super.getSupplierId();
    }

    /**Sets <code>value</code> as attribute value for SUPPLIER_ID using the alias name SupplierId.
     */
    public void setSupplierId(Number value) {
        super.setSupplierId(value);
    }

    /**Gets the attribute value for CONTACT_METHOD_CODE using the alias name ContactMethodCode.
     */
    public String getContactMethodCode() {
        return super.getContactMethodCode();
    }

    /**Sets <code>value</code> as attribute value for CONTACT_METHOD_CODE using the alias name ContactMethodCode.
     */
    public void setContactMethodCode(String value) {
        super.setContactMethodCode(value);
    }

    /**Gets the attribute value for PROVISIONED_FLAG using the alias name ProvisionedFlag.
     */
    public String getProvisionedFlag() {
        return super.getProvisionedFlag();
    }

    /**Sets <code>value</code> as attribute value for PROVISIONED_FLAG using the alias name ProvisionedFlag.
     */
    public void setProvisionedFlag(String value) {
        super.setProvisionedFlag(value);
    }

    /**Gets the attribute value for CONTACTABLE_FLAG using the alias name ContactableFlag.
     */
    public String getContactableFlag() {
        return super.getContactableFlag();
    }

    /**Sets <code>value</code> as attribute value for CONTACTABLE_FLAG using the alias name ContactableFlag.
     */
    public void setContactableFlag(String value) {
        super.setContactableFlag(value);
    }

    /**Gets the attribute value for PRIMARY_ADDRESS_ID using the alias name PrimaryAddressId.
     */
    public Number getPrimaryAddressId() {
        return super.getPrimaryAddressId();
    }

    /**Sets <code>value</code> as attribute value for PRIMARY_ADDRESS_ID using the alias name PrimaryAddressId.
     */
    public void setPrimaryAddressId(Number value) {
        super.setPrimaryAddressId(value);
    }

    /**Gets the attribute value for CONTACT_BY_AFFILLIATES_FLAG using the alias name ContactByAffilliatesFlag.
     */
    public String getContactByAffilliatesFlag() {
        return super.getContactByAffilliatesFlag();
    }

    /**Sets <code>value</code> as attribute value for CONTACT_BY_AFFILLIATES_FLAG using the alias name ContactByAffilliatesFlag.
     */
    public void setContactByAffilliatesFlag(String value) {
        super.setContactByAffilliatesFlag(value);
    }

    /**Gets the attribute value for REGISTERED_DATE using the alias name RegisteredDate.
     */
    public Date getRegisteredDate() {
        return super.getRegisteredDate();
    }

    /**Sets <code>value</code> as attribute value for REGISTERED_DATE using the alias name RegisteredDate.
     */
    public void setRegisteredDate(Date value) {
        super.setRegisteredDate(value);
    }

    /**Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     */
    public String getCreatedBy() {
        return super.getCreatedBy();
    }

    /**Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     */
    public void setCreatedBy(String value) {
        super.setCreatedBy(value);
    }

    /**Gets the attribute value for MEMBERSHIP_ID using the alias name MembershipId.
     */
    public Number getMembershipId() {
        return super.getMembershipId();
    }

    /**Sets <code>value</code> as attribute value for MEMBERSHIP_ID using the alias name MembershipId.
     */
    public void setMembershipId(Number value) {
        super.setMembershipId(value);
    }

    /**Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     */
    public Date getCreationDate() {
        return super.getCreationDate();
    }

    /**Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
     */
    public void setCreationDate(Date value) {
        super.setCreationDate(value);
    }

    /**Gets the attribute value for EMAIL using the alias name Email.
     */
    public String getEmail() {
        return super.getEmail();
    }

    /**Sets <code>value</code> as attribute value for EMAIL using the alias name Email.
     */
    public void setEmail(String value) {
        super.setEmail(value);
    }

    /**Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     */
    public String getLastUpdatedBy() {
        return super.getLastUpdatedBy();
    }

    /**Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     */
    public void setLastUpdatedBy(String value) {
        super.setLastUpdatedBy(value);
    }

    /**Gets the attribute value for CONFIRMED_EMAIL using the alias name ConfirmedEmail.
     */
    public String getConfirmedEmail() {
        return super.getConfirmedEmail();
    }

    /**Sets <code>value</code> as attribute value for CONFIRMED_EMAIL using the alias name ConfirmedEmail.
     */
    public void setConfirmedEmail(String value) {
        super.setConfirmedEmail(value);
    }

    /**Gets the attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     */
    public Date getLastUpdateDate() {
        return super.getLastUpdateDate();
    }

    /**Sets <code>value</code> as attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     */
    public void setLastUpdateDate(Date value) {
        super.setLastUpdateDate(value);
    }

    /**Gets the attribute value for PHONE_NUMBER using the alias name PhoneNumber.
     */
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    /**Sets <code>value</code> as attribute value for PHONE_NUMBER using the alias name PhoneNumber.
     */
    public void setPhoneNumber(String value) {
        super.setPhoneNumber(value);
    }

    /**Gets the attribute value for OBJECT_VERSION_ID using the alias name ObjectVersionId.
     */
    public Number getObjectVersionId() {
        return super.getObjectVersionId();
    }

    /**Sets <code>value</code> as attribute value for OBJECT_VERSION_ID using the alias name ObjectVersionId.
     */
    public void setObjectVersionId(Number value) {
        super.setObjectVersionId(value);
    }

    /**Gets the attribute value for MOBILE_PHONE_NUMBER using the alias name MobilePhoneNumber.
     */
    public String getMobilePhoneNumber() {
        return super.getMobilePhoneNumber();
    }

    /**Sets <code>value</code> as attribute value for MOBILE_PHONE_NUMBER using the alias name MobilePhoneNumber.
     */
    public void setMobilePhoneNumber(String value) {
        super.setMobilePhoneNumber(value);
    }

    /**Gets the attribute value for DISCOUNT_ELIGIBLE using the alias name DiscountEligible.
     */
    public String getDiscountEligible() {
        return (String) getAttributeInternal(DISCOUNTELIGIBLE);
    }

    /**Sets <code>value</code> as attribute value for DISCOUNT_ELIGIBLE using the alias name DiscountEligible.
     */
    public void setDiscountEligible(String value) {
        setAttributeInternal(DISCOUNTELIGIBLE, value);
    }

    /**getAttrInvokeAccessor: generated method. Do not modify.
     */
    protected Object getAttrInvokeAccessor(int index, 
                                           AttributeDefImpl attrDef) throws Exception {
        if (index == DISCOUNTELIGIBLE) {
            return getDiscountEligible();
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**setAttrInvokeAccessor: generated method. Do not modify.
     */
    protected void setAttrInvokeAccessor(int index, Object value, 
                                         AttributeDefImpl attrDef) throws Exception {
        if (index == DISCOUNTELIGIBLE) {
            setDiscountEligible((String)value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
        return;
    }
}
