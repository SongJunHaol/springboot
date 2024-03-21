package com.sjh001.springboot3001;


import com.sjh001.springboot3001.bean.Student;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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


    List<StudentStore> studentList = Arrays.asList(
            new StudentStore("zhangsan","男",90,"123"),
            new StudentStore("lisi","女",90,"123"),
            new StudentStore("wangwu","男",90,"123"),
            new StudentStore("zhaoliu","男",65,"123"),
            new StudentStore("songqi","男",90,"123"),
            new StudentStore("张甲","女",90,"123"),
            new StudentStore("妲己","男",40,"123"),
            new StudentStore("韩信","男",90,"123"),
            new StudentStore("李白","男",90,"123"),
            new StudentStore("关于","女",59,"123")
    );


    @Test
    public void funTest007(){
        studentList.stream().sorted().forEach(System.out::println);
    }



    @Test
    public void funTest005(){
        List<Integer> integerList = Arrays.asList(4,8,5,6,3,5);
        integerList.stream().sorted().forEach(System.out::println);
    }


    @Test
    public void funTest006(){
        List<String> integerList = Arrays.asList("as","ds","ar","gf");
        integerList.stream().sorted().forEach(System.out::println);
    }

    @Test
    public void funTest004(){
        studentList.stream().filter((item)->{
            return item.getSex().equals("男");
        }).map((item)->{
            return item.getStudentName();
        }).forEach((item)->{
            log.info(item);
        });
    }





    @Test
    public void funTest002(){

//        List<StudentStore> studentStores11 = studentList.stream()
//                .filter((item)-> item.getStore()>60)
//                .collect(Collectors.toList());
//        studentStores11.forEach((item)->{
//            System.out.println(item);
//        });
        studentList.stream().filter((item)->{
          return item.getStudentName().length()>3;
        }).map((item)->{
            return new StudentStore(item.getStudentName().toUpperCase(),item.getSex(),item.getStore(),item.getStudentId()) ;
        }).forEach(System.out::println);



    }



    @Test
    public void funTest003(){
        List<String> wordList = Arrays.asList("Java 8", "Lambdas", "In", "Action");
        List<String> strList = wordList.stream()
                .map(w -> w.split(" "))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        List<String> stringList = Arrays.asList("Java 8", "Lambdas", "In", "Action");

        List<Integer> collect = stringList.stream()
                .map(l ->l.length())
                .collect(Collectors.toList());


        strList.forEach((item)->{
            log.info("上{}",item);
        });

        collect.forEach((item)->{
            log.info(item.toString());
        });

    }

    @Test
    public void ofTest(){
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        stream.forEach((item)->{
            System.out.println(item);
        });
        System.out.println(stream);
    }

    @Test
    public void funTest(){
        Stream<Integer> stream = Stream.iterate(0, n -> n + 2).limit(5);
        stream.forEach((item)->{
            System.out.println(item);
        });
    }

    @Test
    public void mapTest(){
        List<String> stringList = Arrays.asList("Java 8", "Lambdas", "In", "Action");
        List<String> collect = stringList.stream()
                .map((item)->{return item.substring(2);})
                .collect(Collectors.toList());

        collect.forEach((item)->{
            System.out.println(item);
        });
    }

    @Test
    public void flatTest(){
        List<String> wordList = Arrays.asList("Java 8", "Lambdas", "In", "Action");

        List<String> strList = wordList.stream()
                .map(w -> w.split(" "))
                .flatMap(item->{
                    for (String s : item) {
                        log.info("item{}",s);
                    }
                    return Arrays.stream(item);
                })
                .collect(Collectors.toList());

        strList.forEach((item)->{
            log.info(item);
        });
    }


    @Test
    public void arrTest(){
        String s1 = "java 8";
        String[] ss1 = s1.split(" ");
        System.out.println();
        Stream stream = Arrays.stream(ss1);
        List list =(List) stream.collect(Collectors.toList());
        list.forEach((item)->{
            System.out.println(item);
        });
        for (String s : ss1) {
            log.info(s);
        }
    }

    @Test
    public void arrayTest(){
        String[][] arrayss = {{"a","b","c"},{"a1","b1","c1"}};
         Stream stream = Arrays.stream(arrayss)
                 .flatMap((item)->{
                     return Arrays.stream(item);
                 });
         stream.forEach((item)->{
             log.info("对对对{}",(String) item);
         });
    }

}
