
package eu.x_road.xsd.x_road;

import java.util.ArrayList;
import java.util.List;
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
 *                   &lt;element name="personCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *                   &lt;element name="person" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="personCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="orgQuery" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="query" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="queryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="validUntil" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
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
@XmlRootElement(name = "userAllowedMethodsResponse")
public class UserAllowedMethodsResponse {

    @XmlElement(required = true, nillable = true)
    protected UserAllowedMethodsResponse.Request request;
    @XmlElement(required = true)
    protected UserAllowedMethodsResponse.Response response;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link UserAllowedMethodsResponse.Request }
     *     
     */
    public UserAllowedMethodsResponse.Request getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAllowedMethodsResponse.Request }
     *     
     */
    public void setRequest(UserAllowedMethodsResponse.Request value) {
        this.request = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link UserAllowedMethodsResponse.Response }
     *     
     */
    public UserAllowedMethodsResponse.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAllowedMethodsResponse.Response }
     *     
     */
    public void setResponse(UserAllowedMethodsResponse.Response value) {
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
     *         &lt;element name="personCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "personCode"
    })
    public static class Request {

        @XmlElement(required = true, nillable = true)
        protected String personCode;

        /**
         * Gets the value of the personCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPersonCode() {
            return personCode;
        }

        /**
         * Sets the value of the personCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPersonCode(String value) {
            this.personCode = value;
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
     *         &lt;element name="person" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="personCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="orgQuery" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="query" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="queryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="validUntil" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
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
        "person",
        "faultCode",
        "faultString"
    })
    public static class Response {

        @XmlElement(required = true, nillable = true)
        protected List<UserAllowedMethodsResponse.Response.Person> person;
        @XmlElement(required = true, nillable = true)
        protected String faultCode;
        @XmlElement(required = true, nillable = true)
        protected String faultString;

        /**
         * Gets the value of the person property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the person property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPerson().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UserAllowedMethodsResponse.Response.Person }
         * 
         * 
         */
        public List<UserAllowedMethodsResponse.Response.Person> getPerson() {
            if (person == null) {
                person = new ArrayList<UserAllowedMethodsResponse.Response.Person>();
            }
            return this.person;
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
         *         &lt;element name="personCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="orgQuery" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="query" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="queryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="validUntil" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
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
            "personCode",
            "orgQuery"
        })
        public static class Person {

            @XmlElement(required = true)
            protected String personCode;
            @XmlElement(required = true, nillable = true)
            protected List<UserAllowedMethodsResponse.Response.Person.OrgQuery> orgQuery;

            /**
             * Gets the value of the personCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPersonCode() {
                return personCode;
            }

            /**
             * Sets the value of the personCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPersonCode(String value) {
                this.personCode = value;
            }

            /**
             * Gets the value of the orgQuery property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the orgQuery property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOrgQuery().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link UserAllowedMethodsResponse.Response.Person.OrgQuery }
             * 
             * 
             */
            public List<UserAllowedMethodsResponse.Response.Person.OrgQuery> getOrgQuery() {
                if (orgQuery == null) {
                    orgQuery = new ArrayList<UserAllowedMethodsResponse.Response.Person.OrgQuery>();
                }
                return this.orgQuery;
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
             *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="query" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="queryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="validUntil" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
                "orgCode",
                "orgName",
                "query"
            })
            public static class OrgQuery {

                @XmlElement(required = true)
                protected String orgCode;
                @XmlElement(required = true)
                protected String orgName;
                protected List<UserAllowedMethodsResponse.Response.Person.OrgQuery.Query> query;

                /**
                 * Gets the value of the orgCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrgCode() {
                    return orgCode;
                }

                /**
                 * Sets the value of the orgCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrgCode(String value) {
                    this.orgCode = value;
                }

                /**
                 * Gets the value of the orgName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrgName() {
                    return orgName;
                }

                /**
                 * Sets the value of the orgName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrgName(String value) {
                    this.orgName = value;
                }

                /**
                 * Gets the value of the query property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the query property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getQuery().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link UserAllowedMethodsResponse.Response.Person.OrgQuery.Query }
                 * 
                 * 
                 */
                public List<UserAllowedMethodsResponse.Response.Person.OrgQuery.Query> getQuery() {
                    if (query == null) {
                        query = new ArrayList<UserAllowedMethodsResponse.Response.Person.OrgQuery.Query>();
                    }
                    return this.query;
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
                 *         &lt;element name="queryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="validUntil" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
                    "queryName",
                    "validUntil"
                })
                public static class Query {

                    @XmlElement(required = true)
                    protected String queryName;
                    @XmlElement(required = true, nillable = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar validUntil;

                    /**
                     * Gets the value of the queryName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getQueryName() {
                        return queryName;
                    }

                    /**
                     * Sets the value of the queryName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setQueryName(String value) {
                        this.queryName = value;
                    }

                    /**
                     * Gets the value of the validUntil property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getValidUntil() {
                        return validUntil;
                    }

                    /**
                     * Sets the value of the validUntil property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setValidUntil(XMLGregorianCalendar value) {
                        this.validUntil = value;
                    }

                }

            }

        }

    }

}
