package com.aprilskin.controller;

import com.aprilskin.configuration.HttpSessionUtils;
import com.aprilskin.entities.User;
//import com.aprilskin.entities.UserValidator;
import com.aprilskin.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/aprilskin/v1/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // 회원가입 화면
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String form() {
        return "/register";
    }

    // 회원가입 처리
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public User insert(@RequestBody User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    // 회원 리스트
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "/user/list";
    }

    // 로그인 페이지
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    // 로그인 처리
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String userId, String password, HttpSession session) {

        User user = userRepository.findByUserId(userId);

        if ( user == null ) {
            System.out.println("login failure");
            return "redirect:/users/loginForm";
        }

        // 로그인 시 password 값과 조회하려는 password 값 비교
        if ( !user.matchPassword(password) ) {
            System.out.println("login failure");
            return "redirect:/users/loginForm";
        }

        session.setAttribute(HttpSessionUtils.USER_SESSION_KEY, user);
        System.out.println("login success");
        return "redirect:/";
    }

    // 로그아웃 처리
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        // 세션에 담기 user 를 제거
        session.removeAttribute(HttpSessionUtils.USER_SESSION_KEY);
        System.out.println("logout success");
        return "redirect:/";
    }




}
