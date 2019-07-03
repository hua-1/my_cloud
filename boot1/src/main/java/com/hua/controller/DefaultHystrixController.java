/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: DefaultHystrixController
 * Author:   Administrator
 * Date:     2019/6/3 0003 10:57
 * Description: 控制类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hua.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈控制类〉
 *
 * @author Administrator
 * @create 2019/6/3 0003
 * @since 1.0.0
 */
@Controller
public class DefaultHystrixController {

    @RequestMapping("/defaultfallback")
    public Map<String,String> defaultfallback(){
        System.out.println("降级操作...");
        Map<String,String> map = new HashMap<>();
        map.put("resultCode","fail");
        map.put("resultMessage","服务异常");
        map.put("resultObj","null");
        return map;
    }

}