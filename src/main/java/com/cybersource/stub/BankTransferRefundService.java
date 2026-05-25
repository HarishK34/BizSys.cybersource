
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankTransferRefundService complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BankTransferRefundService">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="bankTransferRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="bankTransferRealTimeRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="bankTransferRealTimeReconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="bankTransferRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="bankTransferRealTimeRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BankTransferRefundService", propOrder = {
    "bankTransferRequestID",
    "bankTransferRealTimeRequestID",
    "reconciliationID",
    "bankTransferRealTimeReconciliationID",
    "bankTransferRequestToken",
    "bankTransferRealTimeRequestToken"
})
public class BankTransferRefundService {

    protected String bankTransferRequestID;
    protected String bankTransferRealTimeRequestID;
    protected String reconciliationID;
    protected String bankTransferRealTimeReconciliationID;
    protected String bankTransferRequestToken;
    protected String bankTransferRealTimeRequestToken;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Gets the value of the bankTransferRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankTransferRequestID() {
        return bankTransferRequestID;
    }

    /**
     * Sets the value of the bankTransferRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankTransferRequestID(String value) {
        this.bankTransferRequestID = value;
    }

    /**
     * Gets the value of the bankTransferRealTimeRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankTransferRealTimeRequestID() {
        return bankTransferRealTimeRequestID;
    }

    /**
     * Sets the value of the bankTransferRealTimeRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankTransferRealTimeRequestID(String value) {
        this.bankTransferRealTimeRequestID = value;
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
     * Gets the value of the bankTransferRealTimeReconciliationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankTransferRealTimeReconciliationID() {
        return bankTransferRealTimeReconciliationID;
    }

    /**
     * Sets the value of the bankTransferRealTimeReconciliationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankTransferRealTimeReconciliationID(String value) {
        this.bankTransferRealTimeReconciliationID = value;
    }

    /**
     * Gets the value of the bankTransferRequestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankTransferRequestToken() {
        return bankTransferRequestToken;
    }

    /**
     * Sets the value of the bankTransferRequestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankTransferRequestToken(String value) {
        this.bankTransferRequestToken = value;
    }

    /**
     * Gets the value of the bankTransferRealTimeRequestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankTransferRealTimeRequestToken() {
        return bankTransferRealTimeRequestToken;
    }

    /**
     * Sets the value of the bankTransferRealTimeRequestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankTransferRealTimeRequestToken(String value) {
        this.bankTransferRealTimeRequestToken = value;
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
