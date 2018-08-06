package socket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import socket.ChuanServer;

import java.io.IOException;

@Controller
public class PortController {

    @RequestMapping("/port")
    public  String port(String port,Model model){
        model.addAttribute("port",port);
        try {
            ChuanServer.protServer(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }



}
