package cn.aftsky.schedule.dao;

import cn.aftsky.schedule.model.Laboratory;
import cn.aftsky.schedule.model.TimeTable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * created by MaoHonglu on 2018/9/3.
 */
public interface ScheduleDao {

    List<Laboratory> queryLaboratory();

    TimeTable queryTimeTable(int timeTableId);

    int addLaboratory(Laboratory laboratory);

    int addTimeTable(TimeTable timeTable);

    int updateLaboratory(Laboratory laboratory);

    int updateTimeTable(TimeTable timeTable);

    int delLaboratory(int laboratoryId);

    int delTimeTable(int timeTableId);
}
