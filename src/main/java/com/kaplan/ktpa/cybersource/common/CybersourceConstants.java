package com.kaplan.ktpa.cybersource.common;


@SuppressWarnings({"UnusedDeclaration"})
public class CybersourceConstants {

    public static final String TRANSACTION_STATUS_SUCCESS = "ACCEPT";

    /**
     * Request parameters passed back from cybersource after submitting a HOPS page and getting a
     * subscriptionId
     *
     */
    public static final String HOPS_PARAM_FIRST_NAME            = "billTo_firstName";
    public static final String HOPS_PARAM_LAST_NAME             = "billTo_lastName";
    public static final String HOPS_PARAM_COMPANY               = "billTo_company";
    public static final String HOPS_PARAM_CARD_EXPIRATION_YEAR  = "card_expirationYear";
    public static final String HOPS_PARAM_CARD_EXPIRATION_MONTH = "card_expirationMonth";
    public static final String HOPS_PARAM_STREET_ADDRESS_1      = "billTo_street1";
    public static final String HOPS_PARAM_STREET_ADDRESS_2      = "billTo_street2";
    public static final String HOPS_PARAM_CITY                  = "billTo_city";
    public static final String HOPS_PARAM_STATE                 = "billTo_state";
    public static final String HOPS_PARAM_COUNTRY               = "billTo_country";
    public static final String HOPS_PARAM_POSTAL_CODE           = "billTo_postalCode";
    public static final String HOPS_PARAM_CARD_ACCOUNT_NUMBER   = "card_accountNumber";
    public static final String HOPS_PARAM_SUBSCRIPTION_ID       = "paySubscriptionCreateReply_subscriptionID";
    public static final String HOPS_PARAM_PROCESSED_AMOUNT      = "processedAmount";
    public static final String HOPS_PARAM_PHONE_NUMBER          = "billTo_phoneNumber";
    public static final String HOPS_PARAM_EMAIL                 = "billTo_email";
    public static final String HOPS_PARAM_CARD_TYPE             = "card_cardType";
    public static final String HOPS_PARAM_DESCRIPTION           = "description";
    public static final String HOPS_PARAM_PAYMENT_TYPE          = "paymentType";

    public static final String SA_PARAM_FIRST_NAME            = "bill_to_forename";
    public static final String SA_PARAM_LAST_NAME             = "bill_to_surname";
    public static final String SA_PARAM_COMPANY               = "bill_to_company_name";
    public static final String SA_PARAM_CARD_EXPIRY_DATE      = "card_expiry_date";
    public static final String SA_PARAM_ADDRESS_LINE_1        = "bill_to_address_line1";
    public static final String SA_PARAM_ADDRESS_LINE_2        = "bill_to_address_line2";
    public static final String SA_PARAM_CITY                  = "bill_to_address_city";
    public static final String SA_PARAM_STATE                 = "bill_to_address_state";
    public static final String SA_PARAM_COUNTRY               = "bill_to_address_country";
    public static final String SA_PARAM_POSTAL_CODE           = "bill_to_address_postal_code";
    public static final String SA_PARAM_CARD_NUMBER           = "card_number";
    public static final String SA_PARAM_PAYMENT_TOKEN         = "payment_token";
    public static final String SA_PARAM_PROCESSED_AMOUNT      = "processedAmount";
    public static final String SA_PARAM_PHONE_NUMBER          = "bill_to_phone";
    public static final String SA_PARAM_EMAIL                 = "bill_to_email";
    public static final String SA_PARAM_CARD_TYPE             = "card_type";

    public static final String SA_PARAM_ACCESS_KEY                = "access_key";
    public static final String SA_PARAM_AMOUNT                    = "amount";
    public static final String SA_PARAM_LOCALE                    = "locale";
    public static final String SA_PARAM_CURRENCY                  = "currency";
    public static final String SA_PARAM_PROFILE_ID                = "profile_id";
    public static final String SA_PARAM_SIGNED_DATE_TIME          = "signed_date_time";
    public static final String SA_PARAM_SIGNED_FIELD_NAMES        = "signed_field_names";
    public static final String SA_PARAM_TRANSACTION_TYPE          = "transaction_type";
    public static final String SA_PARAM_TRANSACTION_UUID          = "transaction_uuid";
    public static final String SA_PARAM_UNSIGNED_FIELD_NAMES      = "unsigned_field_names";
    public static final String SA_PARAM_REFERENCE_NUMBER          = "reference_number";
    public static final String SA_PARAM_PAYMENT_METHOD            = "payment_method";
    public static final String SA_PARAM_CARD_EXPIRATION_YEAR      = "card_expirationYear";
    public static final String SA_PARAM_CARD_EXPIRATION_MONTH     = "card_expirationMonth";
    public static final String SA_PARAM_SIGNATURE                 = "signature";
    public static final String SA_PARAM_WIDGET_ID                 = "merchant_defined_data1";

    // some default values
    public static final String SA_PARAM_TRANSACTION_TYPE_CREATE_PAYMENT_TOKEN = "create_payment_token";
    public static final String SA_PARAM_PAYMENT_METHOD_VAL                    = "card";
    public  static final String SA_PARAM_AMOUNT_DEFAULT_VAL                   = "0.00";
    public static final String SA_PARAM_LOCALE_VAL                            = "en-us";
    public static final String SA_PARAM_CURRENCY_VAL                          = "usd";

    public static final String SA_PARAM_REQ_BILL_TO_FIRST_NAME             = "req_bill_to_forename";
    public static final String SA_PARAM_REQ_BILL_TO_LAST_NAME              = "req_bill_to_surname";
    public static final String SA_PARAM_REQ_CARD_EXPIRY_DATE               = "req_card_expiry_date";
    public static final String SA_PARAM_REQ_BILL_TO_ADDRESS_LINE1          = "req_bill_to_address_line1";
    public static final String SA_PARAM_REQ_BILL_TO_ADDRESS_LINE2          = "req_bill_to_address_line2";
    public static final String SA_PARAM_REQ_BILL_TO_ADDRESS_CITY           = "req_bill_to_address_city";
    public static final String SA_PARAM_REQ_BILL_TO_ADDRESS_STATE          = "req_bill_to_address_state";
    public static final String SA_PARAM_REQ_BILL_TO_ADDRESS_COUNTRY        = "req_bill_to_address_country";
    public static final String SA_PARAM_REQ_BILL_TO_ADDRESS_POSTAL_CODE    = "req_bill_to_address_postal_code";
    public static final String SA_PARAM_REQ_CARD_NUMBER                    = "req_card_number";
    public static final String SA_PARAM_REQ_CARD_TYPE                      = "req_card_type";
    public static final String SA_PARAM_REQ_SUBSCRIPTION_ID                = "payment_token";
    public static final String SA_PARAM_REQ_WIDGET_ID                      = "req_merchant_defined_data1";

    public static final String BUSINESS_GROUP_NAME = "BUSINESS";
	public static final String LAW_GROUP_NAME = "LAW";
	public static final String HEALTH_GROUP_NAME = "HEALTH";
	public static final String PRECOLLEGE_GROUP_NAME = "PRECOLLEGE";
	public static final String MED_GROUP_NAME = "MED";
	
	public static final String TRANSACTION_SETTLEMENT = "settlement";
	public static final String TRANSACTION_REFUND = "refund";
	
	public static final Long TRANSACTION_SUCCESS_STATUS_ID = 7L;
	public static final Long TRANSACTION_ERROR_STATUS_ID = 8L;
	public static final Long TRANSACTION_DECLINE_STATUS_ID = 9L;
	
	
}