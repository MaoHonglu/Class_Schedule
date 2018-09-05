package cn.aftsky.schedule.model;

/**
 * @author MaoHonglu
 * @create 2018/9/3
 * @since 1.0.0
 */

/**
 * 实验室课程表
 */
public class TimeTable {
    private int timeTableId;
    private String timeTableContent;

    public TimeTable() {
    }

    public TimeTable(int timeTableId, String timeTableContent) {
        this.timeTableId = timeTableId;
        this.timeTableContent = timeTableContent;
    }

    public int getTimeTableId() {
        return timeTableId;
    }

    public void setTimeTableId(int timeTableId) {
        this.timeTableId = timeTableId;
    }

    public String getTimeTableContent() {
        return timeTableContent;
    }

    public void setTimeTableContent(String timeTableContent) {
        this.timeTableContent = timeTableContent;
    }
}