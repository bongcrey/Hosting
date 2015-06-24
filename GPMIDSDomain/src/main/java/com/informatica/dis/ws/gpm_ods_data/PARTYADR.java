
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
 * <p>Java class for PARTY_ADR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PARTY_ADR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ADR_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NBRHD_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FIPS_CNTY_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FIPS_CNTY_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DSF_DLV_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DSF_DLV_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CMRA_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VND_DLV_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VND_DLV_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VCNT_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SESN_ADR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SESN_ADR_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LOC_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DSF_DROP_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FIPS_CNTRY_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FIPS_CNTRY_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VND_ADR_TYP_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VND_ADR_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PST_CARY_RTE_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PST_CARY_RTE_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HHLD_OWN_ADR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ZIP_DLV_PT_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ZIP_CD_CHK_DGT_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LOC_EMPE_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
@XmlType(name = "PARTY_ADR", propOrder = {
    "adrid",
    "srcsystem",
    "partyid",
    "burstrecnum",
    "nbrhdnm",
    "fipscntycd",
    "fipscntynm",
    "dsfdlvcd",
    "dsfdlvdscr",
    "cmraind",
    "vnddlvcd",
    "vnddlvdscr",
    "vcntind",
    "sesnadrcd",
    "sesnadrdscr",
    "locsttsdscr",
    "dsfdropcd",
    "fipscntrycd",
    "fipscntrynm",
    "vndadrtypcd",
    "vndadrtypdscr",
    "pstcaryrtecd",
    "pstcaryrtedscr",
    "hhldownadrid",
    "zipdlvptcd",
    "zipcdchkdgtcd",
    "locempecnt",
    "lstupdtdt",
    "lstupdtusrid",
    "hubstateind",
    "originsrcsys"
})
public class PARTYADR {

    @XmlElement(name = "ADR_ID")
    protected String adrid;
    @XmlElement(name = "SRC_SYSTEM")
    protected String srcsystem;
    @XmlElement(name = "PARTY_ID")
    protected String partyid;
    @XmlElement(name = "BURST_REC_NUM", required = true, nillable = true)
    protected String burstrecnum;
    @XmlElement(name = "NBRHD_NM", required = true, nillable = true)
    protected String nbrhdnm;
    @XmlElement(name = "FIPS_CNTY_CD", required = true, nillable = true)
    protected String fipscntycd;
    @XmlElement(name = "FIPS_CNTY_NM", required = true, nillable = true)
    protected String fipscntynm;
    @XmlElement(name = "DSF_DLV_CD", required = true, nillable = true)
    protected String dsfdlvcd;
    @XmlElement(name = "DSF_DLV_DSCR", required = true, nillable = true)
    protected String dsfdlvdscr;
    @XmlElement(name = "CMRA_IND", required = true, nillable = true)
    protected String cmraind;
    @XmlElement(name = "VND_DLV_CD", required = true, nillable = true)
    protected String vnddlvcd;
    @XmlElement(name = "VND_DLV_DSCR", required = true, nillable = true)
    protected String vnddlvdscr;
    @XmlElement(name = "VCNT_IND", required = true, nillable = true)
    protected String vcntind;
    @XmlElement(name = "SESN_ADR_CD", required = true, nillable = true)
    protected String sesnadrcd;
    @XmlElement(name = "SESN_ADR_DSCR", required = true, nillable = true)
    protected String sesnadrdscr;
    @XmlElement(name = "LOC_STTS_DSCR", required = true, nillable = true)
    protected String locsttsdscr;
    @XmlElement(name = "DSF_DROP_CD", required = true, nillable = true)
    protected String dsfdropcd;
    @XmlElement(name = "FIPS_CNTRY_CD", required = true, nillable = true)
    protected String fipscntrycd;
    @XmlElement(name = "FIPS_CNTRY_NM", required = true, nillable = true)
    protected String fipscntrynm;
    @XmlElement(name = "VND_ADR_TYP_CD", required = true, nillable = true)
    protected String vndadrtypcd;
    @XmlElement(name = "VND_ADR_TYP_DSCR", required = true, nillable = true)
    protected String vndadrtypdscr;
    @XmlElement(name = "PST_CARY_RTE_CD", required = true, nillable = true)
    protected String pstcaryrtecd;
    @XmlElement(name = "PST_CARY_RTE_DSCR", required = true, nillable = true)
    protected String pstcaryrtedscr;
    @XmlElement(name = "HHLD_OWN_ADR_ID", required = true, nillable = true)
    protected String hhldownadrid;
    @XmlElement(name = "ZIP_DLV_PT_CD", required = true, nillable = true)
    protected String zipdlvptcd;
    @XmlElement(name = "ZIP_CD_CHK_DGT_CD", required = true, nillable = true)
    protected String zipcdchkdgtcd;
    @XmlElement(name = "LOC_EMPE_CNT")
    protected BigInteger locempecnt;
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
     * Gets the value of the adrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADRID() {
        return adrid;
    }

    /**
     * Sets the value of the adrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADRID(String value) {
        this.adrid = value;
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
     * Gets the value of the nbrhdnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNBRHDNM() {
        return nbrhdnm;
    }

    /**
     * Sets the value of the nbrhdnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNBRHDNM(String value) {
        this.nbrhdnm = value;
    }

    /**
     * Gets the value of the fipscntycd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIPSCNTYCD() {
        return fipscntycd;
    }

    /**
     * Sets the value of the fipscntycd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIPSCNTYCD(String value) {
        this.fipscntycd = value;
    }

    /**
     * Gets the value of the fipscntynm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIPSCNTYNM() {
        return fipscntynm;
    }

    /**
     * Sets the value of the fipscntynm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIPSCNTYNM(String value) {
        this.fipscntynm = value;
    }

    /**
     * Gets the value of the dsfdlvcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSFDLVCD() {
        return dsfdlvcd;
    }

    /**
     * Sets the value of the dsfdlvcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSFDLVCD(String value) {
        this.dsfdlvcd = value;
    }

    /**
     * Gets the value of the dsfdlvdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSFDLVDSCR() {
        return dsfdlvdscr;
    }

    /**
     * Sets the value of the dsfdlvdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSFDLVDSCR(String value) {
        this.dsfdlvdscr = value;
    }

    /**
     * Gets the value of the cmraind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMRAIND() {
        return cmraind;
    }

    /**
     * Sets the value of the cmraind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMRAIND(String value) {
        this.cmraind = value;
    }

    /**
     * Gets the value of the vnddlvcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVNDDLVCD() {
        return vnddlvcd;
    }

    /**
     * Sets the value of the vnddlvcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVNDDLVCD(String value) {
        this.vnddlvcd = value;
    }

    /**
     * Gets the value of the vnddlvdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVNDDLVDSCR() {
        return vnddlvdscr;
    }

    /**
     * Sets the value of the vnddlvdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVNDDLVDSCR(String value) {
        this.vnddlvdscr = value;
    }

    /**
     * Gets the value of the vcntind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCNTIND() {
        return vcntind;
    }

    /**
     * Sets the value of the vcntind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCNTIND(String value) {
        this.vcntind = value;
    }

    /**
     * Gets the value of the sesnadrcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSESNADRCD() {
        return sesnadrcd;
    }

    /**
     * Sets the value of the sesnadrcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSESNADRCD(String value) {
        this.sesnadrcd = value;
    }

    /**
     * Gets the value of the sesnadrdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSESNADRDSCR() {
        return sesnadrdscr;
    }

    /**
     * Sets the value of the sesnadrdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSESNADRDSCR(String value) {
        this.sesnadrdscr = value;
    }

    /**
     * Gets the value of the locsttsdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCSTTSDSCR() {
        return locsttsdscr;
    }

    /**
     * Sets the value of the locsttsdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCSTTSDSCR(String value) {
        this.locsttsdscr = value;
    }

    /**
     * Gets the value of the dsfdropcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSFDROPCD() {
        return dsfdropcd;
    }

    /**
     * Sets the value of the dsfdropcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSFDROPCD(String value) {
        this.dsfdropcd = value;
    }

    /**
     * Gets the value of the fipscntrycd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIPSCNTRYCD() {
        return fipscntrycd;
    }

    /**
     * Sets the value of the fipscntrycd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIPSCNTRYCD(String value) {
        this.fipscntrycd = value;
    }

    /**
     * Gets the value of the fipscntrynm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIPSCNTRYNM() {
        return fipscntrynm;
    }

    /**
     * Sets the value of the fipscntrynm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIPSCNTRYNM(String value) {
        this.fipscntrynm = value;
    }

    /**
     * Gets the value of the vndadrtypcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVNDADRTYPCD() {
        return vndadrtypcd;
    }

    /**
     * Sets the value of the vndadrtypcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVNDADRTYPCD(String value) {
        this.vndadrtypcd = value;
    }

    /**
     * Gets the value of the vndadrtypdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVNDADRTYPDSCR() {
        return vndadrtypdscr;
    }

    /**
     * Sets the value of the vndadrtypdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVNDADRTYPDSCR(String value) {
        this.vndadrtypdscr = value;
    }

    /**
     * Gets the value of the pstcaryrtecd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSTCARYRTECD() {
        return pstcaryrtecd;
    }

    /**
     * Sets the value of the pstcaryrtecd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSTCARYRTECD(String value) {
        this.pstcaryrtecd = value;
    }

    /**
     * Gets the value of the pstcaryrtedscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSTCARYRTEDSCR() {
        return pstcaryrtedscr;
    }

    /**
     * Sets the value of the pstcaryrtedscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSTCARYRTEDSCR(String value) {
        this.pstcaryrtedscr = value;
    }

    /**
     * Gets the value of the hhldownadrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHHLDOWNADRID() {
        return hhldownadrid;
    }

    /**
     * Sets the value of the hhldownadrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHHLDOWNADRID(String value) {
        this.hhldownadrid = value;
    }

    /**
     * Gets the value of the zipdlvptcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIPDLVPTCD() {
        return zipdlvptcd;
    }

    /**
     * Sets the value of the zipdlvptcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIPDLVPTCD(String value) {
        this.zipdlvptcd = value;
    }

    /**
     * Gets the value of the zipcdchkdgtcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIPCDCHKDGTCD() {
        return zipcdchkdgtcd;
    }

    /**
     * Sets the value of the zipcdchkdgtcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIPCDCHKDGTCD(String value) {
        this.zipcdchkdgtcd = value;
    }

    /**
     * Gets the value of the locempecnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLOCEMPECNT() {
        return locempecnt;
    }

    /**
     * Sets the value of the locempecnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLOCEMPECNT(BigInteger value) {
        this.locempecnt = value;
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
