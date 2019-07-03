/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Stu
 * Author:   Administrator
 * Date:     2019/3/17 0017 14:53
 * Description: 学生
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hua.test.json;

import lombok.Data;
import org.junit.jupiter.api.Test;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈学生〉
 *
 * @author Administrator
 * @create 2019/3/17 0017
 * @since 1.0.0
 */
@Data
public class Stu  implements Serializable{

    private String name;

    @Test
    public  void test1(){
        String value="";

    }
}