//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.21 at 04:03:14 PM EDT 
//


package com.metlife.gpm.services.partymessages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.metlife.gpm.services.partydata.Party;
import com.metlife.gpm.services.partydata.PartyCore;
import com.metlife.gpm.services.partydata.PartyLogical;


/**
 * <p>Java class for PartyInquiryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyInquiryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartyBase" type="{services.gpm.metlife.com/PartyData}Party" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartyCore" type="{services.gpm.metlife.com/PartyData}PartyCore" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartyLogical" type="{services.gpm.metlife.com/PartyData}PartyLogical" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyInquiryResponse", propOrder = {
    "partyBase",
    "partyCore",
    "partyLogical"
})
public class PartyInquiryResponse {

    @XmlElement(name = "PartyBase")
    protected List<Party> partyBase;
    @XmlElement(name = "PartyCore")
    protected List<PartyCore> partyCore;
    @XmlElement(name = "PartyLogical")
    protected List<PartyLogical> partyLogical;

    /**
     * Gets the value of the partyBase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyBase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyBase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party }
     * 
     * 
     */
    public List<Party> getPartyBase() {
        if (partyBase == null) {
            partyBase = new ArrayList<Party>();
        }
        return this.partyBase;
    }

    /**
     * Gets the value of the partyCore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyCore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyCore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyCore }
     * 
     * 
     */
    public List<PartyCore> getPartyCore() {
        if (partyCore == null) {
            partyCore = new ArrayList<PartyCore>();
        }
        return this.partyCore;
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
