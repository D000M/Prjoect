/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

import java.util.ArrayList;

/**
 *
 * @author D00M
 */
public class Suspect extends Citizen{
    
    ArrayList<Lawyer> laweyrs = new ArrayList<>();
    public Suspect(String firstName, String secondName, String lastName, String adress, int age, Roll role) {
        super(firstName, secondName, lastName, adress, age, role);
    }

}
