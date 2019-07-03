/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: DcClientFailBack
 * Author:   Administrator
 * Date:     2019/6/3 0003 14:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hua.dao.fegin;

import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/6/3 0003
 * @since 1.0.0
 */
@Component
public class DcClientFailBack implements HelloFeignService{

    @Override
    public String hello(String name) {
        System.out.println("熔断，默认回调函数");
        return "熔断，默认回调函数";
    }
}