
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCAuthReversalService complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CCAuthReversalService">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="authRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CCAuthReversalService", propOrder = {
    "authRequestID",
    "authRequestToken",
    "reversalReason",
    "returnReversalRecord"
})
public class CCAuthReversalService {

    protected String authRequestID;
    protected String authRequestToken;
    protected String reversalReason;
    protected String returnReversalRecord;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Gets the value of the authRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthRequestID() {
        return authRequestID;
    }

    /**
     * Sets the value of the authRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthRequestID(String value) {
        this.authRequestID = value;
    }

    /**
     * Gets the value of the authRequestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthRequestToken() {
        return authRequestToken;
    }

    /**
     * Sets the value of the authRequestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthRequestToken(String value) {
        this.authRequestToken = value;
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
