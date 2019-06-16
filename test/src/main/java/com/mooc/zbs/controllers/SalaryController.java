package com.mooc.zbs.controllers;

import com.mooc.zbs.beans.AutoWired;
import com.mooc.zbs.service.SalaryService;
import com.mooc.zbs.web.mvc.Controller;
import com.mooc.zbs.web.mvc.RequestMapping;
import com.mooc.zbs.web.mvc.RequestParam;

@Controller
public class SalaryController {

    @AutoWired
    private SalaryService salaryService;

    @RequestMapping("/get_salary.json")
    public Integer getSalary(@RequestParam("name") String name,
                             @RequestParam("experince") String experince) {
        //return 10000;
        return salaryService.calSalary(Integer.parseInt(experince));
    }
}
