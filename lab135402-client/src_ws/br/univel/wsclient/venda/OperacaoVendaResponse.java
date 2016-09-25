
package br.univel.wsclient.venda;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de operacaoVendaResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="operacaoVendaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultadoVenda" type="{http://webservice.univel.br/}venda" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operacaoVendaResponse", propOrder = {
    "resultadoVenda"
})
public class OperacaoVendaResponse {

    protected Venda resultadoVenda;

    /**
     * Obtém o valor da propriedade resultadoVenda.
     * 
     * @return
     *     possible object is
     *     {@link Venda }
     *     
     */
    public Venda getResultadoVenda() {
        return resultadoVenda;
    }

    /**
     * Define o valor da propriedade resultadoVenda.
     * 
     * @param value
     *     allowed object is
     *     {@link Venda }
     *     
     */
    public void setResultadoVenda(Venda value) {
        this.resultadoVenda = value;
    }

}
