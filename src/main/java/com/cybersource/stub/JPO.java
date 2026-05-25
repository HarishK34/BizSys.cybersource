
package com.cybersource.stub;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JPO complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="JPO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="paymentMethod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="bonusAmount" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="bonuses" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="installments" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="firstBillingMonth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="jccaTerminalID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="issuerMessage" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="jis2TrackData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="businessNameAlphanumeric" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="businessNameJapanese" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="businessNameKatakana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="bonusMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="secondBonusMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="secondBonusAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="preapprovalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JPO", propOrder = {
    "paymentMethod",
    "bonusAmount",
    "bonuses",
    "installments",
    "firstBillingMonth",
    "jccaTerminalID",
    "issuerMessage",
    "jis2TrackData",
    "businessNameAlphanumeric",
    "businessNameJapanese",
    "businessNameKatakana",
    "bonusMonth",
    "secondBonusMonth",
    "secondBonusAmount",
    "preapprovalType"
})
public class JPO {

    protected BigInteger paymentMethod;
    protected String bonusAmount;
    protected BigInteger bonuses;
    protected BigInteger installments;
    protected BigInteger firstBillingMonth;
    protected BigInteger jccaTerminalID;
    protected BigInteger issuerMessage;
    protected String jis2TrackData;
    protected String businessNameAlphanumeric;
    protected String businessNameJapanese;
    protected String businessNameKatakana;
    protected String bonusMonth;
    protected String secondBonusMonth;
    protected String secondBonusAmount;
    protected String preapprovalType;

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPaymentMethod(BigInteger value) {
        this.paymentMethod = value;
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
     * Gets the value of the bonuses property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBonuses() {
        return bonuses;
    }

    /**
     * Sets the value of the bonuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBonuses(BigInteger value) {
        this.bonuses = value;
    }

    /**
     * Gets the value of the installments property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInstallments() {
        return installments;
    }

    /**
     * Sets the value of the installments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInstallments(BigInteger value) {
        this.installments = value;
    }

    /**
     * Gets the value of the firstBillingMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstBillingMonth() {
        return firstBillingMonth;
    }

    /**
     * Sets the value of the firstBillingMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirstBillingMonth(BigInteger value) {
        this.firstBillingMonth = value;
    }

    /**
     * Gets the value of the jccaTerminalID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJccaTerminalID() {
        return jccaTerminalID;
    }

    /**
     * Sets the value of the jccaTerminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJccaTerminalID(BigInteger value) {
        this.jccaTerminalID = value;
    }

    /**
     * Gets the value of the issuerMessage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIssuerMessage() {
        return issuerMessage;
    }

    /**
     * Sets the value of the issuerMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIssuerMessage(BigInteger value) {
        this.issuerMessage = value;
    }

    /**
     * Gets the value of the jis2TrackData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJis2TrackData() {
        return jis2TrackData;
    }

    /**
     * Sets the value of the jis2TrackData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJis2TrackData(String value) {
        this.jis2TrackData = value;
    }

    /**
     * Gets the value of the businessNameAlphanumeric property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessNameAlphanumeric() {
        return businessNameAlphanumeric;
    }

    /**
     * Sets the value of the businessNameAlphanumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessNameAlphanumeric(String value) {
        this.businessNameAlphanumeric = value;
    }

    /**
     * Gets the value of the businessNameJapanese property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessNameJapanese() {
        return businessNameJapanese;
    }

    /**
     * Sets the value of the businessNameJapanese property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessNameJapanese(String value) {
        this.businessNameJapanese = value;
    }

    /**
     * Gets the value of the businessNameKatakana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessNameKatakana() {
        return businessNameKatakana;
    }

    /**
     * Sets the value of the businessNameKatakana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessNameKatakana(String value) {
        this.businessNameKatakana = value;
    }

    /**
     * Gets the value of the bonusMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBonusMonth() {
        return bonusMonth;
    }

    /**
     * Sets the value of the bonusMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBonusMonth(String value) {
        this.bonusMonth = value;
    }

    /**
     * Gets the value of the secondBonusMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondBonusMonth() {
        return secondBonusMonth;
    }

    /**
     * Sets the value of the secondBonusMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondBonusMonth(String value) {
        this.secondBonusMonth = value;
    }

    /**
     * Gets the value of the secondBonusAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondBonusAmount() {
        return secondBonusAmount;
    }

    /**
     * Sets the value of the secondBonusAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondBonusAmount(String value) {
        this.secondBonusAmount = value;
    }

    /**
     * Gets the value of the preapprovalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreapprovalType() {
        return preapprovalType;
    }

    /**
     * Sets the value of the preapprovalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreapprovalType(String value) {
        this.preapprovalType = value;
    }

}
