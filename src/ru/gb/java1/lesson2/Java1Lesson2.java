package ru.gb.java1.lesson2;

public class Java1Lesson2 {
    public static void main(String[] args) {
        int a = 3, b = 3, c = 2, d = 4;
        //т.к. переменные целочисленные, а деление может дать результат с дробной частью, добавляется float перед данной операцией
        System.out.println(a * (b + ((float) c / d)));
    }
}
