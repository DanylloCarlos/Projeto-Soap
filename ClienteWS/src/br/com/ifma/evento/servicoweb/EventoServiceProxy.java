package br.com.ifma.evento.servicoweb;

public class EventoServiceProxy implements br.com.ifma.evento.servicoweb.EventoService {
  private String _endpoint = null;
  private br.com.ifma.evento.servicoweb.EventoService eventoService = null;
  
  public EventoServiceProxy() {
    _initEventoServiceProxy();
  }
  
  public EventoServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initEventoServiceProxy();
  }
  
  private void _initEventoServiceProxy() {
    try {
      eventoService = (new br.com.ifma.evento.servicoweb.EventoServiceServiceLocator()).getEventoServicePort();
      if (eventoService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)eventoService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)eventoService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (eventoService != null)
      ((javax.xml.rpc.Stub)eventoService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.ifma.evento.servicoweb.EventoService getEventoService() {
    if (eventoService == null)
      _initEventoServiceProxy();
    return eventoService;
  }
  
  public br.com.ifma.evento.servicoweb.Evento listarClientesPorEvento(java.lang.String arg0) throws java.rmi.RemoteException{
    if (eventoService == null)
      _initEventoServiceProxy();
    return eventoService.listarClientesPorEvento(arg0);
  }
  
  
}