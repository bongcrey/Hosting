
package com.informatica.dis.ws.gpm_ods_message;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.informatica.dis.ws.gpm_ods_message package. 
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

    private final static QName _GetStart4RecordResponse_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Message", "Get_Start4_RecordResponse");
    private final static QName _GetStart4RecordRequest_QNAME = new QName("http://www.informatica.com/dis/ws/GPM_ODS_Message", "Get_Start4_RecordRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.informatica.dis.ws.gpm_ods_message
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStart4RecordRequest }
     * 
     */
    public GetStart4RecordRequest createGetStart4RecordRequest() {
        return new GetStart4RecordRequest();
    }

    /**
     * Create an instance of {@link GetStart4RecordResponse }
     * 
     */
    public GetStart4RecordResponse createGetStart4RecordResponse() {
        return new GetStart4RecordResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStart4RecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Message", name = "Get_Start4_RecordResponse")
    public JAXBElement<GetStart4RecordResponse> createGetStart4RecordResponse(GetStart4RecordResponse value) {
        return new JAXBElement<GetStart4RecordResponse>(_GetStart4RecordResponse_QNAME, GetStart4RecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStart4RecordRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.informatica.com/dis/ws/GPM_ODS_Message", name = "Get_Start4_RecordRequest")
    public JAXBElement<GetStart4RecordRequest> createGetStart4RecordRequest(GetStart4RecordRequest value) {
        return new JAXBElement<GetStart4RecordRequest>(_GetStart4RecordRequest_QNAME, GetStart4RecordRequest.class, null, value);
    }

}
