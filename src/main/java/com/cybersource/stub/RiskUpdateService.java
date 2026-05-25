
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskUpdateService complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RiskUpdateService">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="recordID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="recordName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="negativeAddress" type="{urn:schemas-cybersource-com:transaction-data-1.219}Address" minOccurs="0"/>
 *         <element name="markingReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="markingNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="markingRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="deviceFingerprintSmartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="deviceFingerprintTrueIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="deviceFingerprintProxyIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "RiskUpdateService", propOrder = {
    "actionCode",
    "recordID",
    "recordName",
    "negativeAddress",
    "markingReason",
    "markingNotes",
    "markingRequestID",
    "deviceFingerprintSmartID",
    "deviceFingerprintTrueIPAddress",
    "deviceFingerprintProxyIPAddress"
})
public class RiskUpdateService {

    protected String actionCode;
    protected String recordID;
    protected String recordName;
    protected Address negativeAddress;
    protected String markingReason;
    protected String markingNotes;
    protected String markingRequestID;
    protected String deviceFingerprintSmartID;
    protected String deviceFingerprintTrueIPAddress;
    protected String deviceFingerprintProxyIPAddress;
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
     * Gets the value of the recordID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordID() {
        return recordID;
    }

    /**
     * Sets the value of the recordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordID(String value) {
        this.recordID = value;
    }

    /**
     * Gets the value of the recordName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordName() {
        return recordName;
    }

    /**
     * Sets the value of the recordName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordName(String value) {
        this.recordName = value;
    }

    /**
     * Gets the value of the negativeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getNegativeAddress() {
        return negativeAddress;
    }

    /**
     * Sets the value of the negativeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setNegativeAddress(Address value) {
        this.negativeAddress = value;
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
     * Gets the value of the deviceFingerprintSmartID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceFingerprintSmartID() {
        return deviceFingerprintSmartID;
    }

    /**
     * Sets the value of the deviceFingerprintSmartID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceFingerprintSmartID(String value) {
        this.deviceFingerprintSmartID = value;
    }

    /**
     * Gets the value of the deviceFingerprintTrueIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceFingerprintTrueIPAddress() {
        return deviceFingerprintTrueIPAddress;
    }

    /**
     * Sets the value of the deviceFingerprintTrueIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceFingerprintTrueIPAddress(String value) {
        this.deviceFingerprintTrueIPAddress = value;
    }

    /**
     * Gets the value of the deviceFingerprintProxyIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceFingerprintProxyIPAddress() {
        return deviceFingerprintProxyIPAddress;
    }

    /**
     * Sets the value of the deviceFingerprintProxyIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceFingerprintProxyIPAddress(String value) {
        this.deviceFingerprintProxyIPAddress = value;
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
