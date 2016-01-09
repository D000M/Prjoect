/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

/**
 *
 * @author D00M
 */
public class Task {
    
    private String name;
    private int workingHours;

    public Task(String name, int worikingHours) {
        setName(name);
        setWorkingHours(worikingHours);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
    public int getWorkingHours() {
        return this.workingHours;
    }
    
}
