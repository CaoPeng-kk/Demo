package dec.controller;

import dec.POJO.User;
import dec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.security.PublicKey;

/*
* 一个处理器类
* */

@Controller
public class UserController {
    @Autowired
    private UserService service;
    @RequestMapping("/pages/query")
    public String query(String username, Model m){
        User newUser = new User();
        newUser.setName(username);
        User oldUser = service.selectUserByname(newUser);
        if (oldUser==null){
            return "NoPeople";
        }else {
            m.addAttribute("name", oldUser);
            return "People";
        }
    }
    @RequestMapping("/haha")
    public String comeBack(){
        System.out.println("11111111111");
        return "NoPeople";
    }

}
