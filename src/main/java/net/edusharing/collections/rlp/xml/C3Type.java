//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.23 at 07:25:27 PM CEST 
//


package net.edusharing.collections.rlp.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for c3type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="c3type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://bsbb.eu}stringtype"/>
 *         &lt;element name="title" type="{http://bsbb.eu}stringtype"/>
 *         &lt;element name="vortext" type="{http://bsbb.eu}textcontent"/>
 *         &lt;element name="themainhalt" type="{http://bsbb.eu}themainhalttype" maxOccurs="30"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "c3type", propOrder = {
    "id",
    "title",
    "vortext",
    "themainhalt"
})
public class C3Type {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected Textcontent vortext;
    @XmlElement(required = true)
    protected List<Themainhalttype> themainhalt;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the vortext property.
     * 
     * @return
     *     possible object is
     *     {@link Textcontent }
     *     
     */
    public Textcontent getVortext() {
        return vortext;
    }

    /**
     * Sets the value of the vortext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Textcontent }
     *     
     */
    public void setVortext(Textcontent value) {
        this.vortext = value;
    }

    /**
     * Gets the value of the themainhalt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the themainhalt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThemainhalt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Themainhalttype }
     * 
     * 
     */
    public List<Themainhalttype> getThemainhalt() {
        if (themainhalt == null) {
            themainhalt = new ArrayList<Themainhalttype>();
        }
        return this.themainhalt;
    }

}
