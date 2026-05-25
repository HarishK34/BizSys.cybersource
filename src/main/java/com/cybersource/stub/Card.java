
package com.cybersource.stub;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Card complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Card">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="expirationMonth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="expirationYear" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="cvIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cvNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="issueNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="startMonth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="startYear" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="accountEncoderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="bin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="encryptedData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="virtual" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cardTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cardSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="level2Eligible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="level3Eligible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="productCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="billingCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="billingCurrencyNumericCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="billingCurrencyMinorDigits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="usage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="prepaidReloadable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="prepaidType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="brands" type="{urn:schemas-cybersource-com:transaction-data-1.219}Brands" maxOccurs="5" minOccurs="0"/>
 *         <element name="fastFundsBusinessFundedTransferDomestic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="fastFundsBusinessFundedTransferCrossBorder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="fastFundsConsumerFundedTransferDomestic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="fastFundsConsumerFundedTransferCrossBorder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="octBusinessFundedTransferDomestic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="octBusinessFundedTransferCrossBorder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="octConsumerFundedTransferDomestic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="octConsumerFundedTransferCrossBorder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="octGamblingDomestic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="octGamblingCrossBorder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="fastFundsGamblingDomestic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="fastFundsGamblingCrossBorder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="octGeoRestrictionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="comboCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="prepaidIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="passPhrase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="personalData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hashedAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Card", propOrder = {
    "fullName",
    "accountNumber",
    "expirationMonth",
    "expirationYear",
    "cvIndicator",
    "cvNumber",
    "cardType",
    "issueNumber",
    "startMonth",
    "startYear",
    "pin",
    "accountEncoderID",
    "bin",
    "encryptedData",
    "suffix",
    "virtual",
    "prefix",
    "cardTypeName",
    "cardSubType",
    "level2Eligible",
    "level3Eligible",
    "productCategory",
    "billingCurrency",
    "billingCurrencyNumericCode",
    "billingCurrencyMinorDigits",
    "productName",
    "usage",
    "prepaidReloadable",
    "prepaidType",
    "brands",
    "fastFundsBusinessFundedTransferDomestic",
    "fastFundsBusinessFundedTransferCrossBorder",
    "fastFundsConsumerFundedTransferDomestic",
    "fastFundsConsumerFundedTransferCrossBorder",
    "octBusinessFundedTransferDomestic",
    "octBusinessFundedTransferCrossBorder",
    "octConsumerFundedTransferDomestic",
    "octConsumerFundedTransferCrossBorder",
    "octGamblingDomestic",
    "octGamblingCrossBorder",
    "fastFundsGamblingDomestic",
    "fastFundsGamblingCrossBorder",
    "octGeoRestrictionIndicator",
    "comboCardType",
    "prepaidIndicator",
    "passPhrase",
    "personalData",
    "hashedAccountNumber"
})
public class Card {

    protected String fullName;
    protected String accountNumber;
    protected BigInteger expirationMonth;
    protected BigInteger expirationYear;
    protected String cvIndicator;
    protected String cvNumber;
    protected String cardType;
    protected String issueNumber;
    protected BigInteger startMonth;
    protected BigInteger startYear;
    protected String pin;
    protected String accountEncoderID;
    protected String bin;
    protected String encryptedData;
    protected String suffix;
    protected String virtual;
    protected String prefix;
    protected String cardTypeName;
    protected String cardSubType;
    protected String level2Eligible;
    protected String level3Eligible;
    protected String productCategory;
    protected String billingCurrency;
    protected String billingCurrencyNumericCode;
    protected String billingCurrencyMinorDigits;
    protected String productName;
    protected String usage;
    protected String prepaidReloadable;
    protected String prepaidType;
    protected List<Brands> brands;
    protected String fastFundsBusinessFundedTransferDomestic;
    protected String fastFundsBusinessFundedTransferCrossBorder;
    protected String fastFundsConsumerFundedTransferDomestic;
    protected String fastFundsConsumerFundedTransferCrossBorder;
    protected String octBusinessFundedTransferDomestic;
    protected String octBusinessFundedTransferCrossBorder;
    protected String octConsumerFundedTransferDomestic;
    protected String octConsumerFundedTransferCrossBorder;
    protected String octGamblingDomestic;
    protected String octGamblingCrossBorder;
    protected String fastFundsGamblingDomestic;
    protected String fastFundsGamblingCrossBorder;
    protected String octGeoRestrictionIndicator;
    protected String comboCardType;
    protected String prepaidIndicator;
    protected String passPhrase;
    protected String personalData;
    protected String hashedAccountNumber;

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the expirationMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpirationMonth() {
        return expirationMonth;
    }

    /**
     * Sets the value of the expirationMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpirationMonth(BigInteger value) {
        this.expirationMonth = value;
    }

    /**
     * Gets the value of the expirationYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpirationYear() {
        return expirationYear;
    }

    /**
     * Sets the value of the expirationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpirationYear(BigInteger value) {
        this.expirationYear = value;
    }

    /**
     * Gets the value of the cvIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvIndicator() {
        return cvIndicator;
    }

    /**
     * Sets the value of the cvIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvIndicator(String value) {
        this.cvIndicator = value;
    }

    /**
     * Gets the value of the cvNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvNumber() {
        return cvNumber;
    }

    /**
     * Sets the value of the cvNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvNumber(String value) {
        this.cvNumber = value;
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
     * Gets the value of the issueNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueNumber() {
        return issueNumber;
    }

    /**
     * Sets the value of the issueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueNumber(String value) {
        this.issueNumber = value;
    }

    /**
     * Gets the value of the startMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartMonth() {
        return startMonth;
    }

    /**
     * Sets the value of the startMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartMonth(BigInteger value) {
        this.startMonth = value;
    }

    /**
     * Gets the value of the startYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartYear() {
        return startYear;
    }

    /**
     * Sets the value of the startYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartYear(BigInteger value) {
        this.startYear = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the accountEncoderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountEncoderID() {
        return accountEncoderID;
    }

    /**
     * Sets the value of the accountEncoderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountEncoderID(String value) {
        this.accountEncoderID = value;
    }

    /**
     * Gets the value of the bin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBin() {
        return bin;
    }

    /**
     * Sets the value of the bin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBin(String value) {
        this.bin = value;
    }

    /**
     * Gets the value of the encryptedData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedData() {
        return encryptedData;
    }

    /**
     * Sets the value of the encryptedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedData(String value) {
        this.encryptedData = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the virtual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtual() {
        return virtual;
    }

    /**
     * Sets the value of the virtual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtual(String value) {
        this.virtual = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the cardTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTypeName() {
        return cardTypeName;
    }

    /**
     * Sets the value of the cardTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTypeName(String value) {
        this.cardTypeName = value;
    }

    /**
     * Gets the value of the cardSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSubType() {
        return cardSubType;
    }

    /**
     * Sets the value of the cardSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSubType(String value) {
        this.cardSubType = value;
    }

    /**
     * Gets the value of the level2Eligible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel2Eligible() {
        return level2Eligible;
    }

    /**
     * Sets the value of the level2Eligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel2Eligible(String value) {
        this.level2Eligible = value;
    }

    /**
     * Gets the value of the level3Eligible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel3Eligible() {
        return level3Eligible;
    }

    /**
     * Sets the value of the level3Eligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel3Eligible(String value) {
        this.level3Eligible = value;
    }

    /**
     * Gets the value of the productCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * Sets the value of the productCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCategory(String value) {
        this.productCategory = value;
    }

    /**
     * Gets the value of the billingCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCurrency() {
        return billingCurrency;
    }

    /**
     * Sets the value of the billingCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCurrency(String value) {
        this.billingCurrency = value;
    }

    /**
     * Gets the value of the billingCurrencyNumericCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCurrencyNumericCode() {
        return billingCurrencyNumericCode;
    }

    /**
     * Sets the value of the billingCurrencyNumericCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCurrencyNumericCode(String value) {
        this.billingCurrencyNumericCode = value;
    }

    /**
     * Gets the value of the billingCurrencyMinorDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCurrencyMinorDigits() {
        return billingCurrencyMinorDigits;
    }

    /**
     * Sets the value of the billingCurrencyMinorDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCurrencyMinorDigits(String value) {
        this.billingCurrencyMinorDigits = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage(String value) {
        this.usage = value;
    }

    /**
     * Gets the value of the prepaidReloadable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepaidReloadable() {
        return prepaidReloadable;
    }

    /**
     * Sets the value of the prepaidReloadable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepaidReloadable(String value) {
        this.prepaidReloadable = value;
    }

    /**
     * Gets the value of the prepaidType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepaidType() {
        return prepaidType;
    }

    /**
     * Sets the value of the prepaidType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepaidType(String value) {
        this.prepaidType = value;
    }

    /**
     * Gets the value of the brands property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brands property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBrands().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Brands }
     * </p>
     * 
     * 
     * @return
     *     The value of the brands property.
     */
    public List<Brands> getBrands() {
        if (brands == null) {
            brands = new ArrayList<>();
        }
        return this.brands;
    }

    /**
     * Gets the value of the fastFundsBusinessFundedTransferDomestic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFastFundsBusinessFundedTransferDomestic() {
        return fastFundsBusinessFundedTransferDomestic;
    }

    /**
     * Sets the value of the fastFundsBusinessFundedTransferDomestic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFastFundsBusinessFundedTransferDomestic(String value) {
        this.fastFundsBusinessFundedTransferDomestic = value;
    }

    /**
     * Gets the value of the fastFundsBusinessFundedTransferCrossBorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFastFundsBusinessFundedTransferCrossBorder() {
        return fastFundsBusinessFundedTransferCrossBorder;
    }

    /**
     * Sets the value of the fastFundsBusinessFundedTransferCrossBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFastFundsBusinessFundedTransferCrossBorder(String value) {
        this.fastFundsBusinessFundedTransferCrossBorder = value;
    }

    /**
     * Gets the value of the fastFundsConsumerFundedTransferDomestic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFastFundsConsumerFundedTransferDomestic() {
        return fastFundsConsumerFundedTransferDomestic;
    }

    /**
     * Sets the value of the fastFundsConsumerFundedTransferDomestic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFastFundsConsumerFundedTransferDomestic(String value) {
        this.fastFundsConsumerFundedTransferDomestic = value;
    }

    /**
     * Gets the value of the fastFundsConsumerFundedTransferCrossBorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFastFundsConsumerFundedTransferCrossBorder() {
        return fastFundsConsumerFundedTransferCrossBorder;
    }

    /**
     * Sets the value of the fastFundsConsumerFundedTransferCrossBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFastFundsConsumerFundedTransferCrossBorder(String value) {
        this.fastFundsConsumerFundedTransferCrossBorder = value;
    }

    /**
     * Gets the value of the octBusinessFundedTransferDomestic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOctBusinessFundedTransferDomestic() {
        return octBusinessFundedTransferDomestic;
    }

    /**
     * Sets the value of the octBusinessFundedTransferDomestic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOctBusinessFundedTransferDomestic(String value) {
        this.octBusinessFundedTransferDomestic = value;
    }

    /**
     * Gets the value of the octBusinessFundedTransferCrossBorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOctBusinessFundedTransferCrossBorder() {
        return octBusinessFundedTransferCrossBorder;
    }

    /**
     * Sets the value of the octBusinessFundedTransferCrossBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOctBusinessFundedTransferCrossBorder(String value) {
        this.octBusinessFundedTransferCrossBorder = value;
    }

    /**
     * Gets the value of the octConsumerFundedTransferDomestic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOctConsumerFundedTransferDomestic() {
        return octConsumerFundedTransferDomestic;
    }

    /**
     * Sets the value of the octConsumerFundedTransferDomestic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOctConsumerFundedTransferDomestic(String value) {
        this.octConsumerFundedTransferDomestic = value;
    }

    /**
     * Gets the value of the octConsumerFundedTransferCrossBorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOctConsumerFundedTransferCrossBorder() {
        return octConsumerFundedTransferCrossBorder;
    }

    /**
     * Sets the value of the octConsumerFundedTransferCrossBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOctConsumerFundedTransferCrossBorder(String value) {
        this.octConsumerFundedTransferCrossBorder = value;
    }

    /**
     * Gets the value of the octGamblingDomestic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOctGamblingDomestic() {
        return octGamblingDomestic;
    }

    /**
     * Sets the value of the octGamblingDomestic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOctGamblingDomestic(String value) {
        this.octGamblingDomestic = value;
    }

    /**
     * Gets the value of the octGamblingCrossBorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOctGamblingCrossBorder() {
        return octGamblingCrossBorder;
    }

    /**
     * Sets the value of the octGamblingCrossBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOctGamblingCrossBorder(String value) {
        this.octGamblingCrossBorder = value;
    }

    /**
     * Gets the value of the fastFundsGamblingDomestic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFastFundsGamblingDomestic() {
        return fastFundsGamblingDomestic;
    }

    /**
     * Sets the value of the fastFundsGamblingDomestic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFastFundsGamblingDomestic(String value) {
        this.fastFundsGamblingDomestic = value;
    }

    /**
     * Gets the value of the fastFundsGamblingCrossBorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFastFundsGamblingCrossBorder() {
        return fastFundsGamblingCrossBorder;
    }

    /**
     * Sets the value of the fastFundsGamblingCrossBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFastFundsGamblingCrossBorder(String value) {
        this.fastFundsGamblingCrossBorder = value;
    }

    /**
     * Gets the value of the octGeoRestrictionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOctGeoRestrictionIndicator() {
        return octGeoRestrictionIndicator;
    }

    /**
     * Sets the value of the octGeoRestrictionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOctGeoRestrictionIndicator(String value) {
        this.octGeoRestrictionIndicator = value;
    }

    /**
     * Gets the value of the comboCardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComboCardType() {
        return comboCardType;
    }

    /**
     * Sets the value of the comboCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComboCardType(String value) {
        this.comboCardType = value;
    }

    /**
     * Gets the value of the prepaidIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepaidIndicator() {
        return prepaidIndicator;
    }

    /**
     * Sets the value of the prepaidIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepaidIndicator(String value) {
        this.prepaidIndicator = value;
    }

    /**
     * Gets the value of the passPhrase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassPhrase() {
        return passPhrase;
    }

    /**
     * Sets the value of the passPhrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassPhrase(String value) {
        this.passPhrase = value;
    }

    /**
     * Gets the value of the personalData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalData() {
        return personalData;
    }

    /**
     * Sets the value of the personalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalData(String value) {
        this.personalData = value;
    }

    /**
     * Gets the value of the hashedAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashedAccountNumber() {
        return hashedAccountNumber;
    }

    /**
     * Sets the value of the hashedAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashedAccountNumber(String value) {
        this.hashedAccountNumber = value;
    }

}
