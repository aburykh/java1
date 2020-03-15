package ru.gb.java1.lesson4;

public class Java1Lesson4 {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Ivanov", 74000, 22, "Junior developer");
//        emp1.surname = "Ivanov";
//        emp1.salary = 74000;
//        emp1.age = 22;
//        emp1.position = "Junior developer";

        Employee emp2 = new Employee();
        emp2.surname = "Vasechkin";
        emp2.salary = 137000;
        emp2.age = 26;
        emp2.position = "Developer";
//
//        Employee emp3 = new Employee();
//        emp3.surname = "Karpov";
//        emp3.salary = 235000;
//        emp3.age = 35;
//        emp3.position = "Senior developer";
//
//        Employee emp4 = new Employee();
//        emp4.surname = "Vasechkin";
//        emp4.salary = 330000;
//        emp4.age = 46;
//        emp4.position = "Chief technical officer";
//
//        Employee emp5 = new Employee();
//        emp5.surname = "Krugov";
//        emp5.salary = 112000;
//        emp5.age = 29;
//        emp5.position = "Analyst";
//
//        Employee emp6 = new Employee();
//        emp6.surname = "Bulochkina";
//        emp6.salary = 154000;
//        emp6.age = 47;
//        emp6.position = "Marketer";
//
//        Employee emp7 = new Employee();
//        emp7.surname = "Vinokurova";
//        emp7.salary = 110000;
//        emp7.age = 51;
//        emp7.position = "Accountant";


        System.out.println(emp1.position + " " + emp1.surname + " of age " + emp1.age + " has a salary of " + emp1.salary);
        System.out.println(emp2.position + " " + emp2.surname + " of age " + emp2.age + " has a salary of " + emp2.salary);
//        System.out.println(emp3.position + " " + emp3.surname + " of age " + emp3.age + " has a salary of " + emp3.salary);
//        System.out.println(emp4.position + " " + emp4.surname + " of age " + emp4.age + " has a salary of " + emp4.salary);
//        System.out.println(emp5.position + " " + emp5.surname + " of age " + emp5.age + " has a salary of " + emp5.salary);
//        System.out.println(emp6.position + " " + emp6.surname + " of age " + emp6.age + " has a salary of " + emp6.salary);
//        System.out.println(emp7.position + " " + emp7.surname + " of age " + emp7.age + " has a salary of " + emp7.salary);

        System.out.println();
    }
}
