
package com.informatica.dis.ws.gpm_ods_data;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PARTY_INCM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PARTY_INCM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PARTY_INCM_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CUR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INCM_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="INCM_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INCM_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INCM_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INCM_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INCM_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="INCM_VAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "PARTY_INCM", propOrder = {
    "partyincmid",
    "srcsystem",
    "partyid",
    "burstrecnum",
    "curcd",
    "incmeffdt",
    "incmsttsdscr",
    "incmtypdscr",
    "incmnm",
    "incmdscr",
    "incmstopdt",
    "incmval",
    "lstupdtdt",
    "lstupdtusrid",
    "hubstateind",
    "originsrcsys"
})
public class PARTYINCM {

    @XmlElement(name = "PARTY_INCM_ID")
    protected Long partyincmid;
    @XmlElement(name = "SRC_SYSTEM")
    protected String srcsystem;
    @XmlElement(name = "PARTY_ID")
    protected String partyid;
    @XmlElement(name = "BURST_REC_NUM", required = true, nillable = true)
    protected String burstrecnum;
    @XmlElement(name = "CUR_CD", required = true, nillable = true)
    protected String curcd;
    @XmlElement(name = "INCM_EFF_DT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar incmeffdt;
    @XmlElement(name = "INCM_STTS_DSCR", required = true, nillable = true)
    protected String incmsttsdscr;
    @XmlElement(name = "INCM_TYP_DSCR", required = true, nillable = true)
    protected String incmtypdscr;
    @XmlElement(name = "INCM_NM", required = true, nillable = true)
    protected String incmnm;
    @XmlElement(name = "INCM_DSCR", required = true, nillable = true)
    protected String incmdscr;
    @XmlElement(name = "INCM_STOP_DT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar incmstopdt;
    @XmlElement(name = "INCM_VAL")
    protected BigDecimal incmval;
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
     * Gets the value of the partyincmid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPARTYINCMID() {
        return partyincmid;
    }

    /**
     * Sets the value of the partyincmid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPARTYINCMID(Long value) {
        this.partyincmid = value;
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
     * Gets the value of the incmeffdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getINCMEFFDT() {
        return incmeffdt;
    }

    /**
     * Sets the value of the incmeffdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setINCMEFFDT(XMLGregorianCalendar value) {
        this.incmeffdt = value;
    }

    /**
     * Gets the value of the incmsttsdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINCMSTTSDSCR() {
        return incmsttsdscr;
    }

    /**
     * Sets the value of the incmsttsdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINCMSTTSDSCR(String value) {
        this.incmsttsdscr = value;
    }

    /**
     * Gets the value of the incmtypdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINCMTYPDSCR() {
        return incmtypdscr;
    }

    /**
     * Sets the value of the incmtypdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINCMTYPDSCR(String value) {
        this.incmtypdscr = value;
    }

    /**
     * Gets the value of the incmnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINCMNM() {
        return incmnm;
    }

    /**
     * Sets the value of the incmnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINCMNM(String value) {
        this.incmnm = value;
    }

    /**
     * Gets the value of the incmdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINCMDSCR() {
        return incmdscr;
    }

    /**
     * Sets the value of the incmdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINCMDSCR(String value) {
        this.incmdscr = value;
    }

    /**
     * Gets the value of the incmstopdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getINCMSTOPDT() {
        return incmstopdt;
    }

    /**
     * Sets the value of the incmstopdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setINCMSTOPDT(XMLGregorianCalendar value) {
        this.incmstopdt = value;
    }

    /**
     * Gets the value of the incmval property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINCMVAL() {
        return incmval;
    }

    /**
     * Sets the value of the incmval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINCMVAL(BigDecimal value) {
        this.incmval = value;
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
