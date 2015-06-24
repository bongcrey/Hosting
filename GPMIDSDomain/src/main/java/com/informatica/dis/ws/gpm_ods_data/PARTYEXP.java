
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
 * <p>Java class for PARTY_EXP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PARTY_EXP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PARTY_EXP_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CUR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EXP_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EXP_FREQ_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EXP_TMFRAM_IN_YR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="EXP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EXP_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "PARTY_EXP", propOrder = {
    "partyexpid",
    "srcsystem",
    "partyid",
    "burstrecnum",
    "curcd",
    "exptypdscr",
    "expfreqnm",
    "exptmframinyr",
    "expdscr",
    "expamt",
    "lstupdtdt",
    "lstupdtusrid",
    "hubstateind",
    "originsrcsys"
})
public class PARTYEXP {

    @XmlElement(name = "PARTY_EXP_ID")
    protected Long partyexpid;
    @XmlElement(name = "SRC_SYSTEM")
    protected String srcsystem;
    @XmlElement(name = "PARTY_ID")
    protected String partyid;
    @XmlElement(name = "BURST_REC_NUM", required = true, nillable = true)
    protected String burstrecnum;
    @XmlElement(name = "CUR_CD", required = true, nillable = true)
    protected String curcd;
    @XmlElement(name = "EXP_TYP_DSCR", required = true, nillable = true)
    protected String exptypdscr;
    @XmlElement(name = "EXP_FREQ_NM", required = true, nillable = true)
    protected String expfreqnm;
    @XmlElement(name = "EXP_TMFRAM_IN_YR")
    protected BigInteger exptmframinyr;
    @XmlElement(name = "EXP_DSCR", required = true, nillable = true)
    protected String expdscr;
    @XmlElement(name = "EXP_AMT")
    protected BigDecimal expamt;
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
     * Gets the value of the partyexpid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPARTYEXPID() {
        return partyexpid;
    }

    /**
     * Sets the value of the partyexpid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPARTYEXPID(Long value) {
        this.partyexpid = value;
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
     * Gets the value of the exptypdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPTYPDSCR() {
        return exptypdscr;
    }

    /**
     * Sets the value of the exptypdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPTYPDSCR(String value) {
        this.exptypdscr = value;
    }

    /**
     * Gets the value of the expfreqnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPFREQNM() {
        return expfreqnm;
    }

    /**
     * Sets the value of the expfreqnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPFREQNM(String value) {
        this.expfreqnm = value;
    }

    /**
     * Gets the value of the exptmframinyr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEXPTMFRAMINYR() {
        return exptmframinyr;
    }

    /**
     * Sets the value of the exptmframinyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEXPTMFRAMINYR(BigInteger value) {
        this.exptmframinyr = value;
    }

    /**
     * Gets the value of the expdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPDSCR() {
        return expdscr;
    }

    /**
     * Sets the value of the expdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPDSCR(String value) {
        this.expdscr = value;
    }

    /**
     * Gets the value of the expamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXPAMT() {
        return expamt;
    }

    /**
     * Sets the value of the expamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXPAMT(BigDecimal value) {
        this.expamt = value;
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
