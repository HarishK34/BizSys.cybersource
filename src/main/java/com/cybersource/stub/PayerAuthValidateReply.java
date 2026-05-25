
package com.cybersource.stub;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayerAuthValidateReply complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PayerAuthValidateReply">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         <element name="authenticationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authenticationStatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cavv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cavvAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="commerceIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="eci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="eciRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="xid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ucafAuthenticationData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ucafCollectionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paresStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="specificationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="directoryServerTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="threeDSServerTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="acsRenderingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="acsTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authenticationType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="directoryServerErrorCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="directoryServerErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="interactionCounter" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="sdkTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="whiteListStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="whiteListStatusSource" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="effectiveAuthenticationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authenticationStatusReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="challengeCancelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authorizationPayload" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         <element name="cardBin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cardTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authenticationOutageExemptionIndicator" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayerAuthValidateReply", propOrder = {
    "reasonCode",
    "authenticationResult",
    "authenticationStatusMessage",
    "cavv",
    "cavvAlgorithm",
    "commerceIndicator",
    "eci",
    "eciRaw",
    "xid",
    "ucafAuthenticationData",
    "ucafCollectionIndicator",
    "paresStatus",
    "specificationVersion",
    "directoryServerTransactionID",
    "threeDSServerTransactionID",
    "acsRenderingType",
    "acsTransactionID",
    "authenticationType",
    "directoryServerErrorCode",
    "directoryServerErrorDescription",
    "interactionCounter",
    "sdkTransactionID",
    "whiteListStatus",
    "whiteListStatusSource",
    "effectiveAuthenticationType",
    "authenticationStatusReason",
    "challengeCancelCode",
    "authorizationPayload",
    "cardBin",
    "cardTypeName",
    "authenticationOutageExemptionIndicator"
})
public class PayerAuthValidateReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String authenticationResult;
    protected String authenticationStatusMessage;
    protected String cavv;
    protected String cavvAlgorithm;
    protected String commerceIndicator;
    protected String eci;
    protected String eciRaw;
    protected String xid;
    protected String ucafAuthenticationData;
    protected String ucafCollectionIndicator;
    protected String paresStatus;
    protected String specificationVersion;
    protected String directoryServerTransactionID;
    protected String threeDSServerTransactionID;
    protected String acsRenderingType;
    protected String acsTransactionID;
    protected BigInteger authenticationType;
    protected BigInteger directoryServerErrorCode;
    protected String directoryServerErrorDescription;
    protected BigInteger interactionCounter;
    protected String sdkTransactionID;
    protected String whiteListStatus;
    protected BigInteger whiteListStatusSource;
    protected String effectiveAuthenticationType;
    protected String authenticationStatusReason;
    protected String challengeCancelCode;
    protected byte[] authorizationPayload;
    protected String cardBin;
    protected String cardTypeName;
    protected BigInteger authenticationOutageExemptionIndicator;

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReasonCode(BigInteger value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the authenticationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationResult() {
        return authenticationResult;
    }

    /**
     * Sets the value of the authenticationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationResult(String value) {
        this.authenticationResult = value;
    }

    /**
     * Gets the value of the authenticationStatusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationStatusMessage() {
        return authenticationStatusMessage;
    }

    /**
     * Sets the value of the authenticationStatusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationStatusMessage(String value) {
        this.authenticationStatusMessage = value;
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
     * Gets the value of the cavvAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavvAlgorithm() {
        return cavvAlgorithm;
    }

    /**
     * Sets the value of the cavvAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavvAlgorithm(String value) {
        this.cavvAlgorithm = value;
    }

    /**
     * Gets the value of the commerceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommerceIndicator() {
        return commerceIndicator;
    }

    /**
     * Sets the value of the commerceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommerceIndicator(String value) {
        this.commerceIndicator = value;
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
     * Gets the value of the ucafAuthenticationData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUcafAuthenticationData() {
        return ucafAuthenticationData;
    }

    /**
     * Sets the value of the ucafAuthenticationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUcafAuthenticationData(String value) {
        this.ucafAuthenticationData = value;
    }

    /**
     * Gets the value of the ucafCollectionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUcafCollectionIndicator() {
        return ucafCollectionIndicator;
    }

    /**
     * Sets the value of the ucafCollectionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUcafCollectionIndicator(String value) {
        this.ucafCollectionIndicator = value;
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
     * Gets the value of the specificationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificationVersion() {
        return specificationVersion;
    }

    /**
     * Sets the value of the specificationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificationVersion(String value) {
        this.specificationVersion = value;
    }

    /**
     * Gets the value of the directoryServerTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryServerTransactionID() {
        return directoryServerTransactionID;
    }

    /**
     * Sets the value of the directoryServerTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryServerTransactionID(String value) {
        this.directoryServerTransactionID = value;
    }

    /**
     * Gets the value of the threeDSServerTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeDSServerTransactionID() {
        return threeDSServerTransactionID;
    }

    /**
     * Sets the value of the threeDSServerTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeDSServerTransactionID(String value) {
        this.threeDSServerTransactionID = value;
    }

    /**
     * Gets the value of the acsRenderingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcsRenderingType() {
        return acsRenderingType;
    }

    /**
     * Sets the value of the acsRenderingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcsRenderingType(String value) {
        this.acsRenderingType = value;
    }

    /**
     * Gets the value of the acsTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcsTransactionID() {
        return acsTransactionID;
    }

    /**
     * Sets the value of the acsTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcsTransactionID(String value) {
        this.acsTransactionID = value;
    }

    /**
     * Gets the value of the authenticationType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Sets the value of the authenticationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuthenticationType(BigInteger value) {
        this.authenticationType = value;
    }

    /**
     * Gets the value of the directoryServerErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDirectoryServerErrorCode() {
        return directoryServerErrorCode;
    }

    /**
     * Sets the value of the directoryServerErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDirectoryServerErrorCode(BigInteger value) {
        this.directoryServerErrorCode = value;
    }

    /**
     * Gets the value of the directoryServerErrorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryServerErrorDescription() {
        return directoryServerErrorDescription;
    }

    /**
     * Sets the value of the directoryServerErrorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryServerErrorDescription(String value) {
        this.directoryServerErrorDescription = value;
    }

    /**
     * Gets the value of the interactionCounter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInteractionCounter() {
        return interactionCounter;
    }

    /**
     * Sets the value of the interactionCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInteractionCounter(BigInteger value) {
        this.interactionCounter = value;
    }

    /**
     * Gets the value of the sdkTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSdkTransactionID() {
        return sdkTransactionID;
    }

    /**
     * Sets the value of the sdkTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSdkTransactionID(String value) {
        this.sdkTransactionID = value;
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
     * Gets the value of the whiteListStatusSource property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWhiteListStatusSource() {
        return whiteListStatusSource;
    }

    /**
     * Sets the value of the whiteListStatusSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWhiteListStatusSource(BigInteger value) {
        this.whiteListStatusSource = value;
    }

    /**
     * Gets the value of the effectiveAuthenticationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveAuthenticationType() {
        return effectiveAuthenticationType;
    }

    /**
     * Sets the value of the effectiveAuthenticationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveAuthenticationType(String value) {
        this.effectiveAuthenticationType = value;
    }

    /**
     * Gets the value of the authenticationStatusReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationStatusReason() {
        return authenticationStatusReason;
    }

    /**
     * Sets the value of the authenticationStatusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationStatusReason(String value) {
        this.authenticationStatusReason = value;
    }

    /**
     * Gets the value of the challengeCancelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallengeCancelCode() {
        return challengeCancelCode;
    }

    /**
     * Sets the value of the challengeCancelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallengeCancelCode(String value) {
        this.challengeCancelCode = value;
    }

    /**
     * Gets the value of the authorizationPayload property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAuthorizationPayload() {
        return authorizationPayload;
    }

    /**
     * Sets the value of the authorizationPayload property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAuthorizationPayload(byte[] value) {
        this.authorizationPayload = value;
    }

    /**
     * Gets the value of the cardBin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBin() {
        return cardBin;
    }

    /**
     * Sets the value of the cardBin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardBin(String value) {
        this.cardBin = value;
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
     * Gets the value of the authenticationOutageExemptionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuthenticationOutageExemptionIndicator() {
        return authenticationOutageExemptionIndicator;
    }

    /**
     * Sets the value of the authenticationOutageExemptionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuthenticationOutageExemptionIndicator(BigInteger value) {
        this.authenticationOutageExemptionIndicator = value;
    }

}
