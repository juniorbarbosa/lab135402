
package br.univel.wsclient.entrega;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de operacaoEntregaResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="operacaoEntregaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultadoEntrega" type="{http://webservice.univel.br/}entrega" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operacaoEntregaResponse", propOrder = {
    "resultadoEntrega"
})
public class OperacaoEntregaResponse {

    protected Entrega resultadoEntrega;

    /**
     * Obtém o valor da propriedade resultadoEntrega.
     * 
     * @return
     *     possible object is
     *     {@link Entrega }
     *     
     */
    public Entrega getResultadoEntrega() {
        return resultadoEntrega;
    }

    /**
     * Define o valor da propriedade resultadoEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link Entrega }
     *     
     */
    public void setResultadoEntrega(Entrega value) {
        this.resultadoEntrega = value;
    }

}
