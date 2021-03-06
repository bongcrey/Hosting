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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyRoleInAgreement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyRoleInAgreement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartyRoleInAgreementID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgreementID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoleSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Market" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssueAge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HierarchyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryRoleInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "PartyRoleInAgreement", propOrder = {
    "partyRoleInAgreementID",
    "partyID",
    "agreementID",
    "roleType",
    "roleSubType",
    "market",
    "issueAge",
    "statusCode",
    "statusReasonCode",
    "hierarchyCode",
    "relTypeCode",
    "primaryRoleInd",
    "pkeySrcObject",
    "sourceSystem"
})
public class PartyRoleInAgreement {

    @XmlElement(name = "PartyRoleInAgreementID")
    protected String partyRoleInAgreementID;
    @XmlElement(name = "PartyID")
    protected String partyID;
    @XmlElement(name = "AgreementID")
    protected String agreementID;
    @XmlElement(name = "RoleType")
    protected String roleType;
    @XmlElement(name = "RoleSubType")
    protected String roleSubType;
    @XmlElement(name = "Market")
    protected String market;
    @XmlElement(name = "IssueAge")
    protected String issueAge;
    @XmlElement(name = "StatusCode")
    protected String statusCode;
    @XmlElement(name = "StatusReasonCode")
    protected String statusReasonCode;
    @XmlElement(name = "HierarchyCode")
    protected String hierarchyCode;
    @XmlElement(name = "RelTypeCode")
    protected String relTypeCode;
    @XmlElement(name = "PrimaryRoleInd")
    protected String primaryRoleInd;
    @XmlElement(name = "PkeySrcObject")
    protected String pkeySrcObject;
    @XmlElement(name = "SourceSystem")
    protected String sourceSystem;

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
     * Gets the value of the roleSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleSubType() {
        return roleSubType;
    }

    /**
     * Sets the value of the roleSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleSubType(String value) {
        this.roleSubType = value;
    }

    /**
     * Gets the value of the market property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarket() {
        return market;
    }

    /**
     * Sets the value of the market property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarket(String value) {
        this.market = value;
    }

    /**
     * Gets the value of the issueAge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueAge() {
        return issueAge;
    }

    /**
     * Sets the value of the issueAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueAge(String value) {
        this.issueAge = value;
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
     * Gets the value of the hierarchyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchyCode() {
        return hierarchyCode;
    }

    /**
     * Sets the value of the hierarchyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchyCode(String value) {
        this.hierarchyCode = value;
    }

    /**
     * Gets the value of the relTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelTypeCode() {
        return relTypeCode;
    }

    /**
     * Sets the value of the relTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelTypeCode(String value) {
        this.relTypeCode = value;
    }

    /**
     * Gets the value of the primaryRoleInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryRoleInd() {
        return primaryRoleInd;
    }

    /**
     * Sets the value of the primaryRoleInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryRoleInd(String value) {
        this.primaryRoleInd = value;
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
