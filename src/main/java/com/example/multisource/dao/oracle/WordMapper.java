package com.example.multisource.dao.oracle;

import com.example.multisource.entity.Word;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WordMapper {

    List<Word> queryAll();


}
