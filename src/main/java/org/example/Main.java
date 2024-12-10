package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task1_1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        /**
         * We go through an array of strings and save the length value to a variable count
         */
        System.out.println(" ");
        System.out.println("Task № 1 ");
        String[] stringArray1 = {"ab", "cd", "ef"};
        int count = 0;
        for (String s1 : stringArray1) {
            count += s1.length();
        }
        System.out.println(count);
        char[] charArray1 = new char[count];
        int i = 0;
        for (String s1 : stringArray1) {
            for (char c : s1.toCharArray()) {
                charArray1[i++] = c;
            }
        }
        System.out.println(Arrays.toString(charArray1));
    }

    /**We set the size of the array ourselves:
     *
     */
    public static void task1_1() {
        System.out.println(" ");
        System.out.println("Task № 1_1 Option = 2 ");
        String[] stringArray1 = {"ab", "cd", "ef"};
        char[] charArray2 = new char[6];
        int i_ = 0;
        for (String s1 : stringArray1) {
            for (char c : s1.toCharArray()) {
                charArray2[i_++] = c;
            }
        }
        System.out.println(Arrays.toString(charArray2));

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

    public static void task4() {
        System.out.println("Task № 3 Option = 2 ");
        String stroke7 = "1203405";
        System.out.println(stroke7.indexOf('0'));
    }
}

