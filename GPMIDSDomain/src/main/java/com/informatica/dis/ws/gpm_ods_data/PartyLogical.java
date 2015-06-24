
package com.informatica.dis.ws.gpm_ods_data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyLogical complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyLogical">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Party" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}Party" minOccurs="0"/>
 *         &lt;element name="PersonDetail" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}PersonDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}Address" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Agreement" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}Agreement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AgreementKey" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}AgreementKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartyRoleInAgreement" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}PartyRoleInAgreement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartyElectronicAddress" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}PartyElectronicAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartyPhone" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}PartyPhone" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartyAlternateIdentifier" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}PartyAlternateIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartyCitizenship" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}PartyCitizenship" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PARTY_INVST_HLD" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}PARTY_INVST_HLD" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PARTY_ACK" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}PARTY_ACK" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PARTY_RISK" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}PARTY_RISK" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PARTY_ADR" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}PARTY_ADR" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PARTY_AGRE" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}PARTY_AGRE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PARTY_INCM" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}PARTY_INCM" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PARTY_ORG" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}PARTY_ORG" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PARTY_PER" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}PARTY_PER" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PARTY_EXP" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}PARTY_EXP" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PARTY_FIN_PROP" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}PARTY_FIN_PROP" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PARTY_SRV_LVLS" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}PARTY_SRV_LVLS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PARTY_AGRGTS_MS" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}PARTY_AGRGTS_MS" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyLogical", propOrder = {
    "party",
    "personDetail",
    "address",
    "agreement",
    "agreementKey",
    "partyRoleInAgreement",
    "partyElectronicAddress",
    "partyPhone",
    "partyAlternateIdentifier",
    "partyCitizenship",
    "partyinvsthld",
    "partyack",
    "partyrisk",
    "partyadr",
    "partyagre",
    "partyincm",
    "partyorg",
    "partyper",
    "partyexp",
    "partyfinprop",
    "partysrvlvls",
    "partyagrgtsms"
})
public class PartyLogical {

    @XmlElement(name = "Party")
    protected Party party;
    @XmlElement(name = "PersonDetail")
    protected List<PersonDetail> personDetail;
    @XmlElement(name = "Address")
    protected List<Address> address;
    @XmlElement(name = "Agreement")
    protected List<Agreement> agreement;
    @XmlElement(name = "AgreementKey")
    protected List<AgreementKey> agreementKey;
    @XmlElement(name = "PartyRoleInAgreement")
    protected List<PartyRoleInAgreement> partyRoleInAgreement;
    @XmlElement(name = "PartyElectronicAddress")
    protected List<PartyElectronicAddress> partyElectronicAddress;
    @XmlElement(name = "PartyPhone")
    protected List<PartyPhone> partyPhone;
    @XmlElement(name = "PartyAlternateIdentifier")
    protected List<PartyAlternateIdentifier> partyAlternateIdentifier;
    @XmlElement(name = "PartyCitizenship")
    protected List<PartyCitizenship> partyCitizenship;
    @XmlElement(name = "PARTY_INVST_HLD")
    protected List<PARTYINVSTHLD> partyinvsthld;
    @XmlElement(name = "PARTY_ACK")
    protected List<PARTYACK> partyack;
    @XmlElement(name = "PARTY_RISK")
    protected List<PARTYRISK> partyrisk;
    @XmlElement(name = "PARTY_ADR")
    protected List<PARTYADR> partyadr;
    @XmlElement(name = "PARTY_AGRE")
    protected List<PARTYAGRE> partyagre;
    @XmlElement(name = "PARTY_INCM")
    protected List<PARTYINCM> partyincm;
    @XmlElement(name = "PARTY_ORG")
    protected List<PARTYORG> partyorg;
    @XmlElement(name = "PARTY_PER")
    protected List<PARTYPER> partyper;
    @XmlElement(name = "PARTY_EXP")
    protected List<PARTYEXP> partyexp;
    @XmlElement(name = "PARTY_FIN_PROP")
    protected List<PARTYFINPROP> partyfinprop;
    @XmlElement(name = "PARTY_SRV_LVLS")
    protected List<PARTYSRVLVLS> partysrvlvls;
    @XmlElement(name = "PARTY_AGRGTS_MS")
    protected List<PARTYAGRGTSMS> partyagrgtsms;

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setParty(Party value) {
        this.party = value;
    }

    /**
     * Gets the value of the personDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonDetail }
     * 
     * 
     */
    public List<PersonDetail> getPersonDetail() {
        if (personDetail == null) {
            personDetail = new ArrayList<PersonDetail>();
        }
        return this.personDetail;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddress() {
        if (address == null) {
            address = new ArrayList<Address>();
        }
        return this.address;
    }

    /**
     * Gets the value of the agreement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agreement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgreement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Agreement }
     * 
     * 
     */
    public List<Agreement> getAgreement() {
        if (agreement == null) {
            agreement = new ArrayList<Agreement>();
        }
        return this.agreement;
    }

    /**
     * Gets the value of the agreementKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agreementKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgreementKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgreementKey }
     * 
     * 
     */
    public List<AgreementKey> getAgreementKey() {
        if (agreementKey == null) {
            agreementKey = new ArrayList<AgreementKey>();
        }
        return this.agreementKey;
    }

    /**
     * Gets the value of the partyRoleInAgreement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyRoleInAgreement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyRoleInAgreement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyRoleInAgreement }
     * 
     * 
     */
    public List<PartyRoleInAgreement> getPartyRoleInAgreement() {
        if (partyRoleInAgreement == null) {
            partyRoleInAgreement = new ArrayList<PartyRoleInAgreement>();
        }
        return this.partyRoleInAgreement;
    }

    /**
     * Gets the value of the partyElectronicAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyElectronicAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyElectronicAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyElectronicAddress }
     * 
     * 
     */
    public List<PartyElectronicAddress> getPartyElectronicAddress() {
        if (partyElectronicAddress == null) {
            partyElectronicAddress = new ArrayList<PartyElectronicAddress>();
        }
        return this.partyElectronicAddress;
    }

    /**
     * Gets the value of the partyPhone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyPhone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyPhone }
     * 
     * 
     */
    public List<PartyPhone> getPartyPhone() {
        if (partyPhone == null) {
            partyPhone = new ArrayList<PartyPhone>();
        }
        return this.partyPhone;
    }

    /**
     * Gets the value of the partyAlternateIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyAlternateIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyAlternateIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyAlternateIdentifier }
     * 
     * 
     */
    public List<PartyAlternateIdentifier> getPartyAlternateIdentifier() {
        if (partyAlternateIdentifier == null) {
            partyAlternateIdentifier = new ArrayList<PartyAlternateIdentifier>();
        }
        return this.partyAlternateIdentifier;
    }

    /**
     * Gets the value of the partyCitizenship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyCitizenship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyCitizenship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyCitizenship }
     * 
     * 
     */
    public List<PartyCitizenship> getPartyCitizenship() {
        if (partyCitizenship == null) {
            partyCitizenship = new ArrayList<PartyCitizenship>();
        }
        return this.partyCitizenship;
    }

    /**
     * Gets the value of the partyinvsthld property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyinvsthld property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTYINVSTHLD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTYINVSTHLD }
     * 
     * 
     */
    public List<PARTYINVSTHLD> getPARTYINVSTHLD() {
        if (partyinvsthld == null) {
            partyinvsthld = new ArrayList<PARTYINVSTHLD>();
        }
        return this.partyinvsthld;
    }

    /**
     * Gets the value of the partyack property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyack property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTYACK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTYACK }
     * 
     * 
     */
    public List<PARTYACK> getPARTYACK() {
        if (partyack == null) {
            partyack = new ArrayList<PARTYACK>();
        }
        return this.partyack;
    }

    /**
     * Gets the value of the partyrisk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyrisk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTYRISK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTYRISK }
     * 
     * 
     */
    public List<PARTYRISK> getPARTYRISK() {
        if (partyrisk == null) {
            partyrisk = new ArrayList<PARTYRISK>();
        }
        return this.partyrisk;
    }

    /**
     * Gets the value of the partyadr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyadr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTYADR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTYADR }
     * 
     * 
     */
    public List<PARTYADR> getPARTYADR() {
        if (partyadr == null) {
            partyadr = new ArrayList<PARTYADR>();
        }
        return this.partyadr;
    }

    /**
     * Gets the value of the partyagre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyagre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTYAGRE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTYAGRE }
     * 
     * 
     */
    public List<PARTYAGRE> getPARTYAGRE() {
        if (partyagre == null) {
            partyagre = new ArrayList<PARTYAGRE>();
        }
        return this.partyagre;
    }

    /**
     * Gets the value of the partyincm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyincm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTYINCM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTYINCM }
     * 
     * 
     */
    public List<PARTYINCM> getPARTYINCM() {
        if (partyincm == null) {
            partyincm = new ArrayList<PARTYINCM>();
        }
        return this.partyincm;
    }

    /**
     * Gets the value of the partyorg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyorg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTYORG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTYORG }
     * 
     * 
     */
    public List<PARTYORG> getPARTYORG() {
        if (partyorg == null) {
            partyorg = new ArrayList<PARTYORG>();
        }
        return this.partyorg;
    }

    /**
     * Gets the value of the partyper property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyper property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTYPER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTYPER }
     * 
     * 
     */
    public List<PARTYPER> getPARTYPER() {
        if (partyper == null) {
            partyper = new ArrayList<PARTYPER>();
        }
        return this.partyper;
    }

    /**
     * Gets the value of the partyexp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyexp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTYEXP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTYEXP }
     * 
     * 
     */
    public List<PARTYEXP> getPARTYEXP() {
        if (partyexp == null) {
            partyexp = new ArrayList<PARTYEXP>();
        }
        return this.partyexp;
    }

    /**
     * Gets the value of the partyfinprop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyfinprop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTYFINPROP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTYFINPROP }
     * 
     * 
     */
    public List<PARTYFINPROP> getPARTYFINPROP() {
        if (partyfinprop == null) {
            partyfinprop = new ArrayList<PARTYFINPROP>();
        }
        return this.partyfinprop;
    }

    /**
     * Gets the value of the partysrvlvls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partysrvlvls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTYSRVLVLS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTYSRVLVLS }
     * 
     * 
     */
    public List<PARTYSRVLVLS> getPARTYSRVLVLS() {
        if (partysrvlvls == null) {
            partysrvlvls = new ArrayList<PARTYSRVLVLS>();
        }
        return this.partysrvlvls;
    }

    /**
     * Gets the value of the partyagrgtsms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyagrgtsms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARTYAGRGTSMS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTYAGRGTSMS }
     * 
     * 
     */
    public List<PARTYAGRGTSMS> getPARTYAGRGTSMS() {
        if (partyagrgtsms == null) {
            partyagrgtsms = new ArrayList<PARTYAGRGTSMS>();
        }
        return this.partyagrgtsms;
    }

}
