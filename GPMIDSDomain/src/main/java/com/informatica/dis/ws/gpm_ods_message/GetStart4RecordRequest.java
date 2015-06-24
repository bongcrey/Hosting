
package com.informatica.dis.ws.gpm_ods_message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Get_Start4_RecordRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Get_Start4_RecordRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppID" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}AppID" minOccurs="0"/>
 *         &lt;element name="GlobalID" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}GlobalID" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}Source" minOccurs="0"/>
 *         &lt;element name="OrigSrcKey" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}OrigSrcKey" minOccurs="0"/>
 *         &lt;element name="InquiryLevel" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}InquiryLevel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Get_Start4_RecordRequest", propOrder = {
    "appID",
    "globalID",
    "source",
    "origSrcKey",
    "inquiryLevel"
})
public class GetStart4RecordRequest {

    @XmlElement(name = "AppID")
    protected String appID;
    @XmlElement(name = "GlobalID")
    protected String globalID;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "OrigSrcKey")
    protected String origSrcKey;
    @XmlElement(name = "InquiryLevel")
    protected String inquiryLevel;

    /**
     * Gets the value of the appID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppID() {
        return appID;
    }

    /**
     * Sets the value of the appID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppID(String value) {
        this.appID = value;
    }

    /**
     * Gets the value of the globalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalID() {
        return globalID;
    }

    /**
     * Sets the value of the globalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalID(String value) {
        this.globalID = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the origSrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigSrcKey() {
        return origSrcKey;
    }

    /**
     * Sets the value of the origSrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigSrcKey(String value) {
        this.origSrcKey = value;
    }

    /**
     * Gets the value of the inquiryLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquiryLevel() {
        return inquiryLevel;
    }

    /**
     * Sets the value of the inquiryLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquiryLevel(String value) {
        this.inquiryLevel = value;
    }

}
