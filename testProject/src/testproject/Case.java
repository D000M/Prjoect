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
public class Case {
    
    public enum CASETYPE {
        Citizens,
        Punishments,
    }
    
    private CASETYPE CT;
    private Judge jdg;
    
    private Jury[] jury;
    private Suspect suspect;
    private Attacker attacker;
    private Prokuror prokuror;
    private Witness[] witnesses;
    

    public Case(CASETYPE CT, Judge jdg, Jury[] jury, Suspect suspect, Attacker attacker, Prokuror prokuror, Witness[] witnesses) {
        setCT(CT);
        setJdg(jdg);
        setJury(jury);
        setSuspect(suspect);
        
        if(CT == CT.Citizens) {
            setAttacker(attacker);
            setProkuror(null);
            this.witnesses = new Witness[3];
        }
        else {
            setProkuror(prokuror);
            setAttacker(null);
            this.witnesses = new Witness[13];
        }
        setWitneses(witnesses);
    }
    
    public CASETYPE getCT() {
        return CT;
    }

    public void setCT(CASETYPE CT) {
        this.CT = CT;
    }

    public Judge getJdg() {
        return jdg;
    }

    public void setJdg(Judge jdg) {
        this.jdg = jdg;
    }

    public Jury[] getJury() {
        return jury;
    }

    public void setJury(Jury[] jury) {
        this.jury = jury;
    }

    public Suspect getSuspect() {
        return suspect;
    }

    public void setSuspect(Suspect suspect) {
        this.suspect = suspect;
    }

    public Attacker getAttacker() {
        return attacker;
    }

    public void setAttacker(Attacker attacker) {
        this.attacker = attacker;
    }

    public Prokuror getProkuror() {
        return prokuror;
    }

    public void setProkuror(Prokuror prokuror) {
        this.prokuror = prokuror;
    }

    public Witness[] getWitneses() {
        return witnesses;
    }

    public void setWitneses(Witness[] witnesess) {
        this.witnesses = witnesess;
    }

}
