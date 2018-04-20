
package com.yuanxin.app.app.wsdl.wcf;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.penglui.ws.client.wcf package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _AppRequest_QNAME = new QName("http://data.easc.net/entities", "AppRequest");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _ArrayOfSeAuditLog_QNAME = new QName("http://schemas.datacontract.org/2004/07/PREasc.Model", "ArrayOfSeAuditLog");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _SeAuditLog_QNAME = new QName("http://schemas.datacontract.org/2004/07/PREasc.Model", "SeAuditLog");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _AppResponse_QNAME = new QName("http://data.easc.net/entities", "AppResponse");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _AuditLogRequest_QNAME = new QName("http://data.easc.net/entities", "AuditLogRequest");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _GetAuditLogsResponseGetAuditLogsResult_QNAME = new QName("http://ws.easc.net/ApplicationService", "GetAuditLogsResult");
    private final static QName _GetAuditLogsAppFunctionId_QNAME = new QName("http://ws.easc.net/ApplicationService", "appFunctionId");
    private final static QName _GetAuditLogsUser_QNAME = new QName("http://ws.easc.net/ApplicationService", "user");
    private final static QName _GetAuditLogsStartDate_QNAME = new QName("http://ws.easc.net/ApplicationService", "startDate");
    private final static QName _GetAuditLogsEndDate_QNAME = new QName("http://ws.easc.net/ApplicationService", "endDate");
    private final static QName _GetAuditLogsAppId_QNAME = new QName("http://ws.easc.net/ApplicationService", "appId");
    private final static QName _GetUserDynamicUserName_QNAME = new QName("http://ws.easc.net/ApplicationService", "userName");
    private final static QName _GetAppinfoRequest_QNAME = new QName("http://ws.easc.net/ApplicationService", "request");
    private final static QName _GetUserDynamicResponseGetUserDynamicResult_QNAME = new QName("http://ws.easc.net/ApplicationService", "GetUserDynamicResult");
    private final static QName _AppRequestUserHostName_QNAME = new QName("http://data.easc.net/entities", "UserHostName");
    private final static QName _AppRequestAppId_QNAME = new QName("http://data.easc.net/entities", "AppId");
    private final static QName _AppRequestMethodName_QNAME = new QName("http://data.easc.net/entities", "MethodName");
    private final static QName _AppRequestData_QNAME = new QName("http://data.easc.net/entities", "Data");
    private final static QName _AppRequestUserHostAddress_QNAME = new QName("http://data.easc.net/entities", "UserHostAddress");
    private final static QName _AuditLogRequestUserId_QNAME = new QName("http://data.easc.net/entities", "UserId");
    private final static QName _AuditLogRequestMessage_QNAME = new QName("http://data.easc.net/entities", "Message");
    private final static QName _AuditLogRequestAppFuntionId_QNAME = new QName("http://data.easc.net/entities", "AppFuntionId");
    private final static QName _GetAppinfoResponseGetAppinfoResult_QNAME = new QName("http://ws.easc.net/ApplicationService", "GetAppinfoResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.penglui.ws.client.wcf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserDynamicResponse }
     * 
     */
    public GetUserDynamicResponse createGetUserDynamicResponse() {
        return new GetUserDynamicResponse();
    }

    /**
     * Create an instance of {@link GetAuditLogs }
     * 
     */
    public GetAuditLogs createGetAuditLogs() {
        return new GetAuditLogs();
    }

    /**
     * Create an instance of {@link GetUserDynamic }
     * 
     */
    public GetUserDynamic createGetUserDynamic() {
        return new GetUserDynamic();
    }

    /**
     * Create an instance of {@link GetAuditLogsResponse }
     * 
     */
    public GetAuditLogsResponse createGetAuditLogsResponse() {
        return new GetAuditLogsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSeAuditLog }
     * 
     */
    public ArrayOfSeAuditLog createArrayOfSeAuditLog() {
        return new ArrayOfSeAuditLog();
    }

    /**
     * Create an instance of {@link GetAppinfo }
     * 
     */
    public GetAppinfo createGetAppinfo() {
        return new GetAppinfo();
    }

    /**
     * Create an instance of {@link AppRequest }
     * 
     */
    public AppRequest createAppRequest() {
        return new AppRequest();
    }

    /**
     * Create an instance of {@link GetAppinfoResponse }
     * 
     */
    public GetAppinfoResponse createGetAppinfoResponse() {
        return new GetAppinfoResponse();
    }

    /**
     * Create an instance of {@link AppResponse }
     * 
     */
    public AppResponse createAppResponse() {
        return new AppResponse();
    }

    /**
     * Create an instance of {@link WriteLogResponse }
     * 
     */
    public WriteLogResponse createWriteLogResponse() {
        return new WriteLogResponse();
    }

    /**
     * Create an instance of {@link WriteLog }
     * 
     */
    public WriteLog createWriteLog() {
        return new WriteLog();
    }

    /**
     * Create an instance of {@link AuditLogRequest }
     * 
     */
    public AuditLogRequest createAuditLogRequest() {
        return new AuditLogRequest();
    }

    /**
     * Create an instance of {@link SeAuditLog }
     * 
     */
    public SeAuditLog createSeAuditLog() {
        return new SeAuditLog();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.easc.net/entities", name = "AppRequest")
    public JAXBElement<AppRequest> createAppRequest(AppRequest value) {
        return new JAXBElement<AppRequest>(_AppRequest_QNAME, AppRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSeAuditLog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/PREasc.Model", name = "ArrayOfSeAuditLog")
    public JAXBElement<ArrayOfSeAuditLog> createArrayOfSeAuditLog(ArrayOfSeAuditLog value) {
        return new JAXBElement<ArrayOfSeAuditLog>(_ArrayOfSeAuditLog_QNAME, ArrayOfSeAuditLog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeAuditLog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/PREasc.Model", name = "SeAuditLog")
    public JAXBElement<SeAuditLog> createSeAuditLog(SeAuditLog value) {
        return new JAXBElement<SeAuditLog>(_SeAuditLog_QNAME, SeAuditLog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.easc.net/entities", name = "AppResponse")
    public JAXBElement<AppResponse> createAppResponse(AppResponse value) {
        return new JAXBElement<AppResponse>(_AppResponse_QNAME, AppResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuditLogRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.easc.net/entities", name = "AuditLogRequest")
    public JAXBElement<AuditLogRequest> createAuditLogRequest(AuditLogRequest value) {
        return new JAXBElement<AuditLogRequest>(_AuditLogRequest_QNAME, AuditLogRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSeAuditLog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.easc.net/ApplicationService", name = "GetAuditLogsResult", scope = GetAuditLogsResponse.class)
    public JAXBElement<ArrayOfSeAuditLog> createGetAuditLogsResponseGetAuditLogsResult(ArrayOfSeAuditLog value) {
        return new JAXBElement<ArrayOfSeAuditLog>(_GetAuditLogsResponseGetAuditLogsResult_QNAME, ArrayOfSeAuditLog.class, GetAuditLogsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.easc.net/ApplicationService", name = "appFunctionId", scope = GetAuditLogs.class)
    public JAXBElement<String> createGetAuditLogsAppFunctionId(String value) {
        return new JAXBElement<String>(_GetAuditLogsAppFunctionId_QNAME, String.class, GetAuditLogs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.easc.net/ApplicationService", name = "user", scope = GetAuditLogs.class)
    public JAXBElement<String> createGetAuditLogsUser(String value) {
        return new JAXBElement<String>(_GetAuditLogsUser_QNAME, String.class, GetAuditLogs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.easc.net/ApplicationService", name = "startDate", scope = GetAuditLogs.class)
    public JAXBElement<String> createGetAuditLogsStartDate(String value) {
        return new JAXBElement<String>(_GetAuditLogsStartDate_QNAME, String.class, GetAuditLogs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.easc.net/ApplicationService", name = "endDate", scope = GetAuditLogs.class)
    public JAXBElement<String> createGetAuditLogsEndDate(String value) {
        return new JAXBElement<String>(_GetAuditLogsEndDate_QNAME, String.class, GetAuditLogs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.easc.net/ApplicationService", name = "appId", scope = GetAuditLogs.class)
    public JAXBElement<String> createGetAuditLogsAppId(String value) {
        return new JAXBElement<String>(_GetAuditLogsAppId_QNAME, String.class, GetAuditLogs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.easc.net/ApplicationService", name = "userName", scope = GetUserDynamic.class)
    public JAXBElement<String> createGetUserDynamicUserName(String value) {
        return new JAXBElement<String>(_GetUserDynamicUserName_QNAME, String.class, GetUserDynamic.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.easc.net/ApplicationService", name = "request", scope = GetAppinfo.class)
    public JAXBElement<AppRequest> createGetAppinfoRequest(AppRequest value) {
        return new JAXBElement<AppRequest>(_GetAppinfoRequest_QNAME, AppRequest.class, GetAppinfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.easc.net/ApplicationService", name = "GetUserDynamicResult", scope = GetUserDynamicResponse.class)
    public JAXBElement<String> createGetUserDynamicResponseGetUserDynamicResult(String value) {
        return new JAXBElement<String>(_GetUserDynamicResponseGetUserDynamicResult_QNAME, String.class, GetUserDynamicResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuditLogRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.easc.net/ApplicationService", name = "request", scope = WriteLog.class)
    public JAXBElement<AuditLogRequest> createWriteLogRequest(AuditLogRequest value) {
        return new JAXBElement<AuditLogRequest>(_GetAppinfoRequest_QNAME, AuditLogRequest.class, WriteLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.easc.net/entities", name = "UserHostName", scope = AppRequest.class)
    public JAXBElement<String> createAppRequestUserHostName(String value) {
        return new JAXBElement<String>(_AppRequestUserHostName_QNAME, String.class, AppRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.easc.net/entities", name = "AppId", scope = AppRequest.class)
    public JAXBElement<String> createAppRequestAppId(String value) {
        return new JAXBElement<String>(_AppRequestAppId_QNAME, String.class, AppRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.easc.net/entities", name = "MethodName", scope = AppRequest.class)
    public JAXBElement<String> createAppRequestMethodName(String value) {
        return new JAXBElement<String>(_AppRequestMethodName_QNAME, String.class, AppRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.easc.net/entities", name = "Data", scope = AppRequest.class)
    public JAXBElement<Object> createAppRequestData(Object value) {
        return new JAXBElement<Object>(_AppRequestData_QNAME, Object.class, AppRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.easc.net/entities", name = "UserHostAddress", scope = AppRequest.class)
    public JAXBElement<String> createAppRequestUserHostAddress(String value) {
        return new JAXBElement<String>(_AppRequestUserHostAddress_QNAME, String.class, AppRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.easc.net/entities", name = "UserHostName", scope = AuditLogRequest.class)
    public JAXBElement<String> createAuditLogRequestUserHostName(String value) {
        return new JAXBElement<String>(_AppRequestUserHostName_QNAME, String.class, AuditLogRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.easc.net/entities", name = "UserId", scope = AuditLogRequest.class)
    public JAXBElement<String> createAuditLogRequestUserId(String value) {
        return new JAXBElement<String>(_AuditLogRequestUserId_QNAME, String.class, AuditLogRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.easc.net/entities", name = "AppId", scope = AuditLogRequest.class)
    public JAXBElement<String> createAuditLogRequestAppId(String value) {
        return new JAXBElement<String>(_AppRequestAppId_QNAME, String.class, AuditLogRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.easc.net/entities", name = "Message", scope = AuditLogRequest.class)
    public JAXBElement<String> createAuditLogRequestMessage(String value) {
        return new JAXBElement<String>(_AuditLogRequestMessage_QNAME, String.class, AuditLogRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.easc.net/entities", name = "AppFuntionId", scope = AuditLogRequest.class)
    public JAXBElement<String> createAuditLogRequestAppFuntionId(String value) {
        return new JAXBElement<String>(_AuditLogRequestAppFuntionId_QNAME, String.class, AuditLogRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.easc.net/entities", name = "UserHostAddress", scope = AuditLogRequest.class)
    public JAXBElement<String> createAuditLogRequestUserHostAddress(String value) {
        return new JAXBElement<String>(_AppRequestUserHostAddress_QNAME, String.class, AuditLogRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.easc.net/entities", name = "Message", scope = AppResponse.class)
    public JAXBElement<String> createAppResponseMessage(String value) {
        return new JAXBElement<String>(_AuditLogRequestMessage_QNAME, String.class, AppResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.easc.net/entities", name = "MethodName", scope = AppResponse.class)
    public JAXBElement<String> createAppResponseMethodName(String value) {
        return new JAXBElement<String>(_AppRequestMethodName_QNAME, String.class, AppResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.easc.net/entities", name = "Data", scope = AppResponse.class)
    public JAXBElement<Object> createAppResponseData(Object value) {
        return new JAXBElement<Object>(_AppRequestData_QNAME, Object.class, AppResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.easc.net/ApplicationService", name = "GetAppinfoResult", scope = GetAppinfoResponse.class)
    public JAXBElement<AppResponse> createGetAppinfoResponseGetAppinfoResult(AppResponse value) {
        return new JAXBElement<AppResponse>(_GetAppinfoResponseGetAppinfoResult_QNAME, AppResponse.class, GetAppinfoResponse.class, value);
    }

}
