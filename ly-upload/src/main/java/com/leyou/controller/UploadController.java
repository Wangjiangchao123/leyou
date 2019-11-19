package com.leyou.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("upload")
public class UploadController {


    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file){

        return ResponseEntity.ok("");
    }


}
