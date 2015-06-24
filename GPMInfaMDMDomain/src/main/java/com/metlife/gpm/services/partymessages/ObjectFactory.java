//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.21 at 04:03:14 PM EDT 
//


package com.metlife.gpm.services.partymessages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.metlife.gpm.services.partymessages package. 
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

    private final static QName _PartySearchResponse_QNAME = new QName("services.gpm.metlife.com/PartyMessages", "PartySearchResponse");
    private final static QName _PartyInquiryRequest_QNAME = new QName("services.gpm.metlife.com/PartyMessages", "PartyInquiryRequest");
    private final static QName _PartySearchRequest_QNAME = new QName("services.gpm.metlife.com/PartyMessages", "PartySearchRequest");
    private final static QName _PartyInquiryResponse_QNAME = new QName("services.gpm.metlife.com/PartyMessages", "PartyInquiryResponse");
    private final static QName _CreatePartyResponse_QNAME = new QName("services.gpm.metlife.com/PartyMessages", "CreatePartyResponse");
    private final static QName _CreatePartyRequest_QNAME = new QName("services.gpm.metlife.com/PartyMessages", "CreatePartyRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.metlife.gpm.services.partymessages
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreatePartyRequest }
     * 
     */
    public CreatePartyRequest createCreatePartyRequest() {
        return new CreatePartyRequest();
    }

    /**
     * Create an instance of {@link PartyInquiryResponse }
     * 
     */
    public PartyInquiryResponse createPartyInquiryResponse() {
        return new PartyInquiryResponse();
    }

    /**
     * Create an instance of {@link PartySearchResponse }
     * 
     */
    public PartySearchResponse createPartySearchResponse() {
        return new PartySearchResponse();
    }

    /**
     * Create an instance of {@link PartyInquiryRequest }
     * 
     */
    public PartyInquiryRequest createPartyInquiryRequest() {
        return new PartyInquiryRequest();
    }

    /**
     * Create an instance of {@link CreatePartyResponse }
     * 
     */
    public CreatePartyResponse createCreatePartyResponse() {
        return new CreatePartyResponse();
    }

    /**
     * Create an instance of {@link PartySearchRequest }
     * 
     */
    public PartySearchRequest createPartySearchRequest() {
        return new PartySearchRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartySearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "services.gpm.metlife.com/PartyMessages", name = "PartySearchResponse")
    public JAXBElement<PartySearchResponse> createPartySearchResponse(PartySearchResponse value) {
        return new JAXBElement<PartySearchResponse>(_PartySearchResponse_QNAME, PartySearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyInquiryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "services.gpm.metlife.com/PartyMessages", name = "PartyInquiryRequest")
    public JAXBElement<PartyInquiryRequest> createPartyInquiryRequest(PartyInquiryRequest value) {
        return new JAXBElement<PartyInquiryRequest>(_PartyInquiryRequest_QNAME, PartyInquiryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartySearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "services.gpm.metlife.com/PartyMessages", name = "PartySearchRequest")
    public JAXBElement<PartySearchRequest> createPartySearchRequest(PartySearchRequest value) {
        return new JAXBElement<PartySearchRequest>(_PartySearchRequest_QNAME, PartySearchRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyInquiryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "services.gpm.metlife.com/PartyMessages", name = "PartyInquiryResponse")
    public JAXBElement<PartyInquiryResponse> createPartyInquiryResponse(PartyInquiryResponse value) {
        return new JAXBElement<PartyInquiryResponse>(_PartyInquiryResponse_QNAME, PartyInquiryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePartyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "services.gpm.metlife.com/PartyMessages", name = "CreatePartyResponse")
    public JAXBElement<CreatePartyResponse> createCreatePartyResponse(CreatePartyResponse value) {
        return new JAXBElement<CreatePartyResponse>(_CreatePartyResponse_QNAME, CreatePartyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePartyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "services.gpm.metlife.com/PartyMessages", name = "CreatePartyRequest")
    public JAXBElement<CreatePartyRequest> createCreatePartyRequest(CreatePartyRequest value) {
        return new JAXBElement<CreatePartyRequest>(_CreatePartyRequest_QNAME, CreatePartyRequest.class, null, value);
    }

}
