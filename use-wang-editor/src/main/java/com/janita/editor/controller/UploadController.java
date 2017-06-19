package com.janita.editor.controller;

import com.janita.editor.service.UploadService;
import com.janita.editor.util.CmMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.*;

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
    @RequestMapping(value = "/upload1",method = RequestMethod.POST)
    @ResponseBody
    public String uploadMultipartFile(@RequestParam("file") MultipartFile file){
        String url = uploadService.upload(file);
        System.out.println("*****"+url);
        return url;
    }



    @RequestMapping(value = "/upload")
    @ResponseBody
    public String upload(HttpServletRequest req) {
        MultipartHttpServletRequest mReq = (MultipartHttpServletRequest)req;
        Map<String, MultipartFile> fileMap = mReq.getFileMap();
        Set<String> strings = fileMap.keySet();
        List<String> list = new ArrayList<>(strings);
        String name = list.get(0);
        MultipartFile file = fileMap.get(name);
        String fileName = file.getOriginalFilename();
        String url = "";
        //获得扩展名
        String ext = fileName.substring(fileName.lastIndexOf(".") + 1,fileName.length()).toLowerCase();
        if(CmMethod.isImageTypevalidate(ext)) {
            String imgURL = uploadService.upload(file, ext);
            url = imgURL;
        }
        System.out.println("\n***** : " +  url);
        return url;
    }
}
