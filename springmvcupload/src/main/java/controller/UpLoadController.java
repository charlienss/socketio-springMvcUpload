package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import service.UpService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Controller
@RequestMapping("/")
public class UpLoadController {

    @Autowired
    private UpService upService;


    private String zhuan="";

    @RequestMapping("/upload")
    public String upload(@RequestParam(value = "file", required = false) MultipartFile file,
                         HttpServletRequest request, @RequestParam("iphost") String iphost,@RequestParam("port") String port,Model model) throws IOException {

        String fileName = file.getOriginalFilename();

        InputStream is = file.getInputStream();

        upService.upload(fileName,is,iphost,port);
        return "success";
    }


    @RequestMapping("/test")
    public String test(){

        return "test";
    }

    @RequestMapping("/liaotian")
    public String liaotian(String shuru,Model model){
        System.out.println("输入的:"+shuru);

        zhuan =shuru;

        model.addAttribute("shuru",zhuan);

        return "redirect:lai";
    }


    @RequestMapping("/lai")
    public String lai(String shuru,Model model,String iphost,String port){

        System.out.println("你输入的内容:"+shuru);

        model.addAttribute("shuru",shuru);

        String fanhui =   upService.liaotian(shuru,iphost,port);

        model.addAttribute("fanhui",fanhui);

        return "liaotian";
    }




}
