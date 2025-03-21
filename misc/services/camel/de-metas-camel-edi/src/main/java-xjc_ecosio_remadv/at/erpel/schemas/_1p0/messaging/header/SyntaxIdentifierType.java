
package at.erpel.schemas._1p0.messaging.header;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SyntaxIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyntaxIdentifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="versionNum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceCodeListDirVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codedCharacterEncoding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="releaseNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyntaxIdentifierType", propOrder = {
    "id",
    "versionNum",
    "serviceCodeListDirVersion",
    "codedCharacterEncoding",
    "releaseNum"
})
public class SyntaxIdentifierType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String versionNum;
    protected String serviceCodeListDirVersion;
    protected String codedCharacterEncoding;
    protected String releaseNum;

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
     * Gets the value of the versionNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionNum() {
        return versionNum;
    }

    /**
     * Sets the value of the versionNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionNum(String value) {
        this.versionNum = value;
    }

    /**
     * Gets the value of the serviceCodeListDirVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCodeListDirVersion() {
        return serviceCodeListDirVersion;
    }

    /**
     * Sets the value of the serviceCodeListDirVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCodeListDirVersion(String value) {
        this.serviceCodeListDirVersion = value;
    }

    /**
     * Gets the value of the codedCharacterEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodedCharacterEncoding() {
        return codedCharacterEncoding;
    }

    /**
     * Sets the value of the codedCharacterEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodedCharacterEncoding(String value) {
        this.codedCharacterEncoding = value;
    }

    /**
     * Gets the value of the releaseNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseNum() {
        return releaseNum;
    }

    /**
     * Sets the value of the releaseNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseNum(String value) {
        this.releaseNum = value;
    }

}
