
package com.informatica.dis.ws.gpm_ods_data;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PARTY_INVST_HLD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PARTY_INVST_HLD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PARTY_INVST_HLD_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CUR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CUR_INVST_HLD_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INVST_HLD_TYP_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HLD_IN_YR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="HLD_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PARTY_INVST_HLD", propOrder = {
    "partyinvsthldid",
    "srcsystem",
    "partyid",
    "burstrecnum",
    "curcd",
    "curinvsthldind",
    "invsthldtypnm",
    "hldinyr",
    "hldamt",
    "lstupdtdt",
    "lstupdtusrid",
    "hubstateind",
    "originsrcsys"
})
public class PARTYINVSTHLD {

    @XmlElement(name = "PARTY_INVST_HLD_ID")
    protected Long partyinvsthldid;
    @XmlElement(name = "SRC_SYSTEM")
    protected String srcsystem;
    @XmlElement(name = "PARTY_ID")
    protected String partyid;
    @XmlElement(name = "BURST_REC_NUM", required = true, nillable = true)
    protected String burstrecnum;
    @XmlElement(name = "CUR_CD", required = true, nillable = true)
    protected String curcd;
    @XmlElement(name = "CUR_INVST_HLD_IND", required = true, nillable = true)
    protected String curinvsthldind;
    @XmlElement(name = "INVST_HLD_TYP_NM", required = true, nillable = true)
    protected String invsthldtypnm;
    @XmlElementRef(name = "HLD_IN_YR", namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> hldinyr;
    @XmlElement(name = "HLD_AMT")
    protected BigDecimal hldamt;
    @XmlElement(name = "LST_UPDT_DT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lstupdtdt;
    @XmlElement(name = "LST_UPDT_USR_ID", required = true, nillable = true)
    protected String lstupdtusrid;
    @XmlElement(name = "HUB_STATE_IND")
    protected BigDecimal hubstateind;
    @XmlElement(name = "ORIGIN_SRC_SYS", required = true, nillable = true)
    protected String originsrcsys;

    /**
     * Gets the value of the partyinvsthldid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPARTYINVSTHLDID() {
        return partyinvsthldid;
    }

    /**
     * Sets the value of the partyinvsthldid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPARTYINVSTHLDID(Long value) {
        this.partyinvsthldid = value;
    }

    /**
     * Gets the value of the srcsystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRCSYSTEM() {
        return srcsystem;
    }

    /**
     * Sets the value of the srcsystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRCSYSTEM(String value) {
        this.srcsystem = value;
    }

    /**
     * Gets the value of the partyid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTYID() {
        return partyid;
    }

    /**
     * Sets the value of the partyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTYID(String value) {
        this.partyid = value;
    }

    /**
     * Gets the value of the burstrecnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBURSTRECNUM() {
        return burstrecnum;
    }

    /**
     * Sets the value of the burstrecnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBURSTRECNUM(String value) {
        this.burstrecnum = value;
    }

    /**
     * Gets the value of the curcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURCD() {
        return curcd;
    }

    /**
     * Sets the value of the curcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURCD(String value) {
        this.curcd = value;
    }

    /**
     * Gets the value of the curinvsthldind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURINVSTHLDIND() {
        return curinvsthldind;
    }

    /**
     * Sets the value of the curinvsthldind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURINVSTHLDIND(String value) {
        this.curinvsthldind = value;
    }

    /**
     * Gets the value of the invsthldtypnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINVSTHLDTYPNM() {
        return invsthldtypnm;
    }

    /**
     * Sets the value of the invsthldtypnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINVSTHLDTYPNM(String value) {
        this.invsthldtypnm = value;
    }

    /**
     * Gets the value of the hldinyr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getHLDINYR() {
        return hldinyr;
    }

    /**
     * Sets the value of the hldinyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setHLDINYR(JAXBElement<BigInteger> value) {
        this.hldinyr = value;
    }

    /**
     * Gets the value of the hldamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHLDAMT() {
        return hldamt;
    }

    /**
     * Sets the value of the hldamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHLDAMT(BigDecimal value) {
        this.hldamt = value;
    }

    /**
     * Gets the value of the lstupdtdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLSTUPDTDT() {
        return lstupdtdt;
    }

    /**
     * Sets the value of the lstupdtdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLSTUPDTDT(XMLGregorianCalendar value) {
        this.lstupdtdt = value;
    }

    /**
     * Gets the value of the lstupdtusrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLSTUPDTUSRID() {
        return lstupdtusrid;
    }

    /**
     * Sets the value of the lstupdtusrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLSTUPDTUSRID(String value) {
        this.lstupdtusrid = value;
    }

    /**
     * Gets the value of the hubstateind property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHUBSTATEIND() {
        return hubstateind;
    }

    /**
     * Sets the value of the hubstateind property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHUBSTATEIND(BigDecimal value) {
        this.hubstateind = value;
    }

    /**
     * Gets the value of the originsrcsys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORIGINSRCSYS() {
        return originsrcsys;
    }

    /**
     * Sets the value of the originsrcsys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORIGINSRCSYS(String value) {
        this.originsrcsys = value;
    }

}
