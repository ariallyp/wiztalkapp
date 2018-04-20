
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
 *         &lt;element name="GetAppinfoResult" type="{http://data.easc.net/entities}AppResponse" minOccurs="0"/>
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
    "getAppinfoResult"
})
@XmlRootElement(name = "GetAppinfoResponse")
public class GetAppinfoResponse {

    @XmlElementRef(name = "GetAppinfoResult", namespace = "http://ws.easc.net/ApplicationService", type = JAXBElement.class, required = false)
    protected JAXBElement<AppResponse> getAppinfoResult;

    /**
     * ��ȡgetAppinfoResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AppResponse }{@code >}
     *     
     */
    public JAXBElement<AppResponse> getGetAppinfoResult() {
        return getAppinfoResult;
    }

    /**
     * ����getAppinfoResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AppResponse }{@code >}
     *     
     */
    public void setGetAppinfoResult(JAXBElement<AppResponse> value) {
        this.getAppinfoResult = value;
    }

}
