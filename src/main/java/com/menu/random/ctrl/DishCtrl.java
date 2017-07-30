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

//    public static void main(String[] args){
//        DishesServiceImpl dishesService = new DishesServiceImpl();
//        List<Dishes> allDishes = new ArrayList<>();
//        Dishes dishes = new Dishes();
//        dishes.setName("t1");
//        dishes.setType("3");
//        allDishes.add(dishes);
//        dishes = new Dishes();
//        dishes.setName("t2");
//        dishes.setType("2");
//        allDishes.add(dishes);
//        dishes = new Dishes();
//        dishes.setName("t3");
//        dishes.setType("2");
//        allDishes.add(dishes);
//        dishes = new Dishes();
//        dishes.setName("a1");
//        dishes.setType("2");
//        allDishes.add(dishes);
//        dishes = new Dishes();
//        dishes.setName("a2");
//        dishes.setType("2");
//        allDishes.add(dishes);
//        dishes = new Dishes();
//        dishes.setName("a3");
//        dishes.setType("2");
//        allDishes.add(dishes);
//        dishes = new Dishes();
//        dishes.setName("b1");
//        dishes.setType("1");
//        allDishes.add(dishes);
//        dishes = new Dishes();
//        dishes.setName("b2");
//        dishes.setType("1");
//        allDishes.add(dishes);
//        dishes = new Dishes();
//        dishes.setName("b3");
//        dishes.setType("1");
//        allDishes.add(dishes);
//
//        List<Dishes> dishesList = dishesService.getMenu(5, allDishes);
//        dishesList.forEach(dishes1 ->{
//            System.out.println(dishes1.getName());
//        });
//    }
}
