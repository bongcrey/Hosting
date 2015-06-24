
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
 * <p>Java class for PARTY_ORG complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PARTY_ORG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ORG_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EMPE_CNT_RNG_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FRTN_500_RNK_NUM" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MET_CUST_IN_YR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="SMALL_BUS_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WMN_OWN_BUS_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GLB_ULT_BUS_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GLB_ULT_BUS_ST_ABBR_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GLB_ULT_PRNT_CNTRY_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CLNT_STTS_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CLNT_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BUS_JRSDICT_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LOC_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="EMPE_CLASS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IND_CLASS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NM_APL_BY_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PLC_OF_ORIG_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "PARTY_ORG", propOrder = {
    "orgid",
    "srcsystem",
    "partyid",
    "burstrecnum",
    "empecntrngdscr",
    "frtn500RNKNUM",
    "metcustinyr",
    "smallbusind",
    "wmnownbusind",
    "glbultbusind",
    "glbultbusstabbrnm",
    "glbultprntcntrynm",
    "clntsttscd",
    "clntsttsdscr",
    "busjrsdictdscr",
    "loccnt",
    "empeclassdscr",
    "indclassdscr",
    "lstupdtdt",
    "lstupdtusrid",
    "hubstateind",
    "nmaplbycd",
    "plcoforigdscr",
    "originsrcsys"
})
public class PARTYORG {

    @XmlElement(name = "ORG_ID")
    protected Long orgid;
    @XmlElement(name = "SRC_SYSTEM")
    protected String srcsystem;
    @XmlElement(name = "PARTY_ID")
    protected String partyid;
    @XmlElement(name = "BURST_REC_NUM", required = true, nillable = true)
    protected String burstrecnum;
    @XmlElement(name = "EMPE_CNT_RNG_DSCR", required = true, nillable = true)
    protected String empecntrngdscr;
    @XmlElement(name = "FRTN_500_RNK_NUM")
    protected BigInteger frtn500RNKNUM;
    @XmlElement(name = "MET_CUST_IN_YR")
    protected BigInteger metcustinyr;
    @XmlElement(name = "SMALL_BUS_IND", required = true, nillable = true)
    protected String smallbusind;
    @XmlElement(name = "WMN_OWN_BUS_IND", required = true, nillable = true)
    protected String wmnownbusind;
    @XmlElement(name = "GLB_ULT_BUS_IND", required = true, nillable = true)
    protected String glbultbusind;
    @XmlElement(name = "GLB_ULT_BUS_ST_ABBR_NM", required = true, nillable = true)
    protected String glbultbusstabbrnm;
    @XmlElement(name = "GLB_ULT_PRNT_CNTRY_NM", required = true, nillable = true)
    protected String glbultprntcntrynm;
    @XmlElement(name = "CLNT_STTS_CD", required = true, nillable = true)
    protected String clntsttscd;
    @XmlElement(name = "CLNT_STTS_DSCR", required = true, nillable = true)
    protected String clntsttsdscr;
    @XmlElement(name = "BUS_JRSDICT_DSCR", required = true, nillable = true)
    protected String busjrsdictdscr;
    @XmlElement(name = "LOC_CNT")
    protected BigInteger loccnt;
    @XmlElement(name = "EMPE_CLASS_DSCR", required = true, nillable = true)
    protected String empeclassdscr;
    @XmlElement(name = "IND_CLASS_DSCR", required = true, nillable = true)
    protected String indclassdscr;
    @XmlElement(name = "LST_UPDT_DT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lstupdtdt;
    @XmlElement(name = "LST_UPDT_USR_ID", required = true, nillable = true)
    protected String lstupdtusrid;
    @XmlElement(name = "HUB_STATE_IND")
    protected BigDecimal hubstateind;
    @XmlElement(name = "NM_APL_BY_CD", required = true, nillable = true)
    protected String nmaplbycd;
    @XmlElement(name = "PLC_OF_ORIG_DSCR", required = true, nillable = true)
    protected String plcoforigdscr;
    @XmlElement(name = "ORIGIN_SRC_SYS", required = true, nillable = true)
    protected String originsrcsys;

    /**
     * Gets the value of the orgid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getORGID() {
        return orgid;
    }

    /**
     * Sets the value of the orgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setORGID(Long value) {
        this.orgid = value;
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
     * Gets the value of the empecntrngdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPECNTRNGDSCR() {
        return empecntrngdscr;
    }

    /**
     * Sets the value of the empecntrngdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPECNTRNGDSCR(String value) {
        this.empecntrngdscr = value;
    }

    /**
     * Gets the value of the frtn500RNKNUM property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFRTN500RNKNUM() {
        return frtn500RNKNUM;
    }

    /**
     * Sets the value of the frtn500RNKNUM property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFRTN500RNKNUM(BigInteger value) {
        this.frtn500RNKNUM = value;
    }

    /**
     * Gets the value of the metcustinyr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMETCUSTINYR() {
        return metcustinyr;
    }

    /**
     * Sets the value of the metcustinyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMETCUSTINYR(BigInteger value) {
        this.metcustinyr = value;
    }

    /**
     * Gets the value of the smallbusind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMALLBUSIND() {
        return smallbusind;
    }

    /**
     * Sets the value of the smallbusind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMALLBUSIND(String value) {
        this.smallbusind = value;
    }

    /**
     * Gets the value of the wmnownbusind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWMNOWNBUSIND() {
        return wmnownbusind;
    }

    /**
     * Sets the value of the wmnownbusind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWMNOWNBUSIND(String value) {
        this.wmnownbusind = value;
    }

    /**
     * Gets the value of the glbultbusind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLBULTBUSIND() {
        return glbultbusind;
    }

    /**
     * Sets the value of the glbultbusind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLBULTBUSIND(String value) {
        this.glbultbusind = value;
    }

    /**
     * Gets the value of the glbultbusstabbrnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLBULTBUSSTABBRNM() {
        return glbultbusstabbrnm;
    }

    /**
     * Sets the value of the glbultbusstabbrnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLBULTBUSSTABBRNM(String value) {
        this.glbultbusstabbrnm = value;
    }

    /**
     * Gets the value of the glbultprntcntrynm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLBULTPRNTCNTRYNM() {
        return glbultprntcntrynm;
    }

    /**
     * Sets the value of the glbultprntcntrynm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLBULTPRNTCNTRYNM(String value) {
        this.glbultprntcntrynm = value;
    }

    /**
     * Gets the value of the clntsttscd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLNTSTTSCD() {
        return clntsttscd;
    }

    /**
     * Sets the value of the clntsttscd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLNTSTTSCD(String value) {
        this.clntsttscd = value;
    }

    /**
     * Gets the value of the clntsttsdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLNTSTTSDSCR() {
        return clntsttsdscr;
    }

    /**
     * Sets the value of the clntsttsdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLNTSTTSDSCR(String value) {
        this.clntsttsdscr = value;
    }

    /**
     * Gets the value of the busjrsdictdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUSJRSDICTDSCR() {
        return busjrsdictdscr;
    }

    /**
     * Sets the value of the busjrsdictdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUSJRSDICTDSCR(String value) {
        this.busjrsdictdscr = value;
    }

    /**
     * Gets the value of the loccnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLOCCNT() {
        return loccnt;
    }

    /**
     * Sets the value of the loccnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLOCCNT(BigInteger value) {
        this.loccnt = value;
    }

    /**
     * Gets the value of the empeclassdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPECLASSDSCR() {
        return empeclassdscr;
    }

    /**
     * Sets the value of the empeclassdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPECLASSDSCR(String value) {
        this.empeclassdscr = value;
    }

    /**
     * Gets the value of the indclassdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDCLASSDSCR() {
        return indclassdscr;
    }

    /**
     * Sets the value of the indclassdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDCLASSDSCR(String value) {
        this.indclassdscr = value;
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
     * Gets the value of the nmaplbycd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMAPLBYCD() {
        return nmaplbycd;
    }

    /**
     * Sets the value of the nmaplbycd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMAPLBYCD(String value) {
        this.nmaplbycd = value;
    }

    /**
     * Gets the value of the plcoforigdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLCOFORIGDSCR() {
        return plcoforigdscr;
    }

    /**
     * Sets the value of the plcoforigdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLCOFORIGDSCR(String value) {
        this.plcoforigdscr = value;
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
