package com.example.lobby.controller;

import com.example.lobby.domain.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping("/")
public class HelloController {
    @GetMapping
    public String hello(Model model, @AuthenticationPrincipal User user){
        HashMap<Object,Object> data = new HashMap<>();
        data.put("profile",user);
        data.put("messages",null);
        model.addAttribute("frontendData",data);
        return "index";
    }
}
