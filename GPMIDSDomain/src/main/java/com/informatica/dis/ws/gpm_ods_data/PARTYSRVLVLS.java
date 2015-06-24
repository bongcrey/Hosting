
package com.informatica.dis.ws.gpm_ods_data;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PARTY_SRV_LVLS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PARTY_SRV_LVLS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PARTY_SRV_LVL_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SRV_LVL_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SRV_LVL_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SRV_LVL_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SRV_LVL_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SRV_LVL_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SRV_LVL_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SRV_LVL_VAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "PARTY_SRV_LVLS", propOrder = {
    "partysrvlvlid",
    "srcsystem",
    "partyid",
    "burstrecnum",
    "srvlvleffdt",
    "srvlvlsttsdscr",
    "srvlvltypdscr",
    "srvlvlnm",
    "srvlvldscr",
    "srvlvlstopdt",
    "srvlvlval",
    "lstupdtdt",
    "lstupdtusrid",
    "hubstateind",
    "originsrcsys"
})
public class PARTYSRVLVLS {

    @XmlElement(name = "PARTY_SRV_LVL_ID")
    protected Long partysrvlvlid;
    @XmlElement(name = "SRC_SYSTEM")
    protected String srcsystem;
    @XmlElement(name = "PARTY_ID")
    protected String partyid;
    @XmlElement(name = "BURST_REC_NUM", required = true, nillable = true)
    protected String burstrecnum;
    @XmlElement(name = "SRV_LVL_EFF_DT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar srvlvleffdt;
    @XmlElement(name = "SRV_LVL_STTS_DSCR", required = true, nillable = true)
    protected String srvlvlsttsdscr;
    @XmlElement(name = "SRV_LVL_TYP_DSCR", required = true, nillable = true)
    protected String srvlvltypdscr;
    @XmlElement(name = "SRV_LVL_NM", required = true, nillable = true)
    protected String srvlvlnm;
    @XmlElement(name = "SRV_LVL_DSCR", required = true, nillable = true)
    protected String srvlvldscr;
    @XmlElement(name = "SRV_LVL_STOP_DT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar srvlvlstopdt;
    @XmlElement(name = "SRV_LVL_VAL", required = true, nillable = true)
    protected String srvlvlval;
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
     * Gets the value of the partysrvlvlid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPARTYSRVLVLID() {
        return partysrvlvlid;
    }

    /**
     * Sets the value of the partysrvlvlid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPARTYSRVLVLID(Long value) {
        this.partysrvlvlid = value;
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
     * Gets the value of the srvlvleffdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSRVLVLEFFDT() {
        return srvlvleffdt;
    }

    /**
     * Sets the value of the srvlvleffdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSRVLVLEFFDT(XMLGregorianCalendar value) {
        this.srvlvleffdt = value;
    }

    /**
     * Gets the value of the srvlvlsttsdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRVLVLSTTSDSCR() {
        return srvlvlsttsdscr;
    }

    /**
     * Sets the value of the srvlvlsttsdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRVLVLSTTSDSCR(String value) {
        this.srvlvlsttsdscr = value;
    }

    /**
     * Gets the value of the srvlvltypdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRVLVLTYPDSCR() {
        return srvlvltypdscr;
    }

    /**
     * Sets the value of the srvlvltypdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRVLVLTYPDSCR(String value) {
        this.srvlvltypdscr = value;
    }

    /**
     * Gets the value of the srvlvlnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRVLVLNM() {
        return srvlvlnm;
    }

    /**
     * Sets the value of the srvlvlnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRVLVLNM(String value) {
        this.srvlvlnm = value;
    }

    /**
     * Gets the value of the srvlvldscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRVLVLDSCR() {
        return srvlvldscr;
    }

    /**
     * Sets the value of the srvlvldscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRVLVLDSCR(String value) {
        this.srvlvldscr = value;
    }

    /**
     * Gets the value of the srvlvlstopdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSRVLVLSTOPDT() {
        return srvlvlstopdt;
    }

    /**
     * Sets the value of the srvlvlstopdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSRVLVLSTOPDT(XMLGregorianCalendar value) {
        this.srvlvlstopdt = value;
    }

    /**
     * Gets the value of the srvlvlval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRVLVLVAL() {
        return srvlvlval;
    }

    /**
     * Sets the value of the srvlvlval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRVLVLVAL(String value) {
        this.srvlvlval = value;
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
