/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

/**
 *
 * @author D00M
 */
public abstract class Citizen{
    
    private String firstName;
    private String secondName;
    private String lastName;
    private String adress;
    private int age;
    private Roll role;
    
    public Citizen(String firstName, String secondName, String lastName, String adress, int age, Roll role) {
        setFirstName(firstName);
        setSecondName(secondName);
        setLastName(lastName);
        setAdress(adress);
        setAge(age);
        setRole(role);
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Roll getRole() {
        return role;
    }

    public void setRole(Roll role) {
        this.role = role;
    }
       
}
