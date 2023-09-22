package com.workintech.employeeApp.model;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id, String fullName, String email, String password, String[] healthplans){
        this.id=id;
        this.fullName=fullName;
        this.email=email;
        this.password=password;
        this.healthPlans=healthplans;
    }

    public int getId(){ return id; }
    public String getFullName(){ return fullName; }
    public String getEmail(){ return email; }
    public String getPassword(){ return  password; }
    public String[] getHealthPlans(){ return healthPlans; }
    public String toString(){
        return "Employee = " + "id: " + id + " fullName: " + fullName +
                " email: " + email + " password: " + password + " healthPlans: " + healthPlans;
    }

    public void addHealthPlan(int index, String name){
        try {
            if (healthPlans[index] == null){
                healthPlans[index] = name;
            }else {
                System.out.println("İlgili index için atama yapılmış.");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Olmayan index için atama yapıldı" + index);
        }
    }
}
