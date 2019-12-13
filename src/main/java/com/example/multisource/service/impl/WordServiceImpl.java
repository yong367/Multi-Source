package com.example.multisource.service.impl;

import com.example.multisource.dao.oracle.WordMapper;
import com.example.multisource.entity.Word;
import com.example.multisource.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordServiceImpl extends BaseServiceImpl<Word> implements WordService<Word> {

    @Autowired
    private WordMapper wordMapper;

    @Override
    public List<Word> queryAll() {
        return wordMapper.queryAll();
    }
}
