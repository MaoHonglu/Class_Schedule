package cn.aftsky.schedule.dao.impl;

import cn.aftsky.schedule.dao.AdminDao;
import cn.aftsky.schedule.model.Admin;
import cn.aftsky.schedule.muc.LoginResult;
import cn.aftsky.schedule.util.RZZX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author MaoHonglu
 * @create 2018/9/3
 * @since 1.0.0
 */
@Repository("adminDao")
public class AdminDaoImpl implements AdminDao{

    @Autowired
    private RZZX rzzx;
    @Autowired
    private JdbcOperations jdbcOperations;

    //sql查询语句
    private final String ADMIN_LOGIN="select * from admin where user_id=?";

    //RowMapper对象，用来从ResultSet中提取数据并构建目标对象
    private static final class AdminRowMapper implements RowMapper<Admin> {
        public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Admin(
                    rs.getString("user_id")
            );
        }
    }
    @Override
    public Admin login(String account, String password) {
        try {
            //1.首先查询自己的数据库里面是否存在这个管理员
            //如果不存在则会捕获Empty异常并且返回null，否则返回admin对象
            Admin admin = jdbcOperations.queryForObject(ADMIN_LOGIN,new AdminRowMapper(),account);
            //2.说明用户有管理员权限
            LoginResult loginResult = rzzx.getRzzxBinding().checklogin(account,password);
            if(loginResult.getSuccess()==true){
                admin = new Admin(loginResult.getEmail(),loginResult.getName(),loginResult.getSuccess(),loginResult.getUserId(),loginResult.getUserType());
            }else{
                return null;
            }
        }catch ( EmptyResultDataAccessException e){
            System.out.println("用户没有管理员权限");
        }
        catch (RemoteException e) {
            System.out.println("信息门户用户登录接口调用失败");
        }
        return null;
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