/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: HelloFeignService
 * Author:   Administrator
 * Date:     2019/6/3 0003 14:18
 * Description: jiekou
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hua.dao.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 〈一句话功能简述〉<br> 
 * 〈jiekou 〉
 *
 * @author Administrator
 * @create 2019/6/3 0003
 * @since 1.0.0
 */
@FeignClient(name = "eurekaclient2" ,fallback = DcClientFailBack.class)
public interface HelloFeignService {
    //地址为服务提供者对外暴露的地址
    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);
}