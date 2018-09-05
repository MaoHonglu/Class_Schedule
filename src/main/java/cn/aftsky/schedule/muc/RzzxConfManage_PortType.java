/**
 * RzzxConfManage_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.aftsky.schedule.muc;

public interface RzzxConfManage_PortType extends java.rmi.Remote {
    public cn.aftsky.schedule.muc.RzzxConf getrzzxconf() throws java.rmi.RemoteException;
    public cn.aftsky.schedule.muc.Rzzxjcxx getrzzxjcxx() throws java.rmi.RemoteException;
    public Boolean setrzzxjcxx(cn.aftsky.schedule.muc.Rzzxjcxx rzzxjcxx) throws java.rmi.RemoteException;
    public cn.aftsky.schedule.muc.ModifypwdSet getModifypwdSet() throws java.rmi.RemoteException;
    public Boolean setModifypwdSet(cn.aftsky.schedule.muc.ModifypwdSet modifypwdset) throws java.rmi.RemoteException;
    public Object[] getYwxtdmYhlxList(String ywxtdm) throws java.rmi.RemoteException;
    public Object[] getYwxtdmList() throws java.rmi.RemoteException;
    public cn.aftsky.schedule.muc.LoginResult checklogin(String yhm, String kl) throws java.rmi.RemoteException;
    public Boolean checkLoginService(String yhm, String kl) throws java.rmi.RemoteException;
    public Object[] getUserRights(String username, String ywxtdm) throws java.rmi.RemoteException;
    public Boolean setrzzxconf(cn.aftsky.schedule.muc.RzzxConf rzzxConf) throws java.rmi.RemoteException;
    public cn.aftsky.schedule.muc.LoginResult getUserInfo(String yhm, String key) throws java.rmi.RemoteException;
}
