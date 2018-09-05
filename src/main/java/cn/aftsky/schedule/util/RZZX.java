package cn.aftsky.schedule.util;
;
import cn.aftsky.schedule.muc.RzzxConfManageService;
import cn.aftsky.schedule.muc.RzzxConfManageServiceLocator;
import cn.aftsky.schedule.muc.RzzxConfManage_PortType;
import org.springframework.stereotype.Component;

import javax.xml.rpc.ServiceException;

/**
 * @author MaoHonglu
 * @create 2018/5/17
 * @since 1.0.0
 */
@Component
public class RZZX {
    private static final RzzxConfManageService rzzxService=new RzzxConfManageServiceLocator();
    private static RzzxConfManage_PortType rzzxBinding;
    static {
        try {
            rzzxBinding = (RzzxConfManage_PortType) rzzxService.getRzzxConfManage();
        } catch (ServiceException e) {
            System.out.println("绑定信息门户SOAP服务失败！");
        }
    }

    public RzzxConfManage_PortType getRzzxBinding() {
        return rzzxBinding;
    }

}