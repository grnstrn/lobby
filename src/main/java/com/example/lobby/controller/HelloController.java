package com.example.lobby.controller;

import com.example.lobby.domain.User;
import com.example.lobby.repo.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping("/")
public class HelloController {
    private final MessageRepo messageRepo;

    @Value("${spring.profiles.active}")
    private String profile;

    @Autowired
    public HelloController(MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
    }

    @GetMapping
    public String hello(Model model, @AuthenticationPrincipal User user){
        HashMap<Object,Object> data = new HashMap<>();
        data.put("profile",user);
        data.put("messages",messageRepo.findAll());
        model.addAttribute("frontendData",data);
        model.addAttribute("isDevMode","dev".equals(profile));
        return "index";
    }
}
