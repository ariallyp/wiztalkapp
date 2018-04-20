
package com.yuanxin.app.app.wsdl.wcf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AuditLogRequest complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AuditLogRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppFuntionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OperateType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UserHostAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserHostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditLogRequest", namespace = "http://data.easc.net/entities", propOrder = {
    "appFuntionId",
    "appId",
    "message",
    "messageType",
    "operateType",
    "userHostAddress",
    "userHostName",
    "userId"
})
public class AuditLogRequest {

    @XmlElementRef(name = "AppFuntionId", namespace = "http://data.easc.net/entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> appFuntionId;
    @XmlElementRef(name = "AppId", namespace = "http://data.easc.net/entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> appId;
    @XmlElementRef(name = "Message", namespace = "http://data.easc.net/entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message;
    @XmlElement(name = "MessageType")
    protected Integer messageType;
    @XmlElement(name = "OperateType")
    protected Long operateType;
    @XmlElementRef(name = "UserHostAddress", namespace = "http://data.easc.net/entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userHostAddress;
    @XmlElementRef(name = "UserHostName", namespace = "http://data.easc.net/entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userHostName;
    @XmlElementRef(name = "UserId", namespace = "http://data.easc.net/entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userId;

    /**
     * ��ȡappFuntionId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAppFuntionId() {
        return appFuntionId;
    }

    /**
     * ����appFuntionId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAppFuntionId(JAXBElement<String> value) {
        this.appFuntionId = value;
    }

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
     * ��ȡmessage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessage() {
        return message;
    }

    /**
     * ����message���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessage(JAXBElement<String> value) {
        this.message = value;
    }

    /**
     * ��ȡmessageType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMessageType() {
        return messageType;
    }

    /**
     * ����messageType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMessageType(Integer value) {
        this.messageType = value;
    }

    /**
     * ��ȡoperateType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOperateType() {
        return operateType;
    }

    /**
     * ����operateType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOperateType(Long value) {
        this.operateType = value;
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

    /**
     * ��ȡuserId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserId() {
        return userId;
    }

    /**
     * ����userId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserId(JAXBElement<String> value) {
        this.userId = value;
    }

}
