package com.zhang.controller;


import com.zhang.model.auto.Shop;
import com.zhang.service.IShopService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author astupidcoder
 * @since 2023-05-26
 */
@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private IShopService iShopService;
    //查询所有
    @ApiOperation("查询所有")
    @GetMapping("/getShop")
    public List<Shop> getShop(){
        return iShopService.list();
    }

    //根据id删除
    @ApiOperation("根据id删除")
    @DeleteMapping("removeById")
    public void removeById(Long id) {
        iShopService.removeById(id);
    }
    //根据id修改
    @ApiOperation("根据id修改")
    @PostMapping("update")
    public void update(@RequestBody Shop shop) {
        iShopService.updateById(shop);
    }
    //新增
    @PostMapping("save")
    @ApiOperation("新增")
    public void save(@RequestBody Shop shop){
        iShopService.save(shop);
    }
}
