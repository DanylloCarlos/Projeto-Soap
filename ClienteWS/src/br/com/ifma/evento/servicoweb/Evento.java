/**
 * Evento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.ifma.evento.servicoweb;

public class Evento  implements java.io.Serializable {
    private br.com.ifma.evento.servicoweb.Cliente cliente;

    private java.lang.Integer id;

    private java.lang.String nomeEvento;

    public Evento() {
    }

    public Evento(
           br.com.ifma.evento.servicoweb.Cliente cliente,
           java.lang.Integer id,
           java.lang.String nomeEvento) {
           this.cliente = cliente;
           this.id = id;
           this.nomeEvento = nomeEvento;
    }


    /**
     * Gets the cliente value for this Evento.
     * 
     * @return cliente
     */
    public br.com.ifma.evento.servicoweb.Cliente getCliente() {
        return cliente;
    }


    /**
     * Sets the cliente value for this Evento.
     * 
     * @param cliente
     */
    public void setCliente(br.com.ifma.evento.servicoweb.Cliente cliente) {
        this.cliente = cliente;
    }


    /**
     * Gets the id value for this Evento.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this Evento.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the nomeEvento value for this Evento.
     * 
     * @return nomeEvento
     */
    public java.lang.String getNomeEvento() {
        return nomeEvento;
    }


    /**
     * Sets the nomeEvento value for this Evento.
     * 
     * @param nomeEvento
     */
    public void setNomeEvento(java.lang.String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Evento)) return false;
        Evento other = (Evento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cliente==null && other.getCliente()==null) || 
             (this.cliente!=null &&
              this.cliente.equals(other.getCliente()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.nomeEvento==null && other.getNomeEvento()==null) || 
             (this.nomeEvento!=null &&
              this.nomeEvento.equals(other.getNomeEvento())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCliente() != null) {
            _hashCode += getCliente().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNomeEvento() != null) {
            _hashCode += getNomeEvento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Evento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servicoweb.evento.ifma.com.br/", "evento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicoweb.evento.ifma.com.br/", "cliente"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeEvento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeEvento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
