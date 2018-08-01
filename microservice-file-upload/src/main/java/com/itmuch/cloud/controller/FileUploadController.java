package com.itmuch.cloud.controller;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class FileUploadController {

    /**
     * 上传文件
     * 有页面测试:http://localhost:5001/index.html
     * 无页面测试:curl -F "file=@文件全名" localhost:5001/upload
     * ps. 该示例比较简单,没有做io异常,文件大小,文件非空等处理
     * @param file  待上传的文件
     * @return 文件在服务器上的绝对路径
     * @throws java.io.IOException IO 异常
     * */
    //@PostMapping(value = "/upload")
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public @ResponseBody String handleFileUpload(@RequestParam(value = "file")MultipartFile file) throws IOException{
        byte [] bytes = file.getBytes();
        File fileToSave = new File(file.getOriginalFilename());
        FileCopyUtils.copy(bytes,fileToSave);
        return fileToSave.getAbsolutePath();
    }
}
