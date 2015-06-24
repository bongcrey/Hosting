
package com.informatica.dis.ws.gpm_ods_data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyAlternateIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyAlternateIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartyAlternateIdentifierID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternateIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternateIDValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PkeySrcObject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAlternateIdentifier", propOrder = {
    "partyAlternateIdentifierID",
    "partyID",
    "alternateIDType",
    "alternateIDValue",
    "sourceSystem",
    "pkeySrcObject"
})
public class PartyAlternateIdentifier {

    @XmlElement(name = "PartyAlternateIdentifierID")
    protected String partyAlternateIdentifierID;
    @XmlElement(name = "PartyID")
    protected String partyID;
    @XmlElement(name = "AlternateIDType")
    protected String alternateIDType;
    @XmlElement(name = "AlternateIDValue")
    protected String alternateIDValue;
    @XmlElement(name = "SourceSystem")
    protected String sourceSystem;
    @XmlElement(name = "PkeySrcObject")
    protected String pkeySrcObject;

    /**
     * Gets the value of the partyAlternateIdentifierID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyAlternateIdentifierID() {
        return partyAlternateIdentifierID;
    }

    /**
     * Sets the value of the partyAlternateIdentifierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyAlternateIdentifierID(String value) {
        this.partyAlternateIdentifierID = value;
    }

    /**
     * Gets the value of the partyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyID() {
        return partyID;
    }

    /**
     * Sets the value of the partyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyID(String value) {
        this.partyID = value;
    }

    /**
     * Gets the value of the alternateIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateIDType() {
        return alternateIDType;
    }

    /**
     * Sets the value of the alternateIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateIDType(String value) {
        this.alternateIDType = value;
    }

    /**
     * Gets the value of the alternateIDValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateIDValue() {
        return alternateIDValue;
    }

    /**
     * Sets the value of the alternateIDValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateIDValue(String value) {
        this.alternateIDValue = value;
    }

    /**
     * Gets the value of the sourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the sourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystem(String value) {
        this.sourceSystem = value;
    }

    /**
     * Gets the value of the pkeySrcObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkeySrcObject() {
        return pkeySrcObject;
    }

    /**
     * Sets the value of the pkeySrcObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkeySrcObject(String value) {
        this.pkeySrcObject = value;
    }

}
