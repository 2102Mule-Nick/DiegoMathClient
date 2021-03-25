
package com.revature.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.revature.ws package. 
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

    private final static QName _DoAddition_QNAME = new QName("http://ws.revature.com/", "doAddition");
    private final static QName _DoAdditionResponse_QNAME = new QName("http://ws.revature.com/", "doAdditionResponse");
    private final static QName _DoDivision_QNAME = new QName("http://ws.revature.com/", "doDivision");
    private final static QName _DoDivisionResponse_QNAME = new QName("http://ws.revature.com/", "doDivisionResponse");
    private final static QName _DoModulo_QNAME = new QName("http://ws.revature.com/", "doModulo");
    private final static QName _DoModuloResponse_QNAME = new QName("http://ws.revature.com/", "doModuloResponse");
    private final static QName _DoMultiplication_QNAME = new QName("http://ws.revature.com/", "doMultiplication");
    private final static QName _DoMultiplicationResponse_QNAME = new QName("http://ws.revature.com/", "doMultiplicationResponse");
    private final static QName _DoSubtraction_QNAME = new QName("http://ws.revature.com/", "doSubtraction");
    private final static QName _DoSubtractionResponse_QNAME = new QName("http://ws.revature.com/", "doSubtractionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.revature.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoAddition }
     * 
     */
    public DoAddition createDoAddition() {
        return new DoAddition();
    }

    /**
     * Create an instance of {@link DoAdditionResponse }
     * 
     */
    public DoAdditionResponse createDoAdditionResponse() {
        return new DoAdditionResponse();
    }

    /**
     * Create an instance of {@link DoDivision }
     * 
     */
    public DoDivision createDoDivision() {
        return new DoDivision();
    }

    /**
     * Create an instance of {@link DoDivisionResponse }
     * 
     */
    public DoDivisionResponse createDoDivisionResponse() {
        return new DoDivisionResponse();
    }

    /**
     * Create an instance of {@link DoModulo }
     * 
     */
    public DoModulo createDoModulo() {
        return new DoModulo();
    }

    /**
     * Create an instance of {@link DoModuloResponse }
     * 
     */
    public DoModuloResponse createDoModuloResponse() {
        return new DoModuloResponse();
    }

    /**
     * Create an instance of {@link DoMultiplication }
     * 
     */
    public DoMultiplication createDoMultiplication() {
        return new DoMultiplication();
    }

    /**
     * Create an instance of {@link DoMultiplicationResponse }
     * 
     */
    public DoMultiplicationResponse createDoMultiplicationResponse() {
        return new DoMultiplicationResponse();
    }

    /**
     * Create an instance of {@link DoSubtraction }
     * 
     */
    public DoSubtraction createDoSubtraction() {
        return new DoSubtraction();
    }

    /**
     * Create an instance of {@link DoSubtractionResponse }
     * 
     */
    public DoSubtractionResponse createDoSubtractionResponse() {
        return new DoSubtractionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoAddition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DoAddition }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "doAddition")
    public JAXBElement<DoAddition> createDoAddition(DoAddition value) {
        return new JAXBElement<DoAddition>(_DoAddition_QNAME, DoAddition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoAdditionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DoAdditionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "doAdditionResponse")
    public JAXBElement<DoAdditionResponse> createDoAdditionResponse(DoAdditionResponse value) {
        return new JAXBElement<DoAdditionResponse>(_DoAdditionResponse_QNAME, DoAdditionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoDivision }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DoDivision }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "doDivision")
    public JAXBElement<DoDivision> createDoDivision(DoDivision value) {
        return new JAXBElement<DoDivision>(_DoDivision_QNAME, DoDivision.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoDivisionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DoDivisionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "doDivisionResponse")
    public JAXBElement<DoDivisionResponse> createDoDivisionResponse(DoDivisionResponse value) {
        return new JAXBElement<DoDivisionResponse>(_DoDivisionResponse_QNAME, DoDivisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoModulo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DoModulo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "doModulo")
    public JAXBElement<DoModulo> createDoModulo(DoModulo value) {
        return new JAXBElement<DoModulo>(_DoModulo_QNAME, DoModulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoModuloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DoModuloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "doModuloResponse")
    public JAXBElement<DoModuloResponse> createDoModuloResponse(DoModuloResponse value) {
        return new JAXBElement<DoModuloResponse>(_DoModuloResponse_QNAME, DoModuloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoMultiplication }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DoMultiplication }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "doMultiplication")
    public JAXBElement<DoMultiplication> createDoMultiplication(DoMultiplication value) {
        return new JAXBElement<DoMultiplication>(_DoMultiplication_QNAME, DoMultiplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoMultiplicationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DoMultiplicationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "doMultiplicationResponse")
    public JAXBElement<DoMultiplicationResponse> createDoMultiplicationResponse(DoMultiplicationResponse value) {
        return new JAXBElement<DoMultiplicationResponse>(_DoMultiplicationResponse_QNAME, DoMultiplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoSubtraction }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DoSubtraction }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "doSubtraction")
    public JAXBElement<DoSubtraction> createDoSubtraction(DoSubtraction value) {
        return new JAXBElement<DoSubtraction>(_DoSubtraction_QNAME, DoSubtraction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoSubtractionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DoSubtractionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "doSubtractionResponse")
    public JAXBElement<DoSubtractionResponse> createDoSubtractionResponse(DoSubtractionResponse value) {
        return new JAXBElement<DoSubtractionResponse>(_DoSubtractionResponse_QNAME, DoSubtractionResponse.class, null, value);
    }

}
