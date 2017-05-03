
package eu.x_road.kli_util_v1.producer;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.x_road.kli_util_v1.producer package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.x_road.kli_util_v1.producer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddNumbers }
     * 
     */
    public AddNumbers createAddNumbers() {
        return new AddNumbers();
    }

    /**
     * Create an instance of {@link AddNumbersResponse }
     * 
     */
    public AddNumbersResponse createAddNumbersResponse() {
        return new AddNumbersResponse();
    }

    /**
     * Create an instance of {@link AddNumbers.Request }
     * 
     */
    public AddNumbers.Request createAddNumbersRequest() {
        return new AddNumbers.Request();
    }

    /**
     * Create an instance of {@link AddNumbersResponse.Request }
     * 
     */
    public AddNumbersResponse.Request createAddNumbersResponseRequest() {
        return new AddNumbersResponse.Request();
    }

    /**
     * Create an instance of {@link AddNumbersResponse.Response }
     * 
     */
    public AddNumbersResponse.Response createAddNumbersResponseResponse() {
        return new AddNumbersResponse.Response();
    }

}
