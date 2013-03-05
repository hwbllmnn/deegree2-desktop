//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.20 at 10:12:01 AM MEZ 
//


package org.deegree.igeo.enterprise.dictionary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *       For JDBC based Datastores only, contains the necessary connection information.
 *       
 * 
 * <p>Java class for JDBCConnectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JDBCConnectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Driver" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecurityConstraints" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="Encoding" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="AliasPrefix" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="SDEDatabase" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="SDEVersion" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="OracleWorkspace" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JDBCConnectionType", namespace = "http://www.deegree.org/jdbc", propOrder = {
    "driver",
    "url",
    "user",
    "password",
    "securityConstraints",
    "encoding",
    "aliasPrefix",
    "sdeDatabase",
    "sdeVersion",
    "oracleWorkspace"
})
public class JDBCConnectionType {

    @XmlElement(name = "Driver", namespace = "http://www.deegree.org/jdbc", required = true)
    protected String driver;
    @XmlElement(name = "Url", namespace = "http://www.deegree.org/jdbc", required = true)
    protected String url;
    @XmlElement(name = "User", namespace = "http://www.deegree.org/jdbc")
    protected String user;
    @XmlElement(name = "Password", namespace = "http://www.deegree.org/jdbc")
    protected String password;
    @XmlElement(name = "SecurityConstraints", namespace = "http://www.deegree.org/jdbc")
    protected Object securityConstraints;
    @XmlElement(name = "Encoding", namespace = "http://www.deegree.org/jdbc")
    protected Object encoding;
    @XmlElement(name = "AliasPrefix", namespace = "http://www.deegree.org/jdbc")
    protected Object aliasPrefix;
    @XmlElement(name = "SDEDatabase", namespace = "http://www.deegree.org/jdbc")
    protected Object sdeDatabase;
    @XmlElement(name = "SDEVersion", namespace = "http://www.deegree.org/jdbc")
    protected Object sdeVersion;
    @XmlElement(name = "OracleWorkspace", namespace = "http://www.deegree.org/jdbc")
    protected Object oracleWorkspace;

    /**
     * Gets the value of the driver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriver() {
        return driver;
    }

    /**
     * Sets the value of the driver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriver(String value) {
        this.driver = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the securityConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSecurityConstraints() {
        return securityConstraints;
    }

    /**
     * Sets the value of the securityConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSecurityConstraints(Object value) {
        this.securityConstraints = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEncoding(Object value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the aliasPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAliasPrefix() {
        return aliasPrefix;
    }

    /**
     * Sets the value of the aliasPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAliasPrefix(Object value) {
        this.aliasPrefix = value;
    }

    /**
     * Gets the value of the sdeDatabase property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSDEDatabase() {
        return sdeDatabase;
    }

    /**
     * Sets the value of the sdeDatabase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSDEDatabase(Object value) {
        this.sdeDatabase = value;
    }

    /**
     * Gets the value of the sdeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSDEVersion() {
        return sdeVersion;
    }

    /**
     * Sets the value of the sdeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSDEVersion(Object value) {
        this.sdeVersion = value;
    }

    /**
     * Gets the value of the oracleWorkspace property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOracleWorkspace() {
        return oracleWorkspace;
    }

    /**
     * Sets the value of the oracleWorkspace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOracleWorkspace(Object value) {
        this.oracleWorkspace = value;
    }

}