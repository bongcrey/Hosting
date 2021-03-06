
package com.metlife.gpm.services.partyservice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "PartyService", targetNamespace = "services.gpm.metlife.com/PartyService", wsdlLocation = "file:/D:/metlife/SIF/PartyService.wsdl")
public class PartyService_Service
    extends Service
{

    private final static URL PARTYSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.metlife.gpm.services.partyservice.PartyService_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.metlife.gpm.services.partyservice.PartyService_Service.class.getResource(".");
            url = new URL(baseUrl, "file:/D:/metlife/SIF/PartyService.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/D:/metlife/SIF/PartyService.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        PARTYSERVICE_WSDL_LOCATION = url;
    }

    public PartyService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PartyService_Service() {
        super(PARTYSERVICE_WSDL_LOCATION, new QName("services.gpm.metlife.com/PartyService", "PartyService"));
    }

    /**
     * 
     * @return
     *     returns PartyService
     */
    @WebEndpoint(name = "PartyService")
    public PartyService getPartyService() {
        return super.getPort(new QName("services.gpm.metlife.com/PartyService", "PartyService"), PartyService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PartyService
     */
    @WebEndpoint(name = "PartyService")
    public PartyService getPartyService(WebServiceFeature... features) {
        return super.getPort(new QName("services.gpm.metlife.com/PartyService", "PartyService"), PartyService.class, features);
    }

}
