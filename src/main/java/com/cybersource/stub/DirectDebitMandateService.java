
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectDebitMandateService complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DirectDebitMandateService">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="mandateDescriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="firstDebitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "DirectDebitMandateService", propOrder = {
    "mandateDescriptor",
    "firstDebitDate"
})
public class DirectDebitMandateService {

    protected String mandateDescriptor;
    protected String firstDebitDate;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Gets the value of the mandateDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandateDescriptor() {
        return mandateDescriptor;
    }

    /**
     * Sets the value of the mandateDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandateDescriptor(String value) {
        this.mandateDescriptor = value;
    }

    /**
     * Gets the value of the firstDebitDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstDebitDate() {
        return firstDebitDate;
    }

    /**
     * Sets the value of the firstDebitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstDebitDate(String value) {
        this.firstDebitDate = value;
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
