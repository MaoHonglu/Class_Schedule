package cn.aftsky.schedule.service.impl;

import cn.aftsky.schedule.dao.AdminDao;
import cn.aftsky.schedule.model.Admin;
import cn.aftsky.schedule.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author MaoHonglu
 * @create 2018/9/3
 * @since 1.0.0
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminDao adminDao;

    @Override
    public Admin login(String account, String password) {
        return adminDao.login(account,password);
    }

    @Override
    public Admin addAdmin(String account) {
        return null;
    }

    @Override
    public Admin delAdmin(String account) {
        return null;
    }
}