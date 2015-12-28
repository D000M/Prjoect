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
public abstract class Jurist {
    
    private String nickName;
    private int stage;
    private int numCases;
    private ID job;

    public Jurist(String nickName, ID job, int stage, int numCases) {
        setName(nickName);
        setJob(job);
        setStage(stage);
        setNumCases(numCases);
    }
    
    public String getName() {
        return nickName;
    }

    public void setName(String name) {
        if(name != null) {
            this.nickName = name;
        }
        else {
            this.nickName = "Invalid Name";
        }
    }
    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public int getNumCases() {
        return numCases;
    }

    public void setNumCases(int numCases) {
        this.numCases = numCases;
    }

    public ID getJob() {
        return job;
    }

    public void setJob(ID job) {
        this.job = job;
    }

    public abstract void askQuestion();
    public abstract void writeAnswers();
    
}
