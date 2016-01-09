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
public class Work {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Task task1 = new Task("Kopaene", 18);
        Task task2 = new Task("Srane", 22);
        Task task3 = new Task("Pluvane", 30);
        Task task4 = new Task("Programirane", 20);
        Task task5 = new Task("Dyrvar", 12);
        Task task6 = new Task("Researcher", 19);
        Task task7 = new Task("Prostitutka", 8);
        Task task8 = new Task("Bibliotekar", 35);
        Task task9 = new Task("Ubiec", 9);
        Task task10 = new Task("Pevec", 100);
        
        AllWork currentWork = new AllWork();
        currentWork.addTask(task1);
        currentWork.addTask(task2);
        currentWork.addTask(task3);
        currentWork.addTask(task4);
        currentWork.addTask(task5);
        currentWork.addTask(task6);
        currentWork.addTask(task7);
        currentWork.addTask(task8);
        currentWork.addTask(task9);
        currentWork.addTask(task10);

        Employee ivan = new Employee("Ivan");
        Employee mariika = new Employee("Mariika");
        Employee petko = new Employee("Petko");
        Employee churko = new Employee("Churko");
        ivan.setAllWork(currentWork);
        mariika.setAllWork(currentWork);
        petko.setAllWork(currentWork);
        churko.setAllWork(currentWork);
        int day = 1;
        
        while(currentWork.isAllWorkDone() != true) {
            
            System.out.println("New day: " + day);
            ivan.startWorkingDay();
            mariika.startWorkingDay();
            petko.startWorkingDay();
            churko.startWorkingDay();
            
            ivan.work();
            mariika.work();
            petko.work();
            churko.work();
            day++;
        }
    }
    
}
