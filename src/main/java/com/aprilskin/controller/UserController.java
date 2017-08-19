package com.aprilskin.controller;

import com.aprilskin.configuration.HttpSessionUtils;
import com.aprilskin.entities.User;
import com.aprilskin.repositories.UserRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.logging.Logger;

import static com.aprilskin.configuration.HttpSessionUtils.USER_SESSION_KEY;

@Controller
@RequestMapping("/users")
public class UserController {

    //private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/form")
    public String form() {
        return "/user/form";
    }

    @PostMapping("/create")
    public String create(User user) {
        userRepository.save(user);
        return "redirect:/users/list";
    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("users",userRepository.findAll());
        return "/user/list";
    }

    @GetMapping("/loginForm")
    public String loginForm() {
        return "/user/login";
    }

    @PostMapping("/login")
    public String login(String userId, String password, HttpSession session){
        User user = userRepository.findByUserId(userId);

        if(user == null ) {
            System.out.println("login failure");
            return "redirect:/users/loginForm";
        }

        if( !user.matchPassword(password)){
            System.out.println("login failure");
            return "redirect:/users/loginForm";
        }

        session.setAttribute(HttpSessionUtils.USER_SESSION_KEY, user);
        System.out.println("login success");
        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {

        session.removeAttribute(HttpSessionUtils.USER_SESSION_KEY);
        System.out.println("logout success");
        return "redirect:/";
    }

    @GetMapping("/{id}/form")
    public String updateForm(@PathVariable Long id, Model model, HttpSession session) {

        if(!HttpSessionUtils.isLoginUser(session)) {
            return "redirect:/users/loginForm";
        }

        User sessionUser = HttpSessionUtils.getUserFromSession(session);

        if(!sessionUser.matchId(id)) {
            throw new IllegalStateException("Can't modify other's information");
        }

        User user = userRepository.findOne(id);
        model.addAttribute("user", user);
        return "/user/updateForm";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable Long id, User updateUser, HttpSession session){

        if(!HttpSessionUtils.isLoginUser(session)) {
            return "redirect:/users/loginForm";
        }

        User sessionUser = HttpSessionUtils.getUserFromSession(session);

        if(!sessionUser.matchId(id)) {
            throw new IllegalStateException("Can't modify other's information");
        }

        User user = userRepository.findOne(id);
        user.update(updateUser);
        userRepository.save(user);
        return  "redirect:/users/list";
    }


}
