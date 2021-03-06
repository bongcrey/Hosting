//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.21 at 04:03:14 PM EDT 
//


package com.metlife.gpm.services.partydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PartyRelInAgreement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyRelInAgreement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartyRellInAgreementID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyID1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyID2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgreementID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EffectiveEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PkeySrcObject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyRelInAgreement", propOrder = {
    "partyRellInAgreementID",
    "partyID1",
    "partyID2",
    "agreementID",
    "roleType",
    "statusCode",
    "statusReasonCode",
    "effectiveStartDate",
    "effectiveEndDate",
    "pkeySrcObject",
    "sourceSystem"
})
public class PartyRelInAgreement {

    @XmlElement(name = "PartyRellInAgreementID")
    protected String partyRellInAgreementID;
    @XmlElement(name = "PartyID1")
    protected String partyID1;
    @XmlElement(name = "PartyID2")
    protected String partyID2;
    @XmlElement(name = "AgreementID")
    protected String agreementID;
    @XmlElement(name = "RoleType")
    protected String roleType;
    @XmlElement(name = "StatusCode")
    protected String statusCode;
    @XmlElement(name = "StatusReasonCode")
    protected String statusReasonCode;
    @XmlElement(name = "EffectiveStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveStartDate;
    @XmlElement(name = "EffectiveEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveEndDate;
    @XmlElement(name = "PkeySrcObject")
    protected String pkeySrcObject;
    @XmlElement(name = "SourceSystem")
    protected String sourceSystem;

    /**
     * Gets the value of the partyRellInAgreementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRellInAgreementID() {
        return partyRellInAgreementID;
    }

    /**
     * Sets the value of the partyRellInAgreementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRellInAgreementID(String value) {
        this.partyRellInAgreementID = value;
    }

    /**
     * Gets the value of the partyID1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyID1() {
        return partyID1;
    }

    /**
     * Sets the value of the partyID1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyID1(String value) {
        this.partyID1 = value;
    }

    /**
     * Gets the value of the partyID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyID2() {
        return partyID2;
    }

    /**
     * Sets the value of the partyID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyID2(String value) {
        this.partyID2 = value;
    }

    /**
     * Gets the value of the agreementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementID() {
        return agreementID;
    }

    /**
     * Sets the value of the agreementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementID(String value) {
        this.agreementID = value;
    }

    /**
     * Gets the value of the roleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleType() {
        return roleType;
    }

    /**
     * Sets the value of the roleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleType(String value) {
        this.roleType = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusReasonCode() {
        return statusReasonCode;
    }

    /**
     * Sets the value of the statusReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusReasonCode(String value) {
        this.statusReasonCode = value;
    }

    /**
     * Gets the value of the effectiveStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveStartDate() {
        return effectiveStartDate;
    }

    /**
     * Sets the value of the effectiveStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveStartDate(XMLGregorianCalendar value) {
        this.effectiveStartDate = value;
    }

    /**
     * Gets the value of the effectiveEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveEndDate() {
        return effectiveEndDate;
    }

    /**
     * Sets the value of the effectiveEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveEndDate(XMLGregorianCalendar value) {
        this.effectiveEndDate = value;
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

}
