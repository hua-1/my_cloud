/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: IndexController
 * Author:   Administrator
 * Date:     2019/6/3 0003 12:44
 * Description: 测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hua.controller;

import com.hua.dao.fegin.HelloFeignService;
import com.hua.dao.fegin.IIndexFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试〉
 *
 * @author Administrator
 * @create 2019/6/3 0003
 * @since 1.0.0
 */
@RestController
public class IndexController {

    @Autowired
    private IIndexFeignService feignService;

    @Autowired
    private HelloFeignService helloFeignService;


    @RequestMapping("/hello")
    public String hello(String name){
        return "hi " + name;
    }

    @RequestMapping("/timeout")
    public String timeout(){
        try{
            //睡5秒，网关Hystrix3秒超时，会触发熔断降级操作
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "timeout";
    }



    @RequestMapping(value = "/search" , method = RequestMethod.GET)
    public String search(@RequestParam("query") String query){
        return feignService.search(query);
    }


    private static ExecutorService pool;
    public static ExecutorService getPool()
    {
        //直接提交队列
        pool = new ThreadPoolExecutor(1, 2, 1000, TimeUnit.MILLISECONDS,
                new SynchronousQueue<Runnable>(),Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        return pool;
    }


}