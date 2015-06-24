
package com.informatica.dis.ws.gpm_ods_message;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.informatica.dis.ws.gpm_ods_data.PartyLogical;


/**
 * <p>Java class for Get_Start4_RecordResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Get_Start4_RecordResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ROWID_OBJECT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PartyLogical" type="{http://www.informatica.com/dis/ws/GPM_ODS_Data}PartyLogical" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Get_Start4_RecordResponse", propOrder = {
    "rowidobject",
    "partyLogical"
})
public class GetStart4RecordResponse {

    @XmlElement(name = "ROWID_OBJECT", required = true)
    protected String rowidobject;
    @XmlElement(name = "PartyLogical")
    protected List<PartyLogical> partyLogical;

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
     * Gets the value of the partyLogical property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyLogical property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyLogical().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyLogical }
     * 
     * 
     */
    public List<PartyLogical> getPartyLogical() {
        if (partyLogical == null) {
            partyLogical = new ArrayList<PartyLogical>();
        }
        return this.partyLogical;
    }

}
