
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
 * <p>Java class for PARTY_PER complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PARTY_PER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PER_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FIN_REG_ASSOC_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ESERVICE_PRFL_EDIT_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EMP_IN_YR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MET_EMP_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DIR_OFC_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OVR_18_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AGE_IN_YR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="AGE_RNG_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EMP_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TAX_BRKT_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TAX_BRKT_PCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OCC_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OCC_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OCC_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OCC_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OCC_STRT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OCC_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BNR_LST_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LST_BNR_MAIL_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LST_SUIT_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MED_COND_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NM_APL_BY_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PLC_OF_ORIG_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EMPR_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NXT_BNR_MAIL_DT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EMPR_ADR_LN_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EMPR_ADR_LN_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EMPR_ADR_LN_3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EMPR_ADR_LN_4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EMPR_ADR_LN_5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EMPR_CITY_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EMPR_ST_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EMPR_ZIP_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EMPR_N_US_RGN_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EMPR_N_US_PST_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EMPR_CNTRY_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EMPR_TEL_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PARTY_PER", propOrder = {
    "perid",
    "srcsystem",
    "partyid",
    "burstrecnum",
    "finregassocind",
    "eserviceprfleditind",
    "empinyr",
    "metempind",
    "dirofcind",
    "ovr18IND",
    "ageinyr",
    "agerngdscr",
    "empsttsdscr",
    "taxbrktdscr",
    "taxbrktpct",
    "occsttsdscr",
    "occtypdscr",
    "occnm",
    "occdscr",
    "occstrtdt",
    "occstopdt",
    "bnrlsteffdt",
    "lstbnrmaildt",
    "lstsuitupdtdt",
    "medcondsttsdscr",
    "lstupdtdt",
    "lstupdtusrid",
    "hubstateind",
    "nmaplbycd",
    "plcoforigdscr",
    "originsrcsys",
    "emprnm",
    "nxtbnrmaildt",
    "empradrln1",
    "empradrln2",
    "empradrln3",
    "empradrln4",
    "empradrln5",
    "emprcitynm",
    "emprstcd",
    "emprzipcd",
    "emprnusrgncd",
    "emprnuspstcd",
    "emprcntrynm",
    "emprtelnum"
})
public class PARTYPER {

    @XmlElement(name = "PER_ID")
    protected Long perid;
    @XmlElement(name = "SRC_SYSTEM")
    protected String srcsystem;
    @XmlElement(name = "PARTY_ID")
    protected String partyid;
    @XmlElement(name = "BURST_REC_NUM", required = true, nillable = true)
    protected String burstrecnum;
    @XmlElement(name = "FIN_REG_ASSOC_IND", required = true, nillable = true)
    protected String finregassocind;
    @XmlElement(name = "ESERVICE_PRFL_EDIT_IND", required = true, nillable = true)
    protected String eserviceprfleditind;
    @XmlElement(name = "EMP_IN_YR")
    protected BigInteger empinyr;
    @XmlElement(name = "MET_EMP_IND", required = true, nillable = true)
    protected String metempind;
    @XmlElement(name = "DIR_OFC_IND", required = true, nillable = true)
    protected String dirofcind;
    @XmlElement(name = "OVR_18_IND", required = true, nillable = true)
    protected String ovr18IND;
    @XmlElement(name = "AGE_IN_YR")
    protected BigInteger ageinyr;
    @XmlElement(name = "AGE_RNG_DSCR", required = true, nillable = true)
    protected String agerngdscr;
    @XmlElement(name = "EMP_STTS_DSCR", required = true, nillable = true)
    protected String empsttsdscr;
    @XmlElement(name = "TAX_BRKT_DSCR", required = true, nillable = true)
    protected String taxbrktdscr;
    @XmlElement(name = "TAX_BRKT_PCT")
    protected String taxbrktpct;
    @XmlElement(name = "OCC_STTS_DSCR", required = true, nillable = true)
    protected String occsttsdscr;
    @XmlElement(name = "OCC_TYP_DSCR", required = true, nillable = true)
    protected String occtypdscr;
    @XmlElement(name = "OCC_NM", required = true, nillable = true)
    protected String occnm;
    @XmlElement(name = "OCC_DSCR", required = true, nillable = true)
    protected String occdscr;
    @XmlElement(name = "OCC_STRT_DT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar occstrtdt;
    @XmlElement(name = "OCC_STOP_DT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar occstopdt;
    @XmlElement(name = "BNR_LST_EFF_DT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bnrlsteffdt;
    @XmlElement(name = "LST_BNR_MAIL_DT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lstbnrmaildt;
    @XmlElement(name = "LST_SUIT_UPDT_DT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lstsuitupdtdt;
    @XmlElement(name = "MED_COND_STTS_DSCR", required = true, nillable = true)
    protected String medcondsttsdscr;
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
    @XmlElement(name = "EMPR_NM", required = true, nillable = true)
    protected String emprnm;
    @XmlElement(name = "NXT_BNR_MAIL_DT", required = true, nillable = true)
    protected String nxtbnrmaildt;
    @XmlElement(name = "EMPR_ADR_LN_1", required = true, nillable = true)
    protected String empradrln1;
    @XmlElement(name = "EMPR_ADR_LN_2", required = true, nillable = true)
    protected String empradrln2;
    @XmlElement(name = "EMPR_ADR_LN_3", required = true, nillable = true)
    protected String empradrln3;
    @XmlElement(name = "EMPR_ADR_LN_4", required = true, nillable = true)
    protected String empradrln4;
    @XmlElement(name = "EMPR_ADR_LN_5", required = true, nillable = true)
    protected String empradrln5;
    @XmlElement(name = "EMPR_CITY_NM", required = true, nillable = true)
    protected String emprcitynm;
    @XmlElement(name = "EMPR_ST_CD", required = true, nillable = true)
    protected String emprstcd;
    @XmlElement(name = "EMPR_ZIP_CD", required = true, nillable = true)
    protected String emprzipcd;
    @XmlElement(name = "EMPR_N_US_RGN_CD", required = true, nillable = true)
    protected String emprnusrgncd;
    @XmlElement(name = "EMPR_N_US_PST_CD", required = true, nillable = true)
    protected String emprnuspstcd;
    @XmlElement(name = "EMPR_CNTRY_NM", required = true, nillable = true)
    protected String emprcntrynm;
    @XmlElement(name = "EMPR_TEL_NUM", required = true, nillable = true)
    protected String emprtelnum;

    /**
     * Gets the value of the perid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPERID() {
        return perid;
    }

    /**
     * Sets the value of the perid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPERID(Long value) {
        this.perid = value;
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
     * Gets the value of the finregassocind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFINREGASSOCIND() {
        return finregassocind;
    }

    /**
     * Sets the value of the finregassocind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFINREGASSOCIND(String value) {
        this.finregassocind = value;
    }

    /**
     * Gets the value of the eserviceprfleditind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESERVICEPRFLEDITIND() {
        return eserviceprfleditind;
    }

    /**
     * Sets the value of the eserviceprfleditind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESERVICEPRFLEDITIND(String value) {
        this.eserviceprfleditind = value;
    }

    /**
     * Gets the value of the empinyr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEMPINYR() {
        return empinyr;
    }

    /**
     * Sets the value of the empinyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEMPINYR(BigInteger value) {
        this.empinyr = value;
    }

    /**
     * Gets the value of the metempind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMETEMPIND() {
        return metempind;
    }

    /**
     * Sets the value of the metempind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMETEMPIND(String value) {
        this.metempind = value;
    }

    /**
     * Gets the value of the dirofcind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIROFCIND() {
        return dirofcind;
    }

    /**
     * Sets the value of the dirofcind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIROFCIND(String value) {
        this.dirofcind = value;
    }

    /**
     * Gets the value of the ovr18IND property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOVR18IND() {
        return ovr18IND;
    }

    /**
     * Sets the value of the ovr18IND property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOVR18IND(String value) {
        this.ovr18IND = value;
    }

    /**
     * Gets the value of the ageinyr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAGEINYR() {
        return ageinyr;
    }

    /**
     * Sets the value of the ageinyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAGEINYR(BigInteger value) {
        this.ageinyr = value;
    }

    /**
     * Gets the value of the agerngdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGERNGDSCR() {
        return agerngdscr;
    }

    /**
     * Sets the value of the agerngdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGERNGDSCR(String value) {
        this.agerngdscr = value;
    }

    /**
     * Gets the value of the empsttsdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPSTTSDSCR() {
        return empsttsdscr;
    }

    /**
     * Sets the value of the empsttsdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPSTTSDSCR(String value) {
        this.empsttsdscr = value;
    }

    /**
     * Gets the value of the taxbrktdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXBRKTDSCR() {
        return taxbrktdscr;
    }

    /**
     * Sets the value of the taxbrktdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXBRKTDSCR(String value) {
        this.taxbrktdscr = value;
    }

    /**
     * Gets the value of the taxbrktpct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXBRKTPCT() {
        return taxbrktpct;
    }

    /**
     * Sets the value of the taxbrktpct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXBRKTPCT(String value) {
        this.taxbrktpct = value;
    }

    /**
     * Gets the value of the occsttsdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOCCSTTSDSCR() {
        return occsttsdscr;
    }

    /**
     * Sets the value of the occsttsdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOCCSTTSDSCR(String value) {
        this.occsttsdscr = value;
    }

    /**
     * Gets the value of the occtypdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOCCTYPDSCR() {
        return occtypdscr;
    }

    /**
     * Sets the value of the occtypdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOCCTYPDSCR(String value) {
        this.occtypdscr = value;
    }

    /**
     * Gets the value of the occnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOCCNM() {
        return occnm;
    }

    /**
     * Sets the value of the occnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOCCNM(String value) {
        this.occnm = value;
    }

    /**
     * Gets the value of the occdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOCCDSCR() {
        return occdscr;
    }

    /**
     * Sets the value of the occdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOCCDSCR(String value) {
        this.occdscr = value;
    }

    /**
     * Gets the value of the occstrtdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOCCSTRTDT() {
        return occstrtdt;
    }

    /**
     * Sets the value of the occstrtdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOCCSTRTDT(XMLGregorianCalendar value) {
        this.occstrtdt = value;
    }

    /**
     * Gets the value of the occstopdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOCCSTOPDT() {
        return occstopdt;
    }

    /**
     * Sets the value of the occstopdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOCCSTOPDT(XMLGregorianCalendar value) {
        this.occstopdt = value;
    }

    /**
     * Gets the value of the bnrlsteffdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBNRLSTEFFDT() {
        return bnrlsteffdt;
    }

    /**
     * Sets the value of the bnrlsteffdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBNRLSTEFFDT(XMLGregorianCalendar value) {
        this.bnrlsteffdt = value;
    }

    /**
     * Gets the value of the lstbnrmaildt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLSTBNRMAILDT() {
        return lstbnrmaildt;
    }

    /**
     * Sets the value of the lstbnrmaildt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLSTBNRMAILDT(XMLGregorianCalendar value) {
        this.lstbnrmaildt = value;
    }

    /**
     * Gets the value of the lstsuitupdtdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLSTSUITUPDTDT() {
        return lstsuitupdtdt;
    }

    /**
     * Sets the value of the lstsuitupdtdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLSTSUITUPDTDT(XMLGregorianCalendar value) {
        this.lstsuitupdtdt = value;
    }

    /**
     * Gets the value of the medcondsttsdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEDCONDSTTSDSCR() {
        return medcondsttsdscr;
    }

    /**
     * Sets the value of the medcondsttsdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEDCONDSTTSDSCR(String value) {
        this.medcondsttsdscr = value;
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

    /**
     * Gets the value of the emprnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRNM() {
        return emprnm;
    }

    /**
     * Sets the value of the emprnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRNM(String value) {
        this.emprnm = value;
    }

    /**
     * Gets the value of the nxtbnrmaildt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNXTBNRMAILDT() {
        return nxtbnrmaildt;
    }

    /**
     * Sets the value of the nxtbnrmaildt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNXTBNRMAILDT(String value) {
        this.nxtbnrmaildt = value;
    }

    /**
     * Gets the value of the empradrln1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRADRLN1() {
        return empradrln1;
    }

    /**
     * Sets the value of the empradrln1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRADRLN1(String value) {
        this.empradrln1 = value;
    }

    /**
     * Gets the value of the empradrln2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRADRLN2() {
        return empradrln2;
    }

    /**
     * Sets the value of the empradrln2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRADRLN2(String value) {
        this.empradrln2 = value;
    }

    /**
     * Gets the value of the empradrln3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRADRLN3() {
        return empradrln3;
    }

    /**
     * Sets the value of the empradrln3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRADRLN3(String value) {
        this.empradrln3 = value;
    }

    /**
     * Gets the value of the empradrln4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRADRLN4() {
        return empradrln4;
    }

    /**
     * Sets the value of the empradrln4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRADRLN4(String value) {
        this.empradrln4 = value;
    }

    /**
     * Gets the value of the empradrln5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRADRLN5() {
        return empradrln5;
    }

    /**
     * Sets the value of the empradrln5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRADRLN5(String value) {
        this.empradrln5 = value;
    }

    /**
     * Gets the value of the emprcitynm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRCITYNM() {
        return emprcitynm;
    }

    /**
     * Sets the value of the emprcitynm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRCITYNM(String value) {
        this.emprcitynm = value;
    }

    /**
     * Gets the value of the emprstcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRSTCD() {
        return emprstcd;
    }

    /**
     * Sets the value of the emprstcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRSTCD(String value) {
        this.emprstcd = value;
    }

    /**
     * Gets the value of the emprzipcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRZIPCD() {
        return emprzipcd;
    }

    /**
     * Sets the value of the emprzipcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRZIPCD(String value) {
        this.emprzipcd = value;
    }

    /**
     * Gets the value of the emprnusrgncd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRNUSRGNCD() {
        return emprnusrgncd;
    }

    /**
     * Sets the value of the emprnusrgncd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRNUSRGNCD(String value) {
        this.emprnusrgncd = value;
    }

    /**
     * Gets the value of the emprnuspstcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRNUSPSTCD() {
        return emprnuspstcd;
    }

    /**
     * Sets the value of the emprnuspstcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRNUSPSTCD(String value) {
        this.emprnuspstcd = value;
    }

    /**
     * Gets the value of the emprcntrynm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRCNTRYNM() {
        return emprcntrynm;
    }

    /**
     * Sets the value of the emprcntrynm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRCNTRYNM(String value) {
        this.emprcntrynm = value;
    }

    /**
     * Gets the value of the emprtelnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRTELNUM() {
        return emprtelnum;
    }

    /**
     * Sets the value of the emprtelnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRTELNUM(String value) {
        this.emprtelnum = value;
    }

}
