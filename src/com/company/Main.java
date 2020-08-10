package com.company;

public class Main {

    public static void main(String[] args) {
            Employee e = new Employee("John","Due",2000,35);
            e.describeEmployee();
            System.out.println(e.getSalaryForLastMonths(5));

            //getter
            System.out.println("\n"+e.getFirstName());
            System.out.println(e.getLastName());
            System.out.println(e.getSalary());
            System.out.println(e.getId());

            //setter
            e.setFirstName("\nEdward");
            e.setLastName("Andrews");
            e.setSalary(3000);
            e.setId(10);

            System.out.println(e.getFirstName());
            System.out.println(e.getLastName());
            System.out.println(e.getSalary());
            System.out.println(e.getId());
        }
}
