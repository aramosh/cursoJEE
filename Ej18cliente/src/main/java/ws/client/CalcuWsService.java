
package ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "CalcuWsService", targetNamespace = "http://webservice/", wsdlLocation = "http://localhost:8080/_29_WS_SOAP_HolaMundo-0.0.1-SNAPSHOT/CalcuWs?wsdl")
public class CalcuWsService
    extends Service
{

    private final static URL CALCUWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException CALCUWSSERVICE_EXCEPTION;
    private final static QName CALCUWSSERVICE_QNAME = new QName("http://webservice/", "CalcuWsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/_29_WS_SOAP_HolaMundo-0.0.1-SNAPSHOT/CalcuWs?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCUWSSERVICE_WSDL_LOCATION = url;
        CALCUWSSERVICE_EXCEPTION = e;
    }

    public CalcuWsService() {
        super(__getWsdlLocation(), CALCUWSSERVICE_QNAME);
    }

    public CalcuWsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCUWSSERVICE_QNAME, features);
    }

    public CalcuWsService(URL wsdlLocation) {
        super(wsdlLocation, CALCUWSSERVICE_QNAME);
    }

    public CalcuWsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCUWSSERVICE_QNAME, features);
    }

    public CalcuWsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalcuWsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CalcuSoap
     */
    @WebEndpoint(name = "CalcuWsPort")
    public CalcuSoap getCalcuWsPort() {
        return super.getPort(new QName("http://webservice/", "CalcuWsPort"), CalcuSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalcuSoap
     */
    @WebEndpoint(name = "CalcuWsPort")
    public CalcuSoap getCalcuWsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice/", "CalcuWsPort"), CalcuSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCUWSSERVICE_EXCEPTION!= null) {
            throw CALCUWSSERVICE_EXCEPTION;
        }
        return CALCUWSSERVICE_WSDL_LOCATION;
    }

}