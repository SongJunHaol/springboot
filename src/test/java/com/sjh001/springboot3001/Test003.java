package com.sjh001.springboot3001;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Test003 {
    @Test
    public  void test001(){
        ArrayList<String> list = new ArrayList<>();

        // 向列表中添加一些元素
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // 访问列表中的第四个元素（索引为3），超出列表范围，可能抛出 IndexOutOfBoundsException 异常
        String fourthElement = list.get(3);

        // 将第四个元素转换为大写，可能抛出 NullPointerException 异常
        String upperCase = fourthElement.toUpperCase();

        // 打印转换后的结果
        System.out.println("转换后的结果: " + upperCase);
    }


    @Test
    public void test004(){
        // 一些复杂的代码逻辑
        int[] numbers = {1, 2, 3};
        String str = "Hello, world!";
        // 代码块1
        int result = divide(10, 0);
        System.out.println("Result: " + result);
        // 代码块2
        int value = numbers[5];
        System.out.println("Value: " + value);
        // 代码块3
        int length = str.length();
        System.out.println("Length: " + length);
        // 更多复杂的代码逻辑
    }
    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }


    @Test
    public void test005(){
        for (int i = 0; i < 5; i++) {
            try {
                // 代码块1
                System.out.println("Iteration: " + i);
                int result = divide(10, i);
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("除数不能为零！");
            }

            // 更多复杂的代码逻辑
            int[] numbers = {1, 2, 3};
            try {
                // 代码块2
                for (int j = 0; j < 5; j++) {
                    System.out.println("Nested Iteration: " + j);
                    int value = numbers[j];
                    System.out.println("Value: " + value);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("数组索引越界！");
            }

            // 更多复杂的代码逻辑
        }
    }


}
