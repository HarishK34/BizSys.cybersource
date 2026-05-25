
package com.cybersource.stub;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayerAuthEnrollService complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PayerAuthEnrollService">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="httpAccept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="httpUserAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="merchantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="merchantURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="purchaseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="purchaseTime" type="{urn:schemas-cybersource-com:transaction-data-1.219}dateTime" minOccurs="0"/>
 *         <element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="acquirerBin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="loginID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="merchantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="overridePaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="referenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="marketingOptIn" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="marketingSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="defaultCard" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="shipAddressUsageDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="transactionCountDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="transactionCountYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="addCardAttempts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="accountPurchases" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="fraudActivity" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="paymentAccountDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="alternateAuthenticationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="alternateAuthenticationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="alternateAuthenticationData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="challengeRequired" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="challengeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="preorder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="reorder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="preorderDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="giftCardAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="giftCardCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="giftCardCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="messageCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="npaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="recurringOriginalPurchaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="returnURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="transactionMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="recurringEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="recurringFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="merchantNewCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="customerCCAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="installmentTotalCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authenticationTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="httpUserAccept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mobilePhoneDomestic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pareqChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="shoppingChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authenticationChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="merchantTTPCredential" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="requestorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="requestorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="acsWindowSize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="decoupledAuthenticationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="decoupledAuthenticationMaxTime" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="deviceChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="priorAuthenticationReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="priorAuthenticationData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="priorAuthenticationMethod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="priorAuthenticationTime" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="requestorInitiatedAuthenticationIndicator" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="sdkMaxTimeout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authenticationIndicator" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="whiteListStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="totalOffersCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="merchantScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="merchantFraudRate" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="acquirerCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="secureCorporatePaymentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="resendCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="workPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="scoreRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="transactionFlowIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="run" use="required" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayerAuthEnrollService", propOrder = {
    "httpAccept",
    "httpUserAgent",
    "merchantName",
    "merchantURL",
    "purchaseDescription",
    "purchaseTime",
    "countryCode",
    "acquirerBin",
    "loginID",
    "password",
    "merchantID",
    "overridePaymentMethod",
    "mobilePhone",
    "mcc",
    "productCode",
    "referenceID",
    "marketingOptIn",
    "marketingSource",
    "defaultCard",
    "shipAddressUsageDate",
    "transactionCountDay",
    "transactionCountYear",
    "addCardAttempts",
    "accountPurchases",
    "fraudActivity",
    "paymentAccountDate",
    "alternateAuthenticationMethod",
    "alternateAuthenticationDate",
    "alternateAuthenticationData",
    "challengeRequired",
    "challengeCode",
    "preorder",
    "reorder",
    "preorderDate",
    "giftCardAmount",
    "giftCardCurrency",
    "giftCardCount",
    "messageCategory",
    "npaCode",
    "recurringOriginalPurchaseDate",
    "returnURL",
    "transactionMode",
    "recurringEndDate",
    "recurringFrequency",
    "merchantNewCustomer",
    "customerCCAlias",
    "installmentTotalCount",
    "authenticationTransactionID",
    "httpUserAccept",
    "mobilePhoneDomestic",
    "pareqChannel",
    "shoppingChannel",
    "authenticationChannel",
    "merchantTTPCredential",
    "requestorID",
    "requestorName",
    "acsWindowSize",
    "decoupledAuthenticationIndicator",
    "decoupledAuthenticationMaxTime",
    "deviceChannel",
    "priorAuthenticationReferenceID",
    "priorAuthenticationData",
    "priorAuthenticationMethod",
    "priorAuthenticationTime",
    "requestorInitiatedAuthenticationIndicator",
    "sdkMaxTimeout",
    "authenticationIndicator",
    "whiteListStatus",
    "totalOffersCount",
    "merchantScore",
    "merchantFraudRate",
    "acquirerCountry",
    "secureCorporatePaymentIndicator",
    "resendCount",
    "workPhone",
    "scoreRequest",
    "transactionFlowIndicator"
})
public class PayerAuthEnrollService {

    protected String httpAccept;
    protected String httpUserAgent;
    protected String merchantName;
    protected String merchantURL;
    protected String purchaseDescription;
    protected String purchaseTime;
    protected String countryCode;
    protected String acquirerBin;
    protected String loginID;
    protected String password;
    protected String merchantID;
    protected String overridePaymentMethod;
    protected String mobilePhone;
    @XmlElement(name = "MCC")
    protected String mcc;
    protected String productCode;
    protected String referenceID;
    protected String marketingOptIn;
    protected String marketingSource;
    protected String defaultCard;
    protected String shipAddressUsageDate;
    protected String transactionCountDay;
    protected String transactionCountYear;
    protected String addCardAttempts;
    protected String accountPurchases;
    protected String fraudActivity;
    protected String paymentAccountDate;
    protected String alternateAuthenticationMethod;
    protected String alternateAuthenticationDate;
    protected String alternateAuthenticationData;
    protected String challengeRequired;
    protected String challengeCode;
    protected String preorder;
    protected String reorder;
    protected String preorderDate;
    protected String giftCardAmount;
    protected String giftCardCurrency;
    protected String giftCardCount;
    protected String messageCategory;
    protected String npaCode;
    protected String recurringOriginalPurchaseDate;
    protected String returnURL;
    protected String transactionMode;
    protected String recurringEndDate;
    protected String recurringFrequency;
    protected String merchantNewCustomer;
    protected String customerCCAlias;
    protected String installmentTotalCount;
    protected String authenticationTransactionID;
    protected String httpUserAccept;
    protected String mobilePhoneDomestic;
    protected String pareqChannel;
    protected String shoppingChannel;
    protected String authenticationChannel;
    protected String merchantTTPCredential;
    protected String requestorID;
    protected String requestorName;
    protected BigInteger acsWindowSize;
    protected String decoupledAuthenticationIndicator;
    protected BigInteger decoupledAuthenticationMaxTime;
    protected String deviceChannel;
    protected String priorAuthenticationReferenceID;
    protected String priorAuthenticationData;
    protected BigInteger priorAuthenticationMethod;
    protected BigInteger priorAuthenticationTime;
    protected BigInteger requestorInitiatedAuthenticationIndicator;
    protected String sdkMaxTimeout;
    protected BigInteger authenticationIndicator;
    protected String whiteListStatus;
    protected BigInteger totalOffersCount;
    protected String merchantScore;
    protected BigInteger merchantFraudRate;
    protected String acquirerCountry;
    protected String secureCorporatePaymentIndicator;
    protected String resendCount;
    protected String workPhone;
    protected Boolean scoreRequest;
    protected String transactionFlowIndicator;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Gets the value of the httpAccept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpAccept() {
        return httpAccept;
    }

    /**
     * Sets the value of the httpAccept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpAccept(String value) {
        this.httpAccept = value;
    }

    /**
     * Gets the value of the httpUserAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpUserAgent() {
        return httpUserAgent;
    }

    /**
     * Sets the value of the httpUserAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpUserAgent(String value) {
        this.httpUserAgent = value;
    }

    /**
     * Gets the value of the merchantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Sets the value of the merchantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantName(String value) {
        this.merchantName = value;
    }

    /**
     * Gets the value of the merchantURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantURL() {
        return merchantURL;
    }

    /**
     * Sets the value of the merchantURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantURL(String value) {
        this.merchantURL = value;
    }

    /**
     * Gets the value of the purchaseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseDescription() {
        return purchaseDescription;
    }

    /**
     * Sets the value of the purchaseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseDescription(String value) {
        this.purchaseDescription = value;
    }

    /**
     * Gets the value of the purchaseTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseTime() {
        return purchaseTime;
    }

    /**
     * Sets the value of the purchaseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseTime(String value) {
        this.purchaseTime = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the acquirerBin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquirerBin() {
        return acquirerBin;
    }

    /**
     * Sets the value of the acquirerBin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquirerBin(String value) {
        this.acquirerBin = value;
    }

    /**
     * Gets the value of the loginID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginID() {
        return loginID;
    }

    /**
     * Sets the value of the loginID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginID(String value) {
        this.loginID = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the merchantID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantID() {
        return merchantID;
    }

    /**
     * Sets the value of the merchantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantID(String value) {
        this.merchantID = value;
    }

    /**
     * Gets the value of the overridePaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverridePaymentMethod() {
        return overridePaymentMethod;
    }

    /**
     * Sets the value of the overridePaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverridePaymentMethod(String value) {
        this.overridePaymentMethod = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the mcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCC() {
        return mcc;
    }

    /**
     * Sets the value of the mcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCC(String value) {
        this.mcc = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the referenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceID(String value) {
        this.referenceID = value;
    }

    /**
     * Gets the value of the marketingOptIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingOptIn() {
        return marketingOptIn;
    }

    /**
     * Sets the value of the marketingOptIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingOptIn(String value) {
        this.marketingOptIn = value;
    }

    /**
     * Gets the value of the marketingSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingSource() {
        return marketingSource;
    }

    /**
     * Sets the value of the marketingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingSource(String value) {
        this.marketingSource = value;
    }

    /**
     * Gets the value of the defaultCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultCard() {
        return defaultCard;
    }

    /**
     * Sets the value of the defaultCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultCard(String value) {
        this.defaultCard = value;
    }

    /**
     * Gets the value of the shipAddressUsageDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipAddressUsageDate() {
        return shipAddressUsageDate;
    }

    /**
     * Sets the value of the shipAddressUsageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipAddressUsageDate(String value) {
        this.shipAddressUsageDate = value;
    }

    /**
     * Gets the value of the transactionCountDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCountDay() {
        return transactionCountDay;
    }

    /**
     * Sets the value of the transactionCountDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCountDay(String value) {
        this.transactionCountDay = value;
    }

    /**
     * Gets the value of the transactionCountYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCountYear() {
        return transactionCountYear;
    }

    /**
     * Sets the value of the transactionCountYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCountYear(String value) {
        this.transactionCountYear = value;
    }

    /**
     * Gets the value of the addCardAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddCardAttempts() {
        return addCardAttempts;
    }

    /**
     * Sets the value of the addCardAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddCardAttempts(String value) {
        this.addCardAttempts = value;
    }

    /**
     * Gets the value of the accountPurchases property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPurchases() {
        return accountPurchases;
    }

    /**
     * Sets the value of the accountPurchases property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPurchases(String value) {
        this.accountPurchases = value;
    }

    /**
     * Gets the value of the fraudActivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudActivity() {
        return fraudActivity;
    }

    /**
     * Sets the value of the fraudActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudActivity(String value) {
        this.fraudActivity = value;
    }

    /**
     * Gets the value of the paymentAccountDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAccountDate() {
        return paymentAccountDate;
    }

    /**
     * Sets the value of the paymentAccountDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAccountDate(String value) {
        this.paymentAccountDate = value;
    }

    /**
     * Gets the value of the alternateAuthenticationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateAuthenticationMethod() {
        return alternateAuthenticationMethod;
    }

    /**
     * Sets the value of the alternateAuthenticationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateAuthenticationMethod(String value) {
        this.alternateAuthenticationMethod = value;
    }

    /**
     * Gets the value of the alternateAuthenticationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateAuthenticationDate() {
        return alternateAuthenticationDate;
    }

    /**
     * Sets the value of the alternateAuthenticationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateAuthenticationDate(String value) {
        this.alternateAuthenticationDate = value;
    }

    /**
     * Gets the value of the alternateAuthenticationData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateAuthenticationData() {
        return alternateAuthenticationData;
    }

    /**
     * Sets the value of the alternateAuthenticationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateAuthenticationData(String value) {
        this.alternateAuthenticationData = value;
    }

    /**
     * Gets the value of the challengeRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallengeRequired() {
        return challengeRequired;
    }

    /**
     * Sets the value of the challengeRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallengeRequired(String value) {
        this.challengeRequired = value;
    }

    /**
     * Gets the value of the challengeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallengeCode() {
        return challengeCode;
    }

    /**
     * Sets the value of the challengeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallengeCode(String value) {
        this.challengeCode = value;
    }

    /**
     * Gets the value of the preorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreorder() {
        return preorder;
    }

    /**
     * Sets the value of the preorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreorder(String value) {
        this.preorder = value;
    }

    /**
     * Gets the value of the reorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReorder() {
        return reorder;
    }

    /**
     * Sets the value of the reorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReorder(String value) {
        this.reorder = value;
    }

    /**
     * Gets the value of the preorderDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreorderDate() {
        return preorderDate;
    }

    /**
     * Sets the value of the preorderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreorderDate(String value) {
        this.preorderDate = value;
    }

    /**
     * Gets the value of the giftCardAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCardAmount() {
        return giftCardAmount;
    }

    /**
     * Sets the value of the giftCardAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCardAmount(String value) {
        this.giftCardAmount = value;
    }

    /**
     * Gets the value of the giftCardCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCardCurrency() {
        return giftCardCurrency;
    }

    /**
     * Sets the value of the giftCardCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCardCurrency(String value) {
        this.giftCardCurrency = value;
    }

    /**
     * Gets the value of the giftCardCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCardCount() {
        return giftCardCount;
    }

    /**
     * Sets the value of the giftCardCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCardCount(String value) {
        this.giftCardCount = value;
    }

    /**
     * Gets the value of the messageCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCategory() {
        return messageCategory;
    }

    /**
     * Sets the value of the messageCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCategory(String value) {
        this.messageCategory = value;
    }

    /**
     * Gets the value of the npaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNpaCode() {
        return npaCode;
    }

    /**
     * Sets the value of the npaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNpaCode(String value) {
        this.npaCode = value;
    }

    /**
     * Gets the value of the recurringOriginalPurchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurringOriginalPurchaseDate() {
        return recurringOriginalPurchaseDate;
    }

    /**
     * Sets the value of the recurringOriginalPurchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurringOriginalPurchaseDate(String value) {
        this.recurringOriginalPurchaseDate = value;
    }

    /**
     * Gets the value of the returnURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnURL() {
        return returnURL;
    }

    /**
     * Sets the value of the returnURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnURL(String value) {
        this.returnURL = value;
    }

    /**
     * Gets the value of the transactionMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionMode() {
        return transactionMode;
    }

    /**
     * Sets the value of the transactionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionMode(String value) {
        this.transactionMode = value;
    }

    /**
     * Gets the value of the recurringEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurringEndDate() {
        return recurringEndDate;
    }

    /**
     * Sets the value of the recurringEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurringEndDate(String value) {
        this.recurringEndDate = value;
    }

    /**
     * Gets the value of the recurringFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurringFrequency() {
        return recurringFrequency;
    }

    /**
     * Sets the value of the recurringFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurringFrequency(String value) {
        this.recurringFrequency = value;
    }

    /**
     * Gets the value of the merchantNewCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantNewCustomer() {
        return merchantNewCustomer;
    }

    /**
     * Sets the value of the merchantNewCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantNewCustomer(String value) {
        this.merchantNewCustomer = value;
    }

    /**
     * Gets the value of the customerCCAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCCAlias() {
        return customerCCAlias;
    }

    /**
     * Sets the value of the customerCCAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCCAlias(String value) {
        this.customerCCAlias = value;
    }

    /**
     * Gets the value of the installmentTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallmentTotalCount() {
        return installmentTotalCount;
    }

    /**
     * Sets the value of the installmentTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallmentTotalCount(String value) {
        this.installmentTotalCount = value;
    }

    /**
     * Gets the value of the authenticationTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationTransactionID() {
        return authenticationTransactionID;
    }

    /**
     * Sets the value of the authenticationTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationTransactionID(String value) {
        this.authenticationTransactionID = value;
    }

    /**
     * Gets the value of the httpUserAccept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpUserAccept() {
        return httpUserAccept;
    }

    /**
     * Sets the value of the httpUserAccept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpUserAccept(String value) {
        this.httpUserAccept = value;
    }

    /**
     * Gets the value of the mobilePhoneDomestic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhoneDomestic() {
        return mobilePhoneDomestic;
    }

    /**
     * Sets the value of the mobilePhoneDomestic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhoneDomestic(String value) {
        this.mobilePhoneDomestic = value;
    }

    /**
     * Gets the value of the pareqChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPareqChannel() {
        return pareqChannel;
    }

    /**
     * Sets the value of the pareqChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPareqChannel(String value) {
        this.pareqChannel = value;
    }

    /**
     * Gets the value of the shoppingChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShoppingChannel() {
        return shoppingChannel;
    }

    /**
     * Sets the value of the shoppingChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShoppingChannel(String value) {
        this.shoppingChannel = value;
    }

    /**
     * Gets the value of the authenticationChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationChannel() {
        return authenticationChannel;
    }

    /**
     * Sets the value of the authenticationChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationChannel(String value) {
        this.authenticationChannel = value;
    }

    /**
     * Gets the value of the merchantTTPCredential property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantTTPCredential() {
        return merchantTTPCredential;
    }

    /**
     * Sets the value of the merchantTTPCredential property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantTTPCredential(String value) {
        this.merchantTTPCredential = value;
    }

    /**
     * Gets the value of the requestorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestorID() {
        return requestorID;
    }

    /**
     * Sets the value of the requestorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestorID(String value) {
        this.requestorID = value;
    }

    /**
     * Gets the value of the requestorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestorName() {
        return requestorName;
    }

    /**
     * Sets the value of the requestorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestorName(String value) {
        this.requestorName = value;
    }

    /**
     * Gets the value of the acsWindowSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAcsWindowSize() {
        return acsWindowSize;
    }

    /**
     * Sets the value of the acsWindowSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAcsWindowSize(BigInteger value) {
        this.acsWindowSize = value;
    }

    /**
     * Gets the value of the decoupledAuthenticationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecoupledAuthenticationIndicator() {
        return decoupledAuthenticationIndicator;
    }

    /**
     * Sets the value of the decoupledAuthenticationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecoupledAuthenticationIndicator(String value) {
        this.decoupledAuthenticationIndicator = value;
    }

    /**
     * Gets the value of the decoupledAuthenticationMaxTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDecoupledAuthenticationMaxTime() {
        return decoupledAuthenticationMaxTime;
    }

    /**
     * Sets the value of the decoupledAuthenticationMaxTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDecoupledAuthenticationMaxTime(BigInteger value) {
        this.decoupledAuthenticationMaxTime = value;
    }

    /**
     * Gets the value of the deviceChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceChannel() {
        return deviceChannel;
    }

    /**
     * Sets the value of the deviceChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceChannel(String value) {
        this.deviceChannel = value;
    }

    /**
     * Gets the value of the priorAuthenticationReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorAuthenticationReferenceID() {
        return priorAuthenticationReferenceID;
    }

    /**
     * Sets the value of the priorAuthenticationReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorAuthenticationReferenceID(String value) {
        this.priorAuthenticationReferenceID = value;
    }

    /**
     * Gets the value of the priorAuthenticationData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorAuthenticationData() {
        return priorAuthenticationData;
    }

    /**
     * Sets the value of the priorAuthenticationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorAuthenticationData(String value) {
        this.priorAuthenticationData = value;
    }

    /**
     * Gets the value of the priorAuthenticationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriorAuthenticationMethod() {
        return priorAuthenticationMethod;
    }

    /**
     * Sets the value of the priorAuthenticationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriorAuthenticationMethod(BigInteger value) {
        this.priorAuthenticationMethod = value;
    }

    /**
     * Gets the value of the priorAuthenticationTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriorAuthenticationTime() {
        return priorAuthenticationTime;
    }

    /**
     * Sets the value of the priorAuthenticationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriorAuthenticationTime(BigInteger value) {
        this.priorAuthenticationTime = value;
    }

    /**
     * Gets the value of the requestorInitiatedAuthenticationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequestorInitiatedAuthenticationIndicator() {
        return requestorInitiatedAuthenticationIndicator;
    }

    /**
     * Sets the value of the requestorInitiatedAuthenticationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequestorInitiatedAuthenticationIndicator(BigInteger value) {
        this.requestorInitiatedAuthenticationIndicator = value;
    }

    /**
     * Gets the value of the sdkMaxTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSdkMaxTimeout() {
        return sdkMaxTimeout;
    }

    /**
     * Sets the value of the sdkMaxTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSdkMaxTimeout(String value) {
        this.sdkMaxTimeout = value;
    }

    /**
     * Gets the value of the authenticationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuthenticationIndicator() {
        return authenticationIndicator;
    }

    /**
     * Sets the value of the authenticationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuthenticationIndicator(BigInteger value) {
        this.authenticationIndicator = value;
    }

    /**
     * Gets the value of the whiteListStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhiteListStatus() {
        return whiteListStatus;
    }

    /**
     * Sets the value of the whiteListStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhiteListStatus(String value) {
        this.whiteListStatus = value;
    }

    /**
     * Gets the value of the totalOffersCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalOffersCount() {
        return totalOffersCount;
    }

    /**
     * Sets the value of the totalOffersCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalOffersCount(BigInteger value) {
        this.totalOffersCount = value;
    }

    /**
     * Gets the value of the merchantScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantScore() {
        return merchantScore;
    }

    /**
     * Sets the value of the merchantScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantScore(String value) {
        this.merchantScore = value;
    }

    /**
     * Gets the value of the merchantFraudRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMerchantFraudRate() {
        return merchantFraudRate;
    }

    /**
     * Sets the value of the merchantFraudRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMerchantFraudRate(BigInteger value) {
        this.merchantFraudRate = value;
    }

    /**
     * Gets the value of the acquirerCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquirerCountry() {
        return acquirerCountry;
    }

    /**
     * Sets the value of the acquirerCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquirerCountry(String value) {
        this.acquirerCountry = value;
    }

    /**
     * Gets the value of the secureCorporatePaymentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureCorporatePaymentIndicator() {
        return secureCorporatePaymentIndicator;
    }

    /**
     * Sets the value of the secureCorporatePaymentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureCorporatePaymentIndicator(String value) {
        this.secureCorporatePaymentIndicator = value;
    }

    /**
     * Gets the value of the resendCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResendCount() {
        return resendCount;
    }

    /**
     * Sets the value of the resendCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResendCount(String value) {
        this.resendCount = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhone(String value) {
        this.workPhone = value;
    }

    /**
     * Gets the value of the scoreRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScoreRequest() {
        return scoreRequest;
    }

    /**
     * Sets the value of the scoreRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScoreRequest(Boolean value) {
        this.scoreRequest = value;
    }

    /**
     * Gets the value of the transactionFlowIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionFlowIndicator() {
        return transactionFlowIndicator;
    }

    /**
     * Sets the value of the transactionFlowIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionFlowIndicator(String value) {
        this.transactionFlowIndicator = value;
    }

    /**
     * Gets the value of the run property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRun() {
        return run;
    }

    /**
     * Sets the value of the run property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRun(String value) {
        this.run = value;
    }

}
