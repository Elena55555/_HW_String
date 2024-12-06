package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println(" ");
        System.out.println("Task № 1 ");
        String[] stringArray = {"ab", "cd", "ef"};
        String str = (Arrays.toString(stringArray));
        System.out.println(str);
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
    }
    public static void task2() {
        System.out.println(" ");
        System.out.println("Task № 2 ");
        String stroke = "12345";
        char charArray2 = stroke.charAt(0);
        char charArray3 = stroke.charAt(4);
        System.out.println(charArray2 + "" + charArray3);

        System.out.println(" ");
        System.out.println("Task № 2 Option = 2 ");
        String stroke5 = "12345";
        String result = stroke.charAt(0) + "" + stroke.charAt(stroke.length() - 1);
        System.out.println(result);
    }
    public static void task3() {
        System.out.println(" ");
        System.out.println("Task № 3 ");
        String stroke6 = "1203405";
        for (int i = 0; i < 4; i++) {
            if (stroke6.charAt(i) == '0')
                System.out.println(i);
        }
    }
}
















