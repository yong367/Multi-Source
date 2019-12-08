package com.example.multisource.dao.mysql;

import com.example.multisource.entity.UserMysql;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MysqlDao {

    List<UserMysql> getAll();

}
