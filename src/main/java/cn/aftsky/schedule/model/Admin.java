package cn.aftsky.schedule.model;

/**
 * @author MaoHonglu
 * @create 2018/9/3
 * @since 1.0.0
 */
/* 后台管理员信息实体类 */
public class Admin {
    private String email;
    private String name;
    private Boolean success;
    private String userId;
    private int userType;

    public Admin() {
    }
    public Admin(String userId) {
        this.userId = userId;
    }

    public Admin(String email, String name, Boolean success, String userId, int userType) {
        this.email = email;
        this.name = name;
        this.success = success;
        this.userId = userId;
        this.userType = userType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }
}