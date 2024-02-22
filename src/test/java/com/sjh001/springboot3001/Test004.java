package com.sjh001.springboot3001;


import com.sjh001.springboot3001.bean.Student;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.*;

@Slf4j
public class Test004 {
    @Test
    public void funTest001(){
        List<String> list = Arrays.asList("apple","banan","orange");
//        log.info();
        String s1 = "大";
        String s2 = "小";

        System.out.println(s1.compareTo(s2));
        list.forEach(System.out::println);

        StringBuffer stringBuffer = new StringBuffer("菜鸟教程");
        StringBuffer stringBuffer1 = stringBuffer.reverse();
        System.out.println(stringBuffer1);
        log.info(stringBuffer1.toString());


        String ss1 = "abc";
        String sub =  ss1.substring(2);
        System.out.println(sub);
        System.out.println(ss1.codePointAt(2));
    }

    @Test
    public void funTest002(){
        List<StudentStore> studentList = Arrays.asList(
                new StudentStore("张三","男",90,"123"),
                new StudentStore("李四","男",90,"123"),
                new StudentStore("王五","男",90,"123"),
                new StudentStore("赵六","男",90,"123"),
                new StudentStore("宋七","男",90,"123"),
                new StudentStore("张甲","男",90,"123"),
                new StudentStore("张已","男",90,"123"),
                new StudentStore("李四","男",90,"123"),
                new StudentStore("张丁","男",90,"123"),
                new StudentStore("张三","女",70,"123")
                );
        List<StudentStore> studentStores = new ArrayList<>();
        Map<String ,Integer> studentStoreMap = new HashMap<>();
        studentStores.forEach(System.out::println);
    }
}
