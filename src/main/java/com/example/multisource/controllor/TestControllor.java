package com.example.multisource.controllor;

import com.example.multisource.dao.mysql.MysqlDao;
import com.example.multisource.dao.oracle.TestDao;
import com.example.multisource.entity.User;
import com.example.multisource.entity.UserMysql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestControllor {

    @Autowired
    private TestDao testDao;

    @Autowired
    private MysqlDao mysqlDao;

    @RequestMapping("getAll")
    @ResponseBody
    public  List<User> getTest(){
        return testDao.getAll();
    }
    @RequestMapping("getAll1")
    @ResponseBody
    public  List<UserMysql> getMysqlTest(){
        return mysqlDao.getAll();
    }

}
