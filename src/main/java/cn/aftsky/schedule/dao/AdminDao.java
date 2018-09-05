package cn.aftsky.schedule.dao;

import cn.aftsky.schedule.model.Admin;

/**
 * created by MaoHonglu on 2018/9/3.
 */
public interface AdminDao {

    Admin login(String account,String password);

    Admin addAdmin(String account);

    Admin delAdmin(String account);
}
