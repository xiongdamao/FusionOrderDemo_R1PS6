REM Define the lookup codes available on the system
REM TODO: Once the codes are all finalised we need to split these out into one file per language
REM $Id: LOOKUP_CODES.sql 1994 2007-07-27 20:57:45Z csteriad $

INSERT INTO LOOKUP_CODES VALUES ('PERSON_TYPE_CODE', 'STAFF', 'Staff', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('PERSON_TYPE_CODE', 'CUST', 'Customer', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('PERSON_TYPE_CODE', 'SUPP', 'Supplier', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);

INSERT INTO LOOKUP_CODES VALUES ('MARITAL_STATUS_CODE', 'SING', 'Single', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('MARITAL_STATUS_CODE', 'MARR', 'Married', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('MARITAL_STATUS_CODE', 'COHB', 'Cohabitating', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('MARITAL_STATUS_CODE', 'DIV', 'Divorced', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('MARITAL_STATUS_CODE', 'PERS', 'Decline to Answer', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);

INSERT INTO LOOKUP_CODES VALUES ('SHIPPING_CLASS_CODE', 'CLASS1', 'Small Item', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('SHIPPING_CLASS_CODE', 'CLASS2', 'Medium-sized item', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('SHIPPING_CLASS_CODE', 'CLASS3', 'Bulky Item / Special Handling', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
  
INSERT INTO LOOKUP_CODES VALUES ('PAYMENT_TYPE_CODE', 'CC', 'Credit Card', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('PAYMENT_TYPE_CODE', 'DD', 'Direct Debit', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('PAYMENT_TYPE_CODE', 'IN', 'Invoice', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('PAYMENT_TYPE_CODE', 'PP', 'PayPal', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);

INSERT INTO LOOKUP_CODES VALUES ('CARD_TYPE_CODE', 'VISA', 'Visa', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('CARD_TYPE_CODE', 'MSTR', 'MasterCard', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('CARD_TYPE_CODE', 'AMEX', 'American Express', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('CARD_TYPE_CODE', 'DINC', 'Diners Club', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);

INSERT INTO LOOKUP_CODES VALUES ('OWNER_TYPE_CODE', 'CUST', 'Customer', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('OWNER_TYPE_CODE', 'SUPP', 'Supplier', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('OWNER_TYPE_CODE', 'STAFF', 'Staff', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);


INSERT INTO LOOKUP_CODES VALUES ('USAGE_TYPE_CODE', 'IN', 'Invoice Address', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('USAGE_TYPE_CODE', 'SH', 'Shipping Address', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);

INSERT INTO LOOKUP_CODES VALUES ('ID_TYPE_CODE', 'SSN', 'Social Security Number', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('ID_TYPE_CODE', 'ITIN', 'Individual Taxpayer Identity Number', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('ID_TYPE_CODE', 'PASS', 'Passport Number', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('ID_TYPE_CODE', 'DL', 'Drivers License', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);

INSERT INTO LOOKUP_CODES VALUES ('VERIFICATION_METHOD_CODE', 'DOC', 'Document Presented', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('VERIFICATION_METHOD_CODE', 'COPY', 'Copy or Fax of Document Received', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('VERIFICATION_METHOD_CODE', 'CUST', 'Customer Verified', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('VERIFICATION_METHOD_CODE', 'BUR', 'Bureau Verfied', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);

INSERT INTO LOOKUP_CODES VALUES ('CONTACT_METHOD_CODE', 'EMAIL', 'Electronic Mail', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('CONTACT_METHOD_CODE', 'POST', 'Mail via Post', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('CONTACT_METHOD_CODE', 'TEL', 'Telephone', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('CONTACT_METHOD_CODE', 'NONE', 'No Contact Except for Account Purposes', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);

INSERT INTO LOOKUP_CODES VALUES ('DISCOUNT_TYPE_CODE', 'COUP', 'Coupon', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('DISCOUNT_TYPE_CODE', 'MEMB', 'Member', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('DISCOUNT_TYPE_CODE', 'SLVR', 'Silver Member', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('DISCOUNT_TYPE_CODE', 'GOLD', 'Gold Member', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('DISCOUNT_TYPE_CODE', 'CORP', 'Corporate Member', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('DISCOUNT_TYPE_CODE', 'PART', 'Partner', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);

INSERT INTO LOOKUP_CODES VALUES ('MEMBERSHIP_TYPE_CODE', 'PERS', 'Personal Membership', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('MEMBERSHIP_TYPE_CODE', 'GROUP', 'Group Membership', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('MEMBERSHIP_TYPE_CODE', 'CORP', 'Corporate Membership', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('MEMBERSHIP_TYPE_CODE', 'PART', 'Partner Program', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);

INSERT INTO LOOKUP_CODES VALUES ('ORDER_STATUS_CODE', 'CART', 'Order is in the shopping cart', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('ORDER_STATUS_CODE', 'PEND', 'Order has been submitted', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('ORDER_STATUS_CODE', 'PICK', 'Order is being picked', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('ORDER_STATUS_CODE', 'SHIP', 'Order is being shipped', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('ORDER_STATUS_CODE', 'COMPLETE', 'Order complete', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('ORDER_STATUS_CODE', 'CANCEL', 'Order was cancelled', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('ORDER_STATUS_CODE', 'STOCK', 'Order awaiting stock', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);

INSERT INTO LOOKUP_CODES VALUES ('SUPPLIER_STATUS_CODE', 'NEW', 'New unapproved supplier', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('SUPPLIER_STATUS_CODE', 'ACTIVE', 'Approved supplier', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('SUPPLIER_STATUS_CODE', 'SUSPENDED', 'Suspended supplier', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);

INSERT INTO LOOKUP_CODES VALUES ('PRODUCT_STATUS_CODE', 'NEW', 'New product, not yet exposed on site', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('PRODUCT_STATUS_CODE', 'AVAILABLE', 'Available product', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('PRODUCT_STATUS_CODE', 'DISCONTINUED', 'Discontinued product', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);

INSERT INTO LOOKUP_CODES VALUES ('GENDER_CODE', 'M', 'Male', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('GENDER_CODE', 'F', 'Female', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);

INSERT INTO LOOKUP_CODES VALUES ('PERSON_TITLE_CODE', 'MR', 'Mr.', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('PERSON_TITLE_CODE', 'MRS', 'Mrs.', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('PERSON_TITLE_CODE', 'MS', 'Ms.', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('PERSON_TITLE_CODE', 'MISS', 'Miss', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);
INSERT INTO LOOKUP_CODES VALUES ('PERSON_TITLE_CODE', 'DR', 'Dr.', '', '&&1', 'EN', 0, SYSDATE, 0, SYSDATE, 0);