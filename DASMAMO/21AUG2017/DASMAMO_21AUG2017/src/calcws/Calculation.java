
package calcws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "calculation", targetNamespace = "http://CalcWs/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Calculation {


    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://CalcWs/", className = "calcws.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://CalcWs/", className = "calcws.AddResponse")
    @Action(input = "http://CalcWs/calculation/addRequest", output = "http://CalcWs/calculation/addResponse")
    public double add(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "divide", targetNamespace = "http://CalcWs/", className = "calcws.Divide")
    @ResponseWrapper(localName = "divideResponse", targetNamespace = "http://CalcWs/", className = "calcws.DivideResponse")
    @Action(input = "http://CalcWs/calculation/divideRequest", output = "http://CalcWs/calculation/divideResponse")
    public double divide(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiply", targetNamespace = "http://CalcWs/", className = "calcws.Multiply")
    @ResponseWrapper(localName = "multiplyResponse", targetNamespace = "http://CalcWs/", className = "calcws.MultiplyResponse")
    @Action(input = "http://CalcWs/calculation/multiplyRequest", output = "http://CalcWs/calculation/multiplyResponse")
    public double multiply(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "minus", targetNamespace = "http://CalcWs/", className = "calcws.Minus")
    @ResponseWrapper(localName = "minusResponse", targetNamespace = "http://CalcWs/", className = "calcws.MinusResponse")
    @Action(input = "http://CalcWs/calculation/minusRequest", output = "http://CalcWs/calculation/minusResponse")
    public double minus(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

}