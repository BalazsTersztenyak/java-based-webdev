package com.example.demo.Controller;

import com.example.demo.Model.User;
import com.example.demo.Model.UserRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class WebCont {

    @GetMapping("/")
    public String load() {
        return "index.jsp";
    }

    @PostMapping("/login")
    public String login(HttpSession session, Model model, @RequestParam("nev") String name, @RequestParam("jelszo") String psw) {
        if (!name.isEmpty() && !psw.isEmpty()) {
            User user = UserRepo.getInstance().getUserByName(name);
            if (user != null)
            {
                if (user.isPasswordCorrect(psw))
                {
                    session.setAttribute("user",user);
                    return "main.jsp";
                }
            }
            else{
                return "redirect:/incorrect.html";
            }
        }
        else{
            model.addAttribute("user",new User(name,"",""));
            return "register.jsp";
        }

        return "";
    }

    @PostMapping("/adduser")
    public String addUser(@ModelAttribute("user") User u, HttpSession session){
        UserRepo.getInstance().addUser(u);
        session.setAttribute("user", u);
        return "main.jsp";
    }
}
