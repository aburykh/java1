package ru.gb.java1.lesson4;

public class Java1Lesson4 {

    public static void main(String[] args) {
        System.out.println();
        Employee emp1 = new Employee("Vasechkin", 137000, 31, "Developer");
        Employee emp2 = new Employee("Karpov", 235000, 41, "Senior developer");
//        Employee emp3 = new Employee("Khorkov", 330000, 46, "Chief technical officer");
//        Employee emp4 = new Employee("Krugov", 112000, 29, "Analyst");
//        Employee emp5 = new Employee("Bulochkina", 110000, 51, "Accountant");

        System.out.println(emp1.position + " " + emp1.surname + " of age " + emp1.age + " has a salary of " + emp1.salary);
        System.out.println(emp2.position + " " + emp2.surname + " of age " + emp2.age + " has a salary of " + emp2.salary);
//        System.out.println(emp3.position + " " + emp3.surname + " of age " + emp3.age + " has a salary of " + emp3.salary);
//        System.out.println(emp4.position + " " + emp4.surname + " of age " + emp4.age + " has a salary of " + emp4.salary);
//        System.out.println(emp5.position + " " + emp5.surname + " of age " + emp5.age + " has a salary of " + emp5.salary);


        System.out.println();
        System.out.println("4. Вывести при помощи методов из пункта 3 ФИО и должность:");

        emp1.fioAndPosition();
        emp2.fioAndPosition();
//        emp3.fioAndPosition();
//        emp4.fioAndPosition();
//        emp5.fioAndPosition();

/**
  5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 */
        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee("Vasechkin", 137000, 31, "Developer");
        empArr[1] = new Employee("Karpov", 235000, 41, "Senior developer");
        empArr[2] = new Employee("Khorkov", 330000, 46, "Chief technical officer");
        empArr[3] = new Employee("Krugov", 112000, 29, "Analyst");
        empArr[4] = new Employee("Bulochkina", 110000, 51, "Accountant");
        int age40 = 40;
        System.out.println();
        System.out.println("5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет:");
        for (int i = 0; i < empArr.length; i++) {
            if (empArr[i].getAge() >= age40) {
                System.out.println(empArr[i].position + " " + empArr[i].surname + " of age " + empArr[i].age + " has a salary of " + empArr[i].salary);
            }
        }

/**
 6. * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
 */
        int age45 = 45;
        System.out.println();
        System.out.println("6. * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000:");
        for (int i = 0; i < empArr.length; i++) {
            if (empArr[i].getAge() >= age45) {
                empArr[i].salary = empArr[i].getUpSalary();
                System.out.println(empArr[i].position + " " + empArr[i].surname + " of age " + empArr[i].age + " received an increase and now has a salary of " + empArr[i].salary);
            }
        }

/**
 7. * Подсчитать средние арифметические зарплаты и возраст сотрудников из п.5
 */
        System.out.println();
        System.out.println("7. * Подсчитать средние арифметические зарплаты и возраста сотрудников из п.5:");
        int i = 0;
        float averAge = 0, averSalary = 0;
        for (i = 0; i <empArr.length; i++) {
            averAge += empArr[i].getAge();
            averSalary += empArr[i].getSalary();
        }
        averAge = (averAge / empArr.length);
        averSalary = (averSalary / empArr.length);
        System.out.println("Средний возраст - " + averAge);
        System.out.println("Средняя зарплата - " + averSalary);
    }
}
