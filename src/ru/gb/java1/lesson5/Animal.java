/**
 V 1. Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное.
 V 2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
 V   В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
 V 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,;
 V   прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ; плавание: кот и птица не умеют плавать, собака 10 м., лошадь 100 м.).
 V 4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат. (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')
 V 5. Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
 */

package ru.gb.java1.lesson5;

public abstract class Animal {

    protected String name;
    protected String color;
    protected int age;
    protected int runDist;
    protected int swimDist;
    protected float jumpLength;

    public Animal(String name, String color, int age, int runDist, float jumpLength) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.runDist = runDist;
        this.jumpLength = jumpLength;
    }

    public String info () {
        return this.name + "'s color is " + this.color + " and he is " + this.age + " years old";
    }

    public boolean run(int i) {
        boolean bool1 = false;
        if (this.runDist >= i) {
            System.out.println(this.name + " убежал на " + i + " метров");
        } else {
            System.out.println(this.name + " не может так далеко бежать");
        }
        return bool1;
    }

    public boolean swim(int s) {
        boolean bool2 = false;
        if (this.swimDist >= s) {
            System.out.println(this.name + " уплыл на " + s + "м");
        } else {
            System.out.println(this.name + " барахтается в воде на месте, т.к. для него это слишком далеко");
        }
        return bool2;
    }

    public boolean jump(float j) {
        boolean bool3 = false;
        if (this.jumpLength >= j) {
            System.out.println(this.name + " перепрыгнул препятствие в " + j + "м");
        } else {
            System.out.println("Для " + this.name + " препятсвие в " + j + "м слишком большое");
        }
        return bool3;
    }
}