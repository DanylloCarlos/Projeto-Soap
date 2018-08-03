/**
 * EventoServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.ifma.evento.servicoweb;

public interface EventoServiceService extends javax.xml.rpc.Service {
    public java.lang.String getEventoServicePortAddress();

    public br.com.ifma.evento.servicoweb.EventoService getEventoServicePort() throws javax.xml.rpc.ServiceException;

    public br.com.ifma.evento.servicoweb.EventoService getEventoServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
