package com.demo.fegin;

import com.demo.entity.Menu;
import com.demo.entity.VO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient("menu") //相当于 IP+端口号
public interface MenuFegin {

    @GetMapping("/menu/findAll/{index}/{limit}")
        //当调用这个findAll方法时候,这个index 和 limit 参数就会赋值给这个地址。
    VO<Menu> findAll(@PathVariable("index") int index, @PathVariable("limit") int limit);

    @PostMapping("/menu/save")
    void save(Menu menu);

}
