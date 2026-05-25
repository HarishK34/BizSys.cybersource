
package com.cybersource.stub;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxReplyItem complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TaxReplyItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="taxableAmount" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="exemptAmount" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="specialTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="cityTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="countyTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="districtTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="stateTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="countryTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="totalTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount"/>
 *         <element name="jurisdiction" type="{urn:schemas-cybersource-com:transaction-data-1.219}TaxReplyItemJurisdiction" maxOccurs="1000" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxReplyItem", propOrder = {
    "taxableAmount",
    "exemptAmount",
    "specialTaxAmount",
    "cityTaxAmount",
    "countyTaxAmount",
    "districtTaxAmount",
    "stateTaxAmount",
    "countryTaxAmount",
    "totalTaxAmount",
    "jurisdiction"
})
public class TaxReplyItem {

    protected String taxableAmount;
    protected String exemptAmount;
    protected String specialTaxAmount;
    protected String cityTaxAmount;
    protected String countyTaxAmount;
    protected String districtTaxAmount;
    protected String stateTaxAmount;
    protected String countryTaxAmount;
    @XmlElement(required = true)
    protected String totalTaxAmount;
    protected List<TaxReplyItemJurisdiction> jurisdiction;
    @XmlAttribute(name = "id", required = true)
    protected BigInteger id;

    /**
     * Gets the value of the taxableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxableAmount() {
        return taxableAmount;
    }

    /**
     * Sets the value of the taxableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxableAmount(String value) {
        this.taxableAmount = value;
    }

    /**
     * Gets the value of the exemptAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptAmount() {
        return exemptAmount;
    }

    /**
     * Sets the value of the exemptAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptAmount(String value) {
        this.exemptAmount = value;
    }

    /**
     * Gets the value of the specialTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialTaxAmount() {
        return specialTaxAmount;
    }

    /**
     * Sets the value of the specialTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialTaxAmount(String value) {
        this.specialTaxAmount = value;
    }

    /**
     * Gets the value of the cityTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityTaxAmount() {
        return cityTaxAmount;
    }

    /**
     * Sets the value of the cityTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityTaxAmount(String value) {
        this.cityTaxAmount = value;
    }

    /**
     * Gets the value of the countyTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyTaxAmount() {
        return countyTaxAmount;
    }

    /**
     * Sets the value of the countyTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyTaxAmount(String value) {
        this.countyTaxAmount = value;
    }

    /**
     * Gets the value of the districtTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictTaxAmount() {
        return districtTaxAmount;
    }

    /**
     * Sets the value of the districtTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictTaxAmount(String value) {
        this.districtTaxAmount = value;
    }

    /**
     * Gets the value of the stateTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateTaxAmount() {
        return stateTaxAmount;
    }

    /**
     * Sets the value of the stateTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateTaxAmount(String value) {
        this.stateTaxAmount = value;
    }

    /**
     * Gets the value of the countryTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryTaxAmount() {
        return countryTaxAmount;
    }

    /**
     * Sets the value of the countryTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryTaxAmount(String value) {
        this.countryTaxAmount = value;
    }

    /**
     * Gets the value of the totalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * Sets the value of the totalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTaxAmount(String value) {
        this.totalTaxAmount = value;
    }

    /**
     * Gets the value of the jurisdiction property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jurisdiction property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getJurisdiction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxReplyItemJurisdiction }
     * </p>
     * 
     * 
     * @return
     *     The value of the jurisdiction property.
     */
    public List<TaxReplyItemJurisdiction> getJurisdiction() {
        if (jurisdiction == null) {
            jurisdiction = new ArrayList<>();
        }
        return this.jurisdiction;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

}
