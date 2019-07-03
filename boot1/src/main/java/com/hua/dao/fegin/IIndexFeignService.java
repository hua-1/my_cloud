/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: IIndexFeignService
 * Author:   Administrator
 * Date:     2019/6/3 0003 13:56
 * Description: fegin接口
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
 * 〈fegin接口〉
 *
 * @author Administrator
 * @create 2019/6/3 0003
 * @since 1.0.0
 */

@FeignClient(name = "search-github" , url = "https://api.github.com")
public interface IIndexFeignService {
    @RequestMapping(value = "/search/repositories" , method = RequestMethod.GET)
    String search(@RequestParam("q") String query);
}