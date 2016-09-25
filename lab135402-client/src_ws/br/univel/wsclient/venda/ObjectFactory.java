
package br.univel.wsclient.venda;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.univel.wsclient.venda package. 
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

    private final static QName _OperacaoVenda_QNAME = new QName("http://webservice.univel.br/", "operacaoVenda");
    private final static QName _ServletException_QNAME = new QName("http://webservice.univel.br/", "ServletException");
    private final static QName _OperacaoVendaResponse_QNAME = new QName("http://webservice.univel.br/", "operacaoVendaResponse");
    private final static QName _IOException_QNAME = new QName("http://webservice.univel.br/", "IOException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.univel.wsclient.venda
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
     * Create an instance of {@link OperacaoVenda }
     * 
     */
    public OperacaoVenda createOperacaoVenda() {
        return new OperacaoVenda();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link OperacaoVendaResponse }
     * 
     */
    public OperacaoVendaResponse createOperacaoVendaResponse() {
        return new OperacaoVendaResponse();
    }

    /**
     * Create an instance of {@link Venda }
     * 
     */
    public Venda createVenda() {
        return new Venda();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacaoVenda }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.univel.br/", name = "operacaoVenda")
    public JAXBElement<OperacaoVenda> createOperacaoVenda(OperacaoVenda value) {
        return new JAXBElement<OperacaoVenda>(_OperacaoVenda_QNAME, OperacaoVenda.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacaoVendaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.univel.br/", name = "operacaoVendaResponse")
    public JAXBElement<OperacaoVendaResponse> createOperacaoVendaResponse(OperacaoVendaResponse value) {
        return new JAXBElement<OperacaoVendaResponse>(_OperacaoVendaResponse_QNAME, OperacaoVendaResponse.class, null, value);
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
