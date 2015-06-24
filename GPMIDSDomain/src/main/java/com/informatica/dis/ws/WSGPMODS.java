
package com.informatica.dis.ws;

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
@WebServiceClient(name = "WS_GPM_ODS", targetNamespace = "http://www.informatica.com/dis/ws/", wsdlLocation = "file:/D:/metlife/IDS/WS_GPM_ODS.WSDL")
public class WSGPMODS
    extends Service
{

    private final static URL WSGPMODS_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.informatica.dis.ws.WSGPMODS.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.informatica.dis.ws.WSGPMODS.class.getResource(".");
            url = new URL(baseUrl, "file:/D:/metlife/IDS/WS_GPM_ODS.WSDL");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/D:/metlife/IDS/WS_GPM_ODS.WSDL', retrying as a local file");
            logger.warning(e.getMessage());
        }
        WSGPMODS_WSDL_LOCATION = url;
    }

    public WSGPMODS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSGPMODS() {
        super(WSGPMODS_WSDL_LOCATION, new QName("http://www.informatica.com/dis/ws/", "WS_GPM_ODS"));
    }

    /**
     * 
     * @return
     *     returns WSGPMODSPortType
     */
    @WebEndpoint(name = "WS_GPM_ODS")
    public WSGPMODSPortType getWSGPMODS() {
        return super.getPort(new QName("http://www.informatica.com/dis/ws/", "WS_GPM_ODS"), WSGPMODSPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSGPMODSPortType
     */
    @WebEndpoint(name = "WS_GPM_ODS")
    public WSGPMODSPortType getWSGPMODS(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.informatica.com/dis/ws/", "WS_GPM_ODS"), WSGPMODSPortType.class, features);
    }

}