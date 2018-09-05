/**
 * ModifypwdSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.aftsky.schedule.muc;

public class ModifypwdSet  implements java.io.Serializable {
    private String dlcs;

    private String exceptions;

    private String promptmode;

    private String sfgzxg;

    private String times;

    private String useModifpwd;

    public ModifypwdSet() {
    }

    public ModifypwdSet(
           String dlcs,
           String exceptions,
           String promptmode,
           String sfgzxg,
           String times,
           String useModifpwd) {
           this.dlcs = dlcs;
           this.exceptions = exceptions;
           this.promptmode = promptmode;
           this.sfgzxg = sfgzxg;
           this.times = times;
           this.useModifpwd = useModifpwd;
    }


    /**
     * Gets the dlcs value for this ModifypwdSet.
     *
     * @return dlcs
     */
    public String getDlcs() {
        return dlcs;
    }


    /**
     * Sets the dlcs value for this ModifypwdSet.
     *
     * @param dlcs
     */
    public void setDlcs(String dlcs) {
        this.dlcs = dlcs;
    }


    /**
     * Gets the exceptions value for this ModifypwdSet.
     *
     * @return exceptions
     */
    public String getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this ModifypwdSet.
     *
     * @param exceptions
     */
    public void setExceptions(String exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the promptmode value for this ModifypwdSet.
     *
     * @return promptmode
     */
    public String getPromptmode() {
        return promptmode;
    }


    /**
     * Sets the promptmode value for this ModifypwdSet.
     *
     * @param promptmode
     */
    public void setPromptmode(String promptmode) {
        this.promptmode = promptmode;
    }


    /**
     * Gets the sfgzxg value for this ModifypwdSet.
     *
     * @return sfgzxg
     */
    public String getSfgzxg() {
        return sfgzxg;
    }


    /**
     * Sets the sfgzxg value for this ModifypwdSet.
     *
     * @param sfgzxg
     */
    public void setSfgzxg(String sfgzxg) {
        this.sfgzxg = sfgzxg;
    }


    /**
     * Gets the times value for this ModifypwdSet.
     *
     * @return times
     */
    public String getTimes() {
        return times;
    }


    /**
     * Sets the times value for this ModifypwdSet.
     *
     * @param times
     */
    public void setTimes(String times) {
        this.times = times;
    }


    /**
     * Gets the useModifpwd value for this ModifypwdSet.
     *
     * @return useModifpwd
     */
    public String getUseModifpwd() {
        return useModifpwd;
    }


    /**
     * Sets the useModifpwd value for this ModifypwdSet.
     *
     * @param useModifpwd
     */
    public void setUseModifpwd(String useModifpwd) {
        this.useModifpwd = useModifpwd;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ModifypwdSet)) return false;
        ModifypwdSet other = (ModifypwdSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.dlcs==null && other.getDlcs()==null) ||
             (this.dlcs!=null &&
              this.dlcs.equals(other.getDlcs()))) &&
            ((this.exceptions==null && other.getExceptions()==null) ||
             (this.exceptions!=null &&
              this.exceptions.equals(other.getExceptions()))) &&
            ((this.promptmode==null && other.getPromptmode()==null) ||
             (this.promptmode!=null &&
              this.promptmode.equals(other.getPromptmode()))) &&
            ((this.sfgzxg==null && other.getSfgzxg()==null) ||
             (this.sfgzxg!=null &&
              this.sfgzxg.equals(other.getSfgzxg()))) &&
            ((this.times==null && other.getTimes()==null) ||
             (this.times!=null &&
              this.times.equals(other.getTimes()))) &&
            ((this.useModifpwd==null && other.getUseModifpwd()==null) ||
             (this.useModifpwd!=null &&
              this.useModifpwd.equals(other.getUseModifpwd())));
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
        if (getDlcs() != null) {
            _hashCode += getDlcs().hashCode();
        }
        if (getExceptions() != null) {
            _hashCode += getExceptions().hashCode();
        }
        if (getPromptmode() != null) {
            _hashCode += getPromptmode().hashCode();
        }
        if (getSfgzxg() != null) {
            _hashCode += getSfgzxg().hashCode();
        }
        if (getTimes() != null) {
            _hashCode += getTimes().hashCode();
        }
        if (getUseModifpwd() != null) {
            _hashCode += getUseModifpwd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModifypwdSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:BeanService", "ModifypwdSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dlcs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dlcs"));
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
        elemField.setFieldName("promptmode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "promptmode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sfgzxg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sfgzxg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("times");
        elemField.setXmlName(new javax.xml.namespace.QName("", "times"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useModifpwd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useModifpwd"));
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
