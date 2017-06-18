package com.janita.editor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017/6/18- 16:11
 * 该类是:
 */
@RestController
public class UploadController {

    @RequestMapping("/upload")
    public String upload(){
        System.out.println("\n****************** ");
        return "图片url";
    }
}
