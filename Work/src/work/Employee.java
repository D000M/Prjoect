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
public class Employee {
    
    private String name;
    private Task currentTask;
    private int hoursLeft;
    private AllWork allWork;
    
    public Employee(String name) {
        setName(name);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setTask(Task currentTask) {
        this.currentTask = currentTask;
    }
    public Task getTask() {
        return this.currentTask;
    }
    public void setHoursLeft(int hoursLeft) {
        this.hoursLeft = hoursLeft;
    }
    public int getHoursLeft() {
        return hoursLeft;
    }
    public void setAllWork(AllWork allWork) {
        this.allWork = allWork;
    }
    public AllWork getAllWork() {
        return this.allWork;
    }

    public void startWorkingDay() {
        setHoursLeft(8);
    }
    
    public void work() {
  
        if(currentTask == null ) {
            currentTask = allWork.getNextTask();
        }
        
        showReport();
        if(getHoursLeft() <= getTask().getWorkingHours()) {
            getTask().setWorkingHours(getTask().getWorkingHours() - getHoursLeft());
            setHoursLeft(0);
        }
        else {
            setHoursLeft(getHoursLeft() - getTask().getWorkingHours());
            getTask().setWorkingHours(0);
            currentTask = allWork.getNextTask();
            getTask().setWorkingHours(getTask().getWorkingHours() - getHoursLeft());
            setHoursLeft(0);
        }
        showReport();
    } //end of method work()
    
    public void showReport() {
        System.out.print("Employee name: " + getName());
        System.out.print(", Task name: " + getTask().getName());
        System.out.print(", Employee hours: " + getHoursLeft());
        System.out.print(", Task hours: " + getTask().getWorkingHours());
        System.out.println();
    }
    
}
