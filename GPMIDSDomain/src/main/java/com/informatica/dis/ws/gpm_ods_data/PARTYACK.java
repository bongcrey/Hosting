
package com.informatica.dis.ws.gpm_ods_data;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PARTY_ACK complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PARTY_ACK">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PARTY_ACK_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ACK_VER_NUM" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ACK_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ACK_ELCT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ACK_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ACK_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ACK_CNTXT_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ACK_PARM_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ACK_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ACK_PARM_VAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "PARTY_ACK", propOrder = {
    "partyackid",
    "srcsystem",
    "partyid",
    "burstrecnum",
    "ackvernum",
    "ackeffdt",
    "ackelctdt",
    "acksttsdscr",
    "acktypdscr",
    "ackcntxtdscr",
    "ackparmnm",
    "ackstopdt",
    "ackparmval",
    "lstupdtdt",
    "lstupdtusrid",
    "hubstateind",
    "originsrcsys"
})
public class PARTYACK {

    @XmlElement(name = "PARTY_ACK_ID")
    protected Long partyackid;
    @XmlElement(name = "SRC_SYSTEM")
    protected String srcsystem;
    @XmlElement(name = "PARTY_ID")
    protected String partyid;
    @XmlElement(name = "BURST_REC_NUM", required = true, nillable = true)
    protected String burstrecnum;
    @XmlElement(name = "ACK_VER_NUM")
    protected BigInteger ackvernum;
    @XmlElement(name = "ACK_EFF_DT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ackeffdt;
    @XmlElement(name = "ACK_ELCT_DT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ackelctdt;
    @XmlElement(name = "ACK_STTS_DSCR", required = true, nillable = true)
    protected String acksttsdscr;
    @XmlElement(name = "ACK_TYP_DSCR", required = true, nillable = true)
    protected String acktypdscr;
    @XmlElement(name = "ACK_CNTXT_DSCR", required = true, nillable = true)
    protected String ackcntxtdscr;
    @XmlElement(name = "ACK_PARM_NM", required = true, nillable = true)
    protected String ackparmnm;
    @XmlElement(name = "ACK_STOP_DT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ackstopdt;
    @XmlElement(name = "ACK_PARM_VAL", required = true, nillable = true)
    protected String ackparmval;
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
     * Gets the value of the partyackid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPARTYACKID() {
        return partyackid;
    }

    /**
     * Sets the value of the partyackid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPARTYACKID(Long value) {
        this.partyackid = value;
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
     * Gets the value of the ackvernum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getACKVERNUM() {
        return ackvernum;
    }

    /**
     * Sets the value of the ackvernum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setACKVERNUM(BigInteger value) {
        this.ackvernum = value;
    }

    /**
     * Gets the value of the ackeffdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getACKEFFDT() {
        return ackeffdt;
    }

    /**
     * Sets the value of the ackeffdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setACKEFFDT(XMLGregorianCalendar value) {
        this.ackeffdt = value;
    }

    /**
     * Gets the value of the ackelctdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getACKELCTDT() {
        return ackelctdt;
    }

    /**
     * Sets the value of the ackelctdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setACKELCTDT(XMLGregorianCalendar value) {
        this.ackelctdt = value;
    }

    /**
     * Gets the value of the acksttsdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACKSTTSDSCR() {
        return acksttsdscr;
    }

    /**
     * Sets the value of the acksttsdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACKSTTSDSCR(String value) {
        this.acksttsdscr = value;
    }

    /**
     * Gets the value of the acktypdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACKTYPDSCR() {
        return acktypdscr;
    }

    /**
     * Sets the value of the acktypdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACKTYPDSCR(String value) {
        this.acktypdscr = value;
    }

    /**
     * Gets the value of the ackcntxtdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACKCNTXTDSCR() {
        return ackcntxtdscr;
    }

    /**
     * Sets the value of the ackcntxtdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACKCNTXTDSCR(String value) {
        this.ackcntxtdscr = value;
    }

    /**
     * Gets the value of the ackparmnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACKPARMNM() {
        return ackparmnm;
    }

    /**
     * Sets the value of the ackparmnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACKPARMNM(String value) {
        this.ackparmnm = value;
    }

    /**
     * Gets the value of the ackstopdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getACKSTOPDT() {
        return ackstopdt;
    }

    /**
     * Sets the value of the ackstopdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setACKSTOPDT(XMLGregorianCalendar value) {
        this.ackstopdt = value;
    }

    /**
     * Gets the value of the ackparmval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACKPARMVAL() {
        return ackparmval;
    }

    /**
     * Sets the value of the ackparmval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACKPARMVAL(String value) {
        this.ackparmval = value;
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
