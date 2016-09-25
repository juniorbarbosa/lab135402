
package br.univel.wsclient.entrega;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.univel.wsclient.entrega package. 
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

    private final static QName _ServletException_QNAME = new QName("http://webservice.univel.br/", "ServletException");
    private final static QName _OperacaoEntregaResponse_QNAME = new QName("http://webservice.univel.br/", "operacaoEntregaResponse");
    private final static QName _OperacaoEntrega_QNAME = new QName("http://webservice.univel.br/", "operacaoEntrega");
    private final static QName _IOException_QNAME = new QName("http://webservice.univel.br/", "IOException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.univel.wsclient.entrega
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServletException }
     * 
     */
    public ServletException createServletException() {
        return new ServletException();
    }

    /**
     * Create an instance of {@link OperacaoEntrega }
     * 
     */
    public OperacaoEntrega createOperacaoEntrega() {
        return new OperacaoEntrega();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link OperacaoEntregaResponse }
     * 
     */
    public OperacaoEntregaResponse createOperacaoEntregaResponse() {
        return new OperacaoEntregaResponse();
    }

    /**
     * Create an instance of {@link Venda }
     * 
     */
    public Venda createVenda() {
        return new Venda();
    }

    /**
     * Create an instance of {@link Entrega }
     * 
     */
    public Entrega createEntrega() {
        return new Entrega();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServletException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.univel.br/", name = "ServletException")
    public JAXBElement<ServletException> createServletException(ServletException value) {
        return new JAXBElement<ServletException>(_ServletException_QNAME, ServletException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacaoEntregaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.univel.br/", name = "operacaoEntregaResponse")
    public JAXBElement<OperacaoEntregaResponse> createOperacaoEntregaResponse(OperacaoEntregaResponse value) {
        return new JAXBElement<OperacaoEntregaResponse>(_OperacaoEntregaResponse_QNAME, OperacaoEntregaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacaoEntrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.univel.br/", name = "operacaoEntrega")
    public JAXBElement<OperacaoEntrega> createOperacaoEntrega(OperacaoEntrega value) {
        return new JAXBElement<OperacaoEntrega>(_OperacaoEntrega_QNAME, OperacaoEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.univel.br/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

}
