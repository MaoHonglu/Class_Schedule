package cn.aftsky.schedule.service;


import cn.aftsky.schedule.model.Laboratory;
import cn.aftsky.schedule.model.TimeTable;
import cn.aftsky.schedule.util.ResponseWrapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * created by MaoHonglu on 2018/9/3.
 */
public interface ScheduleService {
    
     List<Laboratory> queryLaboratory();

     TimeTable queryTimeTable( int timeTableId);

     int addLaboratory(Laboratory laboratory);

     int addTimeTable(TimeTable timeTable);

     int updateLaboratory(Laboratory laboratory);

     int updateTimeTable(TimeTable timeTable);

     int delLaboratory( int laboratoryId);

     int delTimeTable( int timeTableId);
}
