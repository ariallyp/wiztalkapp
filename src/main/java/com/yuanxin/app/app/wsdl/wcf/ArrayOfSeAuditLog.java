
package com.yuanxin.app.app.wsdl.wcf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfSeAuditLog complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSeAuditLog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeAuditLog" type="{http://schemas.datacontract.org/2004/07/PREasc.Model}SeAuditLog" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSeAuditLog", namespace = "http://schemas.datacontract.org/2004/07/PREasc.Model", propOrder = {
    "seAuditLog"
})
public class ArrayOfSeAuditLog {

    @XmlElement(name = "SeAuditLog", nillable = true)
    protected List<SeAuditLog> seAuditLog;

    /**
     * Gets the value of the seAuditLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seAuditLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeAuditLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeAuditLog }
     * 
     * 
     */
    public List<SeAuditLog> getSeAuditLog() {
        if (seAuditLog == null) {
            seAuditLog = new ArrayList<SeAuditLog>();
        }
        return this.seAuditLog;
    }

}
