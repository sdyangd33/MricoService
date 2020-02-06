package demo.controller;

import demo.entity.Menu;
import demo.entity.VO;
import demo.repository.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Value("server.port")
    private String port;

    @Autowired
    MenuMapper menuMapper;

    @GetMapping("/index")
    public String index() {
        return "Menu的端口号: " + port;
    }


    @GetMapping("/findAll/{index}/{limit}")
    public VO<Menu> findAll(@PathVariable("index") int index, @PathVariable("limit") int limit) {
        return new VO <Menu>(200, "ok", menuMapper.count(), menuMapper.findAll(index, limit));
    }

    @PostMapping("/save")
    public void save(@RequestBody Menu menu) {
        System.out.println(menu);
        menuMapper.save(menu);
    }
}
