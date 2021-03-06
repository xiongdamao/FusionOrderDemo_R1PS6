package oracle.fodemo.storefront.store.queries;


import oracle.fodemo.storefront.entities.AddressEOImpl;
import oracle.fodemo.storefront.entities.AddressUsageEOImpl;
import oracle.fodemo.storefront.entities.PersonEOImpl;

import oracle.jbo.RowIterator;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PersonsVORowImpl extends ViewRowImpl {

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Title {
            public Object get(PersonsVORowImpl obj) {
                return obj.getTitle();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setTitle((String)value);
            }
        }
        ,
        PersonId {
            public Object get(PersonsVORowImpl obj) {
                return obj.getPersonId();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setPersonId((DBSequence)value);
            }
        }
        ,
        LastName {
            public Object get(PersonsVORowImpl obj) {
                return obj.getLastName();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setLastName((String)value);
            }
        }
        ,
        PrincipalName {
            public Object get(PersonsVORowImpl obj) {
                return obj.getPrincipalName();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setPrincipalName((String)value);
            }
        }
        ,
        ProvisionedFlag {
            public Object get(PersonsVORowImpl obj) {
                return obj.getProvisionedFlag();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setProvisionedFlag((String)value);
            }
        }
        ,
        FirstName {
            public Object get(PersonsVORowImpl obj) {
                return obj.getFirstName();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setFirstName((String)value);
            }
        }
        ,
        RegisteredDate {
            public Object get(PersonsVORowImpl obj) {
                return obj.getRegisteredDate();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setRegisteredDate((Date)value);
            }
        }
        ,
        PersonTypeCode {
            public Object get(PersonsVORowImpl obj) {
                return obj.getPersonTypeCode();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setPersonTypeCode((String)value);
            }
        }
        ,
        Email {
            public Object get(PersonsVORowImpl obj) {
                return obj.getEmail();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setEmail((String)value);
            }
        }
        ,
        PrimaryAddressId {
            public Object get(PersonsVORowImpl obj) {
                return obj.getPrimaryAddressId();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setPrimaryAddressId((Number)value);
            }
        }
        ,
        PhoneNumber {
            public Object get(PersonsVORowImpl obj) {
                return obj.getPhoneNumber();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setPhoneNumber((String)value);
            }
        }
        ,
        MembershipId {
            public Object get(PersonsVORowImpl obj) {
                return obj.getMembershipId();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setMembershipId((Number)value);
            }
        }
        ,
        CreditLimit {
            public Object get(PersonsVORowImpl obj) {
                return obj.getCreditLimit();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setCreditLimit((Number)value);
            }
        }
        ,
        ConfirmedEmail {
            public Object get(PersonsVORowImpl obj) {
                return obj.getConfirmedEmail();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setConfirmedEmail((String)value);
            }
        }
        ,
        MaritalStatusCode {
            public Object get(PersonsVORowImpl obj) {
                return obj.getMaritalStatusCode();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setMaritalStatusCode((String)value);
            }
        }
        ,
        MobilePhoneNumber {
            public Object get(PersonsVORowImpl obj) {
                return obj.getMobilePhoneNumber();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setMobilePhoneNumber((String)value);
            }
        }
        ,
        ChildrenUnder18 {
            public Object get(PersonsVORowImpl obj) {
                return obj.getChildrenUnder18();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setChildrenUnder18((Number)value);
            }
        }
        ,
        DateOfBirth {
            public Object get(PersonsVORowImpl obj) {
                return obj.getDateOfBirth();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setDateOfBirth((Date)value);
            }
        }
        ,
        ContactMethodCode {
            public Object get(PersonsVORowImpl obj) {
                return obj.getContactMethodCode();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setContactMethodCode((String)value);
            }
        }
        ,
        Gender {
            public Object get(PersonsVORowImpl obj) {
                return obj.getGender();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setGender((String)value);
            }
        }
        ,
        ContactByAffilliatesFlag {
            public Object get(PersonsVORowImpl obj) {
                return obj.getContactByAffilliatesFlag();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setContactByAffilliatesFlag((String)value);
            }
        }
        ,
        ApproximateIncome {
            public Object get(PersonsVORowImpl obj) {
                return obj.getApproximateIncome();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setApproximateIncome((Number)value);
            }
        }
        ,
        CustomerInterestsId {
            public Object get(PersonsVORowImpl obj) {
                return obj.getCustomerInterestsId();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setCustomerInterestsId((DBSequence)value);
            }
        }
        ,
        ContactableFlag {
            public Object get(PersonsVORowImpl obj) {
                return obj.getContactableFlag();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setContactableFlag((String)value);
            }
        }
        ,
        AddressId {
            public Object get(PersonsVORowImpl obj) {
                return obj.getAddressId();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setAddressId((DBSequence)value);
            }
        }
        ,
        CustomerId {
            public Object get(PersonsVORowImpl obj) {
                return obj.getCustomerId();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setCustomerId((Number)value);
            }
        }
        ,
        Address2 {
            public Object get(PersonsVORowImpl obj) {
                return obj.getAddress2();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setAddress2((String)value);
            }
        }
        ,
        CategoryId {
            public Object get(PersonsVORowImpl obj) {
                return obj.getCategoryId();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setCategoryId((Number)value);
            }
        }
        ,
        PostalCode {
            public Object get(PersonsVORowImpl obj) {
                return obj.getPostalCode();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setPostalCode((String)value);
            }
        }
        ,
        Address1 {
            public Object get(PersonsVORowImpl obj) {
                return obj.getAddress1();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setAddress1((String)value);
            }
        }
        ,
        CountryId {
            public Object get(PersonsVORowImpl obj) {
                return obj.getCountryId();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setCountryId((String)value);
            }
        }
        ,
        City {
            public Object get(PersonsVORowImpl obj) {
                return obj.getCity();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setCity((String)value);
            }
        }
        ,
        Latitude {
            public Object get(PersonsVORowImpl obj) {
                return obj.getLatitude();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setLatitude((Number)value);
            }
        }
        ,
        StateProvince {
            public Object get(PersonsVORowImpl obj) {
                return obj.getStateProvince();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setStateProvince((String)value);
            }
        }
        ,
        Longitude {
            public Object get(PersonsVORowImpl obj) {
                return obj.getLongitude();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setLongitude((Number)value);
            }
        }
        ,
        ObjectVersionId {
            public Object get(PersonsVORowImpl obj) {
                return obj.getObjectVersionId();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setObjectVersionId((Number)value);
            }
        }
        ,
        PaymentOptionsVO {
            public Object get(PersonsVORowImpl obj) {
                return obj.getPaymentOptionsVO();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        OrdersVO {
            public Object get(PersonsVORowImpl obj) {
                return obj.getOrdersVO();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        MembershipDiscountsVO {
            public Object get(PersonsVORowImpl obj) {
                return obj.getMembershipDiscountsVO();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        AddressUsagesVO {
            public Object get(PersonsVORowImpl obj) {
                return obj.getAddressUsagesVO();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CustomerInterestsVO {
            public Object get(PersonsVORowImpl obj) {
                return obj.getCustomerInterestsVO();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CustomerAddressVO {
            public Object get(PersonsVORowImpl obj) {
                return obj.getCustomerAddressVO();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        AddressesAndUsagesVO {
            public Object get(PersonsVORowImpl obj) {
                return obj.getAddressesAndUsagesVO();
            }

            public void put(PersonsVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        /**
         * @param object
         * @return
         */
        public abstract Object get(PersonsVORowImpl object);

        /**
         * @param object
         * @param value
         */
        public abstract void put(PersonsVORowImpl object, Object value);

        /**
         * @return
         */
        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        /**
         * @return
         */
        public static int firstIndex() {
            return firstIndex;
        }

        /**
         * @return
         */
        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        /**
         * @return
         */
        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int TITLE = AttributesEnum.Title.index();
    public static final int PERSONID = AttributesEnum.PersonId.index();
    public static final int LASTNAME = AttributesEnum.LastName.index();
    public static final int PRINCIPALNAME = AttributesEnum.PrincipalName.index();
    public static final int PROVISIONEDFLAG = AttributesEnum.ProvisionedFlag.index();
    public static final int FIRSTNAME = AttributesEnum.FirstName.index();
    public static final int REGISTEREDDATE = AttributesEnum.RegisteredDate.index();
    public static final int PERSONTYPECODE = AttributesEnum.PersonTypeCode.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int PRIMARYADDRESSID = AttributesEnum.PrimaryAddressId.index();
    public static final int PHONENUMBER = AttributesEnum.PhoneNumber.index();
    public static final int MEMBERSHIPID = AttributesEnum.MembershipId.index();
    public static final int CREDITLIMIT = AttributesEnum.CreditLimit.index();
    public static final int CONFIRMEDEMAIL = AttributesEnum.ConfirmedEmail.index();
    public static final int MARITALSTATUSCODE = AttributesEnum.MaritalStatusCode.index();
    public static final int MOBILEPHONENUMBER = AttributesEnum.MobilePhoneNumber.index();
    public static final int CHILDRENUNDER18 = AttributesEnum.ChildrenUnder18.index();
    public static final int DATEOFBIRTH = AttributesEnum.DateOfBirth.index();
    public static final int CONTACTMETHODCODE = AttributesEnum.ContactMethodCode.index();
    public static final int GENDER = AttributesEnum.Gender.index();
    public static final int CONTACTBYAFFILLIATESFLAG = AttributesEnum.ContactByAffilliatesFlag.index();
    public static final int APPROXIMATEINCOME = AttributesEnum.ApproximateIncome.index();
    public static final int CUSTOMERINTERESTSID = AttributesEnum.CustomerInterestsId.index();
    public static final int CONTACTABLEFLAG = AttributesEnum.ContactableFlag.index();
    public static final int ADDRESSID = AttributesEnum.AddressId.index();
    public static final int CUSTOMERID = AttributesEnum.CustomerId.index();
    public static final int ADDRESS2 = AttributesEnum.Address2.index();
    public static final int CATEGORYID = AttributesEnum.CategoryId.index();
    public static final int POSTALCODE = AttributesEnum.PostalCode.index();
    public static final int ADDRESS1 = AttributesEnum.Address1.index();
    public static final int COUNTRYID = AttributesEnum.CountryId.index();
    public static final int CITY = AttributesEnum.City.index();
    public static final int LATITUDE = AttributesEnum.Latitude.index();
    public static final int STATEPROVINCE = AttributesEnum.StateProvince.index();
    public static final int LONGITUDE = AttributesEnum.Longitude.index();
    public static final int OBJECTVERSIONID = AttributesEnum.ObjectVersionId.index();
    public static final int PAYMENTOPTIONSVO = AttributesEnum.PaymentOptionsVO.index();
    public static final int ORDERSVO = AttributesEnum.OrdersVO.index();
    public static final int MEMBERSHIPDISCOUNTSVO = AttributesEnum.MembershipDiscountsVO.index();
    public static final int ADDRESSUSAGESVO = AttributesEnum.AddressUsagesVO.index();
    public static final int CUSTOMERINTERESTSVO = AttributesEnum.CustomerInterestsVO.index();
    public static final int CUSTOMERADDRESSVO = AttributesEnum.CustomerAddressVO.index();
    public static final int ADDRESSESANDUSAGESVO = AttributesEnum.AddressesAndUsagesVO.index();

    /**This is the default constructor (do not remove).
     */
    public PersonsVORowImpl() {
    }

    /**Gets CustomerInterestEO entity object.
     * @return
     */
    public EntityImpl getCustomerInterestEO() {
        return (EntityImpl)getEntity(0);
    }

    /**Gets PersonEO entity object.
     * @return
     */
    public PersonEOImpl getPersonEO() {
        return (PersonEOImpl)getEntity(1);
    }

    /**Gets AddressEO entity object.
     * @return
     */
    public AddressEOImpl getAddressEO() {
        return (AddressEOImpl)getEntity(2);
    }

    /**
     * Gets AddressUsageEO entity object.
     * @return the AddressUsageEO
     */
    public AddressUsageEOImpl getAddressUsageEO() {
        return (AddressUsageEOImpl)getEntity(3);
    }

    /**Gets the attribute value for TITLE using the alias name Title.
     * @return
     */
    public String getTitle() {
        return (String) getAttributeInternal(TITLE);
    }

    /**Sets <code>value</code> as attribute value for TITLE using the alias name Title.
     * @param value
     */
    public void setTitle(String value) {
        setAttributeInternal(TITLE, value);
    }

    /**Gets the attribute value for PERSON_ID using the alias name PersonId.
     * @return
     */
    public DBSequence getPersonId() {
        return (DBSequence)getAttributeInternal(PERSONID);
    }

    /**Sets <code>value</code> as attribute value for PERSON_ID using the alias name PersonId.
     * @param value
     */
    public void setPersonId(DBSequence value) {
        setAttributeInternal(PERSONID, value);
    }

    /**Gets the attribute value for LAST_NAME using the alias name LastName.
     * @return
     */
    public String getLastName() {
        return (String) getAttributeInternal(LASTNAME);
    }

    /**Sets <code>value</code> as attribute value for LAST_NAME using the alias name LastName.
     * @param value
     */
    public void setLastName(String value) {
        setAttributeInternal(LASTNAME, value);
    }

    /**Gets the attribute value for PRINCIPAL_NAME using the alias name PrincipalName.
     * @return
     */
    public String getPrincipalName() {
        return (String) getAttributeInternal(PRINCIPALNAME);
    }

    /**Sets <code>value</code> as attribute value for PRINCIPAL_NAME using the alias name PrincipalName.
     * @param value
     */
    public void setPrincipalName(String value) {
        setAttributeInternal(PRINCIPALNAME, value);
    }

    /**Gets the attribute value for PROVISIONED_FLAG using the alias name ProvisionedFlag.
     * @return
     */
    public String getProvisionedFlag() {
        return (String) getAttributeInternal(PROVISIONEDFLAG);
    }

    /**Sets <code>value</code> as attribute value for PROVISIONED_FLAG using the alias name ProvisionedFlag.
     * @param value
     */
    public void setProvisionedFlag(String value) {
        setAttributeInternal(PROVISIONEDFLAG, value);
    }

    /**Gets the attribute value for FIRST_NAME using the alias name FirstName.
     * @return
     */
    public String getFirstName() {
        return (String) getAttributeInternal(FIRSTNAME);
    }

    /**Sets <code>value</code> as attribute value for FIRST_NAME using the alias name FirstName.
     * @param value
     */
    public void setFirstName(String value) {
        setAttributeInternal(FIRSTNAME, value);
    }

    /**Gets the attribute value for REGISTERED_DATE using the alias name RegisteredDate.
     * @return
     */
    public Date getRegisteredDate() {
        return (Date) getAttributeInternal(REGISTEREDDATE);
    }

    /**Sets <code>value</code> as attribute value for REGISTERED_DATE using the alias name RegisteredDate.
     * @param value
     */
    public void setRegisteredDate(Date value) {
        setAttributeInternal(REGISTEREDDATE, value);
    }

    /**Gets the attribute value for PERSON_TYPE_CODE using the alias name PersonTypeCode.
     * @return
     */
    public String getPersonTypeCode() {
        return (String) getAttributeInternal(PERSONTYPECODE);
    }

    /**Sets <code>value</code> as attribute value for PERSON_TYPE_CODE using the alias name PersonTypeCode.
     * @param value
     */
    public void setPersonTypeCode(String value) {
        setAttributeInternal(PERSONTYPECODE, value);
    }

    /**Gets the attribute value for EMAIL using the alias name Email.
     * @return
     */
    public String getEmail() {
        return (String) getAttributeInternal(EMAIL);
    }

    /**Sets <code>value</code> as attribute value for EMAIL using the alias name Email.
     * @param value
     */
    public void setEmail(String value) {
        setAttributeInternal(EMAIL, value);
    }

    /**Gets the attribute value for PRIMARY_ADDRESS_ID using the alias name PrimaryAddressId.
     * @return
     */
    public Number getPrimaryAddressId() {
        return (Number) getAttributeInternal(PRIMARYADDRESSID);
    }

    /**Sets <code>value</code> as attribute value for PRIMARY_ADDRESS_ID using the alias name PrimaryAddressId.
     * @param value
     */
    public void setPrimaryAddressId(Number value) {
        setAttributeInternal(PRIMARYADDRESSID, value);
    }

    /**Gets the attribute value for PHONE_NUMBER using the alias name PhoneNumber.
     * @return
     */
    public String getPhoneNumber() {
        return (String) getAttributeInternal(PHONENUMBER);
    }

    /**Sets <code>value</code> as attribute value for PHONE_NUMBER using the alias name PhoneNumber.
     * @param value
     */
    public void setPhoneNumber(String value) {
        setAttributeInternal(PHONENUMBER, value);
    }

    /**Gets the attribute value for MEMBERSHIP_ID using the alias name MembershipId.
     * @return
     */
    public Number getMembershipId() {
        return (Number) getAttributeInternal(MEMBERSHIPID);
    }

    /**Sets <code>value</code> as attribute value for MEMBERSHIP_ID using the alias name MembershipId.
     * @param value
     */
    public void setMembershipId(Number value) {
        setAttributeInternal(MEMBERSHIPID, value);
    }

    /**Gets the attribute value for CREDIT_LIMIT using the alias name CreditLimit.
     * @return
     */
    public Number getCreditLimit() {
        return (Number) getAttributeInternal(CREDITLIMIT);
    }

    /**Sets <code>value</code> as attribute value for CREDIT_LIMIT using the alias name CreditLimit.
     * @param value
     */
    public void setCreditLimit(Number value) {
        setAttributeInternal(CREDITLIMIT, value);
    }

    /**Gets the attribute value for CONFIRMED_EMAIL using the alias name ConfirmedEmail.
     * @return
     */
    public String getConfirmedEmail() {
        return (String) getAttributeInternal(CONFIRMEDEMAIL);
    }

    /**Sets <code>value</code> as attribute value for CONFIRMED_EMAIL using the alias name ConfirmedEmail.
     * @param value
     */
    public void setConfirmedEmail(String value) {
        setAttributeInternal(CONFIRMEDEMAIL, value);
    }

    /**Gets the attribute value for MARITAL_STATUS_CODE using the alias name MaritalStatusCode.
     * @return
     */
    public String getMaritalStatusCode() {
        return (String) getAttributeInternal(MARITALSTATUSCODE);
    }

    /**Sets <code>value</code> as attribute value for MARITAL_STATUS_CODE using the alias name MaritalStatusCode.
     * @param value
     */
    public void setMaritalStatusCode(String value) {
        setAttributeInternal(MARITALSTATUSCODE, value);
    }

    /**Gets the attribute value for MOBILE_PHONE_NUMBER using the alias name MobilePhoneNumber.
     * @return
     */
    public String getMobilePhoneNumber() {
        return (String) getAttributeInternal(MOBILEPHONENUMBER);
    }

    /**Sets <code>value</code> as attribute value for MOBILE_PHONE_NUMBER using the alias name MobilePhoneNumber.
     * @param value
     */
    public void setMobilePhoneNumber(String value) {
        setAttributeInternal(MOBILEPHONENUMBER, value);
    }

    /**Gets the attribute value for CHILDREN_UNDER_18 using the alias name ChildrenUnder18.
     * @return
     */
    public Number getChildrenUnder18() {
        return (Number) getAttributeInternal(CHILDRENUNDER18);
    }

    /**Sets <code>value</code> as attribute value for CHILDREN_UNDER_18 using the alias name ChildrenUnder18.
     * @param value
     */
    public void setChildrenUnder18(Number value) {
        setAttributeInternal(CHILDRENUNDER18, value);
    }

    /**Gets the attribute value for DATE_OF_BIRTH using the alias name DateOfBirth.
     * @return
     */
    public Date getDateOfBirth() {
        return (Date) getAttributeInternal(DATEOFBIRTH);
    }

    /**Sets <code>value</code> as attribute value for DATE_OF_BIRTH using the alias name DateOfBirth.
     * @param value
     */
    public void setDateOfBirth(Date value) {
        setAttributeInternal(DATEOFBIRTH, value);
    }

    /**Gets the attribute value for CONTACT_METHOD_CODE using the alias name ContactMethodCode.
     * @return
     */
    public String getContactMethodCode() {
        return (String) getAttributeInternal(CONTACTMETHODCODE);
    }

    /**Sets <code>value</code> as attribute value for CONTACT_METHOD_CODE using the alias name ContactMethodCode.
     * @param value
     */
    public void setContactMethodCode(String value) {
        setAttributeInternal(CONTACTMETHODCODE, value);
    }

    /**Gets the attribute value for GENDER using the alias name Gender.
     * @return
     */
    public String getGender() {
        return (String) getAttributeInternal(GENDER);
    }

    /**Sets <code>value</code> as attribute value for GENDER using the alias name Gender.
     * @param value
     */
    public void setGender(String value) {
        setAttributeInternal(GENDER, value);
    }

    /**Gets the attribute value for CONTACT_BY_AFFILLIATES_FLAG using the alias name ContactByAffilliatesFlag.
     * @return
     */
    public String getContactByAffilliatesFlag() {
        return (String) getAttributeInternal(CONTACTBYAFFILLIATESFLAG);
    }

    /**Sets <code>value</code> as attribute value for CONTACT_BY_AFFILLIATES_FLAG using the alias name ContactByAffilliatesFlag.
     * @param value
     */
    public void setContactByAffilliatesFlag(String value) {
        setAttributeInternal(CONTACTBYAFFILLIATESFLAG, value);
    }

    /**Gets the attribute value for APPROXIMATE_INCOME using the alias name ApproximateIncome.
     * @return
     */
    public Number getApproximateIncome() {
        return (Number) getAttributeInternal(APPROXIMATEINCOME);
    }

    /**Sets <code>value</code> as attribute value for APPROXIMATE_INCOME using the alias name ApproximateIncome.
     * @param value
     */
    public void setApproximateIncome(Number value) {
        setAttributeInternal(APPROXIMATEINCOME, value);
    }

    /**Gets the attribute value for CUSTOMER_INTERESTS_ID using the alias name CustomerInterestsId.
     * @return
     */
    public DBSequence getCustomerInterestsId() {
        return (DBSequence)getAttributeInternal(CUSTOMERINTERESTSID);
    }

    /**Sets <code>value</code> as attribute value for CUSTOMER_INTERESTS_ID using the alias name CustomerInterestsId.
     * @param value
     */
    public void setCustomerInterestsId(DBSequence value) {
        setAttributeInternal(CUSTOMERINTERESTSID, value);
    }

    /**Gets the attribute value for CONTACTABLE_FLAG using the alias name ContactableFlag.
     * @return
     */
    public String getContactableFlag() {
        return (String) getAttributeInternal(CONTACTABLEFLAG);
    }

    /**Sets <code>value</code> as attribute value for CONTACTABLE_FLAG using the alias name ContactableFlag.
     * @param value
     */
    public void setContactableFlag(String value) {
        setAttributeInternal(CONTACTABLEFLAG, value);
    }

    /**Gets the attribute value for ADDRESS_ID using the alias name AddressId.
     * @return
     */
    public DBSequence getAddressId() {
        return (DBSequence)getAttributeInternal(ADDRESSID);
    }

    /**Sets <code>value</code> as attribute value for ADDRESS_ID using the alias name AddressId.
     * @param value
     */
    public void setAddressId(DBSequence value) {
        setAttributeInternal(ADDRESSID, value);
    }

    /**Gets the attribute value for CUSTOMER_ID using the alias name CustomerId.
     * @return
     */
    public Number getCustomerId() {
        return (Number) getAttributeInternal(CUSTOMERID);
    }

    /**Sets <code>value</code> as attribute value for CUSTOMER_ID using the alias name CustomerId.
     * @param value
     */
    public void setCustomerId(Number value) {
        setAttributeInternal(CUSTOMERID, value);
    }

    /**Gets the attribute value for ADDRESS2 using the alias name Address2.
     * @return
     */
    public String getAddress2() {
        return (String) getAttributeInternal(ADDRESS2);
    }

    /**Sets <code>value</code> as attribute value for ADDRESS2 using the alias name Address2.
     * @param value
     */
    public void setAddress2(String value) {
        setAttributeInternal(ADDRESS2, value);
    }

    /**Gets the attribute value for CATEGORY_ID using the alias name CategoryId.
     * @return
     */
    public Number getCategoryId() {
        return (Number) getAttributeInternal(CATEGORYID);
    }

    /**Sets <code>value</code> as attribute value for CATEGORY_ID using the alias name CategoryId.
     * @param value
     */
    public void setCategoryId(Number value) {
        setAttributeInternal(CATEGORYID, value);
    }

    /**Gets the attribute value for POSTAL_CODE using the alias name PostalCode.
     * @return
     */
    public String getPostalCode() {
        return (String) getAttributeInternal(POSTALCODE);
    }

    /**Sets <code>value</code> as attribute value for POSTAL_CODE using the alias name PostalCode.
     * @param value
     */
    public void setPostalCode(String value) {
        setAttributeInternal(POSTALCODE, value);
    }

    /**Gets the attribute value for ADDRESS1 using the alias name Address1.
     * @return
     */
    public String getAddress1() {
        return (String) getAttributeInternal(ADDRESS1);
    }

    /**Sets <code>value</code> as attribute value for ADDRESS1 using the alias name Address1.
     * @param value
     */
    public void setAddress1(String value) {
        setAttributeInternal(ADDRESS1, value);
    }

    /**Gets the attribute value for COUNTRY_ID using the alias name CountryId.
     * @return
     */
    public String getCountryId() {
        return (String) getAttributeInternal(COUNTRYID);
    }

    /**Sets <code>value</code> as attribute value for COUNTRY_ID using the alias name CountryId.
     * @param value
     */
    public void setCountryId(String value) {
        setAttributeInternal(COUNTRYID, value);
    }

    /**Gets the attribute value for CITY using the alias name City.
     * @return
     */
    public String getCity() {
        return (String) getAttributeInternal(CITY);
    }

    /**Sets <code>value</code> as attribute value for CITY using the alias name City.
     * @param value
     */
    public void setCity(String value) {
        setAttributeInternal(CITY, value);
    }

    /**Gets the attribute value for LATITUDE using the alias name Latitude.
     * @return
     */
    public Number getLatitude() {
        return (Number) getAttributeInternal(LATITUDE);
    }

    /**Sets <code>value</code> as attribute value for LATITUDE using the alias name Latitude.
     * @param value
     */
    public void setLatitude(Number value) {
        setAttributeInternal(LATITUDE, value);
    }

    /**Gets the attribute value for STATE_PROVINCE using the alias name StateProvince.
     * @return
     */
    public String getStateProvince() {
        return (String) getAttributeInternal(STATEPROVINCE);
    }

    /**Sets <code>value</code> as attribute value for STATE_PROVINCE using the alias name StateProvince.
     * @param value
     */
    public void setStateProvince(String value) {
        setAttributeInternal(STATEPROVINCE, value);
    }

    /**Gets the attribute value for LONGITUDE using the alias name Longitude.
     * @return
     */
    public Number getLongitude() {
        return (Number) getAttributeInternal(LONGITUDE);
    }

    /**Sets <code>value</code> as attribute value for LONGITUDE using the alias name Longitude.
     * @param value
     */
    public void setLongitude(Number value) {
        setAttributeInternal(LONGITUDE, value);
    }

    /**Gets the attribute value for OBJECT_VERSION_ID using the alias name ObjectVersionId.
     * @return
     */
    public Number getObjectVersionId() {
        return (Number) getAttributeInternal(OBJECTVERSIONID);
    }


    /**
     * Sets <code>value</code> as attribute value for OBJECT_VERSION_ID using the alias name ObjectVersionId.
     * @param value value to set the OBJECT_VERSION_ID
     */
    public void setObjectVersionId(Number value) {
        setAttributeInternal(OBJECTVERSIONID, value);
    }

    /**getAttrInvokeAccessor: generated method. Do not modify.
     * @param index
     * @param attrDef
     * @return
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index, 
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**setAttrInvokeAccessor: generated method. Do not modify.
     * @param index
     * @param value
     * @param attrDef
     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value, 
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**Gets the associated <code>RowIterator</code> using master-detail link PaymentOptionsVO.
     * @return
     */
    public RowIterator getPaymentOptionsVO() {
        return (RowIterator)getAttributeInternal(PAYMENTOPTIONSVO);
    }

    /**Gets the associated <code>RowIterator</code> using master-detail link AddressesAndUsagesVO.
     * @return
     */
    public RowIterator getAddressesAndUsagesVO() {
        return (RowIterator)getAttributeInternal(ADDRESSESANDUSAGESVO);
    }

    /**Gets the associated <code>RowIterator</code> using master-detail link OrdersVO.
     * @return
     */
    public RowIterator getOrdersVO() {
        return (RowIterator)getAttributeInternal(ORDERSVO);
    }

    /**Gets the associated <code>RowIterator</code> using master-detail link MembershipDiscountsVO.
     * @return
     */
    public RowIterator getMembershipDiscountsVO() {
        return (RowIterator)getAttributeInternal(MEMBERSHIPDISCOUNTSVO);
    }

    /**Gets the associated <code>RowIterator</code> using master-detail link AddressUsagesVO.
     * @return
     */
    public RowIterator getAddressUsagesVO() {
        return (RowIterator)getAttributeInternal(ADDRESSUSAGESVO);
    }

    /**Gets the associated <code>RowIterator</code> using master-detail link CustomerInterestsVO.
     * @return
     */
    public RowIterator getCustomerInterestsVO() {
        return (RowIterator)getAttributeInternal(CUSTOMERINTERESTSVO);
    }

    /**Gets the associated <code>RowIterator</code> using master-detail link CustomerAddressVO.
     * @return
     */
    public RowIterator getCustomerAddressVO() {
        return (RowIterator)getAttributeInternal(CUSTOMERADDRESSVO);
    }
}
