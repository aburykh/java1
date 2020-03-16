/**
 V 1. Создать класс "Сотрудник" с полями: Фамилия, зарплата, возраст, должность;
 V 2. Конструктор класса должен заполнять эти поля при создании объекта;
 V 3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
 V 4. Вывести при помощи методов из пункта 3 ФИО и должность.
 V 5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 V 6. * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
 V 7. * Подсчитать средние арифметические зарплаты и возраста сотрудников из п.5
 8. *** Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался личный уникальный идентификационный порядковый номер
 */

package ru.gb.java1.lesson4;

/**
1. Создать класс "Сотрудник" с полями: Фамилия, зарплата, возраст, должность
 */

public class Employee {
    String surname;
    float salary;
    int age;
    String position;
//    private static final int CURRENT_YEAR = 2020;
//    private final int birthDate;

    Employee () {
        age = 0;
    }
/**
 2. Конструктор класса должен заполнять эти поля при создании объекта
 */
    Employee (String surname, float salary, int age, String position) {
        this();
        this.surname = surname;
        this.salary = salary;
        this.age = age;
        this.position = position;
//        this.employeeID = numberOfEmployees;
//        this.birthDate = birthDate;
//        surname = ;
//        salary = 0;
//        age = 0;
//        position = 0;
    }

/**
 3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля
 */
    public String getSurname() {
        return this.surname;
    }
    public float getSalary() {
        return this.salary;
    }
    public int getAge() {
        return this.age;
    }
    public String getPosition() {
        return this.position;
    }
//    public int getAge() {
//        return CURRENT_YEAR - birthDate;
//    }

/**
 4. Вывести при помощи методов из пункта 3 ФИО и должность
 */
    public void fioAndPosition() {
        System.out.println(this.surname + " is the " + this.position);
    }

/**
 6. * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
 */
    float getUpSalary(int increaseSalary, float increaseKoef) {
        return this.salary = salary + salary * increaseKoef / 100 + increaseSalary;
    }
}
