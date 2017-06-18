package com.janita.editor.controller;

import com.janita.editor.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Janita on 2017/6/18- 16:11
 * 该类是:
 */
@RestController
public class UploadController {

    @Autowired
    private UploadService uploadService;

    /**
     * 上传文件
     * @param file  文件
     * @return
     */
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    @ResponseBody
    public String uploadMultipartFile( @RequestParam("file") MultipartFile file){
        String url = uploadService.upload(file);
        System.out.println("*****"+url);
        return url;
    }
}
