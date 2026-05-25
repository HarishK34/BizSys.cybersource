
package com.cybersource.stub;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ECAVSReply complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ECAVSReply">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         <element name="validationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="primaryStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="secondaryStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="additionalStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="lastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="addedOrClosedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="previousStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="fcraDisputeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="scoredAccountProcessorResponse1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="scoredAccountProcessorResponse2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="scoredAccountProcessorResponse3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="scoredAccountProcessorResponse5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="customerDataConditionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="matchBillToFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="matchBillToPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="matchBillToFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="matchBillToMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="matchBillToLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="matchBillToSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="matchBillToCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="matchBillToAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="matchBillToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="matchBillToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="matchBillToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="matchBillToPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="matchBillToCompanyPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="matchBillToCompanyTaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="matchBillToSSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="matchBillToDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="matchPersonalIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="matchPersonalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="matchPersonalIDIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="overallMatchScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="calculatedResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="referenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authorizationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECAVSReply", propOrder = {
    "reasonCode",
    "validationType",
    "primaryStatusCode",
    "secondaryStatusCode",
    "additionalStatusCode",
    "lastUpdateDate",
    "addedOrClosedDate",
    "previousStatusCode",
    "fcraDisputeCode",
    "scoredAccountProcessorResponse1",
    "scoredAccountProcessorResponse2",
    "scoredAccountProcessorResponse3",
    "scoredAccountProcessorResponse5",
    "customerDataConditionCode",
    "matchBillToFullName",
    "matchBillToPrefix",
    "matchBillToFirstName",
    "matchBillToMiddleName",
    "matchBillToLastName",
    "matchBillToSuffix",
    "matchBillToCompany",
    "matchBillToAddress",
    "matchBillToCity",
    "matchBillToState",
    "matchBillToPostalCode",
    "matchBillToPhoneNumber",
    "matchBillToCompanyPhoneNumber",
    "matchBillToCompanyTaxID",
    "matchBillToSSN",
    "matchBillToDateOfBirth",
    "matchPersonalIDType",
    "matchPersonalID",
    "matchPersonalIDIssuedBy",
    "overallMatchScore",
    "calculatedResponse",
    "referenceID",
    "resultCode",
    "authorizationLevel",
    "accountType"
})
public class ECAVSReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String validationType;
    protected String primaryStatusCode;
    protected String secondaryStatusCode;
    protected String additionalStatusCode;
    protected String lastUpdateDate;
    protected String addedOrClosedDate;
    protected String previousStatusCode;
    protected String fcraDisputeCode;
    protected String scoredAccountProcessorResponse1;
    protected String scoredAccountProcessorResponse2;
    protected String scoredAccountProcessorResponse3;
    protected String scoredAccountProcessorResponse5;
    protected String customerDataConditionCode;
    protected String matchBillToFullName;
    protected String matchBillToPrefix;
    protected String matchBillToFirstName;
    protected String matchBillToMiddleName;
    protected String matchBillToLastName;
    protected String matchBillToSuffix;
    protected String matchBillToCompany;
    protected String matchBillToAddress;
    protected String matchBillToCity;
    protected String matchBillToState;
    protected String matchBillToPostalCode;
    protected String matchBillToPhoneNumber;
    protected String matchBillToCompanyPhoneNumber;
    protected String matchBillToCompanyTaxID;
    protected String matchBillToSSN;
    protected String matchBillToDateOfBirth;
    protected String matchPersonalIDType;
    protected String matchPersonalID;
    protected String matchPersonalIDIssuedBy;
    protected BigInteger overallMatchScore;
    protected String calculatedResponse;
    protected String referenceID;
    protected String resultCode;
    protected String authorizationLevel;
    protected String accountType;

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
     * Gets the value of the validationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationType() {
        return validationType;
    }

    /**
     * Sets the value of the validationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationType(String value) {
        this.validationType = value;
    }

    /**
     * Gets the value of the primaryStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryStatusCode() {
        return primaryStatusCode;
    }

    /**
     * Sets the value of the primaryStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryStatusCode(String value) {
        this.primaryStatusCode = value;
    }

    /**
     * Gets the value of the secondaryStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryStatusCode() {
        return secondaryStatusCode;
    }

    /**
     * Sets the value of the secondaryStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryStatusCode(String value) {
        this.secondaryStatusCode = value;
    }

    /**
     * Gets the value of the additionalStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalStatusCode() {
        return additionalStatusCode;
    }

    /**
     * Sets the value of the additionalStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalStatusCode(String value) {
        this.additionalStatusCode = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateDate(String value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the addedOrClosedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddedOrClosedDate() {
        return addedOrClosedDate;
    }

    /**
     * Sets the value of the addedOrClosedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddedOrClosedDate(String value) {
        this.addedOrClosedDate = value;
    }

    /**
     * Gets the value of the previousStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousStatusCode() {
        return previousStatusCode;
    }

    /**
     * Sets the value of the previousStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousStatusCode(String value) {
        this.previousStatusCode = value;
    }

    /**
     * Gets the value of the fcraDisputeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFcraDisputeCode() {
        return fcraDisputeCode;
    }

    /**
     * Sets the value of the fcraDisputeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFcraDisputeCode(String value) {
        this.fcraDisputeCode = value;
    }

    /**
     * Gets the value of the scoredAccountProcessorResponse1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoredAccountProcessorResponse1() {
        return scoredAccountProcessorResponse1;
    }

    /**
     * Sets the value of the scoredAccountProcessorResponse1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoredAccountProcessorResponse1(String value) {
        this.scoredAccountProcessorResponse1 = value;
    }

    /**
     * Gets the value of the scoredAccountProcessorResponse2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoredAccountProcessorResponse2() {
        return scoredAccountProcessorResponse2;
    }

    /**
     * Sets the value of the scoredAccountProcessorResponse2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoredAccountProcessorResponse2(String value) {
        this.scoredAccountProcessorResponse2 = value;
    }

    /**
     * Gets the value of the scoredAccountProcessorResponse3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoredAccountProcessorResponse3() {
        return scoredAccountProcessorResponse3;
    }

    /**
     * Sets the value of the scoredAccountProcessorResponse3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoredAccountProcessorResponse3(String value) {
        this.scoredAccountProcessorResponse3 = value;
    }

    /**
     * Gets the value of the scoredAccountProcessorResponse5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoredAccountProcessorResponse5() {
        return scoredAccountProcessorResponse5;
    }

    /**
     * Sets the value of the scoredAccountProcessorResponse5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoredAccountProcessorResponse5(String value) {
        this.scoredAccountProcessorResponse5 = value;
    }

    /**
     * Gets the value of the customerDataConditionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerDataConditionCode() {
        return customerDataConditionCode;
    }

    /**
     * Sets the value of the customerDataConditionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerDataConditionCode(String value) {
        this.customerDataConditionCode = value;
    }

    /**
     * Gets the value of the matchBillToFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToFullName() {
        return matchBillToFullName;
    }

    /**
     * Sets the value of the matchBillToFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToFullName(String value) {
        this.matchBillToFullName = value;
    }

    /**
     * Gets the value of the matchBillToPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToPrefix() {
        return matchBillToPrefix;
    }

    /**
     * Sets the value of the matchBillToPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToPrefix(String value) {
        this.matchBillToPrefix = value;
    }

    /**
     * Gets the value of the matchBillToFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToFirstName() {
        return matchBillToFirstName;
    }

    /**
     * Sets the value of the matchBillToFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToFirstName(String value) {
        this.matchBillToFirstName = value;
    }

    /**
     * Gets the value of the matchBillToMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToMiddleName() {
        return matchBillToMiddleName;
    }

    /**
     * Sets the value of the matchBillToMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToMiddleName(String value) {
        this.matchBillToMiddleName = value;
    }

    /**
     * Gets the value of the matchBillToLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToLastName() {
        return matchBillToLastName;
    }

    /**
     * Sets the value of the matchBillToLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToLastName(String value) {
        this.matchBillToLastName = value;
    }

    /**
     * Gets the value of the matchBillToSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToSuffix() {
        return matchBillToSuffix;
    }

    /**
     * Sets the value of the matchBillToSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToSuffix(String value) {
        this.matchBillToSuffix = value;
    }

    /**
     * Gets the value of the matchBillToCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToCompany() {
        return matchBillToCompany;
    }

    /**
     * Sets the value of the matchBillToCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToCompany(String value) {
        this.matchBillToCompany = value;
    }

    /**
     * Gets the value of the matchBillToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToAddress() {
        return matchBillToAddress;
    }

    /**
     * Sets the value of the matchBillToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToAddress(String value) {
        this.matchBillToAddress = value;
    }

    /**
     * Gets the value of the matchBillToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToCity() {
        return matchBillToCity;
    }

    /**
     * Sets the value of the matchBillToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToCity(String value) {
        this.matchBillToCity = value;
    }

    /**
     * Gets the value of the matchBillToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToState() {
        return matchBillToState;
    }

    /**
     * Sets the value of the matchBillToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToState(String value) {
        this.matchBillToState = value;
    }

    /**
     * Gets the value of the matchBillToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToPostalCode() {
        return matchBillToPostalCode;
    }

    /**
     * Sets the value of the matchBillToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToPostalCode(String value) {
        this.matchBillToPostalCode = value;
    }

    /**
     * Gets the value of the matchBillToPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToPhoneNumber() {
        return matchBillToPhoneNumber;
    }

    /**
     * Sets the value of the matchBillToPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToPhoneNumber(String value) {
        this.matchBillToPhoneNumber = value;
    }

    /**
     * Gets the value of the matchBillToCompanyPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToCompanyPhoneNumber() {
        return matchBillToCompanyPhoneNumber;
    }

    /**
     * Sets the value of the matchBillToCompanyPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToCompanyPhoneNumber(String value) {
        this.matchBillToCompanyPhoneNumber = value;
    }

    /**
     * Gets the value of the matchBillToCompanyTaxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToCompanyTaxID() {
        return matchBillToCompanyTaxID;
    }

    /**
     * Sets the value of the matchBillToCompanyTaxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToCompanyTaxID(String value) {
        this.matchBillToCompanyTaxID = value;
    }

    /**
     * Gets the value of the matchBillToSSN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToSSN() {
        return matchBillToSSN;
    }

    /**
     * Sets the value of the matchBillToSSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToSSN(String value) {
        this.matchBillToSSN = value;
    }

    /**
     * Gets the value of the matchBillToDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToDateOfBirth() {
        return matchBillToDateOfBirth;
    }

    /**
     * Sets the value of the matchBillToDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToDateOfBirth(String value) {
        this.matchBillToDateOfBirth = value;
    }

    /**
     * Gets the value of the matchPersonalIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchPersonalIDType() {
        return matchPersonalIDType;
    }

    /**
     * Sets the value of the matchPersonalIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchPersonalIDType(String value) {
        this.matchPersonalIDType = value;
    }

    /**
     * Gets the value of the matchPersonalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchPersonalID() {
        return matchPersonalID;
    }

    /**
     * Sets the value of the matchPersonalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchPersonalID(String value) {
        this.matchPersonalID = value;
    }

    /**
     * Gets the value of the matchPersonalIDIssuedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchPersonalIDIssuedBy() {
        return matchPersonalIDIssuedBy;
    }

    /**
     * Sets the value of the matchPersonalIDIssuedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchPersonalIDIssuedBy(String value) {
        this.matchPersonalIDIssuedBy = value;
    }

    /**
     * Gets the value of the overallMatchScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOverallMatchScore() {
        return overallMatchScore;
    }

    /**
     * Sets the value of the overallMatchScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOverallMatchScore(BigInteger value) {
        this.overallMatchScore = value;
    }

    /**
     * Gets the value of the calculatedResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculatedResponse() {
        return calculatedResponse;
    }

    /**
     * Sets the value of the calculatedResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculatedResponse(String value) {
        this.calculatedResponse = value;
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
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the authorizationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationLevel() {
        return authorizationLevel;
    }

    /**
     * Sets the value of the authorizationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationLevel(String value) {
        this.authorizationLevel = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

}
