package com.itmuch.cloud.controller;

import com.itmuch.cloud.pojo.ClUser;
import com.itmuch.cloud.service.ClUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private ClUserService clUserService;

    /**
     * 新增用户
     * @param clUser
     */
    @PostMapping("/add")
    public int add(ClUser clUser){
        return clUserService.insertOne(clUser);
    }

    /**
     * 查询用户
     * @param id
     */
    @GetMapping("/find/{id}")
    public ClUser findById(@PathVariable Long id){
        return clUserService.queryByPrimary(id);
    }

    /**
     * 分页查询用户
     * @param pageNum
     * @param pageSize
     * @param searchMap
     */
    @GetMapping("/pageinfo/{pageNum}/{pageSize}")
    public HashMap fromPageInfo(Map<String, Object> searchMap,
                                     @PathVariable(name = "pageNum") Integer pageNum , @PathVariable("pageSize") Integer pageSize){
        HashMap hashMap = new HashMap();
        hashMap.put("page",clUserService.fromPageInfo(searchMap,pageNum,pageSize));
        return hashMap;
    }

    /**
     * 分页查询用户:类似list
     * @param pageNum
     * @param pageSize
     * @param searchMap
     */
    @GetMapping("/page/{pageNum}/{pageSize}")
    public HashMap fromPage(Map<String, Object> searchMap,
                                 @PathVariable(name = "pageNum") Integer pageNum , @PathVariable("pageSize") Integer pageSize){
        HashMap hashMap = new HashMap();
        hashMap.put("page",clUserService.fromPage(searchMap,pageNum,pageSize));
        return hashMap;
    }


}
