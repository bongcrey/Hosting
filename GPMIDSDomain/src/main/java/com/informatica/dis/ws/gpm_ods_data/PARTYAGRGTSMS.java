
package com.informatica.dis.ws.gpm_ods_data;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PARTY_AGRGTS_MS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PARTY_AGRGTS_MS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PARTY_AGRGT_MS_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AGRGT_MS_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="AGRGT_MS_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AGRGT_MS_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AGRGT_MS_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AGRGT_MS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AGRGT_MS_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="AGRGT_MS_VAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "PARTY_AGRGTS_MS", propOrder = {
    "partyagrgtmsid",
    "srcsystem",
    "partyid",
    "burstrecnum",
    "agrgtmseffdt",
    "agrgtmssttsdscr",
    "agrgtmstypdscr",
    "agrgtmsnm",
    "agrgtmsdscr",
    "agrgtmsstopdt",
    "agrgtmsval",
    "lstupdtdt",
    "lstupdtusrid",
    "hubstateind",
    "originsrcsys"
})
public class PARTYAGRGTSMS {

    @XmlElement(name = "PARTY_AGRGT_MS_ID")
    protected Long partyagrgtmsid;
    @XmlElement(name = "SRC_SYSTEM")
    protected String srcsystem;
    @XmlElement(name = "PARTY_ID")
    protected String partyid;
    @XmlElement(name = "BURST_REC_NUM", required = true, nillable = true)
    protected String burstrecnum;
    @XmlElement(name = "AGRGT_MS_EFF_DT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar agrgtmseffdt;
    @XmlElement(name = "AGRGT_MS_STTS_DSCR", required = true, nillable = true)
    protected String agrgtmssttsdscr;
    @XmlElement(name = "AGRGT_MS_TYP_DSCR", required = true, nillable = true)
    protected String agrgtmstypdscr;
    @XmlElement(name = "AGRGT_MS_NM", required = true, nillable = true)
    protected String agrgtmsnm;
    @XmlElement(name = "AGRGT_MS_DSCR", required = true, nillable = true)
    protected String agrgtmsdscr;
    @XmlElement(name = "AGRGT_MS_STOP_DT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar agrgtmsstopdt;
    @XmlElement(name = "AGRGT_MS_VAL", required = true, nillable = true)
    protected String agrgtmsval;
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
     * Gets the value of the partyagrgtmsid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPARTYAGRGTMSID() {
        return partyagrgtmsid;
    }

    /**
     * Sets the value of the partyagrgtmsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPARTYAGRGTMSID(Long value) {
        this.partyagrgtmsid = value;
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
     * Gets the value of the agrgtmseffdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAGRGTMSEFFDT() {
        return agrgtmseffdt;
    }

    /**
     * Sets the value of the agrgtmseffdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAGRGTMSEFFDT(XMLGregorianCalendar value) {
        this.agrgtmseffdt = value;
    }

    /**
     * Gets the value of the agrgtmssttsdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGRGTMSSTTSDSCR() {
        return agrgtmssttsdscr;
    }

    /**
     * Sets the value of the agrgtmssttsdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGRGTMSSTTSDSCR(String value) {
        this.agrgtmssttsdscr = value;
    }

    /**
     * Gets the value of the agrgtmstypdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGRGTMSTYPDSCR() {
        return agrgtmstypdscr;
    }

    /**
     * Sets the value of the agrgtmstypdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGRGTMSTYPDSCR(String value) {
        this.agrgtmstypdscr = value;
    }

    /**
     * Gets the value of the agrgtmsnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGRGTMSNM() {
        return agrgtmsnm;
    }

    /**
     * Sets the value of the agrgtmsnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGRGTMSNM(String value) {
        this.agrgtmsnm = value;
    }

    /**
     * Gets the value of the agrgtmsdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGRGTMSDSCR() {
        return agrgtmsdscr;
    }

    /**
     * Sets the value of the agrgtmsdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGRGTMSDSCR(String value) {
        this.agrgtmsdscr = value;
    }

    /**
     * Gets the value of the agrgtmsstopdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAGRGTMSSTOPDT() {
        return agrgtmsstopdt;
    }

    /**
     * Sets the value of the agrgtmsstopdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAGRGTMSSTOPDT(XMLGregorianCalendar value) {
        this.agrgtmsstopdt = value;
    }

    /**
     * Gets the value of the agrgtmsval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGRGTMSVAL() {
        return agrgtmsval;
    }

    /**
     * Sets the value of the agrgtmsval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGRGTMSVAL(String value) {
        this.agrgtmsval = value;
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
