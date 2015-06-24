
package com.informatica.dis.ws;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Party">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ROWID_OBJECT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SOURCE_SYSTEMS" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SOURCE_SYSTEM" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PARTY_INVST_HLDS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PARTY_INVST_HLD" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PARTY_INVST_HLD_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                       &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="CUR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="CUR_INVST_HLD_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="INVST_HLD_TYP_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="HLD_IN_YR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                       &lt;element name="HLD_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PARTY_ACKS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PARTY_ACK" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PARTY_ACK_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                       &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ACK_VER_NUM" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                       &lt;element name="ACK_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="ACK_ELCT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="ACK_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ACK_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ACK_CNTXT_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ACK_PARM_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ACK_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="ACK_PARM_VAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PARTY_RISKS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PARTY_RISK" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PARTY_RISK_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                       &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="RISK_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="RISK_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="RISK_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="RISK_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="RISK_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="RISK_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="RISK_VAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PARTY_ADRS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PARTY_ADR" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ADR_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NBRHD_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FIPS_CNTY_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FIPS_CNTY_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="DSF_DLV_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="DSF_DLV_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="CMRA_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="VND_DLV_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="VND_DLV_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="VCNT_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="SESN_ADR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="SESN_ADR_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="LOC_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="DSF_DROP_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FIPS_CNTRY_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FIPS_CNTRY_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="VND_ADR_TYP_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="VND_ADR_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PST_CARY_RTE_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PST_CARY_RTE_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="HHLD_OWN_ADR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ZIP_DLV_PT_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ZIP_CD_CHK_DGT_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="LOC_EMPE_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                       &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PARTY_AGRES" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PARTY_AGRE" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AGRE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PROD_GRP_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PROD_GRP_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PROD_GRP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PROD_TYP_ABBR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PROD_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PROD_PLN_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PROD_PLN_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PROD_PLN_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PROD_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PROD_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PROD_DTL_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="LOW_LVL_PROD_CVR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="CVR_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="DRV_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                       &lt;element name="VEH_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                       &lt;element name="DPND_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                       &lt;element name="BSCL_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="OPTL_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="HIPPA_REL_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="DSBRS_RMN_YR_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                       &lt;element name="ERL_WD_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="STRT_4_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="CNTRC_CLS_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="INVST_RISK_TLRN_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="INVST_RISK_TLRN_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="INVST_OBJ_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="INVST_OBJ_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="RGST_TYP_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="RGST_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="XPR_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PARTY_INCMS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PARTY_INCM" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PARTY_INCM_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                       &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="CUR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="INCM_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="INCM_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="INCM_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="INCM_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="INCM_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="INCM_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="INCM_VAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PARTY_ORGS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PARTY_ORG" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ORG_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                       &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="EMPE_CNT_RNG_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FRTN_500_RNK_NUM" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                       &lt;element name="MET_CUST_IN_YR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                       &lt;element name="SMALL_BUS_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="WMN_OWN_BUS_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="GLB_ULT_BUS_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="GLB_ULT_BUS_ST_ABBR_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="GLB_ULT_PRNT_CNTRY_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="CLNT_STTS_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="CLNT_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="BUS_JRSDICT_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="LOC_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                       &lt;element name="EMPE_CLASS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="IND_CLASS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="NM_APL_BY_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PLC_OF_ORIG_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PARTY_PERS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PARTY_PER" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PER_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                       &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FIN_REG_ASSOC_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ESERVICE_PRFL_EDIT_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="EMP_IN_YR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                       &lt;element name="MET_EMP_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="DIR_OFC_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="OVR_18_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="AGE_IN_YR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                       &lt;element name="AGE_RNG_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="EMP_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="TAX_BRKT_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="TAX_BRKT_PCT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="OCC_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="OCC_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="OCC_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="OCC_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="OCC_STRT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="OCC_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="BNR_LST_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="LST_BNR_MAIL_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="LST_SUIT_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="MED_COND_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="NM_APL_BY_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PLC_OF_ORIG_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PARTY_EXPS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PARTY_EXP" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PARTY_EXP_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                       &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="CUR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="EXP_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="EXP_FREQ_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="EXP_TMFRAM_IN_YR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                       &lt;element name="EXP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="EXP_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PARTY_FIN_PROPS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PARTY_FIN_PROP" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PARTY_FIN_PROP_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                       &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FIN_PROP_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="FIN_PROP_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FIN_PROP_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FIN_PROP_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FIN_PROP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FIN_PROP_STOP_DT_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FIN_PROP_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="FIN_PROP_VAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PARTY_SRV_LVLS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PARTY_SRV_LVLS" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PARTY_SRV_LVL_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                       &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="SRV_LVL_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="SRV_LVL_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="SRV_LVL_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="SRV_LVL_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="SRV_LVL_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="SRV_LVL_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="SRV_LVL_VAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PARTY_AGRGTS_MSS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PARTY_AGRGTS_MS" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PARTY_AGRGT_MS_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                       &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="AGRGT_MS_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="AGRGT_MS_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="AGRGT_MS_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="AGRGT_MS_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="AGRGT_MS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="AGRGT_MS_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="AGRGT_MS_VAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "party"
})
@XmlRootElement(name = "Get_ODSDetails_by_Party_Rowid_ObjectResponse")
public class GetODSDetailsByPartyRowidObjectResponse {

    @XmlElement(name = "Party", required = true)
    protected GetODSDetailsByPartyRowidObjectResponse.Party party;

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link GetODSDetailsByPartyRowidObjectResponse.Party }
     *     
     */
    public GetODSDetailsByPartyRowidObjectResponse.Party getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetODSDetailsByPartyRowidObjectResponse.Party }
     *     
     */
    public void setParty(GetODSDetailsByPartyRowidObjectResponse.Party value) {
        this.party = value;
    }


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
     *         &lt;element name="SOURCE_SYSTEMS" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SOURCE_SYSTEM" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PARTY_INVST_HLDS" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PARTY_INVST_HLD" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PARTY_INVST_HLD_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                             &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="CUR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="CUR_INVST_HLD_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="INVST_HLD_TYP_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="HLD_IN_YR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                             &lt;element name="HLD_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PARTY_ACKS" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PARTY_ACK" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PARTY_ACK_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                             &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ACK_VER_NUM" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                             &lt;element name="ACK_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="ACK_ELCT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="ACK_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ACK_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ACK_CNTXT_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ACK_PARM_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ACK_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="ACK_PARM_VAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PARTY_RISKS" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PARTY_RISK" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PARTY_RISK_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                             &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="RISK_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="RISK_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="RISK_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="RISK_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="RISK_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="RISK_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="RISK_VAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PARTY_ADRS" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PARTY_ADR" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ADR_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NBRHD_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FIPS_CNTY_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FIPS_CNTY_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="DSF_DLV_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="DSF_DLV_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="CMRA_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="VND_DLV_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="VND_DLV_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="VCNT_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="SESN_ADR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="SESN_ADR_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="LOC_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="DSF_DROP_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FIPS_CNTRY_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FIPS_CNTRY_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="VND_ADR_TYP_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="VND_ADR_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PST_CARY_RTE_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PST_CARY_RTE_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="HHLD_OWN_ADR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ZIP_DLV_PT_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ZIP_CD_CHK_DGT_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="LOC_EMPE_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                             &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PARTY_AGRES" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PARTY_AGRE" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AGRE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PROD_GRP_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PROD_GRP_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PROD_GRP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PROD_TYP_ABBR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PROD_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PROD_PLN_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PROD_PLN_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PROD_PLN_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PROD_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PROD_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PROD_DTL_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="LOW_LVL_PROD_CVR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="CVR_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="DRV_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                             &lt;element name="VEH_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                             &lt;element name="DPND_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                             &lt;element name="BSCL_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="OPTL_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="HIPPA_REL_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="DSBRS_RMN_YR_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                             &lt;element name="ERL_WD_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="STRT_4_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="CNTRC_CLS_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="INVST_RISK_TLRN_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="INVST_RISK_TLRN_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="INVST_OBJ_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="INVST_OBJ_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="RGST_TYP_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="RGST_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="XPR_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PARTY_INCMS" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PARTY_INCM" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PARTY_INCM_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                             &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="CUR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="INCM_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="INCM_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="INCM_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="INCM_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="INCM_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="INCM_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="INCM_VAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PARTY_ORGS" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PARTY_ORG" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ORG_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                             &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="EMPE_CNT_RNG_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FRTN_500_RNK_NUM" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                             &lt;element name="MET_CUST_IN_YR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                             &lt;element name="SMALL_BUS_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="WMN_OWN_BUS_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="GLB_ULT_BUS_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="GLB_ULT_BUS_ST_ABBR_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="GLB_ULT_PRNT_CNTRY_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="CLNT_STTS_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="CLNT_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="BUS_JRSDICT_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="LOC_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                             &lt;element name="EMPE_CLASS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="IND_CLASS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="NM_APL_BY_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PLC_OF_ORIG_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PARTY_PERS" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PARTY_PER" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PER_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                             &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FIN_REG_ASSOC_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ESERVICE_PRFL_EDIT_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="EMP_IN_YR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                             &lt;element name="MET_EMP_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="DIR_OFC_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="OVR_18_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="AGE_IN_YR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                             &lt;element name="AGE_RNG_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="EMP_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="TAX_BRKT_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="TAX_BRKT_PCT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="OCC_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="OCC_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="OCC_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="OCC_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="OCC_STRT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="OCC_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="BNR_LST_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="LST_BNR_MAIL_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="LST_SUIT_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="MED_COND_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="NM_APL_BY_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PLC_OF_ORIG_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PARTY_EXPS" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PARTY_EXP" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PARTY_EXP_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                             &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="CUR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="EXP_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="EXP_FREQ_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="EXP_TMFRAM_IN_YR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                             &lt;element name="EXP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="EXP_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PARTY_FIN_PROPS" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PARTY_FIN_PROP" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PARTY_FIN_PROP_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                             &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FIN_PROP_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="FIN_PROP_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FIN_PROP_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FIN_PROP_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FIN_PROP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FIN_PROP_STOP_DT_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FIN_PROP_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="FIN_PROP_VAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PARTY_SRV_LVLS" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PARTY_SRV_LVLS" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PARTY_SRV_LVL_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                             &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="SRV_LVL_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="SRV_LVL_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="SRV_LVL_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="SRV_LVL_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="SRV_LVL_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="SRV_LVL_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="SRV_LVL_VAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PARTY_AGRGTS_MSS" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PARTY_AGRGTS_MS" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PARTY_AGRGT_MS_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                             &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="AGRGT_MS_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="AGRGT_MS_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="AGRGT_MS_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="AGRGT_MS_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="AGRGT_MS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="AGRGT_MS_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="AGRGT_MS_VAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "sourcesystems",
        "partyinvsthlds",
        "partyacks",
        "partyrisks",
        "partyadrs",
        "partyagres",
        "partyincms",
        "partyorgs",
        "partypers",
        "partyexps",
        "partyfinprops",
        "partysrvlvls",
        "partyagrgtsmss"
    })
    public static class Party {

        @XmlElement(name = "ROWID_OBJECT", required = true)
        protected String rowidobject;
        @XmlElement(name = "SOURCE_SYSTEMS", required = true)
        protected List<GetODSDetailsByPartyRowidObjectResponse.Party.SOURCESYSTEMS> sourcesystems;
        @XmlElement(name = "PARTY_INVST_HLDS")
        protected GetODSDetailsByPartyRowidObjectResponse.Party.PARTYINVSTHLDS partyinvsthlds;
        @XmlElement(name = "PARTY_ACKS")
        protected GetODSDetailsByPartyRowidObjectResponse.Party.PARTYACKS partyacks;
        @XmlElement(name = "PARTY_RISKS")
        protected GetODSDetailsByPartyRowidObjectResponse.Party.PARTYRISKS partyrisks;
        @XmlElement(name = "PARTY_ADRS")
        protected GetODSDetailsByPartyRowidObjectResponse.Party.PARTYADRS partyadrs;
        @XmlElement(name = "PARTY_AGRES")
        protected GetODSDetailsByPartyRowidObjectResponse.Party.PARTYAGRES partyagres;
        @XmlElement(name = "PARTY_INCMS")
        protected GetODSDetailsByPartyRowidObjectResponse.Party.PARTYINCMS partyincms;
        @XmlElement(name = "PARTY_ORGS")
        protected GetODSDetailsByPartyRowidObjectResponse.Party.PARTYORGS partyorgs;
        @XmlElement(name = "PARTY_PERS")
        protected GetODSDetailsByPartyRowidObjectResponse.Party.PARTYPERS partypers;
        @XmlElement(name = "PARTY_EXPS")
        protected GetODSDetailsByPartyRowidObjectResponse.Party.PARTYEXPS partyexps;
        @XmlElement(name = "PARTY_FIN_PROPS")
        protected GetODSDetailsByPartyRowidObjectResponse.Party.PARTYFINPROPS partyfinprops;
        @XmlElement(name = "PARTY_SRV_LVLS")
        protected GetODSDetailsByPartyRowidObjectResponse.Party.PARTYSRVLVLSS partysrvlvls;
        @XmlElement(name = "PARTY_AGRGTS_MSS")
        protected GetODSDetailsByPartyRowidObjectResponse.Party.PARTYAGRGTSMSS partyagrgtsmss;

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
         * Gets the value of the sourcesystems property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sourcesystems property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSOURCESYSTEMS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetODSDetailsByPartyRowidObjectResponse.Party.SOURCESYSTEMS }
         * 
         * 
         */
        public List<GetODSDetailsByPartyRowidObjectResponse.Party.SOURCESYSTEMS> getSOURCESYSTEMS() {
            if (sourcesystems == null) {
                sourcesystems = new ArrayList<GetODSDetailsByPartyRowidObjectResponse.Party.SOURCESYSTEMS>();
            }
            return this.sourcesystems;
        }

        /**
         * Gets the value of the partyinvsthlds property.
         * 
         * @return
         *     possible object is
         *     {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYINVSTHLDS }
         *     
         */
        public GetODSDetailsByPartyRowidObjectResponse.Party.PARTYINVSTHLDS getPARTYINVSTHLDS() {
            return partyinvsthlds;
        }

        /**
         * Sets the value of the partyinvsthlds property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYINVSTHLDS }
         *     
         */
        public void setPARTYINVSTHLDS(GetODSDetailsByPartyRowidObjectResponse.Party.PARTYINVSTHLDS value) {
            this.partyinvsthlds = value;
        }

        /**
         * Gets the value of the partyacks property.
         * 
         * @return
         *     possible object is
         *     {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYACKS }
         *     
         */
        public GetODSDetailsByPartyRowidObjectResponse.Party.PARTYACKS getPARTYACKS() {
            return partyacks;
        }

        /**
         * Sets the value of the partyacks property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYACKS }
         *     
         */
        public void setPARTYACKS(GetODSDetailsByPartyRowidObjectResponse.Party.PARTYACKS value) {
            this.partyacks = value;
        }

        /**
         * Gets the value of the partyrisks property.
         * 
         * @return
         *     possible object is
         *     {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYRISKS }
         *     
         */
        public GetODSDetailsByPartyRowidObjectResponse.Party.PARTYRISKS getPARTYRISKS() {
            return partyrisks;
        }

        /**
         * Sets the value of the partyrisks property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYRISKS }
         *     
         */
        public void setPARTYRISKS(GetODSDetailsByPartyRowidObjectResponse.Party.PARTYRISKS value) {
            this.partyrisks = value;
        }

        /**
         * Gets the value of the partyadrs property.
         * 
         * @return
         *     possible object is
         *     {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYADRS }
         *     
         */
        public GetODSDetailsByPartyRowidObjectResponse.Party.PARTYADRS getPARTYADRS() {
            return partyadrs;
        }

        /**
         * Sets the value of the partyadrs property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYADRS }
         *     
         */
        public void setPARTYADRS(GetODSDetailsByPartyRowidObjectResponse.Party.PARTYADRS value) {
            this.partyadrs = value;
        }

        /**
         * Gets the value of the partyagres property.
         * 
         * @return
         *     possible object is
         *     {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYAGRES }
         *     
         */
        public GetODSDetailsByPartyRowidObjectResponse.Party.PARTYAGRES getPARTYAGRES() {
            return partyagres;
        }

        /**
         * Sets the value of the partyagres property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYAGRES }
         *     
         */
        public void setPARTYAGRES(GetODSDetailsByPartyRowidObjectResponse.Party.PARTYAGRES value) {
            this.partyagres = value;
        }

        /**
         * Gets the value of the partyincms property.
         * 
         * @return
         *     possible object is
         *     {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYINCMS }
         *     
         */
        public GetODSDetailsByPartyRowidObjectResponse.Party.PARTYINCMS getPARTYINCMS() {
            return partyincms;
        }

        /**
         * Sets the value of the partyincms property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYINCMS }
         *     
         */
        public void setPARTYINCMS(GetODSDetailsByPartyRowidObjectResponse.Party.PARTYINCMS value) {
            this.partyincms = value;
        }

        /**
         * Gets the value of the partyorgs property.
         * 
         * @return
         *     possible object is
         *     {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYORGS }
         *     
         */
        public GetODSDetailsByPartyRowidObjectResponse.Party.PARTYORGS getPARTYORGS() {
            return partyorgs;
        }

        /**
         * Sets the value of the partyorgs property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYORGS }
         *     
         */
        public void setPARTYORGS(GetODSDetailsByPartyRowidObjectResponse.Party.PARTYORGS value) {
            this.partyorgs = value;
        }

        /**
         * Gets the value of the partypers property.
         * 
         * @return
         *     possible object is
         *     {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYPERS }
         *     
         */
        public GetODSDetailsByPartyRowidObjectResponse.Party.PARTYPERS getPARTYPERS() {
            return partypers;
        }

        /**
         * Sets the value of the partypers property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYPERS }
         *     
         */
        public void setPARTYPERS(GetODSDetailsByPartyRowidObjectResponse.Party.PARTYPERS value) {
            this.partypers = value;
        }

        /**
         * Gets the value of the partyexps property.
         * 
         * @return
         *     possible object is
         *     {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYEXPS }
         *     
         */
        public GetODSDetailsByPartyRowidObjectResponse.Party.PARTYEXPS getPARTYEXPS() {
            return partyexps;
        }

        /**
         * Sets the value of the partyexps property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYEXPS }
         *     
         */
        public void setPARTYEXPS(GetODSDetailsByPartyRowidObjectResponse.Party.PARTYEXPS value) {
            this.partyexps = value;
        }

        /**
         * Gets the value of the partyfinprops property.
         * 
         * @return
         *     possible object is
         *     {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYFINPROPS }
         *     
         */
        public GetODSDetailsByPartyRowidObjectResponse.Party.PARTYFINPROPS getPARTYFINPROPS() {
            return partyfinprops;
        }

        /**
         * Sets the value of the partyfinprops property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYFINPROPS }
         *     
         */
        public void setPARTYFINPROPS(GetODSDetailsByPartyRowidObjectResponse.Party.PARTYFINPROPS value) {
            this.partyfinprops = value;
        }

        /**
         * Gets the value of the partysrvlvls property.
         * 
         * @return
         *     possible object is
         *     {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYSRVLVLSS }
         *     
         */
        public GetODSDetailsByPartyRowidObjectResponse.Party.PARTYSRVLVLSS getPARTYSRVLVLS() {
            return partysrvlvls;
        }

        /**
         * Sets the value of the partysrvlvls property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYSRVLVLSS }
         *     
         */
        public void setPARTYSRVLVLS(GetODSDetailsByPartyRowidObjectResponse.Party.PARTYSRVLVLSS value) {
            this.partysrvlvls = value;
        }

        /**
         * Gets the value of the partyagrgtsmss property.
         * 
         * @return
         *     possible object is
         *     {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYAGRGTSMSS }
         *     
         */
        public GetODSDetailsByPartyRowidObjectResponse.Party.PARTYAGRGTSMSS getPARTYAGRGTSMSS() {
            return partyagrgtsmss;
        }

        /**
         * Sets the value of the partyagrgtsmss property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYAGRGTSMSS }
         *     
         */
        public void setPARTYAGRGTSMSS(GetODSDetailsByPartyRowidObjectResponse.Party.PARTYAGRGTSMSS value) {
            this.partyagrgtsmss = value;
        }


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
         *         &lt;element name="PARTY_ACK" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PARTY_ACK_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                   &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ACK_VER_NUM" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                   &lt;element name="ACK_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="ACK_ELCT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="ACK_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ACK_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ACK_CNTXT_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ACK_PARM_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ACK_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="ACK_PARM_VAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "partyack"
        })
        public static class PARTYACKS {

            @XmlElement(name = "PARTY_ACK")
            protected List<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYACKS.PARTYACK> partyack;

            /**
             * Gets the value of the partyack property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the partyack property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPARTYACK().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYACKS.PARTYACK }
             * 
             * 
             */
            public List<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYACKS.PARTYACK> getPARTYACK() {
                if (partyack == null) {
                    partyack = new ArrayList<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYACKS.PARTYACK>();
                }
                return this.partyack;
            }


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
             *         &lt;element name="PARTY_ACK_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *         &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ACK_VER_NUM" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *         &lt;element name="ACK_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="ACK_ELCT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="ACK_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ACK_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ACK_CNTXT_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ACK_PARM_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ACK_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="ACK_PARM_VAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "partyackid",
                "srcsystem",
                "partyid",
                "burstrecnum",
                "ackvernum",
                "ackeffdt",
                "ackelctdt",
                "acksttsdscr",
                "acktypdscr",
                "ackcntxtdscr",
                "ackparmnm",
                "ackstopdt",
                "ackparmval",
                "lstupdtdt",
                "lstupdtusrid",
                "hubstateind",
                "originsrcsys"
            })
            public static class PARTYACK {

                @XmlElement(name = "PARTY_ACK_ID")
                protected Long partyackid;
                @XmlElement(name = "SRC_SYSTEM")
                protected String srcsystem;
                @XmlElement(name = "PARTY_ID")
                protected String partyid;
                @XmlElement(name = "BURST_REC_NUM", required = true, nillable = true)
                protected String burstrecnum;
                @XmlElement(name = "ACK_VER_NUM")
                protected BigInteger ackvernum;
                @XmlElement(name = "ACK_EFF_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar ackeffdt;
                @XmlElement(name = "ACK_ELCT_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar ackelctdt;
                @XmlElement(name = "ACK_STTS_DSCR", required = true, nillable = true)
                protected String acksttsdscr;
                @XmlElement(name = "ACK_TYP_DSCR", required = true, nillable = true)
                protected String acktypdscr;
                @XmlElement(name = "ACK_CNTXT_DSCR", required = true, nillable = true)
                protected String ackcntxtdscr;
                @XmlElement(name = "ACK_PARM_NM", required = true, nillable = true)
                protected String ackparmnm;
                @XmlElement(name = "ACK_STOP_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar ackstopdt;
                @XmlElement(name = "ACK_PARM_VAL", required = true, nillable = true)
                protected String ackparmval;
                @XmlElement(name = "LST_UPDT_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar lstupdtdt;
                @XmlElement(name = "LST_UPDT_USR_ID", required = true, nillable = true)
                protected String lstupdtusrid;
                @XmlElement(name = "HUB_STATE_IND")
                protected BigDecimal hubstateind;
                @XmlElement(name = "ORIGIN_SRC_SYS", required = true, nillable = true)
                protected String originsrcsys;

                /**
                 * Gets the value of the partyackid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                public Long getPARTYACKID() {
                    return partyackid;
                }

                /**
                 * Sets the value of the partyackid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                public void setPARTYACKID(Long value) {
                    this.partyackid = value;
                }

                /**
                 * Gets the value of the srcsystem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSRCSYSTEM() {
                    return srcsystem;
                }

                /**
                 * Sets the value of the srcsystem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSRCSYSTEM(String value) {
                    this.srcsystem = value;
                }

                /**
                 * Gets the value of the partyid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPARTYID() {
                    return partyid;
                }

                /**
                 * Sets the value of the partyid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPARTYID(String value) {
                    this.partyid = value;
                }

                /**
                 * Gets the value of the burstrecnum property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBURSTRECNUM() {
                    return burstrecnum;
                }

                /**
                 * Sets the value of the burstrecnum property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBURSTRECNUM(String value) {
                    this.burstrecnum = value;
                }

                /**
                 * Gets the value of the ackvernum property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getACKVERNUM() {
                    return ackvernum;
                }

                /**
                 * Sets the value of the ackvernum property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setACKVERNUM(BigInteger value) {
                    this.ackvernum = value;
                }

                /**
                 * Gets the value of the ackeffdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getACKEFFDT() {
                    return ackeffdt;
                }

                /**
                 * Sets the value of the ackeffdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setACKEFFDT(XMLGregorianCalendar value) {
                    this.ackeffdt = value;
                }

                /**
                 * Gets the value of the ackelctdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getACKELCTDT() {
                    return ackelctdt;
                }

                /**
                 * Sets the value of the ackelctdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setACKELCTDT(XMLGregorianCalendar value) {
                    this.ackelctdt = value;
                }

                /**
                 * Gets the value of the acksttsdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getACKSTTSDSCR() {
                    return acksttsdscr;
                }

                /**
                 * Sets the value of the acksttsdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setACKSTTSDSCR(String value) {
                    this.acksttsdscr = value;
                }

                /**
                 * Gets the value of the acktypdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getACKTYPDSCR() {
                    return acktypdscr;
                }

                /**
                 * Sets the value of the acktypdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setACKTYPDSCR(String value) {
                    this.acktypdscr = value;
                }

                /**
                 * Gets the value of the ackcntxtdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getACKCNTXTDSCR() {
                    return ackcntxtdscr;
                }

                /**
                 * Sets the value of the ackcntxtdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setACKCNTXTDSCR(String value) {
                    this.ackcntxtdscr = value;
                }

                /**
                 * Gets the value of the ackparmnm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getACKPARMNM() {
                    return ackparmnm;
                }

                /**
                 * Sets the value of the ackparmnm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setACKPARMNM(String value) {
                    this.ackparmnm = value;
                }

                /**
                 * Gets the value of the ackstopdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getACKSTOPDT() {
                    return ackstopdt;
                }

                /**
                 * Sets the value of the ackstopdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setACKSTOPDT(XMLGregorianCalendar value) {
                    this.ackstopdt = value;
                }

                /**
                 * Gets the value of the ackparmval property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getACKPARMVAL() {
                    return ackparmval;
                }

                /**
                 * Sets the value of the ackparmval property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setACKPARMVAL(String value) {
                    this.ackparmval = value;
                }

                /**
                 * Gets the value of the lstupdtdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getLSTUPDTDT() {
                    return lstupdtdt;
                }

                /**
                 * Sets the value of the lstupdtdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setLSTUPDTDT(XMLGregorianCalendar value) {
                    this.lstupdtdt = value;
                }

                /**
                 * Gets the value of the lstupdtusrid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLSTUPDTUSRID() {
                    return lstupdtusrid;
                }

                /**
                 * Sets the value of the lstupdtusrid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLSTUPDTUSRID(String value) {
                    this.lstupdtusrid = value;
                }

                /**
                 * Gets the value of the hubstateind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getHUBSTATEIND() {
                    return hubstateind;
                }

                /**
                 * Sets the value of the hubstateind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setHUBSTATEIND(BigDecimal value) {
                    this.hubstateind = value;
                }

                /**
                 * Gets the value of the originsrcsys property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getORIGINSRCSYS() {
                    return originsrcsys;
                }

                /**
                 * Sets the value of the originsrcsys property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setORIGINSRCSYS(String value) {
                    this.originsrcsys = value;
                }

            }

        }


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
         *         &lt;element name="PARTY_ADR" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ADR_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NBRHD_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FIPS_CNTY_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FIPS_CNTY_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="DSF_DLV_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="DSF_DLV_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="CMRA_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="VND_DLV_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="VND_DLV_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="VCNT_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="SESN_ADR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="SESN_ADR_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="LOC_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="DSF_DROP_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FIPS_CNTRY_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FIPS_CNTRY_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="VND_ADR_TYP_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="VND_ADR_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PST_CARY_RTE_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PST_CARY_RTE_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="HHLD_OWN_ADR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ZIP_DLV_PT_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ZIP_CD_CHK_DGT_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="LOC_EMPE_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                   &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "partyadr"
        })
        public static class PARTYADRS {

            @XmlElement(name = "PARTY_ADR")
            protected List<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYADRS.PARTYADR> partyadr;

            /**
             * Gets the value of the partyadr property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the partyadr property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPARTYADR().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYADRS.PARTYADR }
             * 
             * 
             */
            public List<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYADRS.PARTYADR> getPARTYADR() {
                if (partyadr == null) {
                    partyadr = new ArrayList<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYADRS.PARTYADR>();
                }
                return this.partyadr;
            }


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
             *         &lt;element name="ADR_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NBRHD_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FIPS_CNTY_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FIPS_CNTY_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="DSF_DLV_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="DSF_DLV_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="CMRA_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="VND_DLV_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="VND_DLV_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="VCNT_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="SESN_ADR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="SESN_ADR_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="LOC_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="DSF_DROP_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FIPS_CNTRY_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FIPS_CNTRY_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="VND_ADR_TYP_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="VND_ADR_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PST_CARY_RTE_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PST_CARY_RTE_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="HHLD_OWN_ADR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ZIP_DLV_PT_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ZIP_CD_CHK_DGT_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="LOC_EMPE_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *         &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "adrid",
                "srcsystem",
                "partyid",
                "burstrecnum",
                "nbrhdnm",
                "fipscntycd",
                "fipscntynm",
                "dsfdlvcd",
                "dsfdlvdscr",
                "cmraind",
                "vnddlvcd",
                "vnddlvdscr",
                "vcntind",
                "sesnadrcd",
                "sesnadrdscr",
                "locsttsdscr",
                "dsfdropcd",
                "fipscntrycd",
                "fipscntrynm",
                "vndadrtypcd",
                "vndadrtypdscr",
                "pstcaryrtecd",
                "pstcaryrtedscr",
                "hhldownadrid",
                "zipdlvptcd",
                "zipcdchkdgtcd",
                "locempecnt",
                "lstupdtdt",
                "lstupdtusrid",
                "hubstateind",
                "originsrcsys"
            })
            public static class PARTYADR {

                @XmlElement(name = "ADR_ID")
                protected String adrid;
                @XmlElement(name = "SRC_SYSTEM")
                protected String srcsystem;
                @XmlElement(name = "PARTY_ID")
                protected String partyid;
                @XmlElement(name = "BURST_REC_NUM", required = true, nillable = true)
                protected String burstrecnum;
                @XmlElement(name = "NBRHD_NM", required = true, nillable = true)
                protected String nbrhdnm;
                @XmlElement(name = "FIPS_CNTY_CD", required = true, nillable = true)
                protected String fipscntycd;
                @XmlElement(name = "FIPS_CNTY_NM", required = true, nillable = true)
                protected String fipscntynm;
                @XmlElement(name = "DSF_DLV_CD", required = true, nillable = true)
                protected String dsfdlvcd;
                @XmlElement(name = "DSF_DLV_DSCR", required = true, nillable = true)
                protected String dsfdlvdscr;
                @XmlElement(name = "CMRA_IND", required = true, nillable = true)
                protected String cmraind;
                @XmlElement(name = "VND_DLV_CD", required = true, nillable = true)
                protected String vnddlvcd;
                @XmlElement(name = "VND_DLV_DSCR", required = true, nillable = true)
                protected String vnddlvdscr;
                @XmlElement(name = "VCNT_IND", required = true, nillable = true)
                protected String vcntind;
                @XmlElement(name = "SESN_ADR_CD", required = true, nillable = true)
                protected String sesnadrcd;
                @XmlElement(name = "SESN_ADR_DSCR", required = true, nillable = true)
                protected String sesnadrdscr;
                @XmlElement(name = "LOC_STTS_DSCR", required = true, nillable = true)
                protected String locsttsdscr;
                @XmlElement(name = "DSF_DROP_CD", required = true, nillable = true)
                protected String dsfdropcd;
                @XmlElement(name = "FIPS_CNTRY_CD", required = true, nillable = true)
                protected String fipscntrycd;
                @XmlElement(name = "FIPS_CNTRY_NM", required = true, nillable = true)
                protected String fipscntrynm;
                @XmlElement(name = "VND_ADR_TYP_CD", required = true, nillable = true)
                protected String vndadrtypcd;
                @XmlElement(name = "VND_ADR_TYP_DSCR", required = true, nillable = true)
                protected String vndadrtypdscr;
                @XmlElement(name = "PST_CARY_RTE_CD", required = true, nillable = true)
                protected String pstcaryrtecd;
                @XmlElement(name = "PST_CARY_RTE_DSCR", required = true, nillable = true)
                protected String pstcaryrtedscr;
                @XmlElement(name = "HHLD_OWN_ADR_ID", required = true, nillable = true)
                protected String hhldownadrid;
                @XmlElement(name = "ZIP_DLV_PT_CD", required = true, nillable = true)
                protected String zipdlvptcd;
                @XmlElement(name = "ZIP_CD_CHK_DGT_CD", required = true, nillable = true)
                protected String zipcdchkdgtcd;
                @XmlElement(name = "LOC_EMPE_CNT")
                protected BigInteger locempecnt;
                @XmlElement(name = "LST_UPDT_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar lstupdtdt;
                @XmlElement(name = "LST_UPDT_USR_ID", required = true, nillable = true)
                protected String lstupdtusrid;
                @XmlElement(name = "HUB_STATE_IND")
                protected BigDecimal hubstateind;
                @XmlElement(name = "ORIGIN_SRC_SYS", required = true, nillable = true)
                protected String originsrcsys;

                /**
                 * Gets the value of the adrid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getADRID() {
                    return adrid;
                }

                /**
                 * Sets the value of the adrid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setADRID(String value) {
                    this.adrid = value;
                }

                /**
                 * Gets the value of the srcsystem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSRCSYSTEM() {
                    return srcsystem;
                }

                /**
                 * Sets the value of the srcsystem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSRCSYSTEM(String value) {
                    this.srcsystem = value;
                }

                /**
                 * Gets the value of the partyid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPARTYID() {
                    return partyid;
                }

                /**
                 * Sets the value of the partyid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPARTYID(String value) {
                    this.partyid = value;
                }

                /**
                 * Gets the value of the burstrecnum property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBURSTRECNUM() {
                    return burstrecnum;
                }

                /**
                 * Sets the value of the burstrecnum property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBURSTRECNUM(String value) {
                    this.burstrecnum = value;
                }

                /**
                 * Gets the value of the nbrhdnm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNBRHDNM() {
                    return nbrhdnm;
                }

                /**
                 * Sets the value of the nbrhdnm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNBRHDNM(String value) {
                    this.nbrhdnm = value;
                }

                /**
                 * Gets the value of the fipscntycd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFIPSCNTYCD() {
                    return fipscntycd;
                }

                /**
                 * Sets the value of the fipscntycd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFIPSCNTYCD(String value) {
                    this.fipscntycd = value;
                }

                /**
                 * Gets the value of the fipscntynm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFIPSCNTYNM() {
                    return fipscntynm;
                }

                /**
                 * Sets the value of the fipscntynm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFIPSCNTYNM(String value) {
                    this.fipscntynm = value;
                }

                /**
                 * Gets the value of the dsfdlvcd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDSFDLVCD() {
                    return dsfdlvcd;
                }

                /**
                 * Sets the value of the dsfdlvcd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDSFDLVCD(String value) {
                    this.dsfdlvcd = value;
                }

                /**
                 * Gets the value of the dsfdlvdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDSFDLVDSCR() {
                    return dsfdlvdscr;
                }

                /**
                 * Sets the value of the dsfdlvdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDSFDLVDSCR(String value) {
                    this.dsfdlvdscr = value;
                }

                /**
                 * Gets the value of the cmraind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCMRAIND() {
                    return cmraind;
                }

                /**
                 * Sets the value of the cmraind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCMRAIND(String value) {
                    this.cmraind = value;
                }

                /**
                 * Gets the value of the vnddlvcd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVNDDLVCD() {
                    return vnddlvcd;
                }

                /**
                 * Sets the value of the vnddlvcd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVNDDLVCD(String value) {
                    this.vnddlvcd = value;
                }

                /**
                 * Gets the value of the vnddlvdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVNDDLVDSCR() {
                    return vnddlvdscr;
                }

                /**
                 * Sets the value of the vnddlvdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVNDDLVDSCR(String value) {
                    this.vnddlvdscr = value;
                }

                /**
                 * Gets the value of the vcntind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVCNTIND() {
                    return vcntind;
                }

                /**
                 * Sets the value of the vcntind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVCNTIND(String value) {
                    this.vcntind = value;
                }

                /**
                 * Gets the value of the sesnadrcd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSESNADRCD() {
                    return sesnadrcd;
                }

                /**
                 * Sets the value of the sesnadrcd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSESNADRCD(String value) {
                    this.sesnadrcd = value;
                }

                /**
                 * Gets the value of the sesnadrdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSESNADRDSCR() {
                    return sesnadrdscr;
                }

                /**
                 * Sets the value of the sesnadrdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSESNADRDSCR(String value) {
                    this.sesnadrdscr = value;
                }

                /**
                 * Gets the value of the locsttsdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLOCSTTSDSCR() {
                    return locsttsdscr;
                }

                /**
                 * Sets the value of the locsttsdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLOCSTTSDSCR(String value) {
                    this.locsttsdscr = value;
                }

                /**
                 * Gets the value of the dsfdropcd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDSFDROPCD() {
                    return dsfdropcd;
                }

                /**
                 * Sets the value of the dsfdropcd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDSFDROPCD(String value) {
                    this.dsfdropcd = value;
                }

                /**
                 * Gets the value of the fipscntrycd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFIPSCNTRYCD() {
                    return fipscntrycd;
                }

                /**
                 * Sets the value of the fipscntrycd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFIPSCNTRYCD(String value) {
                    this.fipscntrycd = value;
                }

                /**
                 * Gets the value of the fipscntrynm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFIPSCNTRYNM() {
                    return fipscntrynm;
                }

                /**
                 * Sets the value of the fipscntrynm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFIPSCNTRYNM(String value) {
                    this.fipscntrynm = value;
                }

                /**
                 * Gets the value of the vndadrtypcd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVNDADRTYPCD() {
                    return vndadrtypcd;
                }

                /**
                 * Sets the value of the vndadrtypcd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVNDADRTYPCD(String value) {
                    this.vndadrtypcd = value;
                }

                /**
                 * Gets the value of the vndadrtypdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVNDADRTYPDSCR() {
                    return vndadrtypdscr;
                }

                /**
                 * Sets the value of the vndadrtypdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVNDADRTYPDSCR(String value) {
                    this.vndadrtypdscr = value;
                }

                /**
                 * Gets the value of the pstcaryrtecd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPSTCARYRTECD() {
                    return pstcaryrtecd;
                }

                /**
                 * Sets the value of the pstcaryrtecd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPSTCARYRTECD(String value) {
                    this.pstcaryrtecd = value;
                }

                /**
                 * Gets the value of the pstcaryrtedscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPSTCARYRTEDSCR() {
                    return pstcaryrtedscr;
                }

                /**
                 * Sets the value of the pstcaryrtedscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPSTCARYRTEDSCR(String value) {
                    this.pstcaryrtedscr = value;
                }

                /**
                 * Gets the value of the hhldownadrid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHHLDOWNADRID() {
                    return hhldownadrid;
                }

                /**
                 * Sets the value of the hhldownadrid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHHLDOWNADRID(String value) {
                    this.hhldownadrid = value;
                }

                /**
                 * Gets the value of the zipdlvptcd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getZIPDLVPTCD() {
                    return zipdlvptcd;
                }

                /**
                 * Sets the value of the zipdlvptcd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setZIPDLVPTCD(String value) {
                    this.zipdlvptcd = value;
                }

                /**
                 * Gets the value of the zipcdchkdgtcd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getZIPCDCHKDGTCD() {
                    return zipcdchkdgtcd;
                }

                /**
                 * Sets the value of the zipcdchkdgtcd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setZIPCDCHKDGTCD(String value) {
                    this.zipcdchkdgtcd = value;
                }

                /**
                 * Gets the value of the locempecnt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getLOCEMPECNT() {
                    return locempecnt;
                }

                /**
                 * Sets the value of the locempecnt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setLOCEMPECNT(BigInteger value) {
                    this.locempecnt = value;
                }

                /**
                 * Gets the value of the lstupdtdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getLSTUPDTDT() {
                    return lstupdtdt;
                }

                /**
                 * Sets the value of the lstupdtdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setLSTUPDTDT(XMLGregorianCalendar value) {
                    this.lstupdtdt = value;
                }

                /**
                 * Gets the value of the lstupdtusrid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLSTUPDTUSRID() {
                    return lstupdtusrid;
                }

                /**
                 * Sets the value of the lstupdtusrid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLSTUPDTUSRID(String value) {
                    this.lstupdtusrid = value;
                }

                /**
                 * Gets the value of the hubstateind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getHUBSTATEIND() {
                    return hubstateind;
                }

                /**
                 * Sets the value of the hubstateind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setHUBSTATEIND(BigDecimal value) {
                    this.hubstateind = value;
                }

                /**
                 * Gets the value of the originsrcsys property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getORIGINSRCSYS() {
                    return originsrcsys;
                }

                /**
                 * Sets the value of the originsrcsys property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setORIGINSRCSYS(String value) {
                    this.originsrcsys = value;
                }

            }

        }


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
         *         &lt;element name="PARTY_AGRE" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AGRE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PROD_GRP_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PROD_GRP_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PROD_GRP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PROD_TYP_ABBR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PROD_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PROD_PLN_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PROD_PLN_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PROD_PLN_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PROD_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PROD_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PROD_DTL_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="LOW_LVL_PROD_CVR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="CVR_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="DRV_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                   &lt;element name="VEH_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                   &lt;element name="DPND_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                   &lt;element name="BSCL_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="OPTL_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="HIPPA_REL_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="DSBRS_RMN_YR_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                   &lt;element name="ERL_WD_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="STRT_4_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="CNTRC_CLS_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="INVST_RISK_TLRN_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="INVST_RISK_TLRN_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="INVST_OBJ_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="INVST_OBJ_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="RGST_TYP_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="RGST_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="XPR_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "partyagre"
        })
        public static class PARTYAGRES {

            @XmlElement(name = "PARTY_AGRE")
            protected List<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYAGRES.PARTYAGRE> partyagre;

            /**
             * Gets the value of the partyagre property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the partyagre property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPARTYAGRE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYAGRES.PARTYAGRE }
             * 
             * 
             */
            public List<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYAGRES.PARTYAGRE> getPARTYAGRE() {
                if (partyagre == null) {
                    partyagre = new ArrayList<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYAGRES.PARTYAGRE>();
                }
                return this.partyagre;
            }


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
             *         &lt;element name="AGRE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PROD_GRP_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PROD_GRP_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PROD_GRP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PROD_TYP_ABBR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PROD_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PROD_PLN_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PROD_PLN_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PROD_PLN_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PROD_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PROD_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PROD_DTL_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="LOW_LVL_PROD_CVR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="CVR_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="DRV_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *         &lt;element name="VEH_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *         &lt;element name="DPND_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *         &lt;element name="BSCL_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="OPTL_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="HIPPA_REL_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="DSBRS_RMN_YR_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *         &lt;element name="ERL_WD_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="STRT_4_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="CNTRC_CLS_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="INVST_RISK_TLRN_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="INVST_RISK_TLRN_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="INVST_OBJ_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="INVST_OBJ_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="RGST_TYP_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="RGST_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="XPR_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "agreid",
                "srcsystem",
                "partyid",
                "burstrecnum",
                "prodgrpcd",
                "prodgrpnm",
                "prodgrpdscr",
                "prodtypabbrcd",
                "prodtypdscr",
                "prodplncd",
                "prodplnnm",
                "prodplndscr",
                "prodcd",
                "prodnm",
                "proddtldscr",
                "lowlvlprodcvrcd",
                "cvramt",
                "drvcnt",
                "vehcnt",
                "dpndcnt",
                "bsclind",
                "optlind",
                "hipparelind",
                "dsbrsrmnyrcnt",
                "erlwdind",
                "strt4IND",
                "cntrcclsdt",
                "invstrisktlrndscr",
                "invstrisktlrnnm",
                "invstobjnm",
                "invstobjdscr",
                "rgsttypnm",
                "rgsttypdscr",
                "xprdt",
                "lstupdtdt",
                "lstupdtusrid",
                "hubstateind",
                "originsrcsys"
            })
            public static class PARTYAGRE {

                @XmlElement(name = "AGRE_ID")
                protected String agreid;
                @XmlElement(name = "SRC_SYSTEM")
                protected String srcsystem;
                @XmlElement(name = "PARTY_ID")
                protected String partyid;
                @XmlElement(name = "BURST_REC_NUM", required = true, nillable = true)
                protected String burstrecnum;
                @XmlElement(name = "PROD_GRP_CD", required = true, nillable = true)
                protected String prodgrpcd;
                @XmlElement(name = "PROD_GRP_NM", required = true, nillable = true)
                protected String prodgrpnm;
                @XmlElement(name = "PROD_GRP_DSCR", required = true, nillable = true)
                protected String prodgrpdscr;
                @XmlElement(name = "PROD_TYP_ABBR_CD", required = true, nillable = true)
                protected String prodtypabbrcd;
                @XmlElement(name = "PROD_TYP_DSCR", required = true, nillable = true)
                protected String prodtypdscr;
                @XmlElement(name = "PROD_PLN_CD", required = true, nillable = true)
                protected String prodplncd;
                @XmlElement(name = "PROD_PLN_NM", required = true, nillable = true)
                protected String prodplnnm;
                @XmlElement(name = "PROD_PLN_DSCR", required = true, nillable = true)
                protected String prodplndscr;
                @XmlElement(name = "PROD_CD", required = true, nillable = true)
                protected String prodcd;
                @XmlElement(name = "PROD_NM", required = true, nillable = true)
                protected String prodnm;
                @XmlElement(name = "PROD_DTL_DSCR", required = true, nillable = true)
                protected String proddtldscr;
                @XmlElement(name = "LOW_LVL_PROD_CVR_CD", required = true, nillable = true)
                protected String lowlvlprodcvrcd;
                @XmlElement(name = "CVR_AMT")
                protected BigDecimal cvramt;
                @XmlElement(name = "DRV_CNT")
                protected BigInteger drvcnt;
                @XmlElement(name = "VEH_CNT")
                protected BigInteger vehcnt;
                @XmlElement(name = "DPND_CNT")
                protected BigInteger dpndcnt;
                @XmlElement(name = "BSCL_IND", required = true, nillable = true)
                protected String bsclind;
                @XmlElement(name = "OPTL_IND", required = true, nillable = true)
                protected String optlind;
                @XmlElement(name = "HIPPA_REL_IND", required = true, nillable = true)
                protected String hipparelind;
                @XmlElement(name = "DSBRS_RMN_YR_CNT")
                protected BigInteger dsbrsrmnyrcnt;
                @XmlElement(name = "ERL_WD_IND", required = true, nillable = true)
                protected String erlwdind;
                @XmlElement(name = "STRT_4_IND", required = true, nillable = true)
                protected String strt4IND;
                @XmlElement(name = "CNTRC_CLS_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar cntrcclsdt;
                @XmlElement(name = "INVST_RISK_TLRN_DSCR", required = true, nillable = true)
                protected String invstrisktlrndscr;
                @XmlElement(name = "INVST_RISK_TLRN_NM", required = true, nillable = true)
                protected String invstrisktlrnnm;
                @XmlElement(name = "INVST_OBJ_NM", required = true, nillable = true)
                protected String invstobjnm;
                @XmlElement(name = "INVST_OBJ_DSCR", required = true, nillable = true)
                protected String invstobjdscr;
                @XmlElement(name = "RGST_TYP_NM", required = true, nillable = true)
                protected String rgsttypnm;
                @XmlElement(name = "RGST_TYP_DSCR", required = true, nillable = true)
                protected String rgsttypdscr;
                @XmlElement(name = "XPR_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar xprdt;
                @XmlElement(name = "LST_UPDT_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar lstupdtdt;
                @XmlElement(name = "LST_UPDT_USR_ID", required = true, nillable = true)
                protected String lstupdtusrid;
                @XmlElement(name = "HUB_STATE_IND")
                protected BigDecimal hubstateind;
                @XmlElement(name = "ORIGIN_SRC_SYS", required = true, nillable = true)
                protected String originsrcsys;

                /**
                 * Gets the value of the agreid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAGREID() {
                    return agreid;
                }

                /**
                 * Sets the value of the agreid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAGREID(String value) {
                    this.agreid = value;
                }

                /**
                 * Gets the value of the srcsystem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSRCSYSTEM() {
                    return srcsystem;
                }

                /**
                 * Sets the value of the srcsystem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSRCSYSTEM(String value) {
                    this.srcsystem = value;
                }

                /**
                 * Gets the value of the partyid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPARTYID() {
                    return partyid;
                }

                /**
                 * Sets the value of the partyid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPARTYID(String value) {
                    this.partyid = value;
                }

                /**
                 * Gets the value of the burstrecnum property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBURSTRECNUM() {
                    return burstrecnum;
                }

                /**
                 * Sets the value of the burstrecnum property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBURSTRECNUM(String value) {
                    this.burstrecnum = value;
                }

                /**
                 * Gets the value of the prodgrpcd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPRODGRPCD() {
                    return prodgrpcd;
                }

                /**
                 * Sets the value of the prodgrpcd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPRODGRPCD(String value) {
                    this.prodgrpcd = value;
                }

                /**
                 * Gets the value of the prodgrpnm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPRODGRPNM() {
                    return prodgrpnm;
                }

                /**
                 * Sets the value of the prodgrpnm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPRODGRPNM(String value) {
                    this.prodgrpnm = value;
                }

                /**
                 * Gets the value of the prodgrpdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPRODGRPDSCR() {
                    return prodgrpdscr;
                }

                /**
                 * Sets the value of the prodgrpdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPRODGRPDSCR(String value) {
                    this.prodgrpdscr = value;
                }

                /**
                 * Gets the value of the prodtypabbrcd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPRODTYPABBRCD() {
                    return prodtypabbrcd;
                }

                /**
                 * Sets the value of the prodtypabbrcd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPRODTYPABBRCD(String value) {
                    this.prodtypabbrcd = value;
                }

                /**
                 * Gets the value of the prodtypdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPRODTYPDSCR() {
                    return prodtypdscr;
                }

                /**
                 * Sets the value of the prodtypdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPRODTYPDSCR(String value) {
                    this.prodtypdscr = value;
                }

                /**
                 * Gets the value of the prodplncd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPRODPLNCD() {
                    return prodplncd;
                }

                /**
                 * Sets the value of the prodplncd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPRODPLNCD(String value) {
                    this.prodplncd = value;
                }

                /**
                 * Gets the value of the prodplnnm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPRODPLNNM() {
                    return prodplnnm;
                }

                /**
                 * Sets the value of the prodplnnm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPRODPLNNM(String value) {
                    this.prodplnnm = value;
                }

                /**
                 * Gets the value of the prodplndscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPRODPLNDSCR() {
                    return prodplndscr;
                }

                /**
                 * Sets the value of the prodplndscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPRODPLNDSCR(String value) {
                    this.prodplndscr = value;
                }

                /**
                 * Gets the value of the prodcd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPRODCD() {
                    return prodcd;
                }

                /**
                 * Sets the value of the prodcd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPRODCD(String value) {
                    this.prodcd = value;
                }

                /**
                 * Gets the value of the prodnm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPRODNM() {
                    return prodnm;
                }

                /**
                 * Sets the value of the prodnm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPRODNM(String value) {
                    this.prodnm = value;
                }

                /**
                 * Gets the value of the proddtldscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPRODDTLDSCR() {
                    return proddtldscr;
                }

                /**
                 * Sets the value of the proddtldscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPRODDTLDSCR(String value) {
                    this.proddtldscr = value;
                }

                /**
                 * Gets the value of the lowlvlprodcvrcd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLOWLVLPRODCVRCD() {
                    return lowlvlprodcvrcd;
                }

                /**
                 * Sets the value of the lowlvlprodcvrcd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLOWLVLPRODCVRCD(String value) {
                    this.lowlvlprodcvrcd = value;
                }

                /**
                 * Gets the value of the cvramt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getCVRAMT() {
                    return cvramt;
                }

                /**
                 * Sets the value of the cvramt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setCVRAMT(BigDecimal value) {
                    this.cvramt = value;
                }

                /**
                 * Gets the value of the drvcnt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getDRVCNT() {
                    return drvcnt;
                }

                /**
                 * Sets the value of the drvcnt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setDRVCNT(BigInteger value) {
                    this.drvcnt = value;
                }

                /**
                 * Gets the value of the vehcnt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getVEHCNT() {
                    return vehcnt;
                }

                /**
                 * Sets the value of the vehcnt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setVEHCNT(BigInteger value) {
                    this.vehcnt = value;
                }

                /**
                 * Gets the value of the dpndcnt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getDPNDCNT() {
                    return dpndcnt;
                }

                /**
                 * Sets the value of the dpndcnt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setDPNDCNT(BigInteger value) {
                    this.dpndcnt = value;
                }

                /**
                 * Gets the value of the bsclind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBSCLIND() {
                    return bsclind;
                }

                /**
                 * Sets the value of the bsclind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBSCLIND(String value) {
                    this.bsclind = value;
                }

                /**
                 * Gets the value of the optlind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOPTLIND() {
                    return optlind;
                }

                /**
                 * Sets the value of the optlind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOPTLIND(String value) {
                    this.optlind = value;
                }

                /**
                 * Gets the value of the hipparelind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHIPPARELIND() {
                    return hipparelind;
                }

                /**
                 * Sets the value of the hipparelind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHIPPARELIND(String value) {
                    this.hipparelind = value;
                }

                /**
                 * Gets the value of the dsbrsrmnyrcnt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getDSBRSRMNYRCNT() {
                    return dsbrsrmnyrcnt;
                }

                /**
                 * Sets the value of the dsbrsrmnyrcnt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setDSBRSRMNYRCNT(BigInteger value) {
                    this.dsbrsrmnyrcnt = value;
                }

                /**
                 * Gets the value of the erlwdind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getERLWDIND() {
                    return erlwdind;
                }

                /**
                 * Sets the value of the erlwdind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setERLWDIND(String value) {
                    this.erlwdind = value;
                }

                /**
                 * Gets the value of the strt4IND property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSTRT4IND() {
                    return strt4IND;
                }

                /**
                 * Sets the value of the strt4IND property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSTRT4IND(String value) {
                    this.strt4IND = value;
                }

                /**
                 * Gets the value of the cntrcclsdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getCNTRCCLSDT() {
                    return cntrcclsdt;
                }

                /**
                 * Sets the value of the cntrcclsdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setCNTRCCLSDT(XMLGregorianCalendar value) {
                    this.cntrcclsdt = value;
                }

                /**
                 * Gets the value of the invstrisktlrndscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getINVSTRISKTLRNDSCR() {
                    return invstrisktlrndscr;
                }

                /**
                 * Sets the value of the invstrisktlrndscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setINVSTRISKTLRNDSCR(String value) {
                    this.invstrisktlrndscr = value;
                }

                /**
                 * Gets the value of the invstrisktlrnnm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getINVSTRISKTLRNNM() {
                    return invstrisktlrnnm;
                }

                /**
                 * Sets the value of the invstrisktlrnnm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setINVSTRISKTLRNNM(String value) {
                    this.invstrisktlrnnm = value;
                }

                /**
                 * Gets the value of the invstobjnm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getINVSTOBJNM() {
                    return invstobjnm;
                }

                /**
                 * Sets the value of the invstobjnm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setINVSTOBJNM(String value) {
                    this.invstobjnm = value;
                }

                /**
                 * Gets the value of the invstobjdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getINVSTOBJDSCR() {
                    return invstobjdscr;
                }

                /**
                 * Sets the value of the invstobjdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setINVSTOBJDSCR(String value) {
                    this.invstobjdscr = value;
                }

                /**
                 * Gets the value of the rgsttypnm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRGSTTYPNM() {
                    return rgsttypnm;
                }

                /**
                 * Sets the value of the rgsttypnm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRGSTTYPNM(String value) {
                    this.rgsttypnm = value;
                }

                /**
                 * Gets the value of the rgsttypdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRGSTTYPDSCR() {
                    return rgsttypdscr;
                }

                /**
                 * Sets the value of the rgsttypdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRGSTTYPDSCR(String value) {
                    this.rgsttypdscr = value;
                }

                /**
                 * Gets the value of the xprdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getXPRDT() {
                    return xprdt;
                }

                /**
                 * Sets the value of the xprdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setXPRDT(XMLGregorianCalendar value) {
                    this.xprdt = value;
                }

                /**
                 * Gets the value of the lstupdtdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getLSTUPDTDT() {
                    return lstupdtdt;
                }

                /**
                 * Sets the value of the lstupdtdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setLSTUPDTDT(XMLGregorianCalendar value) {
                    this.lstupdtdt = value;
                }

                /**
                 * Gets the value of the lstupdtusrid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLSTUPDTUSRID() {
                    return lstupdtusrid;
                }

                /**
                 * Sets the value of the lstupdtusrid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLSTUPDTUSRID(String value) {
                    this.lstupdtusrid = value;
                }

                /**
                 * Gets the value of the hubstateind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getHUBSTATEIND() {
                    return hubstateind;
                }

                /**
                 * Sets the value of the hubstateind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setHUBSTATEIND(BigDecimal value) {
                    this.hubstateind = value;
                }

                /**
                 * Gets the value of the originsrcsys property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getORIGINSRCSYS() {
                    return originsrcsys;
                }

                /**
                 * Sets the value of the originsrcsys property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setORIGINSRCSYS(String value) {
                    this.originsrcsys = value;
                }

            }

        }


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
         *         &lt;element name="PARTY_AGRGTS_MS" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PARTY_AGRGT_MS_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                   &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="AGRGT_MS_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="AGRGT_MS_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="AGRGT_MS_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="AGRGT_MS_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="AGRGT_MS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="AGRGT_MS_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="AGRGT_MS_VAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "partyagrgtsms"
        })
        public static class PARTYAGRGTSMSS {

            @XmlElement(name = "PARTY_AGRGTS_MS")
            protected List<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYAGRGTSMSS.PARTYAGRGTSMS> partyagrgtsms;

            /**
             * Gets the value of the partyagrgtsms property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the partyagrgtsms property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPARTYAGRGTSMS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYAGRGTSMSS.PARTYAGRGTSMS }
             * 
             * 
             */
            public List<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYAGRGTSMSS.PARTYAGRGTSMS> getPARTYAGRGTSMS() {
                if (partyagrgtsms == null) {
                    partyagrgtsms = new ArrayList<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYAGRGTSMSS.PARTYAGRGTSMS>();
                }
                return this.partyagrgtsms;
            }


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
             *         &lt;element name="PARTY_AGRGT_MS_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *         &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="AGRGT_MS_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="AGRGT_MS_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="AGRGT_MS_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="AGRGT_MS_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="AGRGT_MS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="AGRGT_MS_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="AGRGT_MS_VAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "partyagrgtmsid",
                "srcsystem",
                "partyid",
                "burstrecnum",
                "agrgtmseffdt",
                "agrgtmssttsdscr",
                "agrgtmstypdscr",
                "agrgtmsnm",
                "agrgtmsdscr",
                "agrgtmsstopdt",
                "agrgtmsval",
                "lstupdtdt",
                "lstupdtusrid",
                "hubstateind",
                "originsrcsys"
            })
            public static class PARTYAGRGTSMS {

                @XmlElement(name = "PARTY_AGRGT_MS_ID")
                protected Long partyagrgtmsid;
                @XmlElement(name = "SRC_SYSTEM")
                protected String srcsystem;
                @XmlElement(name = "PARTY_ID")
                protected String partyid;
                @XmlElement(name = "BURST_REC_NUM", required = true, nillable = true)
                protected String burstrecnum;
                @XmlElement(name = "AGRGT_MS_EFF_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar agrgtmseffdt;
                @XmlElement(name = "AGRGT_MS_STTS_DSCR", required = true, nillable = true)
                protected String agrgtmssttsdscr;
                @XmlElement(name = "AGRGT_MS_TYP_DSCR", required = true, nillable = true)
                protected String agrgtmstypdscr;
                @XmlElement(name = "AGRGT_MS_NM", required = true, nillable = true)
                protected String agrgtmsnm;
                @XmlElement(name = "AGRGT_MS_DSCR", required = true, nillable = true)
                protected String agrgtmsdscr;
                @XmlElement(name = "AGRGT_MS_STOP_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar agrgtmsstopdt;
                @XmlElement(name = "AGRGT_MS_VAL", required = true, nillable = true)
                protected String agrgtmsval;
                @XmlElement(name = "LST_UPDT_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar lstupdtdt;
                @XmlElement(name = "LST_UPDT_USR_ID", required = true, nillable = true)
                protected String lstupdtusrid;
                @XmlElement(name = "HUB_STATE_IND")
                protected BigDecimal hubstateind;
                @XmlElement(name = "ORIGIN_SRC_SYS", required = true, nillable = true)
                protected String originsrcsys;

                /**
                 * Gets the value of the partyagrgtmsid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                public Long getPARTYAGRGTMSID() {
                    return partyagrgtmsid;
                }

                /**
                 * Sets the value of the partyagrgtmsid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                public void setPARTYAGRGTMSID(Long value) {
                    this.partyagrgtmsid = value;
                }

                /**
                 * Gets the value of the srcsystem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSRCSYSTEM() {
                    return srcsystem;
                }

                /**
                 * Sets the value of the srcsystem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSRCSYSTEM(String value) {
                    this.srcsystem = value;
                }

                /**
                 * Gets the value of the partyid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPARTYID() {
                    return partyid;
                }

                /**
                 * Sets the value of the partyid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPARTYID(String value) {
                    this.partyid = value;
                }

                /**
                 * Gets the value of the burstrecnum property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBURSTRECNUM() {
                    return burstrecnum;
                }

                /**
                 * Sets the value of the burstrecnum property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBURSTRECNUM(String value) {
                    this.burstrecnum = value;
                }

                /**
                 * Gets the value of the agrgtmseffdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getAGRGTMSEFFDT() {
                    return agrgtmseffdt;
                }

                /**
                 * Sets the value of the agrgtmseffdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setAGRGTMSEFFDT(XMLGregorianCalendar value) {
                    this.agrgtmseffdt = value;
                }

                /**
                 * Gets the value of the agrgtmssttsdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAGRGTMSSTTSDSCR() {
                    return agrgtmssttsdscr;
                }

                /**
                 * Sets the value of the agrgtmssttsdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAGRGTMSSTTSDSCR(String value) {
                    this.agrgtmssttsdscr = value;
                }

                /**
                 * Gets the value of the agrgtmstypdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAGRGTMSTYPDSCR() {
                    return agrgtmstypdscr;
                }

                /**
                 * Sets the value of the agrgtmstypdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAGRGTMSTYPDSCR(String value) {
                    this.agrgtmstypdscr = value;
                }

                /**
                 * Gets the value of the agrgtmsnm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAGRGTMSNM() {
                    return agrgtmsnm;
                }

                /**
                 * Sets the value of the agrgtmsnm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAGRGTMSNM(String value) {
                    this.agrgtmsnm = value;
                }

                /**
                 * Gets the value of the agrgtmsdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAGRGTMSDSCR() {
                    return agrgtmsdscr;
                }

                /**
                 * Sets the value of the agrgtmsdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAGRGTMSDSCR(String value) {
                    this.agrgtmsdscr = value;
                }

                /**
                 * Gets the value of the agrgtmsstopdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getAGRGTMSSTOPDT() {
                    return agrgtmsstopdt;
                }

                /**
                 * Sets the value of the agrgtmsstopdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setAGRGTMSSTOPDT(XMLGregorianCalendar value) {
                    this.agrgtmsstopdt = value;
                }

                /**
                 * Gets the value of the agrgtmsval property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAGRGTMSVAL() {
                    return agrgtmsval;
                }

                /**
                 * Sets the value of the agrgtmsval property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAGRGTMSVAL(String value) {
                    this.agrgtmsval = value;
                }

                /**
                 * Gets the value of the lstupdtdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getLSTUPDTDT() {
                    return lstupdtdt;
                }

                /**
                 * Sets the value of the lstupdtdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setLSTUPDTDT(XMLGregorianCalendar value) {
                    this.lstupdtdt = value;
                }

                /**
                 * Gets the value of the lstupdtusrid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLSTUPDTUSRID() {
                    return lstupdtusrid;
                }

                /**
                 * Sets the value of the lstupdtusrid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLSTUPDTUSRID(String value) {
                    this.lstupdtusrid = value;
                }

                /**
                 * Gets the value of the hubstateind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getHUBSTATEIND() {
                    return hubstateind;
                }

                /**
                 * Sets the value of the hubstateind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setHUBSTATEIND(BigDecimal value) {
                    this.hubstateind = value;
                }

                /**
                 * Gets the value of the originsrcsys property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getORIGINSRCSYS() {
                    return originsrcsys;
                }

                /**
                 * Sets the value of the originsrcsys property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setORIGINSRCSYS(String value) {
                    this.originsrcsys = value;
                }

            }

        }


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
         *         &lt;element name="PARTY_EXP" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PARTY_EXP_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                   &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="CUR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="EXP_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="EXP_FREQ_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="EXP_TMFRAM_IN_YR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                   &lt;element name="EXP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="EXP_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "partyexp"
        })
        public static class PARTYEXPS {

            @XmlElement(name = "PARTY_EXP")
            protected List<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYEXPS.PARTYEXP> partyexp;

            /**
             * Gets the value of the partyexp property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the partyexp property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPARTYEXP().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYEXPS.PARTYEXP }
             * 
             * 
             */
            public List<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYEXPS.PARTYEXP> getPARTYEXP() {
                if (partyexp == null) {
                    partyexp = new ArrayList<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYEXPS.PARTYEXP>();
                }
                return this.partyexp;
            }


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
             *         &lt;element name="PARTY_EXP_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *         &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="CUR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="EXP_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="EXP_FREQ_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="EXP_TMFRAM_IN_YR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *         &lt;element name="EXP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="EXP_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "partyexpid",
                "srcsystem",
                "partyid",
                "burstrecnum",
                "curcd",
                "exptypdscr",
                "expfreqnm",
                "exptmframinyr",
                "expdscr",
                "expamt",
                "lstupdtdt",
                "lstupdtusrid",
                "hubstateind",
                "originsrcsys"
            })
            public static class PARTYEXP {

                @XmlElement(name = "PARTY_EXP_ID")
                protected Long partyexpid;
                @XmlElement(name = "SRC_SYSTEM")
                protected String srcsystem;
                @XmlElement(name = "PARTY_ID")
                protected String partyid;
                @XmlElement(name = "BURST_REC_NUM", required = true, nillable = true)
                protected String burstrecnum;
                @XmlElement(name = "CUR_CD", required = true, nillable = true)
                protected String curcd;
                @XmlElement(name = "EXP_TYP_DSCR", required = true, nillable = true)
                protected String exptypdscr;
                @XmlElement(name = "EXP_FREQ_NM", required = true, nillable = true)
                protected String expfreqnm;
                @XmlElement(name = "EXP_TMFRAM_IN_YR")
                protected BigInteger exptmframinyr;
                @XmlElement(name = "EXP_DSCR", required = true, nillable = true)
                protected String expdscr;
                @XmlElement(name = "EXP_AMT")
                protected BigDecimal expamt;
                @XmlElement(name = "LST_UPDT_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar lstupdtdt;
                @XmlElement(name = "LST_UPDT_USR_ID", required = true, nillable = true)
                protected String lstupdtusrid;
                @XmlElement(name = "HUB_STATE_IND")
                protected BigDecimal hubstateind;
                @XmlElement(name = "ORIGIN_SRC_SYS", required = true, nillable = true)
                protected String originsrcsys;

                /**
                 * Gets the value of the partyexpid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                public Long getPARTYEXPID() {
                    return partyexpid;
                }

                /**
                 * Sets the value of the partyexpid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                public void setPARTYEXPID(Long value) {
                    this.partyexpid = value;
                }

                /**
                 * Gets the value of the srcsystem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSRCSYSTEM() {
                    return srcsystem;
                }

                /**
                 * Sets the value of the srcsystem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSRCSYSTEM(String value) {
                    this.srcsystem = value;
                }

                /**
                 * Gets the value of the partyid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPARTYID() {
                    return partyid;
                }

                /**
                 * Sets the value of the partyid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPARTYID(String value) {
                    this.partyid = value;
                }

                /**
                 * Gets the value of the burstrecnum property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBURSTRECNUM() {
                    return burstrecnum;
                }

                /**
                 * Sets the value of the burstrecnum property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBURSTRECNUM(String value) {
                    this.burstrecnum = value;
                }

                /**
                 * Gets the value of the curcd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCURCD() {
                    return curcd;
                }

                /**
                 * Sets the value of the curcd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCURCD(String value) {
                    this.curcd = value;
                }

                /**
                 * Gets the value of the exptypdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEXPTYPDSCR() {
                    return exptypdscr;
                }

                /**
                 * Sets the value of the exptypdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEXPTYPDSCR(String value) {
                    this.exptypdscr = value;
                }

                /**
                 * Gets the value of the expfreqnm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEXPFREQNM() {
                    return expfreqnm;
                }

                /**
                 * Sets the value of the expfreqnm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEXPFREQNM(String value) {
                    this.expfreqnm = value;
                }

                /**
                 * Gets the value of the exptmframinyr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getEXPTMFRAMINYR() {
                    return exptmframinyr;
                }

                /**
                 * Sets the value of the exptmframinyr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setEXPTMFRAMINYR(BigInteger value) {
                    this.exptmframinyr = value;
                }

                /**
                 * Gets the value of the expdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEXPDSCR() {
                    return expdscr;
                }

                /**
                 * Sets the value of the expdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEXPDSCR(String value) {
                    this.expdscr = value;
                }

                /**
                 * Gets the value of the expamt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getEXPAMT() {
                    return expamt;
                }

                /**
                 * Sets the value of the expamt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setEXPAMT(BigDecimal value) {
                    this.expamt = value;
                }

                /**
                 * Gets the value of the lstupdtdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getLSTUPDTDT() {
                    return lstupdtdt;
                }

                /**
                 * Sets the value of the lstupdtdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setLSTUPDTDT(XMLGregorianCalendar value) {
                    this.lstupdtdt = value;
                }

                /**
                 * Gets the value of the lstupdtusrid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLSTUPDTUSRID() {
                    return lstupdtusrid;
                }

                /**
                 * Sets the value of the lstupdtusrid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLSTUPDTUSRID(String value) {
                    this.lstupdtusrid = value;
                }

                /**
                 * Gets the value of the hubstateind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getHUBSTATEIND() {
                    return hubstateind;
                }

                /**
                 * Sets the value of the hubstateind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setHUBSTATEIND(BigDecimal value) {
                    this.hubstateind = value;
                }

                /**
                 * Gets the value of the originsrcsys property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getORIGINSRCSYS() {
                    return originsrcsys;
                }

                /**
                 * Sets the value of the originsrcsys property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setORIGINSRCSYS(String value) {
                    this.originsrcsys = value;
                }

            }

        }


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
         *         &lt;element name="PARTY_FIN_PROP" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PARTY_FIN_PROP_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                   &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FIN_PROP_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="FIN_PROP_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FIN_PROP_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FIN_PROP_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FIN_PROP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FIN_PROP_STOP_DT_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FIN_PROP_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="FIN_PROP_VAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "partyfinprop"
        })
        public static class PARTYFINPROPS {

            @XmlElement(name = "PARTY_FIN_PROP")
            protected List<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYFINPROPS.PARTYFINPROP> partyfinprop;

            /**
             * Gets the value of the partyfinprop property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the partyfinprop property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPARTYFINPROP().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYFINPROPS.PARTYFINPROP }
             * 
             * 
             */
            public List<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYFINPROPS.PARTYFINPROP> getPARTYFINPROP() {
                if (partyfinprop == null) {
                    partyfinprop = new ArrayList<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYFINPROPS.PARTYFINPROP>();
                }
                return this.partyfinprop;
            }


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
             *         &lt;element name="PARTY_FIN_PROP_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *         &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FIN_PROP_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="FIN_PROP_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FIN_PROP_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FIN_PROP_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FIN_PROP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FIN_PROP_STOP_DT_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FIN_PROP_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="FIN_PROP_VAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "partyfinpropid",
                "srcsystem",
                "partyid",
                "burstrecnum",
                "finpropeffdt",
                "finpropsttsdscr",
                "finproptypdscr",
                "finpropnm",
                "finpropdscr",
                "finpropstopdttypdscr",
                "finpropstopdt",
                "finpropval",
                "lstupdtdt",
                "lstupdtusrid",
                "hubstateind",
                "originsrcsys"
            })
            public static class PARTYFINPROP {

                @XmlElement(name = "PARTY_FIN_PROP_ID")
                protected Long partyfinpropid;
                @XmlElement(name = "SRC_SYSTEM")
                protected String srcsystem;
                @XmlElement(name = "PARTY_ID")
                protected String partyid;
                @XmlElement(name = "BURST_REC_NUM", required = true, nillable = true)
                protected String burstrecnum;
                @XmlElement(name = "FIN_PROP_EFF_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar finpropeffdt;
                @XmlElement(name = "FIN_PROP_STTS_DSCR", required = true, nillable = true)
                protected String finpropsttsdscr;
                @XmlElement(name = "FIN_PROP_TYP_DSCR", required = true, nillable = true)
                protected String finproptypdscr;
                @XmlElement(name = "FIN_PROP_NM", required = true, nillable = true)
                protected String finpropnm;
                @XmlElement(name = "FIN_PROP_DSCR", required = true, nillable = true)
                protected String finpropdscr;
                @XmlElement(name = "FIN_PROP_STOP_DT_TYP_DSCR", required = true, nillable = true)
                protected String finpropstopdttypdscr;
                @XmlElement(name = "FIN_PROP_STOP_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar finpropstopdt;
                @XmlElement(name = "FIN_PROP_VAL")
                protected BigDecimal finpropval;
                @XmlElement(name = "LST_UPDT_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar lstupdtdt;
                @XmlElement(name = "LST_UPDT_USR_ID", required = true, nillable = true)
                protected String lstupdtusrid;
                @XmlElement(name = "HUB_STATE_IND")
                protected BigDecimal hubstateind;
                @XmlElement(name = "ORIGIN_SRC_SYS", required = true, nillable = true)
                protected String originsrcsys;

                /**
                 * Gets the value of the partyfinpropid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                public Long getPARTYFINPROPID() {
                    return partyfinpropid;
                }

                /**
                 * Sets the value of the partyfinpropid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                public void setPARTYFINPROPID(Long value) {
                    this.partyfinpropid = value;
                }

                /**
                 * Gets the value of the srcsystem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSRCSYSTEM() {
                    return srcsystem;
                }

                /**
                 * Sets the value of the srcsystem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSRCSYSTEM(String value) {
                    this.srcsystem = value;
                }

                /**
                 * Gets the value of the partyid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPARTYID() {
                    return partyid;
                }

                /**
                 * Sets the value of the partyid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPARTYID(String value) {
                    this.partyid = value;
                }

                /**
                 * Gets the value of the burstrecnum property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBURSTRECNUM() {
                    return burstrecnum;
                }

                /**
                 * Sets the value of the burstrecnum property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBURSTRECNUM(String value) {
                    this.burstrecnum = value;
                }

                /**
                 * Gets the value of the finpropeffdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getFINPROPEFFDT() {
                    return finpropeffdt;
                }

                /**
                 * Sets the value of the finpropeffdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setFINPROPEFFDT(XMLGregorianCalendar value) {
                    this.finpropeffdt = value;
                }

                /**
                 * Gets the value of the finpropsttsdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFINPROPSTTSDSCR() {
                    return finpropsttsdscr;
                }

                /**
                 * Sets the value of the finpropsttsdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFINPROPSTTSDSCR(String value) {
                    this.finpropsttsdscr = value;
                }

                /**
                 * Gets the value of the finproptypdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFINPROPTYPDSCR() {
                    return finproptypdscr;
                }

                /**
                 * Sets the value of the finproptypdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFINPROPTYPDSCR(String value) {
                    this.finproptypdscr = value;
                }

                /**
                 * Gets the value of the finpropnm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFINPROPNM() {
                    return finpropnm;
                }

                /**
                 * Sets the value of the finpropnm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFINPROPNM(String value) {
                    this.finpropnm = value;
                }

                /**
                 * Gets the value of the finpropdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFINPROPDSCR() {
                    return finpropdscr;
                }

                /**
                 * Sets the value of the finpropdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFINPROPDSCR(String value) {
                    this.finpropdscr = value;
                }

                /**
                 * Gets the value of the finpropstopdttypdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFINPROPSTOPDTTYPDSCR() {
                    return finpropstopdttypdscr;
                }

                /**
                 * Sets the value of the finpropstopdttypdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFINPROPSTOPDTTYPDSCR(String value) {
                    this.finpropstopdttypdscr = value;
                }

                /**
                 * Gets the value of the finpropstopdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getFINPROPSTOPDT() {
                    return finpropstopdt;
                }

                /**
                 * Sets the value of the finpropstopdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setFINPROPSTOPDT(XMLGregorianCalendar value) {
                    this.finpropstopdt = value;
                }

                /**
                 * Gets the value of the finpropval property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getFINPROPVAL() {
                    return finpropval;
                }

                /**
                 * Sets the value of the finpropval property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setFINPROPVAL(BigDecimal value) {
                    this.finpropval = value;
                }

                /**
                 * Gets the value of the lstupdtdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getLSTUPDTDT() {
                    return lstupdtdt;
                }

                /**
                 * Sets the value of the lstupdtdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setLSTUPDTDT(XMLGregorianCalendar value) {
                    this.lstupdtdt = value;
                }

                /**
                 * Gets the value of the lstupdtusrid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLSTUPDTUSRID() {
                    return lstupdtusrid;
                }

                /**
                 * Sets the value of the lstupdtusrid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLSTUPDTUSRID(String value) {
                    this.lstupdtusrid = value;
                }

                /**
                 * Gets the value of the hubstateind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getHUBSTATEIND() {
                    return hubstateind;
                }

                /**
                 * Sets the value of the hubstateind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setHUBSTATEIND(BigDecimal value) {
                    this.hubstateind = value;
                }

                /**
                 * Gets the value of the originsrcsys property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getORIGINSRCSYS() {
                    return originsrcsys;
                }

                /**
                 * Sets the value of the originsrcsys property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setORIGINSRCSYS(String value) {
                    this.originsrcsys = value;
                }

            }

        }


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
         *         &lt;element name="PARTY_INCM" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PARTY_INCM_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                   &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="CUR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="INCM_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="INCM_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="INCM_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="INCM_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="INCM_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="INCM_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="INCM_VAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "partyincm"
        })
        public static class PARTYINCMS {

            @XmlElement(name = "PARTY_INCM")
            protected List<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYINCMS.PARTYINCM> partyincm;

            /**
             * Gets the value of the partyincm property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the partyincm property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPARTYINCM().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYINCMS.PARTYINCM }
             * 
             * 
             */
            public List<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYINCMS.PARTYINCM> getPARTYINCM() {
                if (partyincm == null) {
                    partyincm = new ArrayList<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYINCMS.PARTYINCM>();
                }
                return this.partyincm;
            }


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
             *         &lt;element name="PARTY_INCM_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *         &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="CUR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="INCM_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="INCM_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="INCM_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="INCM_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="INCM_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="INCM_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="INCM_VAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "partyincmid",
                "srcsystem",
                "partyid",
                "burstrecnum",
                "curcd",
                "incmeffdt",
                "incmsttsdscr",
                "incmtypdscr",
                "incmnm",
                "incmdscr",
                "incmstopdt",
                "incmval",
                "lstupdtdt",
                "lstupdtusrid",
                "hubstateind",
                "originsrcsys"
            })
            public static class PARTYINCM {

                @XmlElement(name = "PARTY_INCM_ID")
                protected Long partyincmid;
                @XmlElement(name = "SRC_SYSTEM")
                protected String srcsystem;
                @XmlElement(name = "PARTY_ID")
                protected String partyid;
                @XmlElement(name = "BURST_REC_NUM", required = true, nillable = true)
                protected String burstrecnum;
                @XmlElement(name = "CUR_CD", required = true, nillable = true)
                protected String curcd;
                @XmlElement(name = "INCM_EFF_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar incmeffdt;
                @XmlElement(name = "INCM_STTS_DSCR", required = true, nillable = true)
                protected String incmsttsdscr;
                @XmlElement(name = "INCM_TYP_DSCR", required = true, nillable = true)
                protected String incmtypdscr;
                @XmlElement(name = "INCM_NM", required = true, nillable = true)
                protected String incmnm;
                @XmlElement(name = "INCM_DSCR", required = true, nillable = true)
                protected String incmdscr;
                @XmlElement(name = "INCM_STOP_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar incmstopdt;
                @XmlElement(name = "INCM_VAL")
                protected BigDecimal incmval;
                @XmlElement(name = "LST_UPDT_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar lstupdtdt;
                @XmlElement(name = "LST_UPDT_USR_ID", required = true, nillable = true)
                protected String lstupdtusrid;
                @XmlElement(name = "HUB_STATE_IND")
                protected BigDecimal hubstateind;
                @XmlElement(name = "ORIGIN_SRC_SYS", required = true, nillable = true)
                protected String originsrcsys;

                /**
                 * Gets the value of the partyincmid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                public Long getPARTYINCMID() {
                    return partyincmid;
                }

                /**
                 * Sets the value of the partyincmid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                public void setPARTYINCMID(Long value) {
                    this.partyincmid = value;
                }

                /**
                 * Gets the value of the srcsystem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSRCSYSTEM() {
                    return srcsystem;
                }

                /**
                 * Sets the value of the srcsystem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSRCSYSTEM(String value) {
                    this.srcsystem = value;
                }

                /**
                 * Gets the value of the partyid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPARTYID() {
                    return partyid;
                }

                /**
                 * Sets the value of the partyid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPARTYID(String value) {
                    this.partyid = value;
                }

                /**
                 * Gets the value of the burstrecnum property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBURSTRECNUM() {
                    return burstrecnum;
                }

                /**
                 * Sets the value of the burstrecnum property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBURSTRECNUM(String value) {
                    this.burstrecnum = value;
                }

                /**
                 * Gets the value of the curcd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCURCD() {
                    return curcd;
                }

                /**
                 * Sets the value of the curcd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCURCD(String value) {
                    this.curcd = value;
                }

                /**
                 * Gets the value of the incmeffdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getINCMEFFDT() {
                    return incmeffdt;
                }

                /**
                 * Sets the value of the incmeffdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setINCMEFFDT(XMLGregorianCalendar value) {
                    this.incmeffdt = value;
                }

                /**
                 * Gets the value of the incmsttsdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getINCMSTTSDSCR() {
                    return incmsttsdscr;
                }

                /**
                 * Sets the value of the incmsttsdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setINCMSTTSDSCR(String value) {
                    this.incmsttsdscr = value;
                }

                /**
                 * Gets the value of the incmtypdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getINCMTYPDSCR() {
                    return incmtypdscr;
                }

                /**
                 * Sets the value of the incmtypdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setINCMTYPDSCR(String value) {
                    this.incmtypdscr = value;
                }

                /**
                 * Gets the value of the incmnm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getINCMNM() {
                    return incmnm;
                }

                /**
                 * Sets the value of the incmnm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setINCMNM(String value) {
                    this.incmnm = value;
                }

                /**
                 * Gets the value of the incmdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getINCMDSCR() {
                    return incmdscr;
                }

                /**
                 * Sets the value of the incmdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setINCMDSCR(String value) {
                    this.incmdscr = value;
                }

                /**
                 * Gets the value of the incmstopdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getINCMSTOPDT() {
                    return incmstopdt;
                }

                /**
                 * Sets the value of the incmstopdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setINCMSTOPDT(XMLGregorianCalendar value) {
                    this.incmstopdt = value;
                }

                /**
                 * Gets the value of the incmval property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getINCMVAL() {
                    return incmval;
                }

                /**
                 * Sets the value of the incmval property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setINCMVAL(BigDecimal value) {
                    this.incmval = value;
                }

                /**
                 * Gets the value of the lstupdtdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getLSTUPDTDT() {
                    return lstupdtdt;
                }

                /**
                 * Sets the value of the lstupdtdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setLSTUPDTDT(XMLGregorianCalendar value) {
                    this.lstupdtdt = value;
                }

                /**
                 * Gets the value of the lstupdtusrid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLSTUPDTUSRID() {
                    return lstupdtusrid;
                }

                /**
                 * Sets the value of the lstupdtusrid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLSTUPDTUSRID(String value) {
                    this.lstupdtusrid = value;
                }

                /**
                 * Gets the value of the hubstateind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getHUBSTATEIND() {
                    return hubstateind;
                }

                /**
                 * Sets the value of the hubstateind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setHUBSTATEIND(BigDecimal value) {
                    this.hubstateind = value;
                }

                /**
                 * Gets the value of the originsrcsys property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getORIGINSRCSYS() {
                    return originsrcsys;
                }

                /**
                 * Sets the value of the originsrcsys property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setORIGINSRCSYS(String value) {
                    this.originsrcsys = value;
                }

            }

        }


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
         *         &lt;element name="PARTY_INVST_HLD" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PARTY_INVST_HLD_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                   &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="CUR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="CUR_INVST_HLD_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="INVST_HLD_TYP_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="HLD_IN_YR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                   &lt;element name="HLD_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "partyinvsthld"
        })
        public static class PARTYINVSTHLDS {

            @XmlElement(name = "PARTY_INVST_HLD", required = true)
            protected List<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYINVSTHLDS.PARTYINVSTHLD> partyinvsthld;

            /**
             * Gets the value of the partyinvsthld property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the partyinvsthld property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPARTYINVSTHLD().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYINVSTHLDS.PARTYINVSTHLD }
             * 
             * 
             */
            public List<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYINVSTHLDS.PARTYINVSTHLD> getPARTYINVSTHLD() {
                if (partyinvsthld == null) {
                    partyinvsthld = new ArrayList<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYINVSTHLDS.PARTYINVSTHLD>();
                }
                return this.partyinvsthld;
            }


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
             *         &lt;element name="PARTY_INVST_HLD_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *         &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="CUR_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="CUR_INVST_HLD_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="INVST_HLD_TYP_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="HLD_IN_YR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *         &lt;element name="HLD_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "partyinvsthldid",
                "srcsystem",
                "partyid",
                "burstrecnum",
                "curcd",
                "curinvsthldind",
                "invsthldtypnm",
                "hldinyr",
                "hldamt",
                "lstupdtdt",
                "lstupdtusrid",
                "hubstateind",
                "originsrcsys"
            })
            public static class PARTYINVSTHLD {

                @XmlElement(name = "PARTY_INVST_HLD_ID")
                protected Long partyinvsthldid;
                @XmlElement(name = "SRC_SYSTEM")
                protected String srcsystem;
                @XmlElement(name = "PARTY_ID")
                protected String partyid;
                @XmlElement(name = "BURST_REC_NUM", required = true, nillable = true)
                protected String burstrecnum;
                @XmlElement(name = "CUR_CD", required = true, nillable = true)
                protected String curcd;
                @XmlElement(name = "CUR_INVST_HLD_IND", required = true, nillable = true)
                protected String curinvsthldind;
                @XmlElement(name = "INVST_HLD_TYP_NM", required = true, nillable = true)
                protected String invsthldtypnm;
                @XmlElementRef(name = "HLD_IN_YR", namespace = "http://www.informatica.com/dis/ws/", type = JAXBElement.class)
                protected JAXBElement<BigInteger> hldinyr;
                @XmlElement(name = "HLD_AMT")
                protected BigDecimal hldamt;
                @XmlElement(name = "LST_UPDT_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar lstupdtdt;
                @XmlElement(name = "LST_UPDT_USR_ID", required = true, nillable = true)
                protected String lstupdtusrid;
                @XmlElement(name = "HUB_STATE_IND")
                protected BigDecimal hubstateind;
                @XmlElement(name = "ORIGIN_SRC_SYS", required = true, nillable = true)
                protected String originsrcsys;

                /**
                 * Gets the value of the partyinvsthldid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                public Long getPARTYINVSTHLDID() {
                    return partyinvsthldid;
                }

                /**
                 * Sets the value of the partyinvsthldid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                public void setPARTYINVSTHLDID(Long value) {
                    this.partyinvsthldid = value;
                }

                /**
                 * Gets the value of the srcsystem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSRCSYSTEM() {
                    return srcsystem;
                }

                /**
                 * Sets the value of the srcsystem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSRCSYSTEM(String value) {
                    this.srcsystem = value;
                }

                /**
                 * Gets the value of the partyid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPARTYID() {
                    return partyid;
                }

                /**
                 * Sets the value of the partyid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPARTYID(String value) {
                    this.partyid = value;
                }

                /**
                 * Gets the value of the burstrecnum property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBURSTRECNUM() {
                    return burstrecnum;
                }

                /**
                 * Sets the value of the burstrecnum property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBURSTRECNUM(String value) {
                    this.burstrecnum = value;
                }

                /**
                 * Gets the value of the curcd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCURCD() {
                    return curcd;
                }

                /**
                 * Sets the value of the curcd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCURCD(String value) {
                    this.curcd = value;
                }

                /**
                 * Gets the value of the curinvsthldind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCURINVSTHLDIND() {
                    return curinvsthldind;
                }

                /**
                 * Sets the value of the curinvsthldind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCURINVSTHLDIND(String value) {
                    this.curinvsthldind = value;
                }

                /**
                 * Gets the value of the invsthldtypnm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getINVSTHLDTYPNM() {
                    return invsthldtypnm;
                }

                /**
                 * Sets the value of the invsthldtypnm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setINVSTHLDTYPNM(String value) {
                    this.invsthldtypnm = value;
                }

                /**
                 * Gets the value of the hldinyr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
                 *     
                 */
                public JAXBElement<BigInteger> getHLDINYR() {
                    return hldinyr;
                }

                /**
                 * Sets the value of the hldinyr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
                 *     
                 */
                public void setHLDINYR(JAXBElement<BigInteger> value) {
                    this.hldinyr = ((JAXBElement<BigInteger> ) value);
                }

                /**
                 * Gets the value of the hldamt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getHLDAMT() {
                    return hldamt;
                }

                /**
                 * Sets the value of the hldamt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setHLDAMT(BigDecimal value) {
                    this.hldamt = value;
                }

                /**
                 * Gets the value of the lstupdtdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getLSTUPDTDT() {
                    return lstupdtdt;
                }

                /**
                 * Sets the value of the lstupdtdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setLSTUPDTDT(XMLGregorianCalendar value) {
                    this.lstupdtdt = value;
                }

                /**
                 * Gets the value of the lstupdtusrid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLSTUPDTUSRID() {
                    return lstupdtusrid;
                }

                /**
                 * Sets the value of the lstupdtusrid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLSTUPDTUSRID(String value) {
                    this.lstupdtusrid = value;
                }

                /**
                 * Gets the value of the hubstateind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getHUBSTATEIND() {
                    return hubstateind;
                }

                /**
                 * Sets the value of the hubstateind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setHUBSTATEIND(BigDecimal value) {
                    this.hubstateind = value;
                }

                /**
                 * Gets the value of the originsrcsys property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getORIGINSRCSYS() {
                    return originsrcsys;
                }

                /**
                 * Sets the value of the originsrcsys property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setORIGINSRCSYS(String value) {
                    this.originsrcsys = value;
                }

            }

        }


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
         *         &lt;element name="PARTY_ORG" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ORG_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                   &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="EMPE_CNT_RNG_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FRTN_500_RNK_NUM" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                   &lt;element name="MET_CUST_IN_YR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                   &lt;element name="SMALL_BUS_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="WMN_OWN_BUS_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="GLB_ULT_BUS_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="GLB_ULT_BUS_ST_ABBR_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="GLB_ULT_PRNT_CNTRY_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="CLNT_STTS_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="CLNT_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="BUS_JRSDICT_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="LOC_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                   &lt;element name="EMPE_CLASS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="IND_CLASS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="NM_APL_BY_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PLC_OF_ORIG_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "partyorg"
        })
        public static class PARTYORGS {

            @XmlElement(name = "PARTY_ORG")
            protected List<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYORGS.PARTYORG> partyorg;

            /**
             * Gets the value of the partyorg property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the partyorg property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPARTYORG().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYORGS.PARTYORG }
             * 
             * 
             */
            public List<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYORGS.PARTYORG> getPARTYORG() {
                if (partyorg == null) {
                    partyorg = new ArrayList<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYORGS.PARTYORG>();
                }
                return this.partyorg;
            }


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
             *         &lt;element name="ORG_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *         &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="EMPE_CNT_RNG_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FRTN_500_RNK_NUM" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *         &lt;element name="MET_CUST_IN_YR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *         &lt;element name="SMALL_BUS_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="WMN_OWN_BUS_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="GLB_ULT_BUS_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="GLB_ULT_BUS_ST_ABBR_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="GLB_ULT_PRNT_CNTRY_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="CLNT_STTS_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="CLNT_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="BUS_JRSDICT_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="LOC_CNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *         &lt;element name="EMPE_CLASS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="IND_CLASS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="NM_APL_BY_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PLC_OF_ORIG_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "orgid",
                "srcsystem",
                "partyid",
                "burstrecnum",
                "empecntrngdscr",
                "frtn500RNKNUM",
                "metcustinyr",
                "smallbusind",
                "wmnownbusind",
                "glbultbusind",
                "glbultbusstabbrnm",
                "glbultprntcntrynm",
                "clntsttscd",
                "clntsttsdscr",
                "busjrsdictdscr",
                "loccnt",
                "empeclassdscr",
                "indclassdscr",
                "lstupdtdt",
                "lstupdtusrid",
                "hubstateind",
                "nmaplbycd",
                "plcoforigdscr",
                "originsrcsys"
            })
            public static class PARTYORG {

                @XmlElement(name = "ORG_ID")
                protected Long orgid;
                @XmlElement(name = "SRC_SYSTEM")
                protected String srcsystem;
                @XmlElement(name = "PARTY_ID")
                protected String partyid;
                @XmlElement(name = "BURST_REC_NUM", required = true, nillable = true)
                protected String burstrecnum;
                @XmlElement(name = "EMPE_CNT_RNG_DSCR", required = true, nillable = true)
                protected String empecntrngdscr;
                @XmlElement(name = "FRTN_500_RNK_NUM")
                protected BigInteger frtn500RNKNUM;
                @XmlElement(name = "MET_CUST_IN_YR")
                protected BigInteger metcustinyr;
                @XmlElement(name = "SMALL_BUS_IND", required = true, nillable = true)
                protected String smallbusind;
                @XmlElement(name = "WMN_OWN_BUS_IND", required = true, nillable = true)
                protected String wmnownbusind;
                @XmlElement(name = "GLB_ULT_BUS_IND", required = true, nillable = true)
                protected String glbultbusind;
                @XmlElement(name = "GLB_ULT_BUS_ST_ABBR_NM", required = true, nillable = true)
                protected String glbultbusstabbrnm;
                @XmlElement(name = "GLB_ULT_PRNT_CNTRY_NM", required = true, nillable = true)
                protected String glbultprntcntrynm;
                @XmlElement(name = "CLNT_STTS_CD", required = true, nillable = true)
                protected String clntsttscd;
                @XmlElement(name = "CLNT_STTS_DSCR", required = true, nillable = true)
                protected String clntsttsdscr;
                @XmlElement(name = "BUS_JRSDICT_DSCR", required = true, nillable = true)
                protected String busjrsdictdscr;
                @XmlElement(name = "LOC_CNT")
                protected BigInteger loccnt;
                @XmlElement(name = "EMPE_CLASS_DSCR", required = true, nillable = true)
                protected String empeclassdscr;
                @XmlElement(name = "IND_CLASS_DSCR", required = true, nillable = true)
                protected String indclassdscr;
                @XmlElement(name = "LST_UPDT_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar lstupdtdt;
                @XmlElement(name = "LST_UPDT_USR_ID", required = true, nillable = true)
                protected String lstupdtusrid;
                @XmlElement(name = "HUB_STATE_IND")
                protected BigDecimal hubstateind;
                @XmlElement(name = "NM_APL_BY_CD", required = true, nillable = true)
                protected String nmaplbycd;
                @XmlElement(name = "PLC_OF_ORIG_DSCR", required = true, nillable = true)
                protected String plcoforigdscr;
                @XmlElement(name = "ORIGIN_SRC_SYS", required = true, nillable = true)
                protected String originsrcsys;

                /**
                 * Gets the value of the orgid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                public Long getORGID() {
                    return orgid;
                }

                /**
                 * Sets the value of the orgid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                public void setORGID(Long value) {
                    this.orgid = value;
                }

                /**
                 * Gets the value of the srcsystem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSRCSYSTEM() {
                    return srcsystem;
                }

                /**
                 * Sets the value of the srcsystem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSRCSYSTEM(String value) {
                    this.srcsystem = value;
                }

                /**
                 * Gets the value of the partyid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPARTYID() {
                    return partyid;
                }

                /**
                 * Sets the value of the partyid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPARTYID(String value) {
                    this.partyid = value;
                }

                /**
                 * Gets the value of the burstrecnum property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBURSTRECNUM() {
                    return burstrecnum;
                }

                /**
                 * Sets the value of the burstrecnum property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBURSTRECNUM(String value) {
                    this.burstrecnum = value;
                }

                /**
                 * Gets the value of the empecntrngdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEMPECNTRNGDSCR() {
                    return empecntrngdscr;
                }

                /**
                 * Sets the value of the empecntrngdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEMPECNTRNGDSCR(String value) {
                    this.empecntrngdscr = value;
                }

                /**
                 * Gets the value of the frtn500RNKNUM property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getFRTN500RNKNUM() {
                    return frtn500RNKNUM;
                }

                /**
                 * Sets the value of the frtn500RNKNUM property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setFRTN500RNKNUM(BigInteger value) {
                    this.frtn500RNKNUM = value;
                }

                /**
                 * Gets the value of the metcustinyr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getMETCUSTINYR() {
                    return metcustinyr;
                }

                /**
                 * Sets the value of the metcustinyr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setMETCUSTINYR(BigInteger value) {
                    this.metcustinyr = value;
                }

                /**
                 * Gets the value of the smallbusind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSMALLBUSIND() {
                    return smallbusind;
                }

                /**
                 * Sets the value of the smallbusind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSMALLBUSIND(String value) {
                    this.smallbusind = value;
                }

                /**
                 * Gets the value of the wmnownbusind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWMNOWNBUSIND() {
                    return wmnownbusind;
                }

                /**
                 * Sets the value of the wmnownbusind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWMNOWNBUSIND(String value) {
                    this.wmnownbusind = value;
                }

                /**
                 * Gets the value of the glbultbusind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGLBULTBUSIND() {
                    return glbultbusind;
                }

                /**
                 * Sets the value of the glbultbusind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGLBULTBUSIND(String value) {
                    this.glbultbusind = value;
                }

                /**
                 * Gets the value of the glbultbusstabbrnm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGLBULTBUSSTABBRNM() {
                    return glbultbusstabbrnm;
                }

                /**
                 * Sets the value of the glbultbusstabbrnm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGLBULTBUSSTABBRNM(String value) {
                    this.glbultbusstabbrnm = value;
                }

                /**
                 * Gets the value of the glbultprntcntrynm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGLBULTPRNTCNTRYNM() {
                    return glbultprntcntrynm;
                }

                /**
                 * Sets the value of the glbultprntcntrynm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGLBULTPRNTCNTRYNM(String value) {
                    this.glbultprntcntrynm = value;
                }

                /**
                 * Gets the value of the clntsttscd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCLNTSTTSCD() {
                    return clntsttscd;
                }

                /**
                 * Sets the value of the clntsttscd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCLNTSTTSCD(String value) {
                    this.clntsttscd = value;
                }

                /**
                 * Gets the value of the clntsttsdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCLNTSTTSDSCR() {
                    return clntsttsdscr;
                }

                /**
                 * Sets the value of the clntsttsdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCLNTSTTSDSCR(String value) {
                    this.clntsttsdscr = value;
                }

                /**
                 * Gets the value of the busjrsdictdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBUSJRSDICTDSCR() {
                    return busjrsdictdscr;
                }

                /**
                 * Sets the value of the busjrsdictdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBUSJRSDICTDSCR(String value) {
                    this.busjrsdictdscr = value;
                }

                /**
                 * Gets the value of the loccnt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getLOCCNT() {
                    return loccnt;
                }

                /**
                 * Sets the value of the loccnt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setLOCCNT(BigInteger value) {
                    this.loccnt = value;
                }

                /**
                 * Gets the value of the empeclassdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEMPECLASSDSCR() {
                    return empeclassdscr;
                }

                /**
                 * Sets the value of the empeclassdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEMPECLASSDSCR(String value) {
                    this.empeclassdscr = value;
                }

                /**
                 * Gets the value of the indclassdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getINDCLASSDSCR() {
                    return indclassdscr;
                }

                /**
                 * Sets the value of the indclassdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setINDCLASSDSCR(String value) {
                    this.indclassdscr = value;
                }

                /**
                 * Gets the value of the lstupdtdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getLSTUPDTDT() {
                    return lstupdtdt;
                }

                /**
                 * Sets the value of the lstupdtdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setLSTUPDTDT(XMLGregorianCalendar value) {
                    this.lstupdtdt = value;
                }

                /**
                 * Gets the value of the lstupdtusrid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLSTUPDTUSRID() {
                    return lstupdtusrid;
                }

                /**
                 * Sets the value of the lstupdtusrid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLSTUPDTUSRID(String value) {
                    this.lstupdtusrid = value;
                }

                /**
                 * Gets the value of the hubstateind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getHUBSTATEIND() {
                    return hubstateind;
                }

                /**
                 * Sets the value of the hubstateind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setHUBSTATEIND(BigDecimal value) {
                    this.hubstateind = value;
                }

                /**
                 * Gets the value of the nmaplbycd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNMAPLBYCD() {
                    return nmaplbycd;
                }

                /**
                 * Sets the value of the nmaplbycd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNMAPLBYCD(String value) {
                    this.nmaplbycd = value;
                }

                /**
                 * Gets the value of the plcoforigdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPLCOFORIGDSCR() {
                    return plcoforigdscr;
                }

                /**
                 * Sets the value of the plcoforigdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPLCOFORIGDSCR(String value) {
                    this.plcoforigdscr = value;
                }

                /**
                 * Gets the value of the originsrcsys property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getORIGINSRCSYS() {
                    return originsrcsys;
                }

                /**
                 * Sets the value of the originsrcsys property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setORIGINSRCSYS(String value) {
                    this.originsrcsys = value;
                }

            }

        }


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
         *         &lt;element name="PARTY_PER" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PER_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                   &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FIN_REG_ASSOC_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ESERVICE_PRFL_EDIT_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="EMP_IN_YR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                   &lt;element name="MET_EMP_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="DIR_OFC_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="OVR_18_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="AGE_IN_YR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                   &lt;element name="AGE_RNG_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="EMP_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="TAX_BRKT_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="TAX_BRKT_PCT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="OCC_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="OCC_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="OCC_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="OCC_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="OCC_STRT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="OCC_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="BNR_LST_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="LST_BNR_MAIL_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="LST_SUIT_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="MED_COND_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="NM_APL_BY_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PLC_OF_ORIG_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "partyper"
        })
        public static class PARTYPERS {

            @XmlElement(name = "PARTY_PER")
            protected List<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYPERS.PARTYPER> partyper;

            /**
             * Gets the value of the partyper property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the partyper property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPARTYPER().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYPERS.PARTYPER }
             * 
             * 
             */
            public List<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYPERS.PARTYPER> getPARTYPER() {
                if (partyper == null) {
                    partyper = new ArrayList<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYPERS.PARTYPER>();
                }
                return this.partyper;
            }


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
             *         &lt;element name="PER_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *         &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FIN_REG_ASSOC_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ESERVICE_PRFL_EDIT_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="EMP_IN_YR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *         &lt;element name="MET_EMP_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="DIR_OFC_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="OVR_18_IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="AGE_IN_YR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *         &lt;element name="AGE_RNG_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="EMP_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="TAX_BRKT_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="TAX_BRKT_PCT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="OCC_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="OCC_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="OCC_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="OCC_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="OCC_STRT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="OCC_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="BNR_LST_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="LST_BNR_MAIL_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="LST_SUIT_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="MED_COND_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="NM_APL_BY_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PLC_OF_ORIG_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "perid",
                "srcsystem",
                "partyid",
                "burstrecnum",
                "finregassocind",
                "eserviceprfleditind",
                "empinyr",
                "metempind",
                "dirofcind",
                "ovr18IND",
                "ageinyr",
                "agerngdscr",
                "empsttsdscr",
                "taxbrktdscr",
                "taxbrktpct",
                "occsttsdscr",
                "occtypdscr",
                "occnm",
                "occdscr",
                "occstrtdt",
                "occstopdt",
                "bnrlsteffdt",
                "lstbnrmaildt",
                "lstsuitupdtdt",
                "medcondsttsdscr",
                "lstupdtdt",
                "lstupdtusrid",
                "hubstateind",
                "nmaplbycd",
                "plcoforigdscr",
                "originsrcsys"
            })
            public static class PARTYPER {

                @XmlElement(name = "PER_ID")
                protected Long perid;
                @XmlElement(name = "SRC_SYSTEM")
                protected String srcsystem;
                @XmlElement(name = "PARTY_ID")
                protected String partyid;
                @XmlElement(name = "BURST_REC_NUM", required = true, nillable = true)
                protected String burstrecnum;
                @XmlElement(name = "FIN_REG_ASSOC_IND", required = true, nillable = true)
                protected String finregassocind;
                @XmlElement(name = "ESERVICE_PRFL_EDIT_IND", required = true, nillable = true)
                protected String eserviceprfleditind;
                @XmlElement(name = "EMP_IN_YR")
                protected BigInteger empinyr;
                @XmlElement(name = "MET_EMP_IND", required = true, nillable = true)
                protected String metempind;
                @XmlElement(name = "DIR_OFC_IND", required = true, nillable = true)
                protected String dirofcind;
                @XmlElement(name = "OVR_18_IND", required = true, nillable = true)
                protected String ovr18IND;
                @XmlElement(name = "AGE_IN_YR")
                protected BigInteger ageinyr;
                @XmlElement(name = "AGE_RNG_DSCR", required = true, nillable = true)
                protected String agerngdscr;
                @XmlElement(name = "EMP_STTS_DSCR", required = true, nillable = true)
                protected String empsttsdscr;
                @XmlElement(name = "TAX_BRKT_DSCR", required = true, nillable = true)
                protected String taxbrktdscr;
                @XmlElement(name = "TAX_BRKT_PCT")
                protected BigDecimal taxbrktpct;
                @XmlElement(name = "OCC_STTS_DSCR", required = true, nillable = true)
                protected String occsttsdscr;
                @XmlElement(name = "OCC_TYP_DSCR", required = true, nillable = true)
                protected String occtypdscr;
                @XmlElement(name = "OCC_NM", required = true, nillable = true)
                protected String occnm;
                @XmlElement(name = "OCC_DSCR", required = true, nillable = true)
                protected String occdscr;
                @XmlElement(name = "OCC_STRT_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar occstrtdt;
                @XmlElement(name = "OCC_STOP_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar occstopdt;
                @XmlElement(name = "BNR_LST_EFF_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar bnrlsteffdt;
                @XmlElement(name = "LST_BNR_MAIL_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar lstbnrmaildt;
                @XmlElement(name = "LST_SUIT_UPDT_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar lstsuitupdtdt;
                @XmlElement(name = "MED_COND_STTS_DSCR", required = true, nillable = true)
                protected String medcondsttsdscr;
                @XmlElement(name = "LST_UPDT_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar lstupdtdt;
                @XmlElement(name = "LST_UPDT_USR_ID", required = true, nillable = true)
                protected String lstupdtusrid;
                @XmlElement(name = "HUB_STATE_IND")
                protected BigDecimal hubstateind;
                @XmlElement(name = "NM_APL_BY_CD", required = true, nillable = true)
                protected String nmaplbycd;
                @XmlElement(name = "PLC_OF_ORIG_DSCR", required = true, nillable = true)
                protected String plcoforigdscr;
                @XmlElement(name = "ORIGIN_SRC_SYS", required = true, nillable = true)
                protected String originsrcsys;

                /**
                 * Gets the value of the perid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                public Long getPERID() {
                    return perid;
                }

                /**
                 * Sets the value of the perid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                public void setPERID(Long value) {
                    this.perid = value;
                }

                /**
                 * Gets the value of the srcsystem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSRCSYSTEM() {
                    return srcsystem;
                }

                /**
                 * Sets the value of the srcsystem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSRCSYSTEM(String value) {
                    this.srcsystem = value;
                }

                /**
                 * Gets the value of the partyid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPARTYID() {
                    return partyid;
                }

                /**
                 * Sets the value of the partyid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPARTYID(String value) {
                    this.partyid = value;
                }

                /**
                 * Gets the value of the burstrecnum property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBURSTRECNUM() {
                    return burstrecnum;
                }

                /**
                 * Sets the value of the burstrecnum property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBURSTRECNUM(String value) {
                    this.burstrecnum = value;
                }

                /**
                 * Gets the value of the finregassocind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFINREGASSOCIND() {
                    return finregassocind;
                }

                /**
                 * Sets the value of the finregassocind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFINREGASSOCIND(String value) {
                    this.finregassocind = value;
                }

                /**
                 * Gets the value of the eserviceprfleditind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getESERVICEPRFLEDITIND() {
                    return eserviceprfleditind;
                }

                /**
                 * Sets the value of the eserviceprfleditind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setESERVICEPRFLEDITIND(String value) {
                    this.eserviceprfleditind = value;
                }

                /**
                 * Gets the value of the empinyr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getEMPINYR() {
                    return empinyr;
                }

                /**
                 * Sets the value of the empinyr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setEMPINYR(BigInteger value) {
                    this.empinyr = value;
                }

                /**
                 * Gets the value of the metempind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMETEMPIND() {
                    return metempind;
                }

                /**
                 * Sets the value of the metempind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMETEMPIND(String value) {
                    this.metempind = value;
                }

                /**
                 * Gets the value of the dirofcind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDIROFCIND() {
                    return dirofcind;
                }

                /**
                 * Sets the value of the dirofcind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDIROFCIND(String value) {
                    this.dirofcind = value;
                }

                /**
                 * Gets the value of the ovr18IND property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOVR18IND() {
                    return ovr18IND;
                }

                /**
                 * Sets the value of the ovr18IND property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOVR18IND(String value) {
                    this.ovr18IND = value;
                }

                /**
                 * Gets the value of the ageinyr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getAGEINYR() {
                    return ageinyr;
                }

                /**
                 * Sets the value of the ageinyr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setAGEINYR(BigInteger value) {
                    this.ageinyr = value;
                }

                /**
                 * Gets the value of the agerngdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAGERNGDSCR() {
                    return agerngdscr;
                }

                /**
                 * Sets the value of the agerngdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAGERNGDSCR(String value) {
                    this.agerngdscr = value;
                }

                /**
                 * Gets the value of the empsttsdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEMPSTTSDSCR() {
                    return empsttsdscr;
                }

                /**
                 * Sets the value of the empsttsdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEMPSTTSDSCR(String value) {
                    this.empsttsdscr = value;
                }

                /**
                 * Gets the value of the taxbrktdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTAXBRKTDSCR() {
                    return taxbrktdscr;
                }

                /**
                 * Sets the value of the taxbrktdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTAXBRKTDSCR(String value) {
                    this.taxbrktdscr = value;
                }

                /**
                 * Gets the value of the taxbrktpct property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTAXBRKTPCT() {
                    return taxbrktpct;
                }

                /**
                 * Sets the value of the taxbrktpct property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTAXBRKTPCT(BigDecimal value) {
                    this.taxbrktpct = value;
                }

                /**
                 * Gets the value of the occsttsdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOCCSTTSDSCR() {
                    return occsttsdscr;
                }

                /**
                 * Sets the value of the occsttsdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOCCSTTSDSCR(String value) {
                    this.occsttsdscr = value;
                }

                /**
                 * Gets the value of the occtypdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOCCTYPDSCR() {
                    return occtypdscr;
                }

                /**
                 * Sets the value of the occtypdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOCCTYPDSCR(String value) {
                    this.occtypdscr = value;
                }

                /**
                 * Gets the value of the occnm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOCCNM() {
                    return occnm;
                }

                /**
                 * Sets the value of the occnm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOCCNM(String value) {
                    this.occnm = value;
                }

                /**
                 * Gets the value of the occdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOCCDSCR() {
                    return occdscr;
                }

                /**
                 * Sets the value of the occdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOCCDSCR(String value) {
                    this.occdscr = value;
                }

                /**
                 * Gets the value of the occstrtdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getOCCSTRTDT() {
                    return occstrtdt;
                }

                /**
                 * Sets the value of the occstrtdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setOCCSTRTDT(XMLGregorianCalendar value) {
                    this.occstrtdt = value;
                }

                /**
                 * Gets the value of the occstopdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getOCCSTOPDT() {
                    return occstopdt;
                }

                /**
                 * Sets the value of the occstopdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setOCCSTOPDT(XMLGregorianCalendar value) {
                    this.occstopdt = value;
                }

                /**
                 * Gets the value of the bnrlsteffdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getBNRLSTEFFDT() {
                    return bnrlsteffdt;
                }

                /**
                 * Sets the value of the bnrlsteffdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setBNRLSTEFFDT(XMLGregorianCalendar value) {
                    this.bnrlsteffdt = value;
                }

                /**
                 * Gets the value of the lstbnrmaildt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getLSTBNRMAILDT() {
                    return lstbnrmaildt;
                }

                /**
                 * Sets the value of the lstbnrmaildt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setLSTBNRMAILDT(XMLGregorianCalendar value) {
                    this.lstbnrmaildt = value;
                }

                /**
                 * Gets the value of the lstsuitupdtdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getLSTSUITUPDTDT() {
                    return lstsuitupdtdt;
                }

                /**
                 * Sets the value of the lstsuitupdtdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setLSTSUITUPDTDT(XMLGregorianCalendar value) {
                    this.lstsuitupdtdt = value;
                }

                /**
                 * Gets the value of the medcondsttsdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMEDCONDSTTSDSCR() {
                    return medcondsttsdscr;
                }

                /**
                 * Sets the value of the medcondsttsdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMEDCONDSTTSDSCR(String value) {
                    this.medcondsttsdscr = value;
                }

                /**
                 * Gets the value of the lstupdtdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getLSTUPDTDT() {
                    return lstupdtdt;
                }

                /**
                 * Sets the value of the lstupdtdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setLSTUPDTDT(XMLGregorianCalendar value) {
                    this.lstupdtdt = value;
                }

                /**
                 * Gets the value of the lstupdtusrid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLSTUPDTUSRID() {
                    return lstupdtusrid;
                }

                /**
                 * Sets the value of the lstupdtusrid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLSTUPDTUSRID(String value) {
                    this.lstupdtusrid = value;
                }

                /**
                 * Gets the value of the hubstateind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getHUBSTATEIND() {
                    return hubstateind;
                }

                /**
                 * Sets the value of the hubstateind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setHUBSTATEIND(BigDecimal value) {
                    this.hubstateind = value;
                }

                /**
                 * Gets the value of the nmaplbycd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNMAPLBYCD() {
                    return nmaplbycd;
                }

                /**
                 * Sets the value of the nmaplbycd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNMAPLBYCD(String value) {
                    this.nmaplbycd = value;
                }

                /**
                 * Gets the value of the plcoforigdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPLCOFORIGDSCR() {
                    return plcoforigdscr;
                }

                /**
                 * Sets the value of the plcoforigdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPLCOFORIGDSCR(String value) {
                    this.plcoforigdscr = value;
                }

                /**
                 * Gets the value of the originsrcsys property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getORIGINSRCSYS() {
                    return originsrcsys;
                }

                /**
                 * Sets the value of the originsrcsys property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setORIGINSRCSYS(String value) {
                    this.originsrcsys = value;
                }

            }

        }


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
         *         &lt;element name="PARTY_RISK" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PARTY_RISK_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                   &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="RISK_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="RISK_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="RISK_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="RISK_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="RISK_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="RISK_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="RISK_VAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "partyrisk"
        })
        public static class PARTYRISKS {

            @XmlElement(name = "PARTY_RISK")
            protected List<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYRISKS.PARTYRISK> partyrisk;

            /**
             * Gets the value of the partyrisk property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the partyrisk property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPARTYRISK().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYRISKS.PARTYRISK }
             * 
             * 
             */
            public List<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYRISKS.PARTYRISK> getPARTYRISK() {
                if (partyrisk == null) {
                    partyrisk = new ArrayList<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYRISKS.PARTYRISK>();
                }
                return this.partyrisk;
            }


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
             *         &lt;element name="PARTY_RISK_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *         &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="RISK_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="RISK_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="RISK_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="RISK_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="RISK_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="RISK_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="RISK_VAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "partyriskid",
                "srcsystem",
                "partyid",
                "burstrecnum",
                "riskeffdt",
                "risksttsdscr",
                "risktypdscr",
                "risknm",
                "riskdscr",
                "riskstopdt",
                "riskval",
                "lstupdtdt",
                "lstupdtusrid",
                "hubstateind",
                "originsrcsys"
            })
            public static class PARTYRISK {

                @XmlElement(name = "PARTY_RISK_ID")
                protected Long partyriskid;
                @XmlElement(name = "SRC_SYSTEM")
                protected String srcsystem;
                @XmlElement(name = "PARTY_ID")
                protected String partyid;
                @XmlElement(name = "BURST_REC_NUM", required = true, nillable = true)
                protected String burstrecnum;
                @XmlElement(name = "RISK_EFF_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar riskeffdt;
                @XmlElement(name = "RISK_STTS_DSCR", required = true, nillable = true)
                protected String risksttsdscr;
                @XmlElement(name = "RISK_TYP_DSCR", required = true, nillable = true)
                protected String risktypdscr;
                @XmlElement(name = "RISK_NM", required = true, nillable = true)
                protected String risknm;
                @XmlElement(name = "RISK_DSCR", required = true, nillable = true)
                protected String riskdscr;
                @XmlElement(name = "RISK_STOP_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar riskstopdt;
                @XmlElement(name = "RISK_VAL", required = true, nillable = true)
                protected String riskval;
                @XmlElement(name = "LST_UPDT_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar lstupdtdt;
                @XmlElement(name = "LST_UPDT_USR_ID", required = true, nillable = true)
                protected String lstupdtusrid;
                @XmlElement(name = "HUB_STATE_IND")
                protected BigDecimal hubstateind;
                @XmlElement(name = "ORIGIN_SRC_SYS", required = true, nillable = true)
                protected String originsrcsys;

                /**
                 * Gets the value of the partyriskid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                public Long getPARTYRISKID() {
                    return partyriskid;
                }

                /**
                 * Sets the value of the partyriskid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                public void setPARTYRISKID(Long value) {
                    this.partyriskid = value;
                }

                /**
                 * Gets the value of the srcsystem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSRCSYSTEM() {
                    return srcsystem;
                }

                /**
                 * Sets the value of the srcsystem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSRCSYSTEM(String value) {
                    this.srcsystem = value;
                }

                /**
                 * Gets the value of the partyid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPARTYID() {
                    return partyid;
                }

                /**
                 * Sets the value of the partyid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPARTYID(String value) {
                    this.partyid = value;
                }

                /**
                 * Gets the value of the burstrecnum property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBURSTRECNUM() {
                    return burstrecnum;
                }

                /**
                 * Sets the value of the burstrecnum property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBURSTRECNUM(String value) {
                    this.burstrecnum = value;
                }

                /**
                 * Gets the value of the riskeffdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getRISKEFFDT() {
                    return riskeffdt;
                }

                /**
                 * Sets the value of the riskeffdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setRISKEFFDT(XMLGregorianCalendar value) {
                    this.riskeffdt = value;
                }

                /**
                 * Gets the value of the risksttsdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRISKSTTSDSCR() {
                    return risksttsdscr;
                }

                /**
                 * Sets the value of the risksttsdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRISKSTTSDSCR(String value) {
                    this.risksttsdscr = value;
                }

                /**
                 * Gets the value of the risktypdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRISKTYPDSCR() {
                    return risktypdscr;
                }

                /**
                 * Sets the value of the risktypdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRISKTYPDSCR(String value) {
                    this.risktypdscr = value;
                }

                /**
                 * Gets the value of the risknm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRISKNM() {
                    return risknm;
                }

                /**
                 * Sets the value of the risknm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRISKNM(String value) {
                    this.risknm = value;
                }

                /**
                 * Gets the value of the riskdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRISKDSCR() {
                    return riskdscr;
                }

                /**
                 * Sets the value of the riskdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRISKDSCR(String value) {
                    this.riskdscr = value;
                }

                /**
                 * Gets the value of the riskstopdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getRISKSTOPDT() {
                    return riskstopdt;
                }

                /**
                 * Sets the value of the riskstopdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setRISKSTOPDT(XMLGregorianCalendar value) {
                    this.riskstopdt = value;
                }

                /**
                 * Gets the value of the riskval property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRISKVAL() {
                    return riskval;
                }

                /**
                 * Sets the value of the riskval property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRISKVAL(String value) {
                    this.riskval = value;
                }

                /**
                 * Gets the value of the lstupdtdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getLSTUPDTDT() {
                    return lstupdtdt;
                }

                /**
                 * Sets the value of the lstupdtdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setLSTUPDTDT(XMLGregorianCalendar value) {
                    this.lstupdtdt = value;
                }

                /**
                 * Gets the value of the lstupdtusrid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLSTUPDTUSRID() {
                    return lstupdtusrid;
                }

                /**
                 * Sets the value of the lstupdtusrid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLSTUPDTUSRID(String value) {
                    this.lstupdtusrid = value;
                }

                /**
                 * Gets the value of the hubstateind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getHUBSTATEIND() {
                    return hubstateind;
                }

                /**
                 * Sets the value of the hubstateind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setHUBSTATEIND(BigDecimal value) {
                    this.hubstateind = value;
                }

                /**
                 * Gets the value of the originsrcsys property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getORIGINSRCSYS() {
                    return originsrcsys;
                }

                /**
                 * Sets the value of the originsrcsys property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setORIGINSRCSYS(String value) {
                    this.originsrcsys = value;
                }

            }

        }


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
         *         &lt;element name="PARTY_SRV_LVLS" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PARTY_SRV_LVL_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                   &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="SRV_LVL_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="SRV_LVL_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="SRV_LVL_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="SRV_LVL_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="SRV_LVL_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="SRV_LVL_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="SRV_LVL_VAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "partysrvlvls"
        })
        public static class PARTYSRVLVLSS {

            @XmlElement(name = "PARTY_SRV_LVLS")
            protected List<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYSRVLVLSS.PARTYSRVLVLS> partysrvlvls;

            /**
             * Gets the value of the partysrvlvls property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the partysrvlvls property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPARTYSRVLVLS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetODSDetailsByPartyRowidObjectResponse.Party.PARTYSRVLVLSS.PARTYSRVLVLS }
             * 
             * 
             */
            public List<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYSRVLVLSS.PARTYSRVLVLS> getPARTYSRVLVLS() {
                if (partysrvlvls == null) {
                    partysrvlvls = new ArrayList<GetODSDetailsByPartyRowidObjectResponse.Party.PARTYSRVLVLSS.PARTYSRVLVLS>();
                }
                return this.partysrvlvls;
            }


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
             *         &lt;element name="PARTY_SRV_LVL_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *         &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BURST_REC_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="SRV_LVL_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="SRV_LVL_STTS_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="SRV_LVL_TYP_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="SRV_LVL_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="SRV_LVL_DSCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="SRV_LVL_STOP_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="SRV_LVL_VAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="LST_UPDT_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="LST_UPDT_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="HUB_STATE_IND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="ORIGIN_SRC_SYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "partysrvlvlid",
                "srcsystem",
                "partyid",
                "burstrecnum",
                "srvlvleffdt",
                "srvlvlsttsdscr",
                "srvlvltypdscr",
                "srvlvlnm",
                "srvlvldscr",
                "srvlvlstopdt",
                "srvlvlval",
                "lstupdtdt",
                "lstupdtusrid",
                "hubstateind",
                "originsrcsys"
            })
            public static class PARTYSRVLVLS {

                @XmlElement(name = "PARTY_SRV_LVL_ID")
                protected Long partysrvlvlid;
                @XmlElement(name = "SRC_SYSTEM")
                protected String srcsystem;
                @XmlElement(name = "PARTY_ID")
                protected String partyid;
                @XmlElement(name = "BURST_REC_NUM", required = true, nillable = true)
                protected String burstrecnum;
                @XmlElement(name = "SRV_LVL_EFF_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar srvlvleffdt;
                @XmlElement(name = "SRV_LVL_STTS_DSCR", required = true, nillable = true)
                protected String srvlvlsttsdscr;
                @XmlElement(name = "SRV_LVL_TYP_DSCR", required = true, nillable = true)
                protected String srvlvltypdscr;
                @XmlElement(name = "SRV_LVL_NM", required = true, nillable = true)
                protected String srvlvlnm;
                @XmlElement(name = "SRV_LVL_DSCR", required = true, nillable = true)
                protected String srvlvldscr;
                @XmlElement(name = "SRV_LVL_STOP_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar srvlvlstopdt;
                @XmlElement(name = "SRV_LVL_VAL", required = true, nillable = true)
                protected String srvlvlval;
                @XmlElement(name = "LST_UPDT_DT")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar lstupdtdt;
                @XmlElement(name = "LST_UPDT_USR_ID", required = true, nillable = true)
                protected String lstupdtusrid;
                @XmlElement(name = "HUB_STATE_IND")
                protected BigDecimal hubstateind;
                @XmlElement(name = "ORIGIN_SRC_SYS", required = true, nillable = true)
                protected String originsrcsys;

                /**
                 * Gets the value of the partysrvlvlid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                public Long getPARTYSRVLVLID() {
                    return partysrvlvlid;
                }

                /**
                 * Sets the value of the partysrvlvlid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                public void setPARTYSRVLVLID(Long value) {
                    this.partysrvlvlid = value;
                }

                /**
                 * Gets the value of the srcsystem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSRCSYSTEM() {
                    return srcsystem;
                }

                /**
                 * Sets the value of the srcsystem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSRCSYSTEM(String value) {
                    this.srcsystem = value;
                }

                /**
                 * Gets the value of the partyid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPARTYID() {
                    return partyid;
                }

                /**
                 * Sets the value of the partyid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPARTYID(String value) {
                    this.partyid = value;
                }

                /**
                 * Gets the value of the burstrecnum property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBURSTRECNUM() {
                    return burstrecnum;
                }

                /**
                 * Sets the value of the burstrecnum property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBURSTRECNUM(String value) {
                    this.burstrecnum = value;
                }

                /**
                 * Gets the value of the srvlvleffdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getSRVLVLEFFDT() {
                    return srvlvleffdt;
                }

                /**
                 * Sets the value of the srvlvleffdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setSRVLVLEFFDT(XMLGregorianCalendar value) {
                    this.srvlvleffdt = value;
                }

                /**
                 * Gets the value of the srvlvlsttsdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSRVLVLSTTSDSCR() {
                    return srvlvlsttsdscr;
                }

                /**
                 * Sets the value of the srvlvlsttsdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSRVLVLSTTSDSCR(String value) {
                    this.srvlvlsttsdscr = value;
                }

                /**
                 * Gets the value of the srvlvltypdscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSRVLVLTYPDSCR() {
                    return srvlvltypdscr;
                }

                /**
                 * Sets the value of the srvlvltypdscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSRVLVLTYPDSCR(String value) {
                    this.srvlvltypdscr = value;
                }

                /**
                 * Gets the value of the srvlvlnm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSRVLVLNM() {
                    return srvlvlnm;
                }

                /**
                 * Sets the value of the srvlvlnm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSRVLVLNM(String value) {
                    this.srvlvlnm = value;
                }

                /**
                 * Gets the value of the srvlvldscr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSRVLVLDSCR() {
                    return srvlvldscr;
                }

                /**
                 * Sets the value of the srvlvldscr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSRVLVLDSCR(String value) {
                    this.srvlvldscr = value;
                }

                /**
                 * Gets the value of the srvlvlstopdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getSRVLVLSTOPDT() {
                    return srvlvlstopdt;
                }

                /**
                 * Sets the value of the srvlvlstopdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setSRVLVLSTOPDT(XMLGregorianCalendar value) {
                    this.srvlvlstopdt = value;
                }

                /**
                 * Gets the value of the srvlvlval property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSRVLVLVAL() {
                    return srvlvlval;
                }

                /**
                 * Sets the value of the srvlvlval property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSRVLVLVAL(String value) {
                    this.srvlvlval = value;
                }

                /**
                 * Gets the value of the lstupdtdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getLSTUPDTDT() {
                    return lstupdtdt;
                }

                /**
                 * Sets the value of the lstupdtdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setLSTUPDTDT(XMLGregorianCalendar value) {
                    this.lstupdtdt = value;
                }

                /**
                 * Gets the value of the lstupdtusrid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLSTUPDTUSRID() {
                    return lstupdtusrid;
                }

                /**
                 * Sets the value of the lstupdtusrid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLSTUPDTUSRID(String value) {
                    this.lstupdtusrid = value;
                }

                /**
                 * Gets the value of the hubstateind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getHUBSTATEIND() {
                    return hubstateind;
                }

                /**
                 * Sets the value of the hubstateind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setHUBSTATEIND(BigDecimal value) {
                    this.hubstateind = value;
                }

                /**
                 * Gets the value of the originsrcsys property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getORIGINSRCSYS() {
                    return originsrcsys;
                }

                /**
                 * Sets the value of the originsrcsys property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setORIGINSRCSYS(String value) {
                    this.originsrcsys = value;
                }

            }

        }


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
         *         &lt;element name="SOURCE_SYSTEM" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "sourcesystem"
        })
        public static class SOURCESYSTEMS {

            @XmlElement(name = "SOURCE_SYSTEM", required = true)
            protected List<GetODSDetailsByPartyRowidObjectResponse.Party.SOURCESYSTEMS.SOURCESYSTEM> sourcesystem;

            /**
             * Gets the value of the sourcesystem property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the sourcesystem property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSOURCESYSTEM().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetODSDetailsByPartyRowidObjectResponse.Party.SOURCESYSTEMS.SOURCESYSTEM }
             * 
             * 
             */
            public List<GetODSDetailsByPartyRowidObjectResponse.Party.SOURCESYSTEMS.SOURCESYSTEM> getSOURCESYSTEM() {
                if (sourcesystem == null) {
                    sourcesystem = new ArrayList<GetODSDetailsByPartyRowidObjectResponse.Party.SOURCESYSTEMS.SOURCESYSTEM>();
                }
                return this.sourcesystem;
            }


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
             *         &lt;element name="SRC_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "srcsystem",
                "partyid"
            })
            public static class SOURCESYSTEM {

                @XmlElement(name = "SRC_SYSTEM", required = true)
                protected String srcsystem;
                @XmlElement(name = "PARTY_ID", required = true)
                protected String partyid;

                /**
                 * Gets the value of the srcsystem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSRCSYSTEM() {
                    return srcsystem;
                }

                /**
                 * Sets the value of the srcsystem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSRCSYSTEM(String value) {
                    this.srcsystem = value;
                }

                /**
                 * Gets the value of the partyid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPARTYID() {
                    return partyid;
                }

                /**
                 * Sets the value of the partyid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPARTYID(String value) {
                    this.partyid = value;
                }

            }

        }

    }

}
