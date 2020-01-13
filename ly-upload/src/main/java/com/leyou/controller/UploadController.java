package com.leyou.controller;

import com.leyou.service.UpLoadService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@RestController
@RequestMapping("upload")
public class UploadController {

    @Resource
    UpLoadService upLoadService;

    @PostMapping("image")
    public ResponseEntity<?> uploadImage(@RequestParam("file") MultipartFile file){
        String upload = upLoadService.upload(file);
        return ResponseEntity.ok(upload);
    }


}
