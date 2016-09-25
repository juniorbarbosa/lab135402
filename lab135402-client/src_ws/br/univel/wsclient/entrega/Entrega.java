
package br.univel.wsclient.entrega;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de entrega complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="entrega">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idEntrega" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="venda" type="{http://webservice.univel.br/}venda" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entrega", propOrder = {
    "endereco",
    "idEntrega",
    "venda"
})
public class Entrega {

    protected String endereco;
    protected int idEntrega;
    protected Venda venda;

    /**
     * Obt�m o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndereco(String value) {
        this.endereco = value;
    }

    /**
     * Obt�m o valor da propriedade idEntrega.
     * 
     */
    public int getIdEntrega() {
        return idEntrega;
    }

    /**
     * Define o valor da propriedade idEntrega.
     * 
     */
    public void setIdEntrega(int value) {
        this.idEntrega = value;
    }

    /**
     * Obt�m o valor da propriedade venda.
     * 
     * @return
     *     possible object is
     *     {@link Venda }
     *     
     */
    public Venda getVenda() {
        return venda;
    }

    /**
     * Define o valor da propriedade venda.
     * 
     * @param value
     *     allowed object is
     *     {@link Venda }
     *     
     */
    public void setVenda(Venda value) {
        this.venda = value;
    }

}
