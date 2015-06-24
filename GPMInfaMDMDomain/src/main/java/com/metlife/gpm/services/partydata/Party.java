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
 * <p>Java class for Party complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Party">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RowidObject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RMID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrefixName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuffixName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RawPrefixName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RawFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RawMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RawLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RawSuffixName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RawFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GenderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryLanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeathIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeathDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FoundationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DissolutionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OriginAdminSourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginAdminSourceKeyParty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PkeySrcObject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Party", propOrder = {
    "rowidObject",
    "partyType",
    "rmid",
    "prefixName",
    "firstName",
    "middleName",
    "lastName",
    "suffixName",
    "fullName",
    "rawPrefixName",
    "rawFirstName",
    "rawMiddleName",
    "rawLastName",
    "rawSuffixName",
    "rawFullName",
    "genderCode",
    "maritalStatus",
    "primaryLanguageCode",
    "deathIndicator",
    "birthDate",
    "deathDate",
    "foundationDate",
    "dissolutionDate",
    "statusCode",
    "statusReasonCode",
    "statusChangeDate",
    "originAdminSourceSystem",
    "originAdminSourceKeyParty",
    "globalID",
    "pkeySrcObject",
    "sourceSystem",
    "referenceSeq"
})
public class Party {

    @XmlElement(name = "RowidObject")
    protected String rowidObject;
    @XmlElement(name = "PartyType")
    protected String partyType;
    @XmlElement(name = "RMID")
    protected String rmid;
    @XmlElement(name = "PrefixName")
    protected String prefixName;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "SuffixName")
    protected String suffixName;
    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "RawPrefixName")
    protected String rawPrefixName;
    @XmlElement(name = "RawFirstName")
    protected String rawFirstName;
    @XmlElement(name = "RawMiddleName")
    protected String rawMiddleName;
    @XmlElement(name = "RawLastName")
    protected String rawLastName;
    @XmlElement(name = "RawSuffixName")
    protected String rawSuffixName;
    @XmlElement(name = "RawFullName")
    protected String rawFullName;
    @XmlElement(name = "GenderCode")
    protected String genderCode;
    @XmlElement(name = "MaritalStatus")
    protected String maritalStatus;
    @XmlElement(name = "PrimaryLanguageCode")
    protected String primaryLanguageCode;
    @XmlElement(name = "DeathIndicator")
    protected String deathIndicator;
    @XmlElement(name = "BirthDate")
    protected String birthDate;
    @XmlElement(name = "DeathDate")
    protected String deathDate;
    @XmlElement(name = "FoundationDate")
    protected String foundationDate;
    @XmlElement(name = "DissolutionDate")
    protected String dissolutionDate;
    @XmlElement(name = "StatusCode")
    protected String statusCode;
    @XmlElement(name = "StatusReasonCode")
    protected String statusReasonCode;
    @XmlElement(name = "StatusChangeDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusChangeDate;
    @XmlElement(name = "OriginAdminSourceSystem")
    protected String originAdminSourceSystem;
    @XmlElement(name = "OriginAdminSourceKeyParty")
    protected String originAdminSourceKeyParty;
    @XmlElement(name = "GlobalID")
    protected String globalID;
    @XmlElement(name = "PkeySrcObject")
    protected String pkeySrcObject;
    @XmlElement(name = "SourceSystem")
    protected String sourceSystem;
    @XmlElement(name = "ReferenceSeq")
    protected String referenceSeq;

    /**
     * Gets the value of the rowidObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowidObject() {
        return rowidObject;
    }

    /**
     * Sets the value of the rowidObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowidObject(String value) {
        this.rowidObject = value;
    }

    /**
     * Gets the value of the partyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyType() {
        return partyType;
    }

    /**
     * Sets the value of the partyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyType(String value) {
        this.partyType = value;
    }

    /**
     * Gets the value of the rmid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMID() {
        return rmid;
    }

    /**
     * Sets the value of the rmid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMID(String value) {
        this.rmid = value;
    }

    /**
     * Gets the value of the prefixName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefixName() {
        return prefixName;
    }

    /**
     * Sets the value of the prefixName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefixName(String value) {
        this.prefixName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the suffixName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffixName() {
        return suffixName;
    }

    /**
     * Sets the value of the suffixName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffixName(String value) {
        this.suffixName = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the rawPrefixName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawPrefixName() {
        return rawPrefixName;
    }

    /**
     * Sets the value of the rawPrefixName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawPrefixName(String value) {
        this.rawPrefixName = value;
    }

    /**
     * Gets the value of the rawFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawFirstName() {
        return rawFirstName;
    }

    /**
     * Sets the value of the rawFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawFirstName(String value) {
        this.rawFirstName = value;
    }

    /**
     * Gets the value of the rawMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawMiddleName() {
        return rawMiddleName;
    }

    /**
     * Sets the value of the rawMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawMiddleName(String value) {
        this.rawMiddleName = value;
    }

    /**
     * Gets the value of the rawLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawLastName() {
        return rawLastName;
    }

    /**
     * Sets the value of the rawLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawLastName(String value) {
        this.rawLastName = value;
    }

    /**
     * Gets the value of the rawSuffixName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawSuffixName() {
        return rawSuffixName;
    }

    /**
     * Sets the value of the rawSuffixName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawSuffixName(String value) {
        this.rawSuffixName = value;
    }

    /**
     * Gets the value of the rawFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawFullName() {
        return rawFullName;
    }

    /**
     * Sets the value of the rawFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawFullName(String value) {
        this.rawFullName = value;
    }

    /**
     * Gets the value of the genderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * Sets the value of the genderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderCode(String value) {
        this.genderCode = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the primaryLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLanguageCode() {
        return primaryLanguageCode;
    }

    /**
     * Sets the value of the primaryLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLanguageCode(String value) {
        this.primaryLanguageCode = value;
    }

    /**
     * Gets the value of the deathIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathIndicator() {
        return deathIndicator;
    }

    /**
     * Sets the value of the deathIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathIndicator(String value) {
        this.deathIndicator = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the deathDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathDate() {
        return deathDate;
    }

    /**
     * Sets the value of the deathDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathDate(String value) {
        this.deathDate = value;
    }

    /**
     * Gets the value of the foundationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoundationDate() {
        return foundationDate;
    }

    /**
     * Sets the value of the foundationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoundationDate(String value) {
        this.foundationDate = value;
    }

    /**
     * Gets the value of the dissolutionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDissolutionDate() {
        return dissolutionDate;
    }

    /**
     * Sets the value of the dissolutionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDissolutionDate(String value) {
        this.dissolutionDate = value;
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
     * Gets the value of the statusChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusChangeDate() {
        return statusChangeDate;
    }

    /**
     * Sets the value of the statusChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusChangeDate(XMLGregorianCalendar value) {
        this.statusChangeDate = value;
    }

    /**
     * Gets the value of the originAdminSourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginAdminSourceSystem() {
        return originAdminSourceSystem;
    }

    /**
     * Sets the value of the originAdminSourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginAdminSourceSystem(String value) {
        this.originAdminSourceSystem = value;
    }

    /**
     * Gets the value of the originAdminSourceKeyParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginAdminSourceKeyParty() {
        return originAdminSourceKeyParty;
    }

    /**
     * Sets the value of the originAdminSourceKeyParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginAdminSourceKeyParty(String value) {
        this.originAdminSourceKeyParty = value;
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
