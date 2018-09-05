package cn.aftsky.schedule.service.impl;

import cn.aftsky.schedule.dao.ScheduleDao;
import cn.aftsky.schedule.model.Laboratory;
import cn.aftsky.schedule.model.TimeTable;
import cn.aftsky.schedule.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author MaoHonglu
 * @create 2018/9/3
 * @since 1.0.0
 */
@Repository("scheduleService")
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    ScheduleDao scheduleDao;

    @Override
    public List<Laboratory> queryLaboratory() {
        return scheduleDao.queryLaboratory();
    }

    @Override
    public TimeTable queryTimeTable(int timeTableId) {
        return scheduleDao.queryTimeTable(timeTableId);
    }

    @Override
    public int addLaboratory(Laboratory laboratory) {
        return scheduleDao.addLaboratory(laboratory);
    }

    @Override
    public int addTimeTable(TimeTable timeTable) {
        return scheduleDao.addTimeTable(timeTable);
    }

    @Override
    public int updateLaboratory(Laboratory laboratory) {
        return scheduleDao.updateLaboratory(laboratory);
    }

    @Override
    public int updateTimeTable(TimeTable timeTable) {
        return scheduleDao.updateTimeTable(timeTable);
    }

    @Override
    public int delLaboratory(int laboratoryId) {
        return scheduleDao.delLaboratory(laboratoryId);
    }

    @Override
    public int delTimeTable(int timeTableId) {
        return scheduleDao.delTimeTable(timeTableId);
    }
}