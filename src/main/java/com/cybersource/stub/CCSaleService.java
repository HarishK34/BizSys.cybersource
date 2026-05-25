
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCSaleService complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CCSaleService">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="overridePaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="commerceIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="partialAuthIndicator" type="{urn:schemas-cybersource-com:transaction-data-1.219}boolean" minOccurs="0"/>
 *         <element name="cavv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="xid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="industryDatatype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="networkTokenCryptogram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paSpecificationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="directoryServerTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cryptocurrencyPurchase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="lowValueExemptionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="riskAnalysisExemptionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="trustedMerchantExemptionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="secureCorporatePaymentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="deferredAuthIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="delegatedAuthenticationExemptionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="transitTransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="transportationMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CCSaleService", propOrder = {
    "overridePaymentMethod",
    "commerceIndicator",
    "partialAuthIndicator",
    "cavv",
    "xid",
    "reconciliationID",
    "industryDatatype",
    "networkTokenCryptogram",
    "paSpecificationVersion",
    "directoryServerTransactionID",
    "cryptocurrencyPurchase",
    "lowValueExemptionIndicator",
    "riskAnalysisExemptionIndicator",
    "trustedMerchantExemptionIndicator",
    "secureCorporatePaymentIndicator",
    "deferredAuthIndicator",
    "delegatedAuthenticationExemptionIndicator",
    "transitTransactionType",
    "transportationMode"
})
public class CCSaleService {

    protected String overridePaymentMethod;
    protected String commerceIndicator;
    protected String partialAuthIndicator;
    protected String cavv;
    protected String xid;
    protected String reconciliationID;
    protected String industryDatatype;
    protected String networkTokenCryptogram;
    protected String paSpecificationVersion;
    protected String directoryServerTransactionID;
    protected String cryptocurrencyPurchase;
    protected String lowValueExemptionIndicator;
    protected String riskAnalysisExemptionIndicator;
    protected String trustedMerchantExemptionIndicator;
    protected String secureCorporatePaymentIndicator;
    protected String deferredAuthIndicator;
    protected String delegatedAuthenticationExemptionIndicator;
    protected String transitTransactionType;
    protected String transportationMode;
    @XmlAttribute(name = "run", required = true)
    protected String run;

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
     * Gets the value of the partialAuthIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartialAuthIndicator() {
        return partialAuthIndicator;
    }

    /**
     * Sets the value of the partialAuthIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartialAuthIndicator(String value) {
        this.partialAuthIndicator = value;
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
     * Gets the value of the reconciliationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationID() {
        return reconciliationID;
    }

    /**
     * Sets the value of the reconciliationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationID(String value) {
        this.reconciliationID = value;
    }

    /**
     * Gets the value of the industryDatatype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryDatatype() {
        return industryDatatype;
    }

    /**
     * Sets the value of the industryDatatype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryDatatype(String value) {
        this.industryDatatype = value;
    }

    /**
     * Gets the value of the networkTokenCryptogram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkTokenCryptogram() {
        return networkTokenCryptogram;
    }

    /**
     * Sets the value of the networkTokenCryptogram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkTokenCryptogram(String value) {
        this.networkTokenCryptogram = value;
    }

    /**
     * Gets the value of the paSpecificationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaSpecificationVersion() {
        return paSpecificationVersion;
    }

    /**
     * Sets the value of the paSpecificationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaSpecificationVersion(String value) {
        this.paSpecificationVersion = value;
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
     * Gets the value of the cryptocurrencyPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCryptocurrencyPurchase() {
        return cryptocurrencyPurchase;
    }

    /**
     * Sets the value of the cryptocurrencyPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCryptocurrencyPurchase(String value) {
        this.cryptocurrencyPurchase = value;
    }

    /**
     * Gets the value of the lowValueExemptionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowValueExemptionIndicator() {
        return lowValueExemptionIndicator;
    }

    /**
     * Sets the value of the lowValueExemptionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowValueExemptionIndicator(String value) {
        this.lowValueExemptionIndicator = value;
    }

    /**
     * Gets the value of the riskAnalysisExemptionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskAnalysisExemptionIndicator() {
        return riskAnalysisExemptionIndicator;
    }

    /**
     * Sets the value of the riskAnalysisExemptionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskAnalysisExemptionIndicator(String value) {
        this.riskAnalysisExemptionIndicator = value;
    }

    /**
     * Gets the value of the trustedMerchantExemptionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrustedMerchantExemptionIndicator() {
        return trustedMerchantExemptionIndicator;
    }

    /**
     * Sets the value of the trustedMerchantExemptionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrustedMerchantExemptionIndicator(String value) {
        this.trustedMerchantExemptionIndicator = value;
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
     * Gets the value of the deferredAuthIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeferredAuthIndicator() {
        return deferredAuthIndicator;
    }

    /**
     * Sets the value of the deferredAuthIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeferredAuthIndicator(String value) {
        this.deferredAuthIndicator = value;
    }

    /**
     * Gets the value of the delegatedAuthenticationExemptionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegatedAuthenticationExemptionIndicator() {
        return delegatedAuthenticationExemptionIndicator;
    }

    /**
     * Sets the value of the delegatedAuthenticationExemptionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegatedAuthenticationExemptionIndicator(String value) {
        this.delegatedAuthenticationExemptionIndicator = value;
    }

    /**
     * Gets the value of the transitTransactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitTransactionType() {
        return transitTransactionType;
    }

    /**
     * Sets the value of the transitTransactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitTransactionType(String value) {
        this.transitTransactionType = value;
    }

    /**
     * Gets the value of the transportationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportationMode() {
        return transportationMode;
    }

    /**
     * Sets the value of the transportationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportationMode(String value) {
        this.transportationMode = value;
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
