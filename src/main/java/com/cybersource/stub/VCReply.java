
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VCReply complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VCReply">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="creationTimeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="alternateShippingAddressCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="alternateShippingAddressPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vcAccountLoginName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vcAccountFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vcAccountLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vcAccountEncryptedID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vcAccountEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vcAccountMobilePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="merchantReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="subtotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="shippingHandlingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="taxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="discountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="giftWrapAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="uncategorizedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="totalPurchaseAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="walletReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="promotionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paymentInstrumentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cardVerificationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="issuerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paymentInstrumentNickName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nameOnCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cardGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cardArt" type="{urn:schemas-cybersource-com:transaction-data-1.219}VCCardArt" minOccurs="0"/>
 *         <element name="riskAdvice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="riskScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="riskAdditionalData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="avsCodeRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cvnCodeRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="eciRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="eci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cavv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="veresEnrolled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="veresTimeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paresStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paresTimeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="xid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="customData" type="{urn:schemas-cybersource-com:transaction-data-1.219}VCCustomData" minOccurs="0"/>
 *         <element name="vcAccountFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paymentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="billingAddressStreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="billingAddressAdditionalLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="billingAddressStreetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="expiredCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cardFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cardLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="shippingAddressStreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="shippingAddressAdditionalLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="shippingAddressStreetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ageOfAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="newUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VCReply", propOrder = {
    "creationTimeStamp",
    "alternateShippingAddressCountryCode",
    "alternateShippingAddressPostalCode",
    "vcAccountLoginName",
    "vcAccountFirstName",
    "vcAccountLastName",
    "vcAccountEncryptedID",
    "vcAccountEmail",
    "vcAccountMobilePhoneNumber",
    "merchantReferenceID",
    "subtotalAmount",
    "shippingHandlingAmount",
    "taxAmount",
    "discountAmount",
    "giftWrapAmount",
    "uncategorizedAmount",
    "totalPurchaseAmount",
    "walletReferenceID",
    "promotionCode",
    "paymentInstrumentID",
    "cardVerificationStatus",
    "issuerID",
    "paymentInstrumentNickName",
    "nameOnCard",
    "cardType",
    "cardGroup",
    "cardArt",
    "riskAdvice",
    "riskScore",
    "riskAdditionalData",
    "avsCodeRaw",
    "cvnCodeRaw",
    "eciRaw",
    "eci",
    "cavv",
    "veresEnrolled",
    "veresTimeStamp",
    "paresStatus",
    "paresTimeStamp",
    "xid",
    "customData",
    "vcAccountFullName",
    "paymentDescription",
    "billingAddressStreetName",
    "billingAddressAdditionalLocation",
    "billingAddressStreetNumber",
    "expiredCard",
    "cardFirstName",
    "cardLastName",
    "shippingAddressStreetName",
    "shippingAddressAdditionalLocation",
    "shippingAddressStreetNumber",
    "ageOfAccount",
    "newUser"
})
public class VCReply {

    protected String creationTimeStamp;
    protected String alternateShippingAddressCountryCode;
    protected String alternateShippingAddressPostalCode;
    protected String vcAccountLoginName;
    protected String vcAccountFirstName;
    protected String vcAccountLastName;
    protected String vcAccountEncryptedID;
    protected String vcAccountEmail;
    protected String vcAccountMobilePhoneNumber;
    protected String merchantReferenceID;
    protected String subtotalAmount;
    protected String shippingHandlingAmount;
    protected String taxAmount;
    protected String discountAmount;
    protected String giftWrapAmount;
    protected String uncategorizedAmount;
    protected String totalPurchaseAmount;
    protected String walletReferenceID;
    protected String promotionCode;
    protected String paymentInstrumentID;
    protected String cardVerificationStatus;
    protected String issuerID;
    protected String paymentInstrumentNickName;
    protected String nameOnCard;
    protected String cardType;
    protected String cardGroup;
    protected VCCardArt cardArt;
    protected String riskAdvice;
    protected String riskScore;
    protected String riskAdditionalData;
    protected String avsCodeRaw;
    protected String cvnCodeRaw;
    protected String eciRaw;
    protected String eci;
    protected String cavv;
    protected String veresEnrolled;
    protected String veresTimeStamp;
    protected String paresStatus;
    protected String paresTimeStamp;
    protected String xid;
    protected VCCustomData customData;
    protected String vcAccountFullName;
    protected String paymentDescription;
    protected String billingAddressStreetName;
    protected String billingAddressAdditionalLocation;
    protected String billingAddressStreetNumber;
    protected String expiredCard;
    protected String cardFirstName;
    protected String cardLastName;
    protected String shippingAddressStreetName;
    protected String shippingAddressAdditionalLocation;
    protected String shippingAddressStreetNumber;
    protected String ageOfAccount;
    protected String newUser;

    /**
     * Gets the value of the creationTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationTimeStamp() {
        return creationTimeStamp;
    }

    /**
     * Sets the value of the creationTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationTimeStamp(String value) {
        this.creationTimeStamp = value;
    }

    /**
     * Gets the value of the alternateShippingAddressCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateShippingAddressCountryCode() {
        return alternateShippingAddressCountryCode;
    }

    /**
     * Sets the value of the alternateShippingAddressCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateShippingAddressCountryCode(String value) {
        this.alternateShippingAddressCountryCode = value;
    }

    /**
     * Gets the value of the alternateShippingAddressPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateShippingAddressPostalCode() {
        return alternateShippingAddressPostalCode;
    }

    /**
     * Sets the value of the alternateShippingAddressPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateShippingAddressPostalCode(String value) {
        this.alternateShippingAddressPostalCode = value;
    }

    /**
     * Gets the value of the vcAccountLoginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcAccountLoginName() {
        return vcAccountLoginName;
    }

    /**
     * Sets the value of the vcAccountLoginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcAccountLoginName(String value) {
        this.vcAccountLoginName = value;
    }

    /**
     * Gets the value of the vcAccountFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcAccountFirstName() {
        return vcAccountFirstName;
    }

    /**
     * Sets the value of the vcAccountFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcAccountFirstName(String value) {
        this.vcAccountFirstName = value;
    }

    /**
     * Gets the value of the vcAccountLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcAccountLastName() {
        return vcAccountLastName;
    }

    /**
     * Sets the value of the vcAccountLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcAccountLastName(String value) {
        this.vcAccountLastName = value;
    }

    /**
     * Gets the value of the vcAccountEncryptedID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcAccountEncryptedID() {
        return vcAccountEncryptedID;
    }

    /**
     * Sets the value of the vcAccountEncryptedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcAccountEncryptedID(String value) {
        this.vcAccountEncryptedID = value;
    }

    /**
     * Gets the value of the vcAccountEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcAccountEmail() {
        return vcAccountEmail;
    }

    /**
     * Sets the value of the vcAccountEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcAccountEmail(String value) {
        this.vcAccountEmail = value;
    }

    /**
     * Gets the value of the vcAccountMobilePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcAccountMobilePhoneNumber() {
        return vcAccountMobilePhoneNumber;
    }

    /**
     * Sets the value of the vcAccountMobilePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcAccountMobilePhoneNumber(String value) {
        this.vcAccountMobilePhoneNumber = value;
    }

    /**
     * Gets the value of the merchantReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantReferenceID() {
        return merchantReferenceID;
    }

    /**
     * Sets the value of the merchantReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantReferenceID(String value) {
        this.merchantReferenceID = value;
    }

    /**
     * Gets the value of the subtotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtotalAmount() {
        return subtotalAmount;
    }

    /**
     * Sets the value of the subtotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtotalAmount(String value) {
        this.subtotalAmount = value;
    }

    /**
     * Gets the value of the shippingHandlingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingHandlingAmount() {
        return shippingHandlingAmount;
    }

    /**
     * Sets the value of the shippingHandlingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingHandlingAmount(String value) {
        this.shippingHandlingAmount = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmount(String value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountAmount(String value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the giftWrapAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftWrapAmount() {
        return giftWrapAmount;
    }

    /**
     * Sets the value of the giftWrapAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftWrapAmount(String value) {
        this.giftWrapAmount = value;
    }

    /**
     * Gets the value of the uncategorizedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUncategorizedAmount() {
        return uncategorizedAmount;
    }

    /**
     * Sets the value of the uncategorizedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUncategorizedAmount(String value) {
        this.uncategorizedAmount = value;
    }

    /**
     * Gets the value of the totalPurchaseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPurchaseAmount() {
        return totalPurchaseAmount;
    }

    /**
     * Sets the value of the totalPurchaseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPurchaseAmount(String value) {
        this.totalPurchaseAmount = value;
    }

    /**
     * Gets the value of the walletReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletReferenceID() {
        return walletReferenceID;
    }

    /**
     * Sets the value of the walletReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletReferenceID(String value) {
        this.walletReferenceID = value;
    }

    /**
     * Gets the value of the promotionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * Sets the value of the promotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
    }

    /**
     * Gets the value of the paymentInstrumentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInstrumentID() {
        return paymentInstrumentID;
    }

    /**
     * Sets the value of the paymentInstrumentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInstrumentID(String value) {
        this.paymentInstrumentID = value;
    }

    /**
     * Gets the value of the cardVerificationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardVerificationStatus() {
        return cardVerificationStatus;
    }

    /**
     * Sets the value of the cardVerificationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardVerificationStatus(String value) {
        this.cardVerificationStatus = value;
    }

    /**
     * Gets the value of the issuerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerID() {
        return issuerID;
    }

    /**
     * Sets the value of the issuerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerID(String value) {
        this.issuerID = value;
    }

    /**
     * Gets the value of the paymentInstrumentNickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInstrumentNickName() {
        return paymentInstrumentNickName;
    }

    /**
     * Sets the value of the paymentInstrumentNickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInstrumentNickName(String value) {
        this.paymentInstrumentNickName = value;
    }

    /**
     * Gets the value of the nameOnCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOnCard() {
        return nameOnCard;
    }

    /**
     * Sets the value of the nameOnCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOnCard(String value) {
        this.nameOnCard = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the cardGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardGroup() {
        return cardGroup;
    }

    /**
     * Sets the value of the cardGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardGroup(String value) {
        this.cardGroup = value;
    }

    /**
     * Gets the value of the cardArt property.
     * 
     * @return
     *     possible object is
     *     {@link VCCardArt }
     *     
     */
    public VCCardArt getCardArt() {
        return cardArt;
    }

    /**
     * Sets the value of the cardArt property.
     * 
     * @param value
     *     allowed object is
     *     {@link VCCardArt }
     *     
     */
    public void setCardArt(VCCardArt value) {
        this.cardArt = value;
    }

    /**
     * Gets the value of the riskAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskAdvice() {
        return riskAdvice;
    }

    /**
     * Sets the value of the riskAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskAdvice(String value) {
        this.riskAdvice = value;
    }

    /**
     * Gets the value of the riskScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskScore() {
        return riskScore;
    }

    /**
     * Sets the value of the riskScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskScore(String value) {
        this.riskScore = value;
    }

    /**
     * Gets the value of the riskAdditionalData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskAdditionalData() {
        return riskAdditionalData;
    }

    /**
     * Sets the value of the riskAdditionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskAdditionalData(String value) {
        this.riskAdditionalData = value;
    }

    /**
     * Gets the value of the avsCodeRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvsCodeRaw() {
        return avsCodeRaw;
    }

    /**
     * Sets the value of the avsCodeRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvsCodeRaw(String value) {
        this.avsCodeRaw = value;
    }

    /**
     * Gets the value of the cvnCodeRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvnCodeRaw() {
        return cvnCodeRaw;
    }

    /**
     * Sets the value of the cvnCodeRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvnCodeRaw(String value) {
        this.cvnCodeRaw = value;
    }

    /**
     * Gets the value of the eciRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEciRaw() {
        return eciRaw;
    }

    /**
     * Sets the value of the eciRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEciRaw(String value) {
        this.eciRaw = value;
    }

    /**
     * Gets the value of the eci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEci() {
        return eci;
    }

    /**
     * Sets the value of the eci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEci(String value) {
        this.eci = value;
    }

    /**
     * Gets the value of the cavv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavv() {
        return cavv;
    }

    /**
     * Sets the value of the cavv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavv(String value) {
        this.cavv = value;
    }

    /**
     * Gets the value of the veresEnrolled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeresEnrolled() {
        return veresEnrolled;
    }

    /**
     * Sets the value of the veresEnrolled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeresEnrolled(String value) {
        this.veresEnrolled = value;
    }

    /**
     * Gets the value of the veresTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeresTimeStamp() {
        return veresTimeStamp;
    }

    /**
     * Sets the value of the veresTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeresTimeStamp(String value) {
        this.veresTimeStamp = value;
    }

    /**
     * Gets the value of the paresStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParesStatus() {
        return paresStatus;
    }

    /**
     * Sets the value of the paresStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParesStatus(String value) {
        this.paresStatus = value;
    }

    /**
     * Gets the value of the paresTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParesTimeStamp() {
        return paresTimeStamp;
    }

    /**
     * Sets the value of the paresTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParesTimeStamp(String value) {
        this.paresTimeStamp = value;
    }

    /**
     * Gets the value of the xid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXid() {
        return xid;
    }

    /**
     * Sets the value of the xid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXid(String value) {
        this.xid = value;
    }

    /**
     * Gets the value of the customData property.
     * 
     * @return
     *     possible object is
     *     {@link VCCustomData }
     *     
     */
    public VCCustomData getCustomData() {
        return customData;
    }

    /**
     * Sets the value of the customData property.
     * 
     * @param value
     *     allowed object is
     *     {@link VCCustomData }
     *     
     */
    public void setCustomData(VCCustomData value) {
        this.customData = value;
    }

    /**
     * Gets the value of the vcAccountFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcAccountFullName() {
        return vcAccountFullName;
    }

    /**
     * Sets the value of the vcAccountFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcAccountFullName(String value) {
        this.vcAccountFullName = value;
    }

    /**
     * Gets the value of the paymentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDescription() {
        return paymentDescription;
    }

    /**
     * Sets the value of the paymentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDescription(String value) {
        this.paymentDescription = value;
    }

    /**
     * Gets the value of the billingAddressStreetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddressStreetName() {
        return billingAddressStreetName;
    }

    /**
     * Sets the value of the billingAddressStreetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddressStreetName(String value) {
        this.billingAddressStreetName = value;
    }

    /**
     * Gets the value of the billingAddressAdditionalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddressAdditionalLocation() {
        return billingAddressAdditionalLocation;
    }

    /**
     * Sets the value of the billingAddressAdditionalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddressAdditionalLocation(String value) {
        this.billingAddressAdditionalLocation = value;
    }

    /**
     * Gets the value of the billingAddressStreetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddressStreetNumber() {
        return billingAddressStreetNumber;
    }

    /**
     * Sets the value of the billingAddressStreetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddressStreetNumber(String value) {
        this.billingAddressStreetNumber = value;
    }

    /**
     * Gets the value of the expiredCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiredCard() {
        return expiredCard;
    }

    /**
     * Sets the value of the expiredCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiredCard(String value) {
        this.expiredCard = value;
    }

    /**
     * Gets the value of the cardFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardFirstName() {
        return cardFirstName;
    }

    /**
     * Sets the value of the cardFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardFirstName(String value) {
        this.cardFirstName = value;
    }

    /**
     * Gets the value of the cardLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardLastName() {
        return cardLastName;
    }

    /**
     * Sets the value of the cardLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardLastName(String value) {
        this.cardLastName = value;
    }

    /**
     * Gets the value of the shippingAddressStreetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAddressStreetName() {
        return shippingAddressStreetName;
    }

    /**
     * Sets the value of the shippingAddressStreetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAddressStreetName(String value) {
        this.shippingAddressStreetName = value;
    }

    /**
     * Gets the value of the shippingAddressAdditionalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAddressAdditionalLocation() {
        return shippingAddressAdditionalLocation;
    }

    /**
     * Sets the value of the shippingAddressAdditionalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAddressAdditionalLocation(String value) {
        this.shippingAddressAdditionalLocation = value;
    }

    /**
     * Gets the value of the shippingAddressStreetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAddressStreetNumber() {
        return shippingAddressStreetNumber;
    }

    /**
     * Sets the value of the shippingAddressStreetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAddressStreetNumber(String value) {
        this.shippingAddressStreetNumber = value;
    }

    /**
     * Gets the value of the ageOfAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeOfAccount() {
        return ageOfAccount;
    }

    /**
     * Sets the value of the ageOfAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeOfAccount(String value) {
        this.ageOfAccount = value;
    }

    /**
     * Gets the value of the newUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewUser() {
        return newUser;
    }

    /**
     * Sets the value of the newUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewUser(String value) {
        this.newUser = value;
    }

}
