
package eu.x_road.xsd.x_road;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="subset" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *                   &lt;element name="classificationNames"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="classifications"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;any maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="faultCode" type="{http://x-road.eu/xsd/x-road.xsd}faultCode"/&gt;
 *                   &lt;element name="faultString" type="{http://x-road.eu/xsd/x-road.xsd}faultString"/&gt;
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
@XmlRootElement(name = "loadClassificationResponse")
public class LoadClassificationResponse {

    @XmlElement(required = true, nillable = true)
    protected LoadClassificationResponse.Request request;
    @XmlElement(required = true)
    protected LoadClassificationResponse.Response response;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link LoadClassificationResponse.Request }
     *     
     */
    public LoadClassificationResponse.Request getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadClassificationResponse.Request }
     *     
     */
    public void setRequest(LoadClassificationResponse.Request value) {
        this.request = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link LoadClassificationResponse.Response }
     *     
     */
    public LoadClassificationResponse.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadClassificationResponse.Response }
     *     
     */
    public void setResponse(LoadClassificationResponse.Response value) {
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
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="subset" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "name",
        "subset",
        "from",
        "max"
    })
    public static class Request {

        @XmlElement(required = true, nillable = true)
        protected String name;
        @XmlElement(required = true, nillable = true)
        protected String subset;
        @XmlElement(required = true, nillable = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar from;
        @XmlElement(required = true, nillable = true)
        protected String max;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the subset property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubset() {
            return subset;
        }

        /**
         * Sets the value of the subset property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubset(String value) {
            this.subset = value;
        }

        /**
         * Gets the value of the from property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFrom() {
            return from;
        }

        /**
         * Sets the value of the from property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFrom(XMLGregorianCalendar value) {
            this.from = value;
        }

        /**
         * Gets the value of the max property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMax() {
            return max;
        }

        /**
         * Sets the value of the max property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMax(String value) {
            this.max = value;
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
     *         &lt;element name="classificationNames"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="classifications"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;any maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="faultCode" type="{http://x-road.eu/xsd/x-road.xsd}faultCode"/&gt;
     *         &lt;element name="faultString" type="{http://x-road.eu/xsd/x-road.xsd}faultString"/&gt;
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
        "classificationNames",
        "classifications",
        "faultCode",
        "faultString"
    })
    public static class Response {

        @XmlElement(required = true, nillable = true)
        protected LoadClassificationResponse.Response.ClassificationNames classificationNames;
        @XmlElement(required = true, nillable = true)
        protected LoadClassificationResponse.Response.Classifications classifications;
        @XmlElement(required = true, nillable = true)
        protected String faultCode;
        @XmlElement(required = true, nillable = true)
        protected String faultString;

        /**
         * Gets the value of the classificationNames property.
         * 
         * @return
         *     possible object is
         *     {@link LoadClassificationResponse.Response.ClassificationNames }
         *     
         */
        public LoadClassificationResponse.Response.ClassificationNames getClassificationNames() {
            return classificationNames;
        }

        /**
         * Sets the value of the classificationNames property.
         * 
         * @param value
         *     allowed object is
         *     {@link LoadClassificationResponse.Response.ClassificationNames }
         *     
         */
        public void setClassificationNames(LoadClassificationResponse.Response.ClassificationNames value) {
            this.classificationNames = value;
        }

        /**
         * Gets the value of the classifications property.
         * 
         * @return
         *     possible object is
         *     {@link LoadClassificationResponse.Response.Classifications }
         *     
         */
        public LoadClassificationResponse.Response.Classifications getClassifications() {
            return classifications;
        }

        /**
         * Sets the value of the classifications property.
         * 
         * @param value
         *     allowed object is
         *     {@link LoadClassificationResponse.Response.Classifications }
         *     
         */
        public void setClassifications(LoadClassificationResponse.Response.Classifications value) {
            this.classifications = value;
        }

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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "item"
        })
        public static class ClassificationNames {

            protected List<String> item;

            /**
             * Gets the value of the item property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getItem() {
                if (item == null) {
                    item = new ArrayList<String>();
                }
                return this.item;
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
         *         &lt;any maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "any"
        })
        public static class Classifications {

            @XmlAnyElement(lax = true)
            protected List<Object> any;

            /**
             * Gets the value of the any property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the any property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAny().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getAny() {
                if (any == null) {
                    any = new ArrayList<Object>();
                }
                return this.any;
            }

        }

    }

}
