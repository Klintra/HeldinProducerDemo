
package eu.x_road.xsd.x_road;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
    "request"
})
@XmlRootElement(name = "loadClassification")
public class LoadClassification {

    @XmlElement(required = true, nillable = true)
    protected LoadClassification.Request request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link LoadClassification.Request }
     *     
     */
    public LoadClassification.Request getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadClassification.Request }
     *     
     */
    public void setRequest(LoadClassification.Request value) {
        this.request = value;
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

}
