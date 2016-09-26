
package br.univel.wsclient.crudproduto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de listaProdutoResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="listaProdutoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="retornoListaProduto" type="{http://webservice.univel.br/}produto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaProdutoResponse", propOrder = {
    "retornoListaProduto"
})
public class ListaProdutoResponse {

    protected List<Produto> retornoListaProduto;

    /**
     * Gets the value of the retornoListaProduto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retornoListaProduto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetornoListaProduto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Produto }
     * 
     * 
     */
    public List<Produto> getRetornoListaProduto() {
        if (retornoListaProduto == null) {
            retornoListaProduto = new ArrayList<Produto>();
        }
        return this.retornoListaProduto;
    }

}
