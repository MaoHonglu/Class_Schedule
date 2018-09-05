/**
 * RzzxConf.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.aftsky.schedule.muc;

public class RzzxConf  implements java.io.Serializable {
    private String dbname;

    private String dbpwd;

    private String dbuser;

    private String exceptions;

    private String ipaddress;

    private String ipaddress2;

    private String ldapaddress;

    private String ldappeasedn;

    private String ldappwd;

    private String ldaprootdc;

    private String ldapsearchBase;

    @Override
    public String toString() {
        return "RzzxConf{" +
                "dbname='" + dbname + '\'' +
                ", dbpwd='" + dbpwd + '\'' +
                ", dbuser='" + dbuser + '\'' +
                ", exceptions='" + exceptions + '\'' +
                ", ipaddress='" + ipaddress + '\'' +
                ", ipaddress2='" + ipaddress2 + '\'' +
                ", ldapaddress='" + ldapaddress + '\'' +
                ", ldappeasedn='" + ldappeasedn + '\'' +
                ", ldappwd='" + ldappwd + '\'' +
                ", ldaprootdc='" + ldaprootdc + '\'' +
                ", ldapsearchBase='" + ldapsearchBase + '\'' +
                ", ldapuser='" + ldapuser + '\'' +
                ", port='" + port + '\'' +
                ", port2='" + port2 + '\'' +
                ", sjkljms='" + sjkljms + '\'' +
                '}';
    }

    private String ldapuser;

    private String port;

    private String port2;

    private String sjkljms;

    public RzzxConf() {
    }

    public RzzxConf(
           String dbname,
           String dbpwd,
           String dbuser,
           String exceptions,
           String ipaddress,
           String ipaddress2,
           String ldapaddress,
           String ldappeasedn,
           String ldappwd,
           String ldaprootdc,
           String ldapsearchBase,
           String ldapuser,
           String port,
           String port2,
           String sjkljms) {
           this.dbname = dbname;
           this.dbpwd = dbpwd;
           this.dbuser = dbuser;
           this.exceptions = exceptions;
           this.ipaddress = ipaddress;
           this.ipaddress2 = ipaddress2;
           this.ldapaddress = ldapaddress;
           this.ldappeasedn = ldappeasedn;
           this.ldappwd = ldappwd;
           this.ldaprootdc = ldaprootdc;
           this.ldapsearchBase = ldapsearchBase;
           this.ldapuser = ldapuser;
           this.port = port;
           this.port2 = port2;
           this.sjkljms = sjkljms;
    }


    /**
     * Gets the dbname value for this RzzxConf.
     *
     * @return dbname
     */
    public String getDbname() {
        return dbname;
    }


    /**
     * Sets the dbname value for this RzzxConf.
     *
     * @param dbname
     */
    public void setDbname(String dbname) {
        this.dbname = dbname;
    }


    /**
     * Gets the dbpwd value for this RzzxConf.
     *
     * @return dbpwd
     */
    public String getDbpwd() {
        return dbpwd;
    }


    /**
     * Sets the dbpwd value for this RzzxConf.
     *
     * @param dbpwd
     */
    public void setDbpwd(String dbpwd) {
        this.dbpwd = dbpwd;
    }


    /**
     * Gets the dbuser value for this RzzxConf.
     *
     * @return dbuser
     */
    public String getDbuser() {
        return dbuser;
    }


    /**
     * Sets the dbuser value for this RzzxConf.
     *
     * @param dbuser
     */
    public void setDbuser(String dbuser) {
        this.dbuser = dbuser;
    }


    /**
     * Gets the exceptions value for this RzzxConf.
     *
     * @return exceptions
     */
    public String getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this RzzxConf.
     *
     * @param exceptions
     */
    public void setExceptions(String exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the ipaddress value for this RzzxConf.
     *
     * @return ipaddress
     */
    public String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this RzzxConf.
     *
     * @param ipaddress
     */
    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the ipaddress2 value for this RzzxConf.
     *
     * @return ipaddress2
     */
    public String getIpaddress2() {
        return ipaddress2;
    }


    /**
     * Sets the ipaddress2 value for this RzzxConf.
     *
     * @param ipaddress2
     */
    public void setIpaddress2(String ipaddress2) {
        this.ipaddress2 = ipaddress2;
    }


    /**
     * Gets the ldapaddress value for this RzzxConf.
     *
     * @return ldapaddress
     */
    public String getLdapaddress() {
        return ldapaddress;
    }


    /**
     * Sets the ldapaddress value for this RzzxConf.
     *
     * @param ldapaddress
     */
    public void setLdapaddress(String ldapaddress) {
        this.ldapaddress = ldapaddress;
    }


    /**
     * Gets the ldappeasedn value for this RzzxConf.
     *
     * @return ldappeasedn
     */
    public String getLdappeasedn() {
        return ldappeasedn;
    }


    /**
     * Sets the ldappeasedn value for this RzzxConf.
     *
     * @param ldappeasedn
     */
    public void setLdappeasedn(String ldappeasedn) {
        this.ldappeasedn = ldappeasedn;
    }


    /**
     * Gets the ldappwd value for this RzzxConf.
     *
     * @return ldappwd
     */
    public String getLdappwd() {
        return ldappwd;
    }


    /**
     * Sets the ldappwd value for this RzzxConf.
     *
     * @param ldappwd
     */
    public void setLdappwd(String ldappwd) {
        this.ldappwd = ldappwd;
    }


    /**
     * Gets the ldaprootdc value for this RzzxConf.
     *
     * @return ldaprootdc
     */
    public String getLdaprootdc() {
        return ldaprootdc;
    }


    /**
     * Sets the ldaprootdc value for this RzzxConf.
     *
     * @param ldaprootdc
     */
    public void setLdaprootdc(String ldaprootdc) {
        this.ldaprootdc = ldaprootdc;
    }


    /**
     * Gets the ldapsearchBase value for this RzzxConf.
     *
     * @return ldapsearchBase
     */
    public String getLdapsearchBase() {
        return ldapsearchBase;
    }


    /**
     * Sets the ldapsearchBase value for this RzzxConf.
     *
     * @param ldapsearchBase
     */
    public void setLdapsearchBase(String ldapsearchBase) {
        this.ldapsearchBase = ldapsearchBase;
    }


    /**
     * Gets the ldapuser value for this RzzxConf.
     *
     * @return ldapuser
     */
    public String getLdapuser() {
        return ldapuser;
    }


    /**
     * Sets the ldapuser value for this RzzxConf.
     *
     * @param ldapuser
     */
    public void setLdapuser(String ldapuser) {
        this.ldapuser = ldapuser;
    }


    /**
     * Gets the port value for this RzzxConf.
     *
     * @return port
     */
    public String getPort() {
        return port;
    }


    /**
     * Sets the port value for this RzzxConf.
     *
     * @param port
     */
    public void setPort(String port) {
        this.port = port;
    }


    /**
     * Gets the port2 value for this RzzxConf.
     *
     * @return port2
     */
    public String getPort2() {
        return port2;
    }


    /**
     * Sets the port2 value for this RzzxConf.
     *
     * @param port2
     */
    public void setPort2(String port2) {
        this.port2 = port2;
    }


    /**
     * Gets the sjkljms value for this RzzxConf.
     *
     * @return sjkljms
     */
    public String getSjkljms() {
        return sjkljms;
    }


    /**
     * Sets the sjkljms value for this RzzxConf.
     *
     * @param sjkljms
     */
    public void setSjkljms(String sjkljms) {
        this.sjkljms = sjkljms;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RzzxConf)) return false;
        RzzxConf other = (RzzxConf) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.dbname==null && other.getDbname()==null) ||
             (this.dbname!=null &&
              this.dbname.equals(other.getDbname()))) &&
            ((this.dbpwd==null && other.getDbpwd()==null) ||
             (this.dbpwd!=null &&
              this.dbpwd.equals(other.getDbpwd()))) &&
            ((this.dbuser==null && other.getDbuser()==null) ||
             (this.dbuser!=null &&
              this.dbuser.equals(other.getDbuser()))) &&
            ((this.exceptions==null && other.getExceptions()==null) ||
             (this.exceptions!=null &&
              this.exceptions.equals(other.getExceptions()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) ||
             (this.ipaddress!=null &&
              this.ipaddress.equals(other.getIpaddress()))) &&
            ((this.ipaddress2==null && other.getIpaddress2()==null) ||
             (this.ipaddress2!=null &&
              this.ipaddress2.equals(other.getIpaddress2()))) &&
            ((this.ldapaddress==null && other.getLdapaddress()==null) ||
             (this.ldapaddress!=null &&
              this.ldapaddress.equals(other.getLdapaddress()))) &&
            ((this.ldappeasedn==null && other.getLdappeasedn()==null) ||
             (this.ldappeasedn!=null &&
              this.ldappeasedn.equals(other.getLdappeasedn()))) &&
            ((this.ldappwd==null && other.getLdappwd()==null) ||
             (this.ldappwd!=null &&
              this.ldappwd.equals(other.getLdappwd()))) &&
            ((this.ldaprootdc==null && other.getLdaprootdc()==null) ||
             (this.ldaprootdc!=null &&
              this.ldaprootdc.equals(other.getLdaprootdc()))) &&
            ((this.ldapsearchBase==null && other.getLdapsearchBase()==null) ||
             (this.ldapsearchBase!=null &&
              this.ldapsearchBase.equals(other.getLdapsearchBase()))) &&
            ((this.ldapuser==null && other.getLdapuser()==null) ||
             (this.ldapuser!=null &&
              this.ldapuser.equals(other.getLdapuser()))) &&
            ((this.port==null && other.getPort()==null) ||
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.port2==null && other.getPort2()==null) ||
             (this.port2!=null &&
              this.port2.equals(other.getPort2()))) &&
            ((this.sjkljms==null && other.getSjkljms()==null) ||
             (this.sjkljms!=null &&
              this.sjkljms.equals(other.getSjkljms())));
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
        if (getDbname() != null) {
            _hashCode += getDbname().hashCode();
        }
        if (getDbpwd() != null) {
            _hashCode += getDbpwd().hashCode();
        }
        if (getDbuser() != null) {
            _hashCode += getDbuser().hashCode();
        }
        if (getExceptions() != null) {
            _hashCode += getExceptions().hashCode();
        }
        if (getIpaddress() != null) {
            _hashCode += getIpaddress().hashCode();
        }
        if (getIpaddress2() != null) {
            _hashCode += getIpaddress2().hashCode();
        }
        if (getLdapaddress() != null) {
            _hashCode += getLdapaddress().hashCode();
        }
        if (getLdappeasedn() != null) {
            _hashCode += getLdappeasedn().hashCode();
        }
        if (getLdappwd() != null) {
            _hashCode += getLdappwd().hashCode();
        }
        if (getLdaprootdc() != null) {
            _hashCode += getLdaprootdc().hashCode();
        }
        if (getLdapsearchBase() != null) {
            _hashCode += getLdapsearchBase().hashCode();
        }
        if (getLdapuser() != null) {
            _hashCode += getLdapuser().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getPort2() != null) {
            _hashCode += getPort2().hashCode();
        }
        if (getSjkljms() != null) {
            _hashCode += getSjkljms().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RzzxConf.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:BeanService", "RzzxConf"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dbname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dbname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dbpwd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dbpwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dbuser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dbuser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipaddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipaddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipaddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldapaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldapaddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldappeasedn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldappeasedn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldappwd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldappwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldaprootdc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldaprootdc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldapsearchBase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldapsearchBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldapuser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldapuser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "port2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sjkljms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sjkljms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
