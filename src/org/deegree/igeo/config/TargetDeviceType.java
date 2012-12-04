//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.15 at 10:29:06 AM MESZ 
//


package org.deegree.igeo.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Defines width, height (pixel) and resolution as dpi of the device a map model shall be rendered onto.
 * 			
 * 
 * <p>Java class for targetDeviceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="targetDeviceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pixelWidth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pixelHeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dpi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "targetDeviceType", namespace = "http://www.deegree.org/coremapmodel", propOrder = {
    "pixelWidth",
    "pixelHeight",
    "dpi"
})
public class TargetDeviceType {

    @XmlElement(namespace = "http://www.deegree.org/coremapmodel")
    protected int pixelWidth;
    @XmlElement(namespace = "http://www.deegree.org/coremapmodel")
    protected int pixelHeight;
    @XmlElement(namespace = "http://www.deegree.org/coremapmodel")
    protected int dpi;

    /**
     * Gets the value of the pixelWidth property.
     * 
     */
    public int getPixelWidth() {
        return pixelWidth;
    }

    /**
     * Sets the value of the pixelWidth property.
     * 
     */
    public void setPixelWidth(int value) {
        this.pixelWidth = value;
    }

    /**
     * Gets the value of the pixelHeight property.
     * 
     */
    public int getPixelHeight() {
        return pixelHeight;
    }

    /**
     * Sets the value of the pixelHeight property.
     * 
     */
    public void setPixelHeight(int value) {
        this.pixelHeight = value;
    }

    /**
     * Gets the value of the dpi property.
     * 
     */
    public int getDpi() {
        return dpi;
    }

    /**
     * Sets the value of the dpi property.
     * 
     */
    public void setDpi(int value) {
        this.dpi = value;
    }

}