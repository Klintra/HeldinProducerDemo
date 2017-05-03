
package eu.x_road.kli_util_v1.producer;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="firstInteger" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="secondInteger" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="response"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="faultCode" type="{http://x-road.eu/xsd/x-road.xsd}faultCode" minOccurs="0"/&gt;
 *                   &lt;element name="faultString" type="{http://x-road.eu/xsd/x-road.xsd}faultString" minOccurs="0"/&gt;
 *                   &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request",
    "response"
})
@XmlRootElement(name = "addNumbersResponse")
public class AddNumbersResponse {

    @XmlElement(required = true)
    protected AddNumbersResponse.Request request;
    @XmlElement(required = true)
    protected AddNumbersResponse.Response response;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link AddNumbersResponse.Request }
     *     
     */
    public AddNumbersResponse.Request getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddNumbersResponse.Request }
     *     
     */
    public void setRequest(AddNumbersResponse.Request value) {
        this.request = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link AddNumbersResponse.Response }
     *     
     */
    public AddNumbersResponse.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddNumbersResponse.Response }
     *     
     */
    public void setResponse(AddNumbersResponse.Response value) {
        this.response = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="firstInteger" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="secondInteger" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "firstInteger",
        "secondInteger"
    })
    public static class Request {

        @XmlElement(required = true)
        protected BigInteger firstInteger;
        @XmlElement(required = true)
        protected BigInteger secondInteger;

        /**
         * Gets the value of the firstInteger property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getFirstInteger() {
            return firstInteger;
        }

        /**
         * Sets the value of the firstInteger property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setFirstInteger(BigInteger value) {
            this.firstInteger = value;
        }

        /**
         * Gets the value of the secondInteger property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSecondInteger() {
            return secondInteger;
        }

        /**
         * Sets the value of the secondInteger property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSecondInteger(BigInteger value) {
            this.secondInteger = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="faultCode" type="{http://x-road.eu/xsd/x-road.xsd}faultCode" minOccurs="0"/&gt;
     *         &lt;element name="faultString" type="{http://x-road.eu/xsd/x-road.xsd}faultString" minOccurs="0"/&gt;
     *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "faultCode",
        "faultString",
        "result"
    })
    public static class Response {

        protected String faultCode;
        protected String faultString;
        @XmlElement(required = true)
        protected BigInteger result;

        /**
         * Gets the value of the faultCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFaultCode() {
            return faultCode;
        }

        /**
         * Sets the value of the faultCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFaultCode(String value) {
            this.faultCode = value;
        }

        /**
         * Gets the value of the faultString property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFaultString() {
            return faultString;
        }

        /**
         * Sets the value of the faultString property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFaultString(String value) {
            this.faultString = value;
        }

        /**
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setResult(BigInteger value) {
            this.result = value;
        }

    }

}
