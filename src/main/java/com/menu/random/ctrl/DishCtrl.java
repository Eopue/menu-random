package com.menu.random.ctrl;


import com.menu.random.pojo.Criteria;
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
@ResponseBody
@RequestMapping("/menu")
public class DishCtrl {

    @Autowired
    private DishesService dishesService;

    @GetMapping("/index")
    public RestResult getTodayMenu(@RequestParam("num") int num){
        List<Dishes> today = dishesService.getMenu(num);
        return new RestResult(today);
    }

    @GetMapping("/specifyPrice")
    public RestResult getTodayMenuOfSpecifyPrice(@RequestParam("price") int price){
        List<List<Dishes>> today = dishesService.getMenuOfSpecifyPrice(price);
        return new RestResult(today);
    }

    @GetMapping("/addDisabled")
    public RestResult getTodayMenuOfSpecifyPrice(@RequestParam("name") String name){
        Dishes dishes = new Dishes();
        dishes.setStatus("disabled");
        Criteria criteria = new Criteria();
        criteria.put("name", name);
        dishesService.updateByParamsSelective(dishes ,criteria);
        return new RestResult();
    }
}
