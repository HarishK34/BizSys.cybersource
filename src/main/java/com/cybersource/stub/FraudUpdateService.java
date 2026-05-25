
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FraudUpdateService complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FraudUpdateService">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="markedData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="markingReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="markingNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="markingRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="markingTransactionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="markingAmount" type="{urn:schemas-cybersource-com:transaction-data-1.219}amount" minOccurs="0"/>
 *         <element name="markingCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="markingIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "FraudUpdateService", propOrder = {
    "actionCode",
    "markedData",
    "markingReason",
    "markingNotes",
    "markingRequestID",
    "markingTransactionDate",
    "markingAmount",
    "markingCurrency",
    "markingIndicator"
})
public class FraudUpdateService {

    protected String actionCode;
    protected String markedData;
    protected String markingReason;
    protected String markingNotes;
    protected String markingRequestID;
    protected String markingTransactionDate;
    protected String markingAmount;
    protected String markingCurrency;
    protected String markingIndicator;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the markedData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkedData() {
        return markedData;
    }

    /**
     * Sets the value of the markedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkedData(String value) {
        this.markedData = value;
    }

    /**
     * Gets the value of the markingReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkingReason() {
        return markingReason;
    }

    /**
     * Sets the value of the markingReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkingReason(String value) {
        this.markingReason = value;
    }

    /**
     * Gets the value of the markingNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkingNotes() {
        return markingNotes;
    }

    /**
     * Sets the value of the markingNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkingNotes(String value) {
        this.markingNotes = value;
    }

    /**
     * Gets the value of the markingRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkingRequestID() {
        return markingRequestID;
    }

    /**
     * Sets the value of the markingRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkingRequestID(String value) {
        this.markingRequestID = value;
    }

    /**
     * Gets the value of the markingTransactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkingTransactionDate() {
        return markingTransactionDate;
    }

    /**
     * Sets the value of the markingTransactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkingTransactionDate(String value) {
        this.markingTransactionDate = value;
    }

    /**
     * Gets the value of the markingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkingAmount() {
        return markingAmount;
    }

    /**
     * Sets the value of the markingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkingAmount(String value) {
        this.markingAmount = value;
    }

    /**
     * Gets the value of the markingCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkingCurrency() {
        return markingCurrency;
    }

    /**
     * Sets the value of the markingCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkingCurrency(String value) {
        this.markingCurrency = value;
    }

    /**
     * Gets the value of the markingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkingIndicator() {
        return markingIndicator;
    }

    /**
     * Sets the value of the markingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkingIndicator(String value) {
        this.markingIndicator = value;
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
