package com.sjh001.springboot3001;

import org.junit.jupiter.api.Test;

import java.io.*;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class Test002 {
    @Test
    public void test001(){
        File file1 = new File("D:\\aaa\\a.txt");
        File file2 = new File("D:\\aaa","a.txt");
        File file3 = new File("a.txt");
        System.out.println(file1);
        System.out.println(file2);
        System.out.println(file3);
    }

    @Test
    public void test002(){
        String filePath = "F:\\img\\1.jpg"; // 文件路径

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // 打印每一行内容
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test003(){
        String filePath = "F:\\img\\3.txt"; // 文件路径
        String content = "Hello, World!"; // 要写入文件的内容
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content); // 写入内容到文件
            System.out.println("文件写入成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void tesst004(){
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:mm");
        TemporalAccessor parsed1 = formatter1.parse("24:00");
        LocalTime lt1 = parsed1.query(LocalTime::from);
        Period excessDays1 = parsed1.query(DateTimeFormatter.parsedExcessDays());
        System.out.println(lt1 + " , " + excessDays1);	//00:00 , P1D

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        TemporalAccessor parsed2 = formatter2.parse("2018-12-03 24:00");
        LocalDateTime lt2 = parsed2.query(LocalDateTime::from);
        Period excessDays2 = parsed2.query(DateTimeFormatter.parsedExcessDays());
        System.out.println(lt2 + " , " + excessDays2); //2018-12-04T00:00 , P0D
    }

    @Test
    public void test005(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");
        LocalTime lt = LocalTime.now();
        System.out.println(dtf.format(lt)); //08:03:32

        dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");
        lt = LocalTime.now();
        System.out.println(dtf.format(lt)); //08:03:32 PM

        dtf = DateTimeFormatter.ofPattern("HH:mm");
        lt = LocalTime.now();
        System.out.println(dtf.format(lt)); //20:03
    }


}
