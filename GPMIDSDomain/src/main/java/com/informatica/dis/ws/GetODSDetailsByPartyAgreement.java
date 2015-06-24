
package com.informatica.dis.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ROWID_OBJECT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AGMT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rowidobject",
    "agmtid"
})
@XmlRootElement(name = "Get_ODSDetails_by_Party_Agreement")
public class GetODSDetailsByPartyAgreement {

    @XmlElement(name = "ROWID_OBJECT", required = true)
    protected String rowidobject;
    @XmlElement(name = "AGMT_ID", required = true)
    protected String agmtid;

    /**
     * Gets the value of the rowidobject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROWIDOBJECT() {
        return rowidobject;
    }

    /**
     * Sets the value of the rowidobject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROWIDOBJECT(String value) {
        this.rowidobject = value;
    }

    /**
     * Gets the value of the agmtid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGMTID() {
        return agmtid;
    }

    /**
     * Sets the value of the agmtid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGMTID(String value) {
        this.agmtid = value;
    }

}
