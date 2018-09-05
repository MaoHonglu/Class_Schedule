/**
 * RzzxConfManageServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.aftsky.schedule.muc;

public class RzzxConfManageServiceLocator extends org.apache.axis.client.Service implements cn.aftsky.schedule.muc.RzzxConfManageService {

    public RzzxConfManageServiceLocator() {
    }


    public RzzxConfManageServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RzzxConfManageServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RzzxConfManage
    private String RzzxConfManage_address = "http://ca.muc.edu.cn/zfca/axis/RzzxConfManage";

    public String getRzzxConfManageAddress() {
        return RzzxConfManage_address;
    }

    // The WSDD service name defaults to the port name.
    private String RzzxConfManageWSDDServiceName = "RzzxConfManage";

    public String getRzzxConfManageWSDDServiceName() {
        return RzzxConfManageWSDDServiceName;
    }

    public void setRzzxConfManageWSDDServiceName(String name) {
        RzzxConfManageWSDDServiceName = name;
    }

    public cn.aftsky.schedule.muc.RzzxConfManage_PortType getRzzxConfManage() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RzzxConfManage_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRzzxConfManage(endpoint);
    }

    public cn.aftsky.schedule.muc.RzzxConfManage_PortType getRzzxConfManage(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.aftsky.schedule.muc.RzzxConfManageSoapBindingStub _stub = new cn.aftsky.schedule.muc.RzzxConfManageSoapBindingStub(portAddress, this);
            _stub.setPortName(getRzzxConfManageWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRzzxConfManageEndpointAddress(String address) {
        RzzxConfManage_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.aftsky.schedule.muc.RzzxConfManage_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.aftsky.schedule.muc.RzzxConfManageSoapBindingStub _stub = new cn.aftsky.schedule.muc.RzzxConfManageSoapBindingStub(new java.net.URL(RzzxConfManage_address), this);
                _stub.setPortName(getRzzxConfManageWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("RzzxConfManage".equals(inputPortName)) {
            return getRzzxConfManage();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ca.muc.edu.cn/zfca/axis/RzzxConfManage", "RzzxConfManageService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ca.muc.edu.cn/zfca/axis/RzzxConfManage", "RzzxConfManage"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {

if ("RzzxConfManage".equals(portName)) {
            setRzzxConfManageEndpointAddress(address);
        }
        else
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
