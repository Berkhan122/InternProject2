package com.bilgeadam.bilgeadamproject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bilgeadam.bilgeadamproject.Employees;
import com.bilgeadam.bilgeadamproject.EmployeeService;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class LoginController {

    final
    EmployeeService employeeService;

    public LoginController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/login")
    public String login(){return "login";}

    @GetMapping("/dashboard")
    public String dashboard() {return "dashboard";}

    @GetMapping("/dashboard")
    public String dashboard(Model model){
        List<Employees> employeesList = employeeService.showAllData();
        model.addAttribute("employees", employeesList);
        return "dashboard";
    }

}
