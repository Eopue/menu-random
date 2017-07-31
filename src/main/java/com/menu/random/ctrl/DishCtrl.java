package com.menu.random.ctrl;


import com.menu.random.pojo.Dishes;
import com.menu.random.pojo.RestResult;
import com.menu.random.service.DishesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by liuxiaolu on 2017/7/28.
 */
@Controller
@RequestMapping("/menu")
public class DishCtrl {

    @Autowired
    private DishesService dishesService;

    @ResponseBody
    @GetMapping("/index")
    public RestResult getTodayMenu(@RequestParam("num") int num){
        List<Dishes> today = dishesService.getMenu(num);
        return new RestResult(today);
    }
}
