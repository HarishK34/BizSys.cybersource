
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoidService complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VoidService">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="voidRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="voidRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="voidReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "VoidService", propOrder = {
    "voidRequestID",
    "voidRequestToken",
    "voidReason"
})
public class VoidService {

    protected String voidRequestID;
    protected String voidRequestToken;
    protected String voidReason;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Gets the value of the voidRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoidRequestID() {
        return voidRequestID;
    }

    /**
     * Sets the value of the voidRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoidRequestID(String value) {
        this.voidRequestID = value;
    }

    /**
     * Gets the value of the voidRequestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoidRequestToken() {
        return voidRequestToken;
    }

    /**
     * Sets the value of the voidRequestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoidRequestToken(String value) {
        this.voidRequestToken = value;
    }

    /**
     * Gets the value of the voidReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoidReason() {
        return voidReason;
    }

    /**
     * Sets the value of the voidReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoidReason(String value) {
        this.voidReason = value;
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
