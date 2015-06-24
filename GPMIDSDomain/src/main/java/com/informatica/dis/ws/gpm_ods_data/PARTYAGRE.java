
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
 * <p>Java class for PARTY_AGRE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PARTY_AGRE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AGRE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PROD_GRP_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PROD_GRP_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PROD_GRP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PROD_TYP_ABBR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PROD_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PROD_PLN_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PROD_PLN_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PROD_PLN_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PROD_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PROD_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PROD_DTL_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LOW_LVL_PROD_CVR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CVR_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DRV_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="VEH_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="DPND_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="BSCL_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OPTL_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HIPPA_REL_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DSBRS_RMN_YR_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ERL_WD_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="STRT_4_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CNTRC_CLS_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="INVST_RISK_TLRN_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INVST_RISK_TLRN_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INVST_OBJ_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INVST_OBJ_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RGST_TYP_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RGST_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="XPR_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TM_HRZN_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LOC_KEY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CARY_ADMN_SYS_NM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SRV_AGNT_FULL_NM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUS_ORG_UNIT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PARTY_AGRE", propOrder = {
    "agreid",
    "srcsystem",
    "partyid",
    "burstrecnum",
    "prodgrpcd",
    "prodgrpnm",
    "prodgrpdscr",
    "prodtypabbrcd",
    "prodtypdscr",
    "prodplncd",
    "prodplnnm",
    "prodplndscr",
    "prodcd",
    "prodnm",
    "proddtldscr",
    "lowlvlprodcvrcd",
    "cvramt",
    "drvcnt",
    "vehcnt",
    "dpndcnt",
    "bsclind",
    "optlind",
    "hipparelind",
    "dsbrsrmnyrcnt",
    "erlwdind",
    "strt4IND",
    "cntrcclsdt",
    "invstrisktlrndscr",
    "invstrisktlrnnm",
    "invstobjnm",
    "invstobjdscr",
    "rgsttypnm",
    "rgsttypdscr",
    "xprdt",
    "lstupdtdt",
    "lstupdtusrid",
    "hubstateind",
    "originsrcsys",
    "tmhrzntypdscr",
    "lockey",
    "caryadmnsysnm",
    "srvagntfullnm",
    "busorgunitid"
})
public class PARTYAGRE {

    @XmlElement(name = "AGRE_ID")
    protected String agreid;
    @XmlElement(name = "SRC_SYSTEM")
    protected String srcsystem;
    @XmlElement(name = "PARTY_ID")
    protected String partyid;
    @XmlElement(name = "BURST_REC_NUM", required = true, nillable = true)
    protected String burstrecnum;
    @XmlElement(name = "PROD_GRP_CD", required = true, nillable = true)
    protected String prodgrpcd;
    @XmlElement(name = "PROD_GRP_NM", required = true, nillable = true)
    protected String prodgrpnm;
    @XmlElement(name = "PROD_GRP_DSCR", required = true, nillable = true)
    protected String prodgrpdscr;
    @XmlElement(name = "PROD_TYP_ABBR_CD", required = true, nillable = true)
    protected String prodtypabbrcd;
    @XmlElement(name = "PROD_TYP_DSCR", required = true, nillable = true)
    protected String prodtypdscr;
    @XmlElement(name = "PROD_PLN_CD", required = true, nillable = true)
    protected String prodplncd;
    @XmlElement(name = "PROD_PLN_NM", required = true, nillable = true)
    protected String prodplnnm;
    @XmlElement(name = "PROD_PLN_DSCR", required = true, nillable = true)
    protected String prodplndscr;
    @XmlElement(name = "PROD_CD", required = true, nillable = true)
    protected String prodcd;
    @XmlElement(name = "PROD_NM", required = true, nillable = true)
    protected String prodnm;
    @XmlElement(name = "PROD_DTL_DSCR", required = true, nillable = true)
    protected String proddtldscr;
    @XmlElement(name = "LOW_LVL_PROD_CVR_CD", required = true, nillable = true)
    protected String lowlvlprodcvrcd;
    @XmlElement(name = "CVR_AMT")
    protected BigDecimal cvramt;
    @XmlElement(name = "DRV_CNT")
    protected BigInteger drvcnt;
    @XmlElement(name = "VEH_CNT")
    protected BigInteger vehcnt;
    @XmlElement(name = "DPND_CNT")
    protected BigInteger dpndcnt;
    @XmlElement(name = "BSCL_IND", required = true, nillable = true)
    protected String bsclind;
    @XmlElement(name = "OPTL_IND", required = true, nillable = true)
    protected String optlind;
    @XmlElement(name = "HIPPA_REL_IND", required = true, nillable = true)
    protected String hipparelind;
    @XmlElement(name = "DSBRS_RMN_YR_CNT")
    protected BigInteger dsbrsrmnyrcnt;
    @XmlElement(name = "ERL_WD_IND", required = true, nillable = true)
    protected String erlwdind;
    @XmlElement(name = "STRT_4_IND", required = true, nillable = true)
    protected String strt4IND;
    @XmlElement(name = "CNTRC_CLS_DT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cntrcclsdt;
    @XmlElement(name = "INVST_RISK_TLRN_DSCR", required = true, nillable = true)
    protected String invstrisktlrndscr;
    @XmlElement(name = "INVST_RISK_TLRN_NM", required = true, nillable = true)
    protected String invstrisktlrnnm;
    @XmlElement(name = "INVST_OBJ_NM", required = true, nillable = true)
    protected String invstobjnm;
    @XmlElement(name = "INVST_OBJ_DSCR", required = true, nillable = true)
    protected String invstobjdscr;
    @XmlElement(name = "RGST_TYP_NM", required = true, nillable = true)
    protected String rgsttypnm;
    @XmlElement(name = "RGST_TYP_DSCR", required = true, nillable = true)
    protected String rgsttypdscr;
    @XmlElement(name = "XPR_DT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar xprdt;
    @XmlElement(name = "LST_UPDT_DT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lstupdtdt;
    @XmlElement(name = "LST_UPDT_USR_ID", required = true, nillable = true)
    protected String lstupdtusrid;
    @XmlElement(name = "HUB_STATE_IND")
    protected BigDecimal hubstateind;
    @XmlElement(name = "ORIGIN_SRC_SYS", required = true, nillable = true)
    protected String originsrcsys;
    @XmlElement(name = "TM_HRZN_TYP_DSCR", required = true, nillable = true)
    protected String tmhrzntypdscr;
    @XmlElement(name = "LOC_KEY", required = true, nillable = true)
    protected String lockey;
    @XmlElementRef(name = "CARY_ADMN_SYS_NM", namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> caryadmnsysnm;
    @XmlElementRef(name = "SRV_AGNT_FULL_NM", namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> srvagntfullnm;
    @XmlElementRef(name = "BUS_ORG_UNIT_ID", namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> busorgunitid;

    /**
     * Gets the value of the agreid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGREID() {
        return agreid;
    }

    /**
     * Sets the value of the agreid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGREID(String value) {
        this.agreid = value;
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
     * Gets the value of the prodgrpcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODGRPCD() {
        return prodgrpcd;
    }

    /**
     * Sets the value of the prodgrpcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODGRPCD(String value) {
        this.prodgrpcd = value;
    }

    /**
     * Gets the value of the prodgrpnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODGRPNM() {
        return prodgrpnm;
    }

    /**
     * Sets the value of the prodgrpnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODGRPNM(String value) {
        this.prodgrpnm = value;
    }

    /**
     * Gets the value of the prodgrpdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODGRPDSCR() {
        return prodgrpdscr;
    }

    /**
     * Sets the value of the prodgrpdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODGRPDSCR(String value) {
        this.prodgrpdscr = value;
    }

    /**
     * Gets the value of the prodtypabbrcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODTYPABBRCD() {
        return prodtypabbrcd;
    }

    /**
     * Sets the value of the prodtypabbrcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODTYPABBRCD(String value) {
        this.prodtypabbrcd = value;
    }

    /**
     * Gets the value of the prodtypdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODTYPDSCR() {
        return prodtypdscr;
    }

    /**
     * Sets the value of the prodtypdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODTYPDSCR(String value) {
        this.prodtypdscr = value;
    }

    /**
     * Gets the value of the prodplncd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODPLNCD() {
        return prodplncd;
    }

    /**
     * Sets the value of the prodplncd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODPLNCD(String value) {
        this.prodplncd = value;
    }

    /**
     * Gets the value of the prodplnnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODPLNNM() {
        return prodplnnm;
    }

    /**
     * Sets the value of the prodplnnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODPLNNM(String value) {
        this.prodplnnm = value;
    }

    /**
     * Gets the value of the prodplndscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODPLNDSCR() {
        return prodplndscr;
    }

    /**
     * Sets the value of the prodplndscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODPLNDSCR(String value) {
        this.prodplndscr = value;
    }

    /**
     * Gets the value of the prodcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODCD() {
        return prodcd;
    }

    /**
     * Sets the value of the prodcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODCD(String value) {
        this.prodcd = value;
    }

    /**
     * Gets the value of the prodnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODNM() {
        return prodnm;
    }

    /**
     * Sets the value of the prodnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODNM(String value) {
        this.prodnm = value;
    }

    /**
     * Gets the value of the proddtldscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODDTLDSCR() {
        return proddtldscr;
    }

    /**
     * Sets the value of the proddtldscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODDTLDSCR(String value) {
        this.proddtldscr = value;
    }

    /**
     * Gets the value of the lowlvlprodcvrcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOWLVLPRODCVRCD() {
        return lowlvlprodcvrcd;
    }

    /**
     * Sets the value of the lowlvlprodcvrcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOWLVLPRODCVRCD(String value) {
        this.lowlvlprodcvrcd = value;
    }

    /**
     * Gets the value of the cvramt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCVRAMT() {
        return cvramt;
    }

    /**
     * Sets the value of the cvramt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCVRAMT(BigDecimal value) {
        this.cvramt = value;
    }

    /**
     * Gets the value of the drvcnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDRVCNT() {
        return drvcnt;
    }

    /**
     * Sets the value of the drvcnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDRVCNT(BigInteger value) {
        this.drvcnt = value;
    }

    /**
     * Gets the value of the vehcnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVEHCNT() {
        return vehcnt;
    }

    /**
     * Sets the value of the vehcnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVEHCNT(BigInteger value) {
        this.vehcnt = value;
    }

    /**
     * Gets the value of the dpndcnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDPNDCNT() {
        return dpndcnt;
    }

    /**
     * Sets the value of the dpndcnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDPNDCNT(BigInteger value) {
        this.dpndcnt = value;
    }

    /**
     * Gets the value of the bsclind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSCLIND() {
        return bsclind;
    }

    /**
     * Sets the value of the bsclind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSCLIND(String value) {
        this.bsclind = value;
    }

    /**
     * Gets the value of the optlind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPTLIND() {
        return optlind;
    }

    /**
     * Sets the value of the optlind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPTLIND(String value) {
        this.optlind = value;
    }

    /**
     * Gets the value of the hipparelind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHIPPARELIND() {
        return hipparelind;
    }

    /**
     * Sets the value of the hipparelind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHIPPARELIND(String value) {
        this.hipparelind = value;
    }

    /**
     * Gets the value of the dsbrsrmnyrcnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDSBRSRMNYRCNT() {
        return dsbrsrmnyrcnt;
    }

    /**
     * Sets the value of the dsbrsrmnyrcnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDSBRSRMNYRCNT(BigInteger value) {
        this.dsbrsrmnyrcnt = value;
    }

    /**
     * Gets the value of the erlwdind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERLWDIND() {
        return erlwdind;
    }

    /**
     * Sets the value of the erlwdind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERLWDIND(String value) {
        this.erlwdind = value;
    }

    /**
     * Gets the value of the strt4IND property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRT4IND() {
        return strt4IND;
    }

    /**
     * Sets the value of the strt4IND property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTRT4IND(String value) {
        this.strt4IND = value;
    }

    /**
     * Gets the value of the cntrcclsdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCNTRCCLSDT() {
        return cntrcclsdt;
    }

    /**
     * Sets the value of the cntrcclsdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCNTRCCLSDT(XMLGregorianCalendar value) {
        this.cntrcclsdt = value;
    }

    /**
     * Gets the value of the invstrisktlrndscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINVSTRISKTLRNDSCR() {
        return invstrisktlrndscr;
    }

    /**
     * Sets the value of the invstrisktlrndscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINVSTRISKTLRNDSCR(String value) {
        this.invstrisktlrndscr = value;
    }

    /**
     * Gets the value of the invstrisktlrnnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINVSTRISKTLRNNM() {
        return invstrisktlrnnm;
    }

    /**
     * Sets the value of the invstrisktlrnnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINVSTRISKTLRNNM(String value) {
        this.invstrisktlrnnm = value;
    }

    /**
     * Gets the value of the invstobjnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINVSTOBJNM() {
        return invstobjnm;
    }

    /**
     * Sets the value of the invstobjnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINVSTOBJNM(String value) {
        this.invstobjnm = value;
    }

    /**
     * Gets the value of the invstobjdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINVSTOBJDSCR() {
        return invstobjdscr;
    }

    /**
     * Sets the value of the invstobjdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINVSTOBJDSCR(String value) {
        this.invstobjdscr = value;
    }

    /**
     * Gets the value of the rgsttypnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRGSTTYPNM() {
        return rgsttypnm;
    }

    /**
     * Sets the value of the rgsttypnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRGSTTYPNM(String value) {
        this.rgsttypnm = value;
    }

    /**
     * Gets the value of the rgsttypdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRGSTTYPDSCR() {
        return rgsttypdscr;
    }

    /**
     * Sets the value of the rgsttypdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRGSTTYPDSCR(String value) {
        this.rgsttypdscr = value;
    }

    /**
     * Gets the value of the xprdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXPRDT() {
        return xprdt;
    }

    /**
     * Sets the value of the xprdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXPRDT(XMLGregorianCalendar value) {
        this.xprdt = value;
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

    /**
     * Gets the value of the tmhrzntypdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMHRZNTYPDSCR() {
        return tmhrzntypdscr;
    }

    /**
     * Sets the value of the tmhrzntypdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMHRZNTYPDSCR(String value) {
        this.tmhrzntypdscr = value;
    }

    /**
     * Gets the value of the lockey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCKEY() {
        return lockey;
    }

    /**
     * Sets the value of the lockey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCKEY(String value) {
        this.lockey = value;
    }

    /**
     * Gets the value of the caryadmnsysnm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCARYADMNSYSNM() {
        return caryadmnsysnm;
    }

    /**
     * Sets the value of the caryadmnsysnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCARYADMNSYSNM(JAXBElement<String> value) {
        this.caryadmnsysnm = value;
    }

    /**
     * Gets the value of the srvagntfullnm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSRVAGNTFULLNM() {
        return srvagntfullnm;
    }

    /**
     * Sets the value of the srvagntfullnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSRVAGNTFULLNM(JAXBElement<String> value) {
        this.srvagntfullnm = value;
    }

    /**
     * Gets the value of the busorgunitid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUSORGUNITID() {
        return busorgunitid;
    }

    /**
     * Sets the value of the busorgunitid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUSORGUNITID(JAXBElement<String> value) {
        this.busorgunitid = value;
    }

}
