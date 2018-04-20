
package com.yuanxin.app.app.wsdl.wcf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AppRequest complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AppRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="MethodName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserHostAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserHostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppRequest", namespace = "http://data.easc.net/entities", propOrder = {
    "appId",
    "data",
    "methodName",
    "userHostAddress",
    "userHostName"
})
public class AppRequest {

    @XmlElementRef(name = "AppId", namespace = "http://data.easc.net/entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> appId;
    @XmlElementRef(name = "Data", namespace = "http://data.easc.net/entities", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> data;
    @XmlElementRef(name = "MethodName", namespace = "http://data.easc.net/entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> methodName;
    @XmlElementRef(name = "UserHostAddress", namespace = "http://data.easc.net/entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userHostAddress;
    @XmlElementRef(name = "UserHostName", namespace = "http://data.easc.net/entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userHostName;

    /**
     * ��ȡappId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAppId() {
        return appId;
    }

    /**
     * ����appId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAppId(JAXBElement<String> value) {
        this.appId = value;
    }

    /**
     * ��ȡdata���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getData() {
        return data;
    }

    /**
     * ����data���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setData(JAXBElement<Object> value) {
        this.data = value;
    }

    /**
     * ��ȡmethodName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMethodName() {
        return methodName;
    }

    /**
     * ����methodName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMethodName(JAXBElement<String> value) {
        this.methodName = value;
    }

    /**
     * ��ȡuserHostAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserHostAddress() {
        return userHostAddress;
    }

    /**
     * ����userHostAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserHostAddress(JAXBElement<String> value) {
        this.userHostAddress = value;
    }

    /**
     * ��ȡuserHostName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserHostName() {
        return userHostName;
    }

    /**
     * ����userHostName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserHostName(JAXBElement<String> value) {
        this.userHostName = value;
    }

}
