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
 * <p>Java class for PartyElectronicAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyElectronicAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartyElectronicAddressID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyRoleInAgreementID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ElectronicAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ElectronicAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValiidationMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EffectiveEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PkeySrcObject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyReferenceSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyElectronicAddress", propOrder = {
    "partyElectronicAddressID",
    "partyID",
    "partyRoleInAgreementID",
    "electronicAddressType",
    "electronicAddress",
    "statusCode",
    "statusReasonCode",
    "validIndicator",
    "valiidationMessage",
    "effectiveStartDate",
    "effectiveEndDate",
    "pkeySrcObject",
    "sourceSystem",
    "partyReferenceSeq",
    "referenceSeq"
})
public class PartyElectronicAddress {

    @XmlElement(name = "PartyElectronicAddressID")
    protected String partyElectronicAddressID;
    @XmlElement(name = "PartyID")
    protected String partyID;
    @XmlElement(name = "PartyRoleInAgreementID")
    protected String partyRoleInAgreementID;
    @XmlElement(name = "ElectronicAddressType")
    protected String electronicAddressType;
    @XmlElement(name = "ElectronicAddress")
    protected String electronicAddress;
    @XmlElement(name = "StatusCode")
    protected String statusCode;
    @XmlElement(name = "StatusReasonCode")
    protected String statusReasonCode;
    @XmlElement(name = "ValidIndicator")
    protected String validIndicator;
    @XmlElement(name = "ValiidationMessage")
    protected String valiidationMessage;
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
    @XmlElement(name = "PartyReferenceSeq")
    protected String partyReferenceSeq;
    @XmlElement(name = "ReferenceSeq")
    protected String referenceSeq;

    /**
     * Gets the value of the partyElectronicAddressID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyElectronicAddressID() {
        return partyElectronicAddressID;
    }

    /**
     * Sets the value of the partyElectronicAddressID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyElectronicAddressID(String value) {
        this.partyElectronicAddressID = value;
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
     * Gets the value of the partyRoleInAgreementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRoleInAgreementID() {
        return partyRoleInAgreementID;
    }

    /**
     * Sets the value of the partyRoleInAgreementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRoleInAgreementID(String value) {
        this.partyRoleInAgreementID = value;
    }

    /**
     * Gets the value of the electronicAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectronicAddressType() {
        return electronicAddressType;
    }

    /**
     * Sets the value of the electronicAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectronicAddressType(String value) {
        this.electronicAddressType = value;
    }

    /**
     * Gets the value of the electronicAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectronicAddress() {
        return electronicAddress;
    }

    /**
     * Sets the value of the electronicAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectronicAddress(String value) {
        this.electronicAddress = value;
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
     * Gets the value of the validIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidIndicator() {
        return validIndicator;
    }

    /**
     * Sets the value of the validIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidIndicator(String value) {
        this.validIndicator = value;
    }

    /**
     * Gets the value of the valiidationMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValiidationMessage() {
        return valiidationMessage;
    }

    /**
     * Sets the value of the valiidationMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValiidationMessage(String value) {
        this.valiidationMessage = value;
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

    /**
     * Gets the value of the partyReferenceSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyReferenceSeq() {
        return partyReferenceSeq;
    }

    /**
     * Sets the value of the partyReferenceSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyReferenceSeq(String value) {
        this.partyReferenceSeq = value;
    }

    /**
     * Gets the value of the referenceSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceSeq() {
        return referenceSeq;
    }

    /**
     * Sets the value of the referenceSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceSeq(String value) {
        this.referenceSeq = value;
    }

}
