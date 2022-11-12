
package cibertec;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cibertec package. 
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

    private final static QName _GetInformacion_QNAME = new QName("http://cibertec/", "getInformacion");
    private final static QName _GetInformacionResponse_QNAME = new QName("http://cibertec/", "getInformacionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cibertec
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetInformacion }
     * 
     */
    public GetInformacion createGetInformacion() {
        return new GetInformacion();
    }

    /**
     * Create an instance of {@link GetInformacionResponse }
     * 
     */
    public GetInformacionResponse createGetInformacionResponse() {
        return new GetInformacionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInformacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetInformacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://cibertec/", name = "getInformacion")
    public JAXBElement<GetInformacion> createGetInformacion(GetInformacion value) {
        return new JAXBElement<GetInformacion>(_GetInformacion_QNAME, GetInformacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInformacionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetInformacionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cibertec/", name = "getInformacionResponse")
    public JAXBElement<GetInformacionResponse> createGetInformacionResponse(GetInformacionResponse value) {
        return new JAXBElement<GetInformacionResponse>(_GetInformacionResponse_QNAME, GetInformacionResponse.class, null, value);
    }

}
