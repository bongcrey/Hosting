
package com.informatica.dis.ws.gpm_ods_data;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PARTY_FIN_PROP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PARTY_FIN_PROP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PARTY_FIN_PROP_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FIN_PROP_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FIN_PROP_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FIN_PROP_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FIN_PROP_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FIN_PROP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FIN_PROP_STOP_DT_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FIN_PROP_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FIN_PROP_VAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "PARTY_FIN_PROP", propOrder = {
    "partyfinpropid",
    "srcsystem",
    "partyid",
    "burstrecnum",
    "finpropeffdt",
    "finpropsttsdscr",
    "finproptypdscr",
    "finpropnm",
    "finpropdscr",
    "finpropstopdttypdscr",
    "finpropstopdt",
    "finpropval",
    "lstupdtdt",
    "lstupdtusrid",
    "hubstateind",
    "originsrcsys"
})
public class PARTYFINPROP {

    @XmlElement(name = "PARTY_FIN_PROP_ID")
    protected Long partyfinpropid;
    @XmlElement(name = "SRC_SYSTEM")
    protected String srcsystem;
    @XmlElement(name = "PARTY_ID")
    protected String partyid;
    @XmlElement(name = "BURST_REC_NUM", required = true, nillable = true)
    protected String burstrecnum;
    @XmlElement(name = "FIN_PROP_EFF_DT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finpropeffdt;
    @XmlElement(name = "FIN_PROP_STTS_DSCR", required = true, nillable = true)
    protected String finpropsttsdscr;
    @XmlElement(name = "FIN_PROP_TYP_DSCR", required = true, nillable = true)
    protected String finproptypdscr;
    @XmlElement(name = "FIN_PROP_NM", required = true, nillable = true)
    protected String finpropnm;
    @XmlElement(name = "FIN_PROP_DSCR", required = true, nillable = true)
    protected String finpropdscr;
    @XmlElement(name = "FIN_PROP_STOP_DT_TYP_DSCR", required = true, nillable = true)
    protected String finpropstopdttypdscr;
    @XmlElement(name = "FIN_PROP_STOP_DT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finpropstopdt;
    @XmlElement(name = "FIN_PROP_VAL")
    protected BigDecimal finpropval;
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
     * Gets the value of the partyfinpropid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPARTYFINPROPID() {
        return partyfinpropid;
    }

    /**
     * Sets the value of the partyfinpropid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPARTYFINPROPID(Long value) {
        this.partyfinpropid = value;
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
     * Gets the value of the finpropeffdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFINPROPEFFDT() {
        return finpropeffdt;
    }

    /**
     * Sets the value of the finpropeffdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFINPROPEFFDT(XMLGregorianCalendar value) {
        this.finpropeffdt = value;
    }

    /**
     * Gets the value of the finpropsttsdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFINPROPSTTSDSCR() {
        return finpropsttsdscr;
    }

    /**
     * Sets the value of the finpropsttsdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFINPROPSTTSDSCR(String value) {
        this.finpropsttsdscr = value;
    }

    /**
     * Gets the value of the finproptypdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFINPROPTYPDSCR() {
        return finproptypdscr;
    }

    /**
     * Sets the value of the finproptypdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFINPROPTYPDSCR(String value) {
        this.finproptypdscr = value;
    }

    /**
     * Gets the value of the finpropnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFINPROPNM() {
        return finpropnm;
    }

    /**
     * Sets the value of the finpropnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFINPROPNM(String value) {
        this.finpropnm = value;
    }

    /**
     * Gets the value of the finpropdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFINPROPDSCR() {
        return finpropdscr;
    }

    /**
     * Sets the value of the finpropdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFINPROPDSCR(String value) {
        this.finpropdscr = value;
    }

    /**
     * Gets the value of the finpropstopdttypdscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFINPROPSTOPDTTYPDSCR() {
        return finpropstopdttypdscr;
    }

    /**
     * Sets the value of the finpropstopdttypdscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFINPROPSTOPDTTYPDSCR(String value) {
        this.finpropstopdttypdscr = value;
    }

    /**
     * Gets the value of the finpropstopdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFINPROPSTOPDT() {
        return finpropstopdt;
    }

    /**
     * Sets the value of the finpropstopdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFINPROPSTOPDT(XMLGregorianCalendar value) {
        this.finpropstopdt = value;
    }

    /**
     * Gets the value of the finpropval property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFINPROPVAL() {
        return finpropval;
    }

    /**
     * Sets the value of the finpropval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFINPROPVAL(BigDecimal value) {
        this.finpropval = value;
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
