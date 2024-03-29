package eu.x_road.kli_util_v1.producer;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-05-03T22:48:36.527+02:00
 * Generated source version: 3.1.11
 * 
 */
@WebService(targetNamespace = "http://kli-util-v1.x-road.eu/producer", name = "HeldinProducerPortType")
@XmlSeeAlso({eu.x_road.xsd.x_road.ObjectFactory.class, ObjectFactory.class, org.w3._2005._05.xmlmime.ObjectFactory.class})
public interface HeldinProducerPortType {

    @WebMethod(action = "listMethods")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "listMethodsResponse", targetNamespace = "http://x-road.eu/xsd/x-road.xsd", partName = "body")
    public eu.x_road.xsd.x_road.ListMethodsResponse listMethods(
        @WebParam(partName = "body", name = "listMethods", targetNamespace = "http://x-road.eu/xsd/x-road.xsd")
        java.lang.Object body
    );

    @WebMethod(action = "testSystem")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "testSystemResponse", targetNamespace = "http://x-road.eu/xsd/x-road.xsd", partName = "body")
    public java.lang.Object testSystem(
        @WebParam(partName = "body", name = "testSystem", targetNamespace = "http://x-road.eu/xsd/x-road.xsd")
        java.lang.Object body
    );

    @WebMethod
    @RequestWrapper(localName = "addNumbers", targetNamespace = "http://kli-util-v1.x-road.eu/producer", className = "eu.x_road.kli_util_v1.producer.AddNumbers")
    @ResponseWrapper(localName = "addNumbersResponse", targetNamespace = "http://kli-util-v1.x-road.eu/producer", className = "eu.x_road.kli_util_v1.producer.AddNumbersResponse")
    public void addNumbers(
        @WebParam(name = "request", targetNamespace = "")
        eu.x_road.kli_util_v1.producer.AddNumbers.Request request,
        @WebParam(name = "consumer", targetNamespace = "http://x-road.eu/xsd/x-road.xsd", header = true)
        java.lang.String consumer,
        @WebParam(name = "producer", targetNamespace = "http://x-road.eu/xsd/x-road.xsd", header = true)
        java.lang.String producer,
        @WebParam(name = "userId", targetNamespace = "http://x-road.eu/xsd/x-road.xsd", header = true)
        java.lang.String userId,
        @WebParam(name = "id", targetNamespace = "http://x-road.eu/xsd/x-road.xsd", header = true)
        java.lang.String id,
        @WebParam(name = "service", targetNamespace = "http://x-road.eu/xsd/x-road.xsd", header = true)
        java.lang.String service,
        @WebParam(mode = WebParam.Mode.OUT, name = "request", targetNamespace = "")
        javax.xml.ws.Holder<eu.x_road.kli_util_v1.producer.AddNumbersResponse.Request> request1,
        @WebParam(mode = WebParam.Mode.OUT, name = "response", targetNamespace = "")
        javax.xml.ws.Holder<eu.x_road.kli_util_v1.producer.AddNumbersResponse.Response> response,
        @WebParam(mode = WebParam.Mode.OUT, name = "consumer", targetNamespace = "http://x-road.eu/xsd/x-road.xsd", header = true)
        javax.xml.ws.Holder<java.lang.String> consumer1,
        @WebParam(mode = WebParam.Mode.OUT, name = "producer", targetNamespace = "http://x-road.eu/xsd/x-road.xsd", header = true)
        javax.xml.ws.Holder<java.lang.String> producer1,
        @WebParam(mode = WebParam.Mode.OUT, name = "userId", targetNamespace = "http://x-road.eu/xsd/x-road.xsd", header = true)
        javax.xml.ws.Holder<java.lang.String> userId1,
        @WebParam(mode = WebParam.Mode.OUT, name = "id", targetNamespace = "http://x-road.eu/xsd/x-road.xsd", header = true)
        javax.xml.ws.Holder<java.lang.String> id1,
        @WebParam(mode = WebParam.Mode.OUT, name = "service", targetNamespace = "http://x-road.eu/xsd/x-road.xsd", header = true)
        javax.xml.ws.Holder<java.lang.String> service1
    );
}
