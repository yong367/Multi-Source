package com.example.multisource.dao.oracle;

import com.example.multisource.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestDao {

    List<User> getAll();

}
