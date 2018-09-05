package cn.aftsky.schedule.model;

/**
 * @author MaoHonglu
 * @create 2018/9/3
 * @since 1.0.0
 */
/*
* 实验室信息基本表
* */
public class Laboratory {
    private int laboratoryId;
    private String subjectName;
    private int roomId;
    private String roomName;
    private int timeTableId;

    public Laboratory(){

    }
    public Laboratory(int laboratoryId, String subjectName, int roomId,String roomName,int timeTableId) {
        this.laboratoryId = laboratoryId;
        this.subjectName = subjectName;
        this.roomId = roomId;
        this.roomName = roomName;
        this.timeTableId = timeTableId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getLaboratoryId() {
        return laboratoryId;
    }

    public void setLaboratoryId(int laboratoryId) {
        this.laboratoryId = laboratoryId;
    }

    public int getTimeTableId() {
        return timeTableId;
    }

    public void setTimeTableId(int timeTableId) {
        this.timeTableId = timeTableId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
}