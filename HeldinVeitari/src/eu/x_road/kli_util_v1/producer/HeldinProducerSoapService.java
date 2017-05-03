package eu.x_road.kli_util_v1.producer;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-05-03T22:48:36.534+02:00
 * Generated source version: 3.1.11
 * 
 */
@WebServiceClient(name = "HeldinProducerSoapService", 
                  wsdlLocation = "file:WebContent/WEB-INF/wsdl/heldinVeitari.wsdl",
                  targetNamespace = "http://kli-util-v1.x-road.eu/producer") 
public class HeldinProducerSoapService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://kli-util-v1.x-road.eu/producer", "HeldinProducerSoapService");
    public final static QName HeldinProducerPort = new QName("http://kli-util-v1.x-road.eu/producer", "HeldinProducerPort");
    static {
        URL url = null;
        try {
            url = new URL("file:WebContent/WEB-INF/wsdl/heldinVeitari.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HeldinProducerSoapService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:WebContent/WEB-INF/wsdl/heldinVeitari.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HeldinProducerSoapService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HeldinProducerSoapService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HeldinProducerSoapService() {
        super(WSDL_LOCATION, SERVICE);
    }
    




    /**
     *
     * @return
     *     returns HeldinProducerPortType
     */
    @WebEndpoint(name = "HeldinProducerPort")
    public HeldinProducerPortType getHeldinProducerPort() {
        return super.getPort(HeldinProducerPort, HeldinProducerPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HeldinProducerPortType
     */
    @WebEndpoint(name = "HeldinProducerPort")
    public HeldinProducerPortType getHeldinProducerPort(WebServiceFeature... features) {
        return super.getPort(HeldinProducerPort, HeldinProducerPortType.class, features);
    }

}