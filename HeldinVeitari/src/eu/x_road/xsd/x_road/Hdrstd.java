
package eu.x_road.xsd.x_road;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hdrstd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hdrstd"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://x-road.eu/xsd/x-road.xsd}consumer"/&gt;
 *         &lt;element ref="{http://x-road.eu/xsd/x-road.xsd}producer"/&gt;
 *         &lt;element ref="{http://x-road.eu/xsd/x-road.xsd}userId"/&gt;
 *         &lt;element ref="{http://x-road.eu/xsd/x-road.xsd}id"/&gt;
 *         &lt;element ref="{http://x-road.eu/xsd/x-road.xsd}service"/&gt;
 *         &lt;element ref="{http://x-road.eu/xsd/x-road.xsd}issue"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hdrstd", propOrder = {
    "consumer",
    "producer",
    "userId",
    "id",
    "service",
    "issue"
})
public class Hdrstd {

    @XmlElement(namespace = "http://x-road.eu/xsd/x-road.xsd", required = true)
    protected String consumer;
    @XmlElement(namespace = "http://x-road.eu/xsd/x-road.xsd", required = true)
    protected String producer;
    @XmlElement(namespace = "http://x-road.eu/xsd/x-road.xsd", required = true)
    protected String userId;
    @XmlElement(namespace = "http://x-road.eu/xsd/x-road.xsd", required = true)
    protected String id;
    @XmlElement(namespace = "http://x-road.eu/xsd/x-road.xsd", required = true)
    protected String service;
    @XmlElement(namespace = "http://x-road.eu/xsd/x-road.xsd", required = true)
    protected String issue;

    /**
     * Gets the value of the consumer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumer() {
        return consumer;
    }

    /**
     * Sets the value of the consumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumer(String value) {
        this.consumer = value;
    }

    /**
     * Gets the value of the producer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducer() {
        return producer;
    }

    /**
     * Sets the value of the producer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducer(String value) {
        this.producer = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the issue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssue() {
        return issue;
    }

    /**
     * Sets the value of the issue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssue(String value) {
        this.issue = value;
    }

}
