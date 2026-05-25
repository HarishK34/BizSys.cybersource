
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APRefundService complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="APRefundService">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="captureRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="refundRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="instant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="apInitiateRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="returnRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="saleRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "APRefundService", propOrder = {
    "captureRequestID",
    "refundRequestID",
    "reason",
    "instant",
    "note",
    "apInitiateRequestID",
    "returnRef",
    "reconciliationID",
    "saleRequestID"
})
public class APRefundService {

    protected String captureRequestID;
    protected String refundRequestID;
    protected String reason;
    protected String instant;
    protected String note;
    protected String apInitiateRequestID;
    protected String returnRef;
    protected String reconciliationID;
    protected String saleRequestID;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Gets the value of the captureRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptureRequestID() {
        return captureRequestID;
    }

    /**
     * Sets the value of the captureRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptureRequestID(String value) {
        this.captureRequestID = value;
    }

    /**
     * Gets the value of the refundRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundRequestID() {
        return refundRequestID;
    }

    /**
     * Sets the value of the refundRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundRequestID(String value) {
        this.refundRequestID = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the instant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstant() {
        return instant;
    }

    /**
     * Sets the value of the instant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstant(String value) {
        this.instant = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the apInitiateRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApInitiateRequestID() {
        return apInitiateRequestID;
    }

    /**
     * Sets the value of the apInitiateRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApInitiateRequestID(String value) {
        this.apInitiateRequestID = value;
    }

    /**
     * Gets the value of the returnRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnRef() {
        return returnRef;
    }

    /**
     * Sets the value of the returnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnRef(String value) {
        this.returnRef = value;
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
     * Gets the value of the saleRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRequestID() {
        return saleRequestID;
    }

    /**
     * Sets the value of the saleRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleRequestID(String value) {
        this.saleRequestID = value;
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
