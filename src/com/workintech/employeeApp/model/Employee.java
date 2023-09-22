package com.workintech.employeeApp.model;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(int id, String fullName, String email, String password, String[] healthplans){
        this.id=id;
        this.fullName=fullName;
        this.email=email;
        this.password=password;
        this.healthplans=healthplans;
    }

    public int getId(){ return id; }
    public String getFullName(){ return fullName; }
    public String getEmail(){ return email; }
    public String getPassword(){ return  password; }
    public String[] getHealthplans(){ return healthplans; }
    public String toString(){
        return "Employee = " + "id: " + id + " fullName: " + fullName +
                " email: " + email + " password: " + password + " healthplans: " + healthplans;
    }

    public void addHealthPlan(int index, String name){
        try {
            if (healthplans[index] == null){
                healthplans[index] = name;
            }else {
                System.out.println("İlgili index için atama yapılmış.");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Olmayan index için atama yapıldı" + index);
        }
    }
}
