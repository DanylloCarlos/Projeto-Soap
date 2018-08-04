/**
 * EventoServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.ifma.evento.servicoweb;

public class EventoServiceServiceLocator extends org.apache.axis.client.Service implements br.com.ifma.evento.servicoweb.EventoServiceService {

    public EventoServiceServiceLocator() {
    }


    public EventoServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EventoServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EventoServicePort
    private java.lang.String EventoServicePort_address = "http://localhost:8080/reunire/EventoService";

    public java.lang.String getEventoServicePortAddress() {
        return EventoServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EventoServicePortWSDDServiceName = "EventoServicePort";

    public java.lang.String getEventoServicePortWSDDServiceName() {
        return EventoServicePortWSDDServiceName;
    }

    public void setEventoServicePortWSDDServiceName(java.lang.String name) {
        EventoServicePortWSDDServiceName = name;
    }

    public br.com.ifma.evento.servicoweb.EventoService getEventoServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EventoServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEventoServicePort(endpoint);
    }

    public br.com.ifma.evento.servicoweb.EventoService getEventoServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.ifma.evento.servicoweb.EventoServiceServiceSoapBindingStub _stub = new br.com.ifma.evento.servicoweb.EventoServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getEventoServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEventoServicePortEndpointAddress(java.lang.String address) {
        EventoServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.ifma.evento.servicoweb.EventoService.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.ifma.evento.servicoweb.EventoServiceServiceSoapBindingStub _stub = new br.com.ifma.evento.servicoweb.EventoServiceServiceSoapBindingStub(new java.net.URL(EventoServicePort_address), this);
                _stub.setPortName(getEventoServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
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
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EventoServicePort".equals(inputPortName)) {
            return getEventoServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://servicoweb.evento.ifma.com.br/", "EventoServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://servicoweb.evento.ifma.com.br/", "EventoServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EventoServicePort".equals(portName)) {
            setEventoServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
