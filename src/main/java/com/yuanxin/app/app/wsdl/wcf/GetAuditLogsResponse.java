
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
 *         &lt;element name="GetAuditLogsResult" type="{http://schemas.datacontract.org/2004/07/PREasc.Model}ArrayOfSeAuditLog" minOccurs="0"/>
 *         &lt;element name="pageCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "getAuditLogsResult",
    "pageCount"
})
@XmlRootElement(name = "GetAuditLogsResponse")
public class GetAuditLogsResponse {

    @XmlElementRef(name = "GetAuditLogsResult", namespace = "http://ws.easc.net/ApplicationService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSeAuditLog> getAuditLogsResult;
    protected Integer pageCount;

    /**
     * ��ȡgetAuditLogsResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSeAuditLog }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSeAuditLog> getGetAuditLogsResult() {
        return getAuditLogsResult;
    }

    /**
     * ����getAuditLogsResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSeAuditLog }{@code >}
     *     
     */
    public void setGetAuditLogsResult(JAXBElement<ArrayOfSeAuditLog> value) {
        this.getAuditLogsResult = value;
    }

    /**
     * ��ȡpageCount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageCount() {
        return pageCount;
    }

    /**
     * ����pageCount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageCount(Integer value) {
        this.pageCount = value;
    }

}
