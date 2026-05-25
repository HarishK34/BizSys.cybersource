
package com.cybersource.stub;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayerAuthEnrollReply complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PayerAuthEnrollReply">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         <element name="acsURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="accessToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authenticationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authenticationStatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cavv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cavvAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="commerceIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="eci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="eciRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paReq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="proxyPAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="xid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="proofXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ucafAuthenticationData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ucafCollectionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paresStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="veresEnrolled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authenticationPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="specificationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authenticationTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="directoryServerTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="challengeRequired" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="threeDSServerTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="acsRenderingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="acsTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authenticationType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="cardholderMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="directoryServerErrorCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="directoryServerErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ivrEnabledMessage" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="ivrEncryptionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ivrEncryptionMandatory" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="ivrEncryptionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ivrLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ivrPrompt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ivrStatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sdkTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="stepUpUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="whiteListStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="whiteListStatusSource" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="effectiveAuthenticationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authenticationStatusReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="networkScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authorizationPayload" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         <element name="challengeCancelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="decoupledAuthenticationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cardBin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cardTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="transactionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="resendCountRemaining" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="acsReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="acsOperatorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="idciScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="idciDecision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="idciReasonCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="idciReasonCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authenticationOutageExemptionIndicator" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="exemptionDataRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayerAuthEnrollReply", propOrder = {
    "reasonCode",
    "acsURL",
    "accessToken",
    "authenticationResult",
    "authenticationStatusMessage",
    "cavv",
    "cavvAlgorithm",
    "commerceIndicator",
    "eci",
    "eciRaw",
    "paReq",
    "proxyPAN",
    "xid",
    "proofXML",
    "ucafAuthenticationData",
    "ucafCollectionIndicator",
    "paresStatus",
    "veresEnrolled",
    "authenticationPath",
    "specificationVersion",
    "authenticationTransactionID",
    "directoryServerTransactionID",
    "challengeRequired",
    "threeDSServerTransactionID",
    "acsRenderingType",
    "acsTransactionID",
    "authenticationType",
    "cardholderMessage",
    "directoryServerErrorCode",
    "directoryServerErrorDescription",
    "ivrEnabledMessage",
    "ivrEncryptionKey",
    "ivrEncryptionMandatory",
    "ivrEncryptionType",
    "ivrLabel",
    "ivrPrompt",
    "ivrStatusMessage",
    "sdkTransactionID",
    "stepUpUrl",
    "whiteListStatus",
    "whiteListStatusSource",
    "effectiveAuthenticationType",
    "authenticationStatusReason",
    "networkScore",
    "authorizationPayload",
    "challengeCancelCode",
    "decoupledAuthenticationIndicator",
    "cardBin",
    "cardTypeName",
    "transactionIndicator",
    "resendCountRemaining",
    "acsReferenceNumber",
    "acsOperatorId",
    "idciScore",
    "idciDecision",
    "idciReasonCode1",
    "idciReasonCode2",
    "authenticationOutageExemptionIndicator",
    "exemptionDataRaw"
})
public class PayerAuthEnrollReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String acsURL;
    protected String accessToken;
    protected String authenticationResult;
    protected String authenticationStatusMessage;
    protected String cavv;
    protected String cavvAlgorithm;
    protected String commerceIndicator;
    protected String eci;
    protected String eciRaw;
    protected String paReq;
    protected String proxyPAN;
    protected String xid;
    protected String proofXML;
    protected String ucafAuthenticationData;
    protected String ucafCollectionIndicator;
    protected String paresStatus;
    protected String veresEnrolled;
    protected String authenticationPath;
    protected String specificationVersion;
    protected String authenticationTransactionID;
    protected String directoryServerTransactionID;
    protected String challengeRequired;
    protected String threeDSServerTransactionID;
    protected String acsRenderingType;
    protected String acsTransactionID;
    protected BigInteger authenticationType;
    protected String cardholderMessage;
    protected BigInteger directoryServerErrorCode;
    protected String directoryServerErrorDescription;
    protected String ivrEnabledMessage;
    protected String ivrEncryptionKey;
    protected String ivrEncryptionMandatory;
    protected String ivrEncryptionType;
    protected String ivrLabel;
    protected String ivrPrompt;
    protected String ivrStatusMessage;
    protected String sdkTransactionID;
    protected String stepUpUrl;
    protected String whiteListStatus;
    protected BigInteger whiteListStatusSource;
    protected String effectiveAuthenticationType;
    protected String authenticationStatusReason;
    protected String networkScore;
    protected byte[] authorizationPayload;
    protected String challengeCancelCode;
    protected String decoupledAuthenticationIndicator;
    protected String cardBin;
    protected String cardTypeName;
    protected String transactionIndicator;
    protected String resendCountRemaining;
    protected String acsReferenceNumber;
    protected String acsOperatorId;
    protected BigInteger idciScore;
    protected String idciDecision;
    protected String idciReasonCode1;
    protected String idciReasonCode2;
    protected BigInteger authenticationOutageExemptionIndicator;
    protected String exemptionDataRaw;

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
     * Gets the value of the acsURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcsURL() {
        return acsURL;
    }

    /**
     * Sets the value of the acsURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcsURL(String value) {
        this.acsURL = value;
    }

    /**
     * Gets the value of the accessToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Sets the value of the accessToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessToken(String value) {
        this.accessToken = value;
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
     * Gets the value of the paReq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaReq() {
        return paReq;
    }

    /**
     * Sets the value of the paReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaReq(String value) {
        this.paReq = value;
    }

    /**
     * Gets the value of the proxyPAN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyPAN() {
        return proxyPAN;
    }

    /**
     * Sets the value of the proxyPAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyPAN(String value) {
        this.proxyPAN = value;
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
     * Gets the value of the proofXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProofXML() {
        return proofXML;
    }

    /**
     * Sets the value of the proofXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProofXML(String value) {
        this.proofXML = value;
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
     * Gets the value of the authenticationPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationPath() {
        return authenticationPath;
    }

    /**
     * Sets the value of the authenticationPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationPath(String value) {
        this.authenticationPath = value;
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
     * Gets the value of the cardholderMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderMessage() {
        return cardholderMessage;
    }

    /**
     * Sets the value of the cardholderMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderMessage(String value) {
        this.cardholderMessage = value;
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
     * Gets the value of the ivrEnabledMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvrEnabledMessage() {
        return ivrEnabledMessage;
    }

    /**
     * Sets the value of the ivrEnabledMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvrEnabledMessage(String value) {
        this.ivrEnabledMessage = value;
    }

    /**
     * Gets the value of the ivrEncryptionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvrEncryptionKey() {
        return ivrEncryptionKey;
    }

    /**
     * Sets the value of the ivrEncryptionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvrEncryptionKey(String value) {
        this.ivrEncryptionKey = value;
    }

    /**
     * Gets the value of the ivrEncryptionMandatory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvrEncryptionMandatory() {
        return ivrEncryptionMandatory;
    }

    /**
     * Sets the value of the ivrEncryptionMandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvrEncryptionMandatory(String value) {
        this.ivrEncryptionMandatory = value;
    }

    /**
     * Gets the value of the ivrEncryptionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvrEncryptionType() {
        return ivrEncryptionType;
    }

    /**
     * Sets the value of the ivrEncryptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvrEncryptionType(String value) {
        this.ivrEncryptionType = value;
    }

    /**
     * Gets the value of the ivrLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvrLabel() {
        return ivrLabel;
    }

    /**
     * Sets the value of the ivrLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvrLabel(String value) {
        this.ivrLabel = value;
    }

    /**
     * Gets the value of the ivrPrompt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvrPrompt() {
        return ivrPrompt;
    }

    /**
     * Sets the value of the ivrPrompt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvrPrompt(String value) {
        this.ivrPrompt = value;
    }

    /**
     * Gets the value of the ivrStatusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvrStatusMessage() {
        return ivrStatusMessage;
    }

    /**
     * Sets the value of the ivrStatusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvrStatusMessage(String value) {
        this.ivrStatusMessage = value;
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
     * Gets the value of the stepUpUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStepUpUrl() {
        return stepUpUrl;
    }

    /**
     * Sets the value of the stepUpUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStepUpUrl(String value) {
        this.stepUpUrl = value;
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
     * Gets the value of the networkScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkScore() {
        return networkScore;
    }

    /**
     * Sets the value of the networkScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkScore(String value) {
        this.networkScore = value;
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
     * Gets the value of the transactionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionIndicator() {
        return transactionIndicator;
    }

    /**
     * Sets the value of the transactionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionIndicator(String value) {
        this.transactionIndicator = value;
    }

    /**
     * Gets the value of the resendCountRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResendCountRemaining() {
        return resendCountRemaining;
    }

    /**
     * Sets the value of the resendCountRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResendCountRemaining(String value) {
        this.resendCountRemaining = value;
    }

    /**
     * Gets the value of the acsReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcsReferenceNumber() {
        return acsReferenceNumber;
    }

    /**
     * Sets the value of the acsReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcsReferenceNumber(String value) {
        this.acsReferenceNumber = value;
    }

    /**
     * Gets the value of the acsOperatorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcsOperatorId() {
        return acsOperatorId;
    }

    /**
     * Sets the value of the acsOperatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcsOperatorId(String value) {
        this.acsOperatorId = value;
    }

    /**
     * Gets the value of the idciScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdciScore() {
        return idciScore;
    }

    /**
     * Sets the value of the idciScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdciScore(BigInteger value) {
        this.idciScore = value;
    }

    /**
     * Gets the value of the idciDecision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdciDecision() {
        return idciDecision;
    }

    /**
     * Sets the value of the idciDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdciDecision(String value) {
        this.idciDecision = value;
    }

    /**
     * Gets the value of the idciReasonCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdciReasonCode1() {
        return idciReasonCode1;
    }

    /**
     * Sets the value of the idciReasonCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdciReasonCode1(String value) {
        this.idciReasonCode1 = value;
    }

    /**
     * Gets the value of the idciReasonCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdciReasonCode2() {
        return idciReasonCode2;
    }

    /**
     * Sets the value of the idciReasonCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdciReasonCode2(String value) {
        this.idciReasonCode2 = value;
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

    /**
     * Gets the value of the exemptionDataRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptionDataRaw() {
        return exemptionDataRaw;
    }

    /**
     * Sets the value of the exemptionDataRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptionDataRaw(String value) {
        this.exemptionDataRaw = value;
    }

}
