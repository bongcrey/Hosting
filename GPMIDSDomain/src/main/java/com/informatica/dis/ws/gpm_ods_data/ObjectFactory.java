
package com.informatica.dis.ws.gpm_ods_data;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.informatica.dis.ws.gpm_ods_data package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PARTYAGRE_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "PARTY_AGRE");
    private final static QName _GlobalID_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "GlobalID");
    private final static QName _Source_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "Source");
    private final static QName _PARTYSRVLVLS_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "PARTY_SRV_LVLS");
    private final static QName _PARTYACK_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "PARTY_ACK");
    private final static QName _InquiryLevel_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "InquiryLevel");
    private final static QName _Address_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "Address");
    private final static QName _PartyPhone_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "PartyPhone");
    private final static QName _AgreementKey_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "AgreementKey");
    private final static QName _PartyRoleInAgreement_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "PartyRoleInAgreement");
    private final static QName _PARTYAGRGTSMS_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "PARTY_AGRGTS_MS");
    private final static QName _PartyLogical_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "PartyLogical");
    private final static QName _PARTYINCM_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "PARTY_INCM");
    private final static QName _Party_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "Party");
    private final static QName _PARTYRISK_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "PARTY_RISK");
    private final static QName _AppID_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "AppID");
    private final static QName _OrigSrcKey_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "OrigSrcKey");
    private final static QName _PersonDetail_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "PersonDetail");
    private final static QName _PartyAlternateIdentifier_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "PartyAlternateIdentifier");
    private final static QName _PARTYADR_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "PARTY_ADR");
    private final static QName _PartyElectronicAddress_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "PartyElectronicAddress");
    private final static QName _PartyCitizenship_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "PartyCitizenship");
    private final static QName _PARTYORG_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "PARTY_ORG");
    private final static QName _PARTYEXP_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "PARTY_EXP");
    private final static QName _PARTYPER_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "PARTY_PER");
    private final static QName _Agreement_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "Agreement");
    private final static QName _PARTYFINPROP_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "PARTY_FIN_PROP");
    private final static QName _PARTYINVSTHLD_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "PARTY_INVST_HLD");
    private final static QName _PARTYAGRECARYADMNSYSNM_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "CARY_ADMN_SYS_NM");
    private final static QName _PARTYAGRESRVAGNTFULLNM_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "SRV_AGNT_FULL_NM");
    private final static QName _PARTYAGREBUSORGUNITID_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "BUS_ORG_UNIT_ID");
    private final static QName _PARTYINVSTHLDHLDINYR_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Data", "HLD_IN_YR");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.informatica.dis.ws.gpm_ods_data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PARTYSRVLVLS }
     * 
     */
    public PARTYSRVLVLS createPARTYSRVLVLS() {
        return new PARTYSRVLVLS();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link PartyPhone }
     * 
     */
    public PartyPhone createPartyPhone() {
        return new PartyPhone();
    }

    /**
     * Create an instance of {@link PARTYACK }
     * 
     */
    public PARTYACK createPARTYACK() {
        return new PARTYACK();
    }

    /**
     * Create an instance of {@link PARTYAGRE }
     * 
     */
    public PARTYAGRE createPARTYAGRE() {
        return new PARTYAGRE();
    }

    /**
     * Create an instance of {@link PartyLogical }
     * 
     */
    public PartyLogical createPartyLogical() {
        return new PartyLogical();
    }

    /**
     * Create an instance of {@link PARTYINCM }
     * 
     */
    public PARTYINCM createPARTYINCM() {
        return new PARTYINCM();
    }

    /**
     * Create an instance of {@link Party }
     * 
     */
    public Party createParty() {
        return new Party();
    }

    /**
     * Create an instance of {@link PARTYRISK }
     * 
     */
    public PARTYRISK createPARTYRISK() {
        return new PARTYRISK();
    }

    /**
     * Create an instance of {@link PartyRoleInAgreement }
     * 
     */
    public PartyRoleInAgreement createPartyRoleInAgreement() {
        return new PartyRoleInAgreement();
    }

    /**
     * Create an instance of {@link PARTYAGRGTSMS }
     * 
     */
    public PARTYAGRGTSMS createPARTYAGRGTSMS() {
        return new PARTYAGRGTSMS();
    }

    /**
     * Create an instance of {@link AgreementKey }
     * 
     */
    public AgreementKey createAgreementKey() {
        return new AgreementKey();
    }

    /**
     * Create an instance of {@link PARTYADR }
     * 
     */
    public PARTYADR createPARTYADR() {
        return new PARTYADR();
    }

    /**
     * Create an instance of {@link PersonDetail }
     * 
     */
    public PersonDetail createPersonDetail() {
        return new PersonDetail();
    }

    /**
     * Create an instance of {@link PartyAlternateIdentifier }
     * 
     */
    public PartyAlternateIdentifier createPartyAlternateIdentifier() {
        return new PartyAlternateIdentifier();
    }

    /**
     * Create an instance of {@link Agreement }
     * 
     */
    public Agreement createAgreement() {
        return new Agreement();
    }

    /**
     * Create an instance of {@link PARTYEXP }
     * 
     */
    public PARTYEXP createPARTYEXP() {
        return new PARTYEXP();
    }

    /**
     * Create an instance of {@link PARTYPER }
     * 
     */
    public PARTYPER createPARTYPER() {
        return new PARTYPER();
    }

    /**
     * Create an instance of {@link PARTYFINPROP }
     * 
     */
    public PARTYFINPROP createPARTYFINPROP() {
        return new PARTYFINPROP();
    }

    /**
     * Create an instance of {@link PARTYINVSTHLD }
     * 
     */
    public PARTYINVSTHLD createPARTYINVSTHLD() {
        return new PARTYINVSTHLD();
    }

    /**
     * Create an instance of {@link PartyElectronicAddress }
     * 
     */
    public PartyElectronicAddress createPartyElectronicAddress() {
        return new PartyElectronicAddress();
    }

    /**
     * Create an instance of {@link PARTYORG }
     * 
     */
    public PARTYORG createPARTYORG() {
        return new PARTYORG();
    }

    /**
     * Create an instance of {@link PartyCitizenship }
     * 
     */
    public PartyCitizenship createPartyCitizenship() {
        return new PartyCitizenship();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PARTYAGRE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "PARTY_AGRE")
    public JAXBElement<PARTYAGRE> createPARTYAGRE(PARTYAGRE value) {
        return new JAXBElement<PARTYAGRE>(_PARTYAGRE_QNAME, PARTYAGRE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "GlobalID")
    public JAXBElement<String> createGlobalID(String value) {
        return new JAXBElement<String>(_GlobalID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "Source")
    public JAXBElement<String> createSource(String value) {
        return new JAXBElement<String>(_Source_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PARTYSRVLVLS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "PARTY_SRV_LVLS")
    public JAXBElement<PARTYSRVLVLS> createPARTYSRVLVLS(PARTYSRVLVLS value) {
        return new JAXBElement<PARTYSRVLVLS>(_PARTYSRVLVLS_QNAME, PARTYSRVLVLS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PARTYACK }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "PARTY_ACK")
    public JAXBElement<PARTYACK> createPARTYACK(PARTYACK value) {
        return new JAXBElement<PARTYACK>(_PARTYACK_QNAME, PARTYACK.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "InquiryLevel")
    public JAXBElement<String> createInquiryLevel(String value) {
        return new JAXBElement<String>(_InquiryLevel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "Address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyPhone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "PartyPhone")
    public JAXBElement<PartyPhone> createPartyPhone(PartyPhone value) {
        return new JAXBElement<PartyPhone>(_PartyPhone_QNAME, PartyPhone.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgreementKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "AgreementKey")
    public JAXBElement<AgreementKey> createAgreementKey(AgreementKey value) {
        return new JAXBElement<AgreementKey>(_AgreementKey_QNAME, AgreementKey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyRoleInAgreement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "PartyRoleInAgreement")
    public JAXBElement<PartyRoleInAgreement> createPartyRoleInAgreement(PartyRoleInAgreement value) {
        return new JAXBElement<PartyRoleInAgreement>(_PartyRoleInAgreement_QNAME, PartyRoleInAgreement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PARTYAGRGTSMS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "PARTY_AGRGTS_MS")
    public JAXBElement<PARTYAGRGTSMS> createPARTYAGRGTSMS(PARTYAGRGTSMS value) {
        return new JAXBElement<PARTYAGRGTSMS>(_PARTYAGRGTSMS_QNAME, PARTYAGRGTSMS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyLogical }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "PartyLogical")
    public JAXBElement<PartyLogical> createPartyLogical(PartyLogical value) {
        return new JAXBElement<PartyLogical>(_PartyLogical_QNAME, PartyLogical.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PARTYINCM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "PARTY_INCM")
    public JAXBElement<PARTYINCM> createPARTYINCM(PARTYINCM value) {
        return new JAXBElement<PARTYINCM>(_PARTYINCM_QNAME, PARTYINCM.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Party }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "Party")
    public JAXBElement<Party> createParty(Party value) {
        return new JAXBElement<Party>(_Party_QNAME, Party.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PARTYRISK }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "PARTY_RISK")
    public JAXBElement<PARTYRISK> createPARTYRISK(PARTYRISK value) {
        return new JAXBElement<PARTYRISK>(_PARTYRISK_QNAME, PARTYRISK.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "AppID")
    public JAXBElement<String> createAppID(String value) {
        return new JAXBElement<String>(_AppID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "OrigSrcKey")
    public JAXBElement<String> createOrigSrcKey(String value) {
        return new JAXBElement<String>(_OrigSrcKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "PersonDetail")
    public JAXBElement<PersonDetail> createPersonDetail(PersonDetail value) {
        return new JAXBElement<PersonDetail>(_PersonDetail_QNAME, PersonDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAlternateIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "PartyAlternateIdentifier")
    public JAXBElement<PartyAlternateIdentifier> createPartyAlternateIdentifier(PartyAlternateIdentifier value) {
        return new JAXBElement<PartyAlternateIdentifier>(_PartyAlternateIdentifier_QNAME, PartyAlternateIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PARTYADR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "PARTY_ADR")
    public JAXBElement<PARTYADR> createPARTYADR(PARTYADR value) {
        return new JAXBElement<PARTYADR>(_PARTYADR_QNAME, PARTYADR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyElectronicAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "PartyElectronicAddress")
    public JAXBElement<PartyElectronicAddress> createPartyElectronicAddress(PartyElectronicAddress value) {
        return new JAXBElement<PartyElectronicAddress>(_PartyElectronicAddress_QNAME, PartyElectronicAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyCitizenship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "PartyCitizenship")
    public JAXBElement<PartyCitizenship> createPartyCitizenship(PartyCitizenship value) {
        return new JAXBElement<PartyCitizenship>(_PartyCitizenship_QNAME, PartyCitizenship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PARTYORG }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "PARTY_ORG")
    public JAXBElement<PARTYORG> createPARTYORG(PARTYORG value) {
        return new JAXBElement<PARTYORG>(_PARTYORG_QNAME, PARTYORG.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PARTYEXP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "PARTY_EXP")
    public JAXBElement<PARTYEXP> createPARTYEXP(PARTYEXP value) {
        return new JAXBElement<PARTYEXP>(_PARTYEXP_QNAME, PARTYEXP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PARTYPER }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "PARTY_PER")
    public JAXBElement<PARTYPER> createPARTYPER(PARTYPER value) {
        return new JAXBElement<PARTYPER>(_PARTYPER_QNAME, PARTYPER.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Agreement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "Agreement")
    public JAXBElement<Agreement> createAgreement(Agreement value) {
        return new JAXBElement<Agreement>(_Agreement_QNAME, Agreement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PARTYFINPROP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "PARTY_FIN_PROP")
    public JAXBElement<PARTYFINPROP> createPARTYFINPROP(PARTYFINPROP value) {
        return new JAXBElement<PARTYFINPROP>(_PARTYFINPROP_QNAME, PARTYFINPROP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PARTYINVSTHLD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "PARTY_INVST_HLD")
    public JAXBElement<PARTYINVSTHLD> createPARTYINVSTHLD(PARTYINVSTHLD value) {
        return new JAXBElement<PARTYINVSTHLD>(_PARTYINVSTHLD_QNAME, PARTYINVSTHLD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "CARY_ADMN_SYS_NM", scope = PARTYAGRE.class)
    public JAXBElement<String> createPARTYAGRECARYADMNSYSNM(String value) {
        return new JAXBElement<String>(_PARTYAGRECARYADMNSYSNM_QNAME, String.class, PARTYAGRE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "SRV_AGNT_FULL_NM", scope = PARTYAGRE.class)
    public JAXBElement<String> createPARTYAGRESRVAGNTFULLNM(String value) {
        return new JAXBElement<String>(_PARTYAGRESRVAGNTFULLNM_QNAME, String.class, PARTYAGRE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "BUS_ORG_UNIT_ID", scope = PARTYAGRE.class)
    public JAXBElement<String> createPARTYAGREBUSORGUNITID(String value) {
        return new JAXBElement<String>(_PARTYAGREBUSORGUNITID_QNAME, String.class, PARTYAGRE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Data", name = "HLD_IN_YR", scope = PARTYINVSTHLD.class)
    public JAXBElement<BigInteger> createPARTYINVSTHLDHLDINYR(BigInteger value) {
        return new JAXBElement<BigInteger>(_PARTYINVSTHLDHLDINYR_QNAME, BigInteger.class, PARTYINVSTHLD.class, value);
    }

}
