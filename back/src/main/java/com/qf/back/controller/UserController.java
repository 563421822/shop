package com.qf.back.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {
/*    @Autowired
    private IUserMapper iUserMapper;*/

    @RequestMapping(value = "/getAllUser")
    @ResponseBody
    public String getAllUser(Model model) {
//         iUserMapper.getAllUser();
        return null;
    }

}
