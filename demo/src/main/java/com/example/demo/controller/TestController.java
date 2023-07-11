package com.example.demo.controller;

import cn.hutool.core.codec.Base64;
import com.arcsoft.face.FaceEngine;
import com.example.demo.config.MyFaceFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author GLaDOS
 * @date 2023/5/10 22:25
 */
@RestController
public class TestController {

    @Autowired
    private MyFaceFeature myFaceFeature;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return "OK";
    }

    @RequestMapping(value = "/face", method = RequestMethod.POST)
    public String testFace(@RequestBody String base){
        try {

            File test = File.createTempFile("test", ".png");
            System.out.println(test.getAbsolutePath());
            Base64.decodeToFile(base.split(",")[1], test);

            FaceEngine faceEngine = new FaceEngine("D:\\人脸\\ArcSoft_ArcFace_Java_Windows_x64_V3.0\\libs\\WIN64");
            //获取当前人脸特征
            byte[] extract = new MyFaceFeature().extract(test, faceEngine);
            System.out.println(Arrays.toString(extract));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
