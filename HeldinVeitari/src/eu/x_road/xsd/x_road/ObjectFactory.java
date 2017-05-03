
package eu.x_road.xsd.x_road;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.x_road.xsd.x_road package. 
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

    private final static QName _Consumer_QNAME = new QName("http://x-road.eu/xsd/x-road.xsd", "consumer");
    private final static QName _Producer_QNAME = new QName("http://x-road.eu/xsd/x-road.xsd", "producer");
    private final static QName _UserId_QNAME = new QName("http://x-road.eu/xsd/x-road.xsd", "userId");
    private final static QName _Id_QNAME = new QName("http://x-road.eu/xsd/x-road.xsd", "id");
    private final static QName _Service_QNAME = new QName("http://x-road.eu/xsd/x-road.xsd", "service");
    private final static QName _Issue_QNAME = new QName("http://x-road.eu/xsd/x-road.xsd", "issue");
    private final static QName _Unit_QNAME = new QName("http://x-road.eu/xsd/x-road.xsd", "unit");
    private final static QName _Position_QNAME = new QName("http://x-road.eu/xsd/x-road.xsd", "position");
    private final static QName _Authenticator_QNAME = new QName("http://x-road.eu/xsd/x-road.xsd", "authenticator");
    private final static QName _UserName_QNAME = new QName("http://x-road.eu/xsd/x-road.xsd", "userName");
    private final static QName _Async_QNAME = new QName("http://x-road.eu/xsd/x-road.xsd", "async");
    private final static QName _Encode_QNAME = new QName("http://x-road.eu/xsd/x-road.xsd", "encode");
    private final static QName _Ref_QNAME = new QName("http://x-road.eu/xsd/x-road.xsd", "ref");
    private final static QName _Wildcard_QNAME = new QName("http://x-road.eu/xsd/x-road.xsd", "wildcard");
    private final static QName _Version_QNAME = new QName("http://x-road.eu/xsd/x-road.xsd", "version");
    private final static QName _Nocontent_QNAME = new QName("http://x-road.eu/xsd/x-road.xsd", "nocontent");
    private final static QName _Requirecontent_QNAME = new QName("http://x-road.eu/xsd/x-road.xsd", "requirecontent");
    private final static QName _ListMethods_QNAME = new QName("http://x-road.eu/xsd/x-road.xsd", "listMethods");
    private final static QName _TestSystem_QNAME = new QName("http://x-road.eu/xsd/x-road.xsd", "testSystem");
    private final static QName _TestSystemResponse_QNAME = new QName("http://x-road.eu/xsd/x-road.xsd", "testSystemResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.x_road.xsd.x_road
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListMethodsResponse }
     * 
     */
    public ListMethodsResponse createListMethodsResponse() {
        return new ListMethodsResponse();
    }

    /**
     * Create an instance of {@link LoadClassification }
     * 
     */
    public LoadClassification createLoadClassification() {
        return new LoadClassification();
    }

    /**
     * Create an instance of {@link LoadClassificationResponse }
     * 
     */
    public LoadClassificationResponse createLoadClassificationResponse() {
        return new LoadClassificationResponse();
    }

    /**
     * Create an instance of {@link UserAllowedMethods }
     * 
     */
    public UserAllowedMethods createUserAllowedMethods() {
        return new UserAllowedMethods();
    }

    /**
     * Create an instance of {@link UserAllowedMethodsResponse }
     * 
     */
    public UserAllowedMethodsResponse createUserAllowedMethodsResponse() {
        return new UserAllowedMethodsResponse();
    }

    /**
     * Create an instance of {@link UnitRepresentResponse }
     * 
     */
    public UnitRepresentResponse createUnitRepresentResponse() {
        return new UnitRepresentResponse();
    }

    /**
     * Create an instance of {@link UnitRepresentResponse.Response }
     * 
     */
    public UnitRepresentResponse.Response createUnitRepresentResponseResponse() {
        return new UnitRepresentResponse.Response();
    }

    /**
     * Create an instance of {@link UnitRepresent }
     * 
     */
    public UnitRepresent createUnitRepresent() {
        return new UnitRepresent();
    }

    /**
     * Create an instance of {@link UnitValidResponse }
     * 
     */
    public UnitValidResponse createUnitValidResponse() {
        return new UnitValidResponse();
    }

    /**
     * Create an instance of {@link UnitValid }
     * 
     */
    public UnitValid createUnitValid() {
        return new UnitValid();
    }

    /**
     * Create an instance of {@link UserAllowedMethodsResponse.Response }
     * 
     */
    public UserAllowedMethodsResponse.Response createUserAllowedMethodsResponseResponse() {
        return new UserAllowedMethodsResponse.Response();
    }

    /**
     * Create an instance of {@link UserAllowedMethodsResponse.Response.Person }
     * 
     */
    public UserAllowedMethodsResponse.Response.Person createUserAllowedMethodsResponseResponsePerson() {
        return new UserAllowedMethodsResponse.Response.Person();
    }

    /**
     * Create an instance of {@link UserAllowedMethodsResponse.Response.Person.OrgQuery }
     * 
     */
    public UserAllowedMethodsResponse.Response.Person.OrgQuery createUserAllowedMethodsResponseResponsePersonOrgQuery() {
        return new UserAllowedMethodsResponse.Response.Person.OrgQuery();
    }

    /**
     * Create an instance of {@link LoadClassificationResponse.Response }
     * 
     */
    public LoadClassificationResponse.Response createLoadClassificationResponseResponse() {
        return new LoadClassificationResponse.Response();
    }

    /**
     * Create an instance of {@link Title }
     * 
     */
    public Title createTitle() {
        return new Title();
    }

    /**
     * Create an instance of {@link Notes }
     * 
     */
    public Notes createNotes() {
        return new Notes();
    }

    /**
     * Create an instance of {@link Technotes }
     * 
     */
    public Technotes createTechnotes() {
        return new Technotes();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link ListMethodsResponse.Response }
     * 
     */
    public ListMethodsResponse.Response createListMethodsResponseResponse() {
        return new ListMethodsResponse.Response();
    }

    /**
     * Create an instance of {@link LoadClassification.Request }
     * 
     */
    public LoadClassification.Request createLoadClassificationRequest() {
        return new LoadClassification.Request();
    }

    /**
     * Create an instance of {@link LoadClassificationResponse.Request }
     * 
     */
    public LoadClassificationResponse.Request createLoadClassificationResponseRequest() {
        return new LoadClassificationResponse.Request();
    }

    /**
     * Create an instance of {@link UserAllowedMethods.Request }
     * 
     */
    public UserAllowedMethods.Request createUserAllowedMethodsRequest() {
        return new UserAllowedMethods.Request();
    }

    /**
     * Create an instance of {@link UserAllowedMethodsResponse.Request }
     * 
     */
    public UserAllowedMethodsResponse.Request createUserAllowedMethodsResponseRequest() {
        return new UserAllowedMethodsResponse.Request();
    }

    /**
     * Create an instance of {@link Hdrstd }
     * 
     */
    public Hdrstd createHdrstd() {
        return new Hdrstd();
    }

    /**
     * Create an instance of {@link LegacyResponse }
     * 
     */
    public LegacyResponse createLegacyResponse() {
        return new LegacyResponse();
    }

    /**
     * Create an instance of {@link InvalidInput }
     * 
     */
    public InvalidInput createInvalidInput() {
        return new InvalidInput();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link UnitRepresentResponse.Request }
     * 
     */
    public UnitRepresentResponse.Request createUnitRepresentResponseRequest() {
        return new UnitRepresentResponse.Request();
    }

    /**
     * Create an instance of {@link UnitRepresentResponse.Response.Item }
     * 
     */
    public UnitRepresentResponse.Response.Item createUnitRepresentResponseResponseItem() {
        return new UnitRepresentResponse.Response.Item();
    }

    /**
     * Create an instance of {@link UnitRepresent.Request }
     * 
     */
    public UnitRepresent.Request createUnitRepresentRequest() {
        return new UnitRepresent.Request();
    }

    /**
     * Create an instance of {@link UnitValidResponse.Request }
     * 
     */
    public UnitValidResponse.Request createUnitValidResponseRequest() {
        return new UnitValidResponse.Request();
    }

    /**
     * Create an instance of {@link UnitValidResponse.Response }
     * 
     */
    public UnitValidResponse.Response createUnitValidResponseResponse() {
        return new UnitValidResponse.Response();
    }

    /**
     * Create an instance of {@link UnitValid.Request }
     * 
     */
    public UnitValid.Request createUnitValidRequest() {
        return new UnitValid.Request();
    }

    /**
     * Create an instance of {@link UserAllowedMethodsResponse.Response.Person.OrgQuery.Query }
     * 
     */
    public UserAllowedMethodsResponse.Response.Person.OrgQuery.Query createUserAllowedMethodsResponseResponsePersonOrgQueryQuery() {
        return new UserAllowedMethodsResponse.Response.Person.OrgQuery.Query();
    }

    /**
     * Create an instance of {@link LoadClassificationResponse.Response.ClassificationNames }
     * 
     */
    public LoadClassificationResponse.Response.ClassificationNames createLoadClassificationResponseResponseClassificationNames() {
        return new LoadClassificationResponse.Response.ClassificationNames();
    }

    /**
     * Create an instance of {@link LoadClassificationResponse.Response.Classifications }
     * 
     */
    public LoadClassificationResponse.Response.Classifications createLoadClassificationResponseResponseClassifications() {
        return new LoadClassificationResponse.Response.Classifications();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/x-road.xsd", name = "consumer")
    public JAXBElement<String> createConsumer(String value) {
        return new JAXBElement<String>(_Consumer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/x-road.xsd", name = "producer")
    public JAXBElement<String> createProducer(String value) {
        return new JAXBElement<String>(_Producer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/x-road.xsd", name = "userId")
    public JAXBElement<String> createUserId(String value) {
        return new JAXBElement<String>(_UserId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/x-road.xsd", name = "id")
    public JAXBElement<String> createId(String value) {
        return new JAXBElement<String>(_Id_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/x-road.xsd", name = "service")
    public JAXBElement<String> createService(String value) {
        return new JAXBElement<String>(_Service_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/x-road.xsd", name = "issue")
    public JAXBElement<String> createIssue(String value) {
        return new JAXBElement<String>(_Issue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/x-road.xsd", name = "unit")
    public JAXBElement<String> createUnit(String value) {
        return new JAXBElement<String>(_Unit_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/x-road.xsd", name = "position")
    public JAXBElement<String> createPosition(String value) {
        return new JAXBElement<String>(_Position_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/x-road.xsd", name = "authenticator")
    public JAXBElement<String> createAuthenticator(String value) {
        return new JAXBElement<String>(_Authenticator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/x-road.xsd", name = "userName")
    public JAXBElement<String> createUserName(String value) {
        return new JAXBElement<String>(_UserName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/x-road.xsd", name = "async")
    public JAXBElement<Boolean> createAsync(Boolean value) {
        return new JAXBElement<Boolean>(_Async_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/x-road.xsd", name = "encode")
    public JAXBElement<String> createEncode(String value) {
        return new JAXBElement<String>(_Encode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/x-road.xsd", name = "ref")
    public JAXBElement<String> createRef(String value) {
        return new JAXBElement<String>(_Ref_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/x-road.xsd", name = "wildcard")
    public JAXBElement<String> createWildcard(String value) {
        return new JAXBElement<String>(_Wildcard_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/x-road.xsd", name = "version")
    public JAXBElement<String> createVersion(String value) {
        return new JAXBElement<String>(_Version_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/x-road.xsd", name = "nocontent")
    public JAXBElement<String> createNocontent(String value) {
        return new JAXBElement<String>(_Nocontent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/x-road.xsd", name = "requirecontent")
    public JAXBElement<String> createRequirecontent(String value) {
        return new JAXBElement<String>(_Requirecontent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/x-road.xsd", name = "listMethods")
    public JAXBElement<Object> createListMethods(Object value) {
        return new JAXBElement<Object>(_ListMethods_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/x-road.xsd", name = "testSystem")
    public JAXBElement<Object> createTestSystem(Object value) {
        return new JAXBElement<Object>(_TestSystem_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/x-road.xsd", name = "testSystemResponse")
    public JAXBElement<Object> createTestSystemResponse(Object value) {
        return new JAXBElement<Object>(_TestSystemResponse_QNAME, Object.class, null, value);
    }

}
