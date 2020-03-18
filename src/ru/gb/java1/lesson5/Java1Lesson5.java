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

public class Java1Lesson5 {

    public static void main (String[] arg) {

        Bird bird = new Bird("Kesha", "blue", 1, 5, 0.2f);
        Cat cat = new Cat("Markiz", "black", 3, 200, 2);
        Dog dog = new Dog("Cooper", "white", 2, 500, 10, 0.5f);
        Horse horse = new Horse("Mustang", "brown", 4, 1500, 100, 3);

        Westie westie = new Westie("Casper", "white", 5, 650, 3, 0.6f);
        Yorkshire yorkshire = new Yorkshire("Yalik", "brown", 16, 300, 12, 0.4f);
        Beagle beagle = new Beagle("Jonny", "black brown", 3, 900, 7, 1.2f);

//        Animal[] zoo = {bird, cat, dog, horse, westie, yorkshire, beagle};
//        for (int i = 0; i < zoo.length; i++) {
//            zoo[i].run(550);
//            System.out.println(zoo[i].getClass().getName());
//            System.out.println();
//        }

        Dog[] dogs = {dog, westie, yorkshire, beagle};
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].run(550);
            System.out.println(dogs[i].getClass().getName());
            System.out.println();
        }


        bird.info();
        cat.info();
        dog.info();
        horse.info();
        //Westie.info();
        System.out.println();

        bird.run(5);
        cat.run(1500);
        dog.run(150);
        horse.run(1500);
        System.out.println();

        bird.swim(1);
        cat.swim(1);
        dog.swim(12);
        horse.swim(90);
        System.out.println();

        bird.jump(2);
        cat.jump(1);
        dog.jump(3);
        horse.jump(1.5f);
        System.out.println();
    }
}
