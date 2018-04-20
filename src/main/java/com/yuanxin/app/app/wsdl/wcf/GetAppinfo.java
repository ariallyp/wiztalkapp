
package com.yuanxin.app.app.wsdl.wcf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://data.easc.net/entities}AppRequest" minOccurs="0"/>
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
    "request"
})
@XmlRootElement(name = "GetAppinfo")
public class GetAppinfo {

    @XmlElementRef(name = "request", namespace = "http://ws.easc.net/ApplicationService", type = JAXBElement.class, required = false)
    protected JAXBElement<AppRequest> request;

    /**
     * ��ȡrequest���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AppRequest }{@code >}
     *     
     */
    public JAXBElement<AppRequest> getRequest() {
        return request;
    }

    /**
     * ����request���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AppRequest }{@code >}
     *     
     */
    public void setRequest(JAXBElement<AppRequest> value) {
        this.request = value;
    }

}
