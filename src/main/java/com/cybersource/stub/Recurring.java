
package com.cybersource.stub;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Recurring complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Recurring">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="validationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="maximumAmount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="12" minOccurs="0"/>
 *         <element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="35" minOccurs="0"/>
 *         <element name="occurrence" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="2" minOccurs="0"/>
 *         <element name="numberOfPayments" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="2" minOccurs="0"/>
 *         <element name="amountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recurring", propOrder = {
    "type",
    "validationIndicator",
    "maximumAmount",
    "referenceNumber",
    "occurrence",
    "numberOfPayments",
    "amountType"
})
public class Recurring {

    protected String type;
    protected String validationIndicator;
    protected List<String> maximumAmount;
    protected List<String> referenceNumber;
    protected List<String> occurrence;
    protected List<String> numberOfPayments;
    protected String amountType;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the validationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationIndicator() {
        return validationIndicator;
    }

    /**
     * Sets the value of the validationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationIndicator(String value) {
        this.validationIndicator = value;
    }

    /**
     * Gets the value of the maximumAmount property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maximumAmount property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMaximumAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the maximumAmount property.
     */
    public List<String> getMaximumAmount() {
        if (maximumAmount == null) {
            maximumAmount = new ArrayList<>();
        }
        return this.maximumAmount;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceNumber property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getReferenceNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the referenceNumber property.
     */
    public List<String> getReferenceNumber() {
        if (referenceNumber == null) {
            referenceNumber = new ArrayList<>();
        }
        return this.referenceNumber;
    }

    /**
     * Gets the value of the occurrence property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occurrence property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOccurrence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the occurrence property.
     */
    public List<String> getOccurrence() {
        if (occurrence == null) {
            occurrence = new ArrayList<>();
        }
        return this.occurrence;
    }

    /**
     * Gets the value of the numberOfPayments property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberOfPayments property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNumberOfPayments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the numberOfPayments property.
     */
    public List<String> getNumberOfPayments() {
        if (numberOfPayments == null) {
            numberOfPayments = new ArrayList<>();
        }
        return this.numberOfPayments;
    }

    /**
     * Gets the value of the amountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountType() {
        return amountType;
    }

    /**
     * Sets the value of the amountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountType(String value) {
        this.amountType = value;
    }

}
