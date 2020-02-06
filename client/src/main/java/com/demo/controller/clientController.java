package com.demo.controller;

import com.demo.entity.Menu;
import com.demo.entity.VO;
import com.demo.fegin.MenuFegin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class clientController {


    @Autowired
    private MenuFegin menuFegin;


    @GetMapping("/menu/findAll/{index}/{limit}")
    public VO<Menu> findAll(@PathVariable("index") int index, @PathVariable("limit") int limit) {
        return menuFegin.findAll(index, limit);
    }

    @GetMapping("/menu/findAll")
    public VO<Menu> findAll2(@RequestParam("page") int page, @RequestParam("limit") int limit) {
        int index = page - 1;
        return menuFegin.findAll(index, limit);
    }

    @PostMapping("/save")
    public void save(Menu menu) {
        System.out.println(menu);
        menuFegin.save(menu);
    }
}
