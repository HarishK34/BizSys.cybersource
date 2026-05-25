
package com.cybersource.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInsightsInformation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaymentInsightsInformation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="responseInsightsCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="responseInsightsCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="processorRawName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="orchestration_infoCodes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInsightsInformation", propOrder = {
    "responseInsightsCategory",
    "responseInsightsCategoryCode",
    "processorRawName",
    "orchestrationInfoCodes"
})
public class PaymentInsightsInformation {

    protected String responseInsightsCategory;
    protected String responseInsightsCategoryCode;
    protected String processorRawName;
    @XmlElement(name = "orchestration_infoCodes")
    protected String orchestrationInfoCodes;

    /**
     * Gets the value of the responseInsightsCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseInsightsCategory() {
        return responseInsightsCategory;
    }

    /**
     * Sets the value of the responseInsightsCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseInsightsCategory(String value) {
        this.responseInsightsCategory = value;
    }

    /**
     * Gets the value of the responseInsightsCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseInsightsCategoryCode() {
        return responseInsightsCategoryCode;
    }

    /**
     * Sets the value of the responseInsightsCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseInsightsCategoryCode(String value) {
        this.responseInsightsCategoryCode = value;
    }

    /**
     * Gets the value of the processorRawName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorRawName() {
        return processorRawName;
    }

    /**
     * Sets the value of the processorRawName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorRawName(String value) {
        this.processorRawName = value;
    }

    /**
     * Gets the value of the orchestrationInfoCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrchestrationInfoCodes() {
        return orchestrationInfoCodes;
    }

    /**
     * Sets the value of the orchestrationInfoCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrchestrationInfoCodes(String value) {
        this.orchestrationInfoCodes = value;
    }

}
