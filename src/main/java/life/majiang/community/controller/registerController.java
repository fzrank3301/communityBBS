package life.majiang.community.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import life.majiang.community.mapper.localUserMapper;
import life.majiang.community.model.localUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class registerController {

    @Autowired
    private localUserMapper localUserMapper;



    @GetMapping("/register")
    public String registerthis(){

        return "register";

    }


    @PostMapping("/register")
    public String register(@RequestParam(value = "uid")String uid,
                           @RequestParam(value = "petName")String petName,
                           @RequestParam(value = "phoneNum")String phoneNum,
                           @RequestParam(value = "Email")String Email,
                           @RequestParam(value = "password")String password,
                           HttpServletRequest request,
                           Model model){

        localUser localUser = new localUser();
        localUser.setUid(uid);
        localUser.setPetName(petName);
        localUser.setPhoneNum(phoneNum);
        localUser.setEmail(Email);
        localUser.setPassword(password);
        Integer totalsuccess = localUserMapper.create(localUser);


        model.addAttribute("hassuccess",totalsuccess);

        return "rediecrt:/";

    }

}
