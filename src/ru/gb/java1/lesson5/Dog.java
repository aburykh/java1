/**
 V 1. Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное.
 V 2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
 V   В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
 V 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,;
 V   прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ; плавание: кот и птица не умеют плавать, собака 10 м., лошадь 100 м.).
 4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат. (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')
 5. Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
 */

package ru.gb.java1.lesson5;

public class Dog extends Animal {

    final int swimDist;

    public Dog (String name, String color, int age, int runDist, int swimDist, float jumpHeight) {
        super(name, color, age, runDist, jumpHeight);
        this.swimDist = swimDist;
    }

    public void info () {
        System.out.println(this.name + "'s color is " + this.color + " and he is " + this.age + " years old");
    }

    public void run(int i) {
        if (this.runDist >= i) {
            System.out.println(this.name + " побежал на " + i + " метров");
        } else {
            System.out.println(this.name + " не может так далеко бежать");
        }
    }
}
