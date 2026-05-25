
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCCreditAuthReversalService complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CCCreditAuthReversalService">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="creditAuthRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="requestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="reversalReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="returnReversalRecord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CCCreditAuthReversalService", propOrder = {
    "creditAuthRequestID",
    "requestToken",
    "reversalReason",
    "returnReversalRecord"
})
public class CCCreditAuthReversalService {

    protected String creditAuthRequestID;
    protected String requestToken;
    protected String reversalReason;
    protected String returnReversalRecord;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Gets the value of the creditAuthRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAuthRequestID() {
        return creditAuthRequestID;
    }

    /**
     * Sets the value of the creditAuthRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAuthRequestID(String value) {
        this.creditAuthRequestID = value;
    }

    /**
     * Gets the value of the requestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestToken() {
        return requestToken;
    }

    /**
     * Sets the value of the requestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestToken(String value) {
        this.requestToken = value;
    }

    /**
     * Gets the value of the reversalReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReversalReason() {
        return reversalReason;
    }

    /**
     * Sets the value of the reversalReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReversalReason(String value) {
        this.reversalReason = value;
    }

    /**
     * Gets the value of the returnReversalRecord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnReversalRecord() {
        return returnReversalRecord;
    }

    /**
     * Sets the value of the returnReversalRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnReversalRecord(String value) {
        this.returnReversalRecord = value;
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
