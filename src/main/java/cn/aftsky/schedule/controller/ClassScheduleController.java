package cn.aftsky.schedule.controller;

import cn.aftsky.schedule.model.Admin;
import cn.aftsky.schedule.model.Laboratory;
import cn.aftsky.schedule.model.TimeTable;
import cn.aftsky.schedule.service.AdminService;
import cn.aftsky.schedule.service.ScheduleService;
import cn.aftsky.schedule.util.ResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author MaoHonglu
 * @create 2018/9/3
 * @since 1.0.0
 */
@RestController(value="/schedule")
public class ClassScheduleController {

    @Autowired
    AdminService adminService;

    @Autowired
    ScheduleService scheduleService;

    /**
     * 1.adminService 管理员相关操作
     */

    /**
     * 1.1
     * i民大信息门户认证接口
     * @return 返回当前登录信息
     */
    @RequestMapping(value = "/admin",method = RequestMethod.POST)
    public ResponseWrapper login(HttpServletRequest request){
        String account  = request.getParameter("userId");
        String password  = request.getParameter("userPassword");
        System.out.println("接收到account:"+account);
        System.out.println("接收到password:"+password);

        Admin admin = adminService.login(account,password);

        if (admin!=null){
            return new ResponseWrapper().addObject("admin",admin);
        }else {
            return new ResponseWrapper("账号密码错误或者用户没有管理员权限");
        }
    }

    /**
     * 2. scheduleService 实验室和课程表相关操作
     */

    // 2.1.查询所有实验室基本信息接口
    @RequestMapping(value = "/laboratory",method = RequestMethod.GET)
    public ResponseWrapper queryLaboratory(){
        List<Laboratory> laboratoryList = scheduleService.queryLaboratory();
        return new ResponseWrapper().addObject("laboratoryList",laboratoryList);
    }
    // 2.2 查询具体某个实验室课表信息接口
    @RequestMapping(value = "/timeTable/{timeTableId}",method = RequestMethod.GET)
    public ResponseWrapper queryTimeTable(@PathVariable int timeTableId){
        TimeTable timeTable = scheduleService.queryTimeTable(timeTableId);
        return new ResponseWrapper().addObject("timeTable",timeTable);
    }
    // 2.3 增加某个实验室的基本信息接口
    @RequestMapping(value = "/laboratory",method = RequestMethod.POST)
    public ResponseWrapper addLaboratory(@RequestBody Laboratory laboratory){
        int laboratoryId = scheduleService.addLaboratory(laboratory);
        return new ResponseWrapper().addObject("laboratoryId",laboratoryId);
    }
    // 2.4 增加某个实验室的课表信息接口
    @RequestMapping(value = "/timeTable",method = RequestMethod.POST)
    public ResponseWrapper addTimeTable(@RequestBody TimeTable timeTable){
        int timeTableId = scheduleService.addTimeTable(timeTable);
        return new ResponseWrapper().addObject("timeTableId",timeTableId);
    }
    // 2.5 修改某个实验室的基本信息接口
    @RequestMapping(value = "/laboratory",method = RequestMethod.PUT)
    public ResponseWrapper updateLaboratory(@RequestBody Laboratory laboratory){
        int laboratoryId = scheduleService.updateLaboratory(laboratory);
        return new ResponseWrapper().addObject("laboratoryId",laboratoryId);
    }
    // 2.6 修改某个实验室的课表信息接口
    @RequestMapping(value = "/timeTable",method = RequestMethod.PUT)
    public ResponseWrapper updateTimeTable(@RequestBody TimeTable timeTable){
        int timeTableId = scheduleService.updateTimeTable(timeTable);
        return new ResponseWrapper().addObject("timeTableId",timeTableId);
    }
    // 2.7 删除某个实验室的基本信息接口
    @RequestMapping(value = "/laboratory/{laboratoryId}",method = RequestMethod.DELETE)
    public ResponseWrapper delLaboratory(@PathVariable int delLaboratoryId){
        int laboratoryId = scheduleService.delLaboratory(delLaboratoryId);
        return new ResponseWrapper().addObject("laboratoryId",laboratoryId);
    }
    // 2.8 删除某个实验室的课表信息接口
    @RequestMapping(value = "/timeTable/{timeTableId}",method = RequestMethod.DELETE)
    public ResponseWrapper delTimeTable(@PathVariable int delTimeTableId){
        int timeTableId = scheduleService.delTimeTable(delTimeTableId);
        return new ResponseWrapper().addObject("timeTableId",timeTableId);
    }
}