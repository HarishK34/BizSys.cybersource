
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GiftCard complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GiftCard">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="originalRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="redemptionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="count" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="escheatable" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="groupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="transactionPostingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="balanceCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="previousBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="currentBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="baseCurrencyPreviousBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="baseCurrencyCurrentBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="baseCurrencyCashbackAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="baseCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="exchangeRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="bonusAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="discountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="extendedAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="additionalAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="physicalCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="returnExtendedAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="promoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiftCard", propOrder = {
    "originalRequestID",
    "redemptionType",
    "count",
    "escheatable",
    "groupID",
    "transactionPostingDate",
    "balanceCurrency",
    "previousBalance",
    "currentBalance",
    "baseCurrencyPreviousBalance",
    "baseCurrencyCurrentBalance",
    "baseCurrencyCashbackAmount",
    "baseCurrency",
    "expirationDate",
    "exchangeRate",
    "bonusAmount",
    "discountAmount",
    "extendedAccountNumber",
    "additionalAccountNumber",
    "physicalCard",
    "returnExtendedAccountNumber",
    "promoCode"
})
public class GiftCard {

    protected String originalRequestID;
    protected String redemptionType;
    protected String count;
    protected String escheatable;
    protected String groupID;
    protected String transactionPostingDate;
    protected String balanceCurrency;
    protected String previousBalance;
    protected String currentBalance;
    protected String baseCurrencyPreviousBalance;
    protected String baseCurrencyCurrentBalance;
    protected String baseCurrencyCashbackAmount;
    protected String baseCurrency;
    protected String expirationDate;
    protected String exchangeRate;
    protected String bonusAmount;
    protected String discountAmount;
    protected String extendedAccountNumber;
    protected String additionalAccountNumber;
    protected String physicalCard;
    protected String returnExtendedAccountNumber;
    protected String promoCode;

    /**
     * Gets the value of the originalRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalRequestID() {
        return originalRequestID;
    }

    /**
     * Sets the value of the originalRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalRequestID(String value) {
        this.originalRequestID = value;
    }

    /**
     * Gets the value of the redemptionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionType() {
        return redemptionType;
    }

    /**
     * Sets the value of the redemptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionType(String value) {
        this.redemptionType = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCount(String value) {
        this.count = value;
    }

    /**
     * Gets the value of the escheatable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscheatable() {
        return escheatable;
    }

    /**
     * Sets the value of the escheatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscheatable(String value) {
        this.escheatable = value;
    }

    /**
     * Gets the value of the groupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupID() {
        return groupID;
    }

    /**
     * Sets the value of the groupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupID(String value) {
        this.groupID = value;
    }

    /**
     * Gets the value of the transactionPostingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionPostingDate() {
        return transactionPostingDate;
    }

    /**
     * Sets the value of the transactionPostingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionPostingDate(String value) {
        this.transactionPostingDate = value;
    }

    /**
     * Gets the value of the balanceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceCurrency() {
        return balanceCurrency;
    }

    /**
     * Sets the value of the balanceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceCurrency(String value) {
        this.balanceCurrency = value;
    }

    /**
     * Gets the value of the previousBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousBalance() {
        return previousBalance;
    }

    /**
     * Sets the value of the previousBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousBalance(String value) {
        this.previousBalance = value;
    }

    /**
     * Gets the value of the currentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Sets the value of the currentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentBalance(String value) {
        this.currentBalance = value;
    }

    /**
     * Gets the value of the baseCurrencyPreviousBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCurrencyPreviousBalance() {
        return baseCurrencyPreviousBalance;
    }

    /**
     * Sets the value of the baseCurrencyPreviousBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCurrencyPreviousBalance(String value) {
        this.baseCurrencyPreviousBalance = value;
    }

    /**
     * Gets the value of the baseCurrencyCurrentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCurrencyCurrentBalance() {
        return baseCurrencyCurrentBalance;
    }

    /**
     * Sets the value of the baseCurrencyCurrentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCurrencyCurrentBalance(String value) {
        this.baseCurrencyCurrentBalance = value;
    }

    /**
     * Gets the value of the baseCurrencyCashbackAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCurrencyCashbackAmount() {
        return baseCurrencyCashbackAmount;
    }

    /**
     * Sets the value of the baseCurrencyCashbackAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCurrencyCashbackAmount(String value) {
        this.baseCurrencyCashbackAmount = value;
    }

    /**
     * Gets the value of the baseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCurrency() {
        return baseCurrency;
    }

    /**
     * Sets the value of the baseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCurrency(String value) {
        this.baseCurrency = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRate(String value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the bonusAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBonusAmount() {
        return bonusAmount;
    }

    /**
     * Sets the value of the bonusAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBonusAmount(String value) {
        this.bonusAmount = value;
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
     * Gets the value of the extendedAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedAccountNumber() {
        return extendedAccountNumber;
    }

    /**
     * Sets the value of the extendedAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedAccountNumber(String value) {
        this.extendedAccountNumber = value;
    }

    /**
     * Gets the value of the additionalAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAccountNumber() {
        return additionalAccountNumber;
    }

    /**
     * Sets the value of the additionalAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAccountNumber(String value) {
        this.additionalAccountNumber = value;
    }

    /**
     * Gets the value of the physicalCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalCard() {
        return physicalCard;
    }

    /**
     * Sets the value of the physicalCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalCard(String value) {
        this.physicalCard = value;
    }

    /**
     * Gets the value of the returnExtendedAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnExtendedAccountNumber() {
        return returnExtendedAccountNumber;
    }

    /**
     * Sets the value of the returnExtendedAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnExtendedAccountNumber(String value) {
        this.returnExtendedAccountNumber = value;
    }

    /**
     * Gets the value of the promoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoCode() {
        return promoCode;
    }

    /**
     * Sets the value of the promoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoCode(String value) {
        this.promoCode = value;
    }

}
