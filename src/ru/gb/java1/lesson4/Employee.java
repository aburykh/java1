/**
 V 1. Создать класс "Сотрудник" с полями: Фамилия, зарплата, возраст, должность;
 V 2. Конструктор класса должен заполнять эти поля при создании объекта;
 3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
 4. Вывести при помощи методов из пункта 3 ФИО и должность.
 5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 6. * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
 7. * Подсчитать средние арифметические зарплаты и возраста сотрудников из п.5
 8. *** Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался личный уникальный идентификационный порядковый номер
 */

package ru.gb.java1.lesson4;

public class Employee {
    String surname;
    float salary;
    int age;
    String position;
//    int uuid;

    Employee () {
        age = 0;
    }

    Employee (String surname, float salary, int age, String position) {
//        int uuid = 0;
//        for (uuid = 1; uuid > 0; uuid++);
        this.surname = surname;
        this.salary = salary;
        this.age = age;
        this.position = position;
//        surname = ;
//        salary = 0;
//        age = 0;
//        position = 0;
    }


    public String getSurname() {
        System.out.println(getSurname());
        return surname;
    }
    public float getSalary() {
        return salary;    
    }
    public int getAge() {
        return age;
    }
    public String getPosition() {
        return this.position;
    }
}
