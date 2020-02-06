package demo.repository;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import demo.entity.Menu;

import java.util.List;

public interface MenuMapper extends BaseMapper {

    List<Menu> findAll(int index, int limit);

    int count();

    void save(Menu menu);

}
