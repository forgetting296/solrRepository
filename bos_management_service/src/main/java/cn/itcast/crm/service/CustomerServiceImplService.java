
package cn.itcast.crm.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CustomerServiceImplService", targetNamespace = "http://service.crm.itcast.cn/", wsdlLocation = "http://localhost:8081/crm/service/customer?wsdl")
public class CustomerServiceImplService
    extends Service
{

    private final static URL CUSTOMERSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CUSTOMERSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName CUSTOMERSERVICEIMPLSERVICE_QNAME = new QName("http://service.crm.itcast.cn/", "CustomerServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/crm/service/customer?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CUSTOMERSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        CUSTOMERSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public CustomerServiceImplService() {
        super(__getWsdlLocation(), CUSTOMERSERVICEIMPLSERVICE_QNAME);
    }

    public CustomerServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CUSTOMERSERVICEIMPLSERVICE_QNAME, features);
    }

    public CustomerServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, CUSTOMERSERVICEIMPLSERVICE_QNAME);
    }

    public CustomerServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CUSTOMERSERVICEIMPLSERVICE_QNAME, features);
    }

    public CustomerServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CustomerServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CustomerServiceImpl
     */
    @WebEndpoint(name = "CustomerServiceImplPort")
    public CustomerServiceImpl getCustomerServiceImplPort() {
        return super.getPort(new QName("http://service.crm.itcast.cn/", "CustomerServiceImplPort"), CustomerServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CustomerServiceImpl
     */
    @WebEndpoint(name = "CustomerServiceImplPort")
    public CustomerServiceImpl getCustomerServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.crm.itcast.cn/", "CustomerServiceImplPort"), CustomerServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CUSTOMERSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw CUSTOMERSERVICEIMPLSERVICE_EXCEPTION;
        }
        return CUSTOMERSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
