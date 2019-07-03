/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: HelloController
 * Author:   Administrator
 * Date:     2019/6/3 0003 14:15
 * Description: 提供服务
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hua.boot2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈提供服务〉
 *
 * @author Administrator
 * @create 2019/6/3 0003
 * @since 1.0.0
 */
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello(String name){
        return  "hello " + name;
    }

}