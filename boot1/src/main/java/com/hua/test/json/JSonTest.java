/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: JSonTest
 * Author:   Administrator
 * Date:     2019/3/17 0017 14:06
 * Description: json对象
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hua.test.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈json对象〉
 *
 * @author Administrator
 * @create 2019/3/17 0017
 * @since 1.0.0
 */
public class JSonTest {



    @Test
    public void add(){
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("12",12);
        jsonObject.put("",90);

        Integer o = (Integer) jsonObject.get("12");

        if (o instanceof Object){
            System.out.println("ha");
        }
        if (o.getClass() == Integer.class){
            System.out.println("ha");
        }
        System.out.println(jsonObject.toJSONString());
    }



    @Test
    public void arr(){
        Stu stu=new Stu();
        stu.setName("123");
        System.out.println(stu.toString());
        Object o = JSON.toJSONString(stu);

        String bb="12:23";
        Map<String,Object> map=new HashMap<>();
        map.put("12","34");
        Object o1 = JSONObject.toJSON(map);
        JSONObject jsonObject = JSONObject.parseObject(o1.toString());

        System.out.println(jsonObject.toString());
    }
}