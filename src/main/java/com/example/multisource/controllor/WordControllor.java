package com.example.multisource.controllor;

import com.example.multisource.entity.User;
import com.example.multisource.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WordControllor {

    @Autowired
    private WordService wordService;

    @RequestMapping("queryAll")
    @ResponseBody
    public  List<User> getTest(){
        return wordService.queryAll();
    }


}
