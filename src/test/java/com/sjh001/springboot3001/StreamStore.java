package com.sjh001.springboot3001;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class StreamStore {


     private List<Store> storeList = Arrays.asList(
            new Store("张三","软件1班",79.6,85.4,67.5,78.6),
            new Store("李四","软件1班",79.6,85.4,65.5,78.6),
            new Store("王五","软件1班",79.6,85.4,55.5,78.6),
            new Store("赵六","软件1班",79.6,85.4,85.5,78.6),
            new Store("宋七","软件1班",79.6,85.4,65.5,78.6),
            new Store("张三","软件1班",79.6,85.4,59.5,78.6),
            new Store("张甲","软件1班",79.6,85.4,65.5,78.6),
            new Store("宋已","软件1班",79.6,85.4,65.5,78.6),
            new Store("王丙","软件1班",79.6,85.4,65.5,78.6),
            new Store("赵丁","软件1班",79.6,85.4,68.5,78.6),
            new Store("张三","软件1班",79.6,85.4,45.5,78.6)
    );

     @Test
     public void storeTest003(){

     }


    @Test
    public void stroeTest(){
        storeList.forEach((item)->{
            log.info(item.toString());
        });
    }


    //过滤
    @Test
    public void storeTest001(){
        List<Store> storeList1 = storeList.stream()
                .filter((item)->{
                    return item.getYuwen()>60;
                })
                .collect(Collectors.toList());
        storeList1.forEach((item)->{
            log.info(item.toString());
        });
    }



    @Test
    public void storeTest002(){
        List<Store> storeList1 = storeList.stream()
                .sorted(Comparator.comparingDouble((item)->{
                    return item.getYuwen();
                }))
                .collect(Collectors.toList());

        storeList1.forEach((item)->{
            log.info(item.toString());
        });
    }
}
