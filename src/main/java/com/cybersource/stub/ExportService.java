
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportService complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportService">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="addressOperator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="addressWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="companyWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nameWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sanctionsLists" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ExportService", propOrder = {
    "addressOperator",
    "addressWeight",
    "companyWeight",
    "nameWeight",
    "sanctionsLists"
})
public class ExportService {

    protected String addressOperator;
    protected String addressWeight;
    protected String companyWeight;
    protected String nameWeight;
    protected String sanctionsLists;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Gets the value of the addressOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressOperator() {
        return addressOperator;
    }

    /**
     * Sets the value of the addressOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressOperator(String value) {
        this.addressOperator = value;
    }

    /**
     * Gets the value of the addressWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressWeight() {
        return addressWeight;
    }

    /**
     * Sets the value of the addressWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressWeight(String value) {
        this.addressWeight = value;
    }

    /**
     * Gets the value of the companyWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyWeight() {
        return companyWeight;
    }

    /**
     * Sets the value of the companyWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyWeight(String value) {
        this.companyWeight = value;
    }

    /**
     * Gets the value of the nameWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameWeight() {
        return nameWeight;
    }

    /**
     * Sets the value of the nameWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameWeight(String value) {
        this.nameWeight = value;
    }

    /**
     * Gets the value of the sanctionsLists property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanctionsLists() {
        return sanctionsLists;
    }

    /**
     * Sets the value of the sanctionsLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanctionsLists(String value) {
        this.sanctionsLists = value;
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
