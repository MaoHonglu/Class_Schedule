package cn.aftsky.schedule.dao.impl;

import cn.aftsky.schedule.dao.ScheduleDao;
import cn.aftsky.schedule.model.Laboratory;
import cn.aftsky.schedule.model.TimeTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.List;

/**
 * @author MaoHonglu
 * @create 2018/9/3
 * @since 1.0.0
 */
@Repository("ScheduleDao")
public class ScheduleDaoImpl implements ScheduleDao {

    @Autowired
    private JdbcOperations jdbcOperations;

    KeyHolder keyHolder = new GeneratedKeyHolder();

    //sql查询语句
    //1.实验室的SQL 操作
    private static final String INSERT_LABORATORY="insert into laboratory (laboratory_id,subject_name,room_id,room_name) values(0,?,?,?)";
    private final String DELETE_LABORATORY="delete from laboratory where laboratory_id=?";
    private final String UPDATE_LABORATORY="update  laboratory set subject_name = ?, room_id = ?,room_name = ?,time_table_id = ? where laboratory_id=?";
    private final String QUERY_LABORATORY_BY_ID="select * from laboratory where laboratory_id=?";
    private final String QUERY_All_LABORATORY="select * from laboratory";
    //2.课表的SQL 操作
    private static final String INSERT_TIMETABLE="insert into time_table (time_table_id,time_table_content) values(0,?)";
    private final String DELETE_TIMETABLE="delete from time_table where time_table_id=?";
    private final String UPDATE_TIMETABLE="update time_table set time_table_content = ? where time_table_id=?";
    private final String QUERY_TIMETABLE_BY_ID="select * from time_table where time_table_id=?";
    private final String QUERY_All_TIMETABLE="select * from time_table";


    @Override
    public List<Laboratory> queryLaboratory() {
        List<Laboratory> laboratoryList = jdbcOperations.query(QUERY_All_LABORATORY,new LaboratoryRowMapper());
        return laboratoryList;
    }

    @Override
    public TimeTable queryTimeTable(int timeTableId) {
        TimeTable timeTable = jdbcOperations.queryForObject(QUERY_TIMETABLE_BY_ID,new TimeTableRowMapper(),timeTableId);
        return timeTable;
    }

    @Override
    public int addLaboratory(Laboratory laboratory) {
        jdbcOperations.update(new InsertLaboratoryPreparedStatementCreator(laboratory),keyHolder);
        System.out.println("插入的实验室的自增主键ID为："+keyHolder.getKey().intValue());
        return keyHolder.getKey().intValue();
    }

    @Override
    public int addTimeTable(TimeTable timeTable) {
        jdbcOperations.update(new InsertTimeTablePreparedStatementCreator(timeTable),keyHolder);
        System.out.println("插入的课表的自增主键ID为："+keyHolder.getKey().intValue());
        return keyHolder.getKey().intValue();
    }

    @Override
    public int updateLaboratory(Laboratory laboratory) {
        jdbcOperations.update(UPDATE_LABORATORY,
                laboratory.getSubjectName(),
                laboratory.getRoomId(),
                laboratory.getRoomName(),
                laboratory.getTimeTableId());
        return laboratory.getLaboratoryId();
    }

    @Override
    public int updateTimeTable(TimeTable timeTable) {
        jdbcOperations.update(UPDATE_TIMETABLE,
                timeTable.getTimeTableContent());
        return timeTable.getTimeTableId();
    }

    @Override
    public int delLaboratory(int laboratoryId) {
        jdbcOperations.update(DELETE_LABORATORY,
                laboratoryId);
        return laboratoryId;
    }

    @Override
    public int delTimeTable(int timeTableId) {
        jdbcOperations.update(DELETE_TIMETABLE,
                timeTableId);
        return timeTableId;
    }

    private static final class InsertLaboratoryPreparedStatementCreator implements PreparedStatementCreator {
        private Laboratory laboratory;

        public InsertLaboratoryPreparedStatementCreator(Laboratory laboratory){
            this.laboratory = laboratory;
        }

        public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {

            String sql = INSERT_LABORATORY;
            java.sql.PreparedStatement ps  = conn.prepareStatement(sql);
            ps.setString(1,laboratory.getSubjectName());
            ps.setInt(2,laboratory.getRoomId());
            ps.setString(3,laboratory.getRoomName());
            return ps;
        }

    }

    private static final class InsertTimeTablePreparedStatementCreator implements PreparedStatementCreator {
        private TimeTable timeTable;

        public InsertTimeTablePreparedStatementCreator(TimeTable timeTable){
            this.timeTable = timeTable;
        }

        public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
            String sql = INSERT_TIMETABLE;
            java.sql.PreparedStatement ps  = conn.prepareStatement(sql);
            ps.setString(1,timeTable.getTimeTableContent());
            return ps;
        }
    }

    //RowMapper对象，用来从ResultSet中提取数据并构建目标对象
    private static final class LaboratoryRowMapper implements RowMapper<Laboratory> {
        public Laboratory mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Laboratory(
                    rs.getInt("laboratory_id"),
                    rs.getString("subject_name"),
                    rs.getInt("room_id"),
                    rs.getString("room_name"),
                    rs.getInt("time_table_id")
            );
        }
    }

    private static final class TimeTableRowMapper implements RowMapper<TimeTable> {
        public TimeTable mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new TimeTable(
                    rs.getInt("time_table_id"),
                    rs.getString("time_table_content")
            );
        }
    }
}