package com.company;

public class Employee {
    private String FirstName;
    private String LastName;
    private int salary=2000;
    private int id=1;

    public Employee(){

    }

    public Employee(String Firstname,String LastName,int salariu,int id){
        if (Firstname != LastName) {
            this.FirstName=Firstname;
        }

        this.LastName=LastName;

        if(salariu>=0 && salariu<=10000){
            salary=salariu;
        }

        if(id>=0){
            this.id=id;
        }
    }

    void showFullName(){
        System.out.println(FirstName+" " +LastName);
    }

    public int getSalaryForLastMonths(int nrMonths){
        return nrMonths*salary;
    }

    void describeEmployee(){
        System.out.println("---------------------\n|Full name: " +FirstName+" "+LastName +"|"+"\n|Employee id: "+id+"    |"+"\n|Salary: "+salary+"       |"+"\n---------------------");
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName(){
        return LastName;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        if (firstName != LastName) {
            FirstName=firstName;
        }
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setId(int id) {
        if(id>=0){
            this.id=id;
        }
    }

    public void setSalary(int salariu) {
        if(salariu>=0 && salariu<=10000){
            salary=salariu;
        }
    }

}


