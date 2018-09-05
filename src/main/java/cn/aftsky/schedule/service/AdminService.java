package cn.aftsky.schedule.service;

import cn.aftsky.schedule.model.Admin;

/**
 * created by MaoHonglu on 2018/9/3.
 */
public interface AdminService {
    Admin login(String account, String password);

    Admin addAdmin(String account);

    Admin delAdmin(String account);
}
