
package com.metlife.gpm.services.partyservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.metlife.gpm.services.partymessages.CreatePartyRequest;
import com.metlife.gpm.services.partymessages.CreatePartyResponse;
import com.metlife.gpm.services.partymessages.PartyInquiryRequest;
import com.metlife.gpm.services.partymessages.PartyInquiryResponse;
import com.metlife.gpm.services.partymessages.PartySearchRequest;
import com.metlife.gpm.services.partymessages.PartySearchResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "PartyService", targetNamespace = "services.gpm.metlife.com/PartyService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.metlife.gpm.services.partymessages.ObjectFactory.class,
    com.metlife.gpm.services.partydata.ObjectFactory.class
})
public interface PartyService {


    /**
     * 
     * @param createPartyRequest
     * @return
     *     returns com.metlife.gpm.services.partymessages.CreatePartyResponse
     * @throws BusinessFaultMessage
     */
    @WebMethod(operationName = "CreateParty", action = "CreateParty")
    @WebResult(name = "CreatePartyResponse", targetNamespace = "services.gpm.metlife.com/PartyMessages", partName = "CreatePartyResponse")
    public CreatePartyResponse createParty(
        @WebParam(name = "CreatePartyRequest", targetNamespace = "services.gpm.metlife.com/PartyMessages", partName = "CreatePartyRequest")
        CreatePartyRequest createPartyRequest)
        throws BusinessFaultMessage
    ;

    /**
     * 
     * @param partySearchRequest
     * @return
     *     returns com.metlife.gpm.services.partymessages.PartySearchResponse
     * @throws BusinessFaultMessage
     */
    @WebMethod(operationName = "PartySearch", action = "PartySearch")
    @WebResult(name = "PartySearchResponse", targetNamespace = "services.gpm.metlife.com/PartyMessages", partName = "PartySearchResponse")
    public PartySearchResponse partySearch(
        @WebParam(name = "PartySearchRequest", targetNamespace = "services.gpm.metlife.com/PartyMessages", partName = "PartySearchRequest")
        PartySearchRequest partySearchRequest)
        throws BusinessFaultMessage
    ;

    /**
     * 
     * @param partyInquiryRequest
     * @return
     *     returns com.metlife.gpm.services.partymessages.PartyInquiryResponse
     * @throws BusinessFaultMessage
     */
    @WebMethod(operationName = "PartyInquiry", action = "PartyInquiry")
    @WebResult(name = "PartyInquiryResponse", targetNamespace = "services.gpm.metlife.com/PartyMessages", partName = "PartyInquiryResponse")
    public PartyInquiryResponse partyInquiry(
        @WebParam(name = "PartyInquiryRequest", targetNamespace = "services.gpm.metlife.com/PartyMessages", partName = "PartyInquiryRequest")
        PartyInquiryRequest partyInquiryRequest)
        throws BusinessFaultMessage
    ;

}
