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
public class AllWork {
    
    private Task[] tasks;
    private int freePlacesForTasks;
    private int currentUnnasignedTask;

    public AllWork() {
        tasks = new Task[10];
        freePlacesForTasks = 10;
        currentUnnasignedTask = -1;
    }
    
    public void addTask(Task task) {
        
        for(int i = 0; i < 10; i++) {
            if(tasks[i] == null) {
                tasks[i] = task;
                freePlacesForTasks--;
                break;
            }
        }
        
    }
    
    public Task getNextTask() {
        if(currentUnnasignedTask < 9) {
            currentUnnasignedTask++;
        }
        
        return tasks[currentUnnasignedTask];
    }
    
    public boolean isAllWorkDone() {

        for(int i = 0; i < 10; i++) {
            if(tasks[i].getWorkingHours() > 0) {
                return false;
            }
        }
        return true;
    }
}
