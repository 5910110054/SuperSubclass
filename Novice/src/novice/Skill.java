/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novice;

/**
 *
 * @author Keem
 */
public class Skill extends Job{
    public String active;
    public String passive;
    
    public void setActive(String active){
        this.active = active;
    }
    public void setPassive(String passive){
        this.passive = passive;
    }
    public void setSkill_T(){
        System.out.println("Passive Skill : HP_UP");
        System.out.println("Active Skill : Guard");
    }
    public void setSkill_S(){
        System.out.println("Passive Skill : SP_UP");
        System.out.println("Active Skill : Increase Agility and Blessing");
    }
    public void setSkill_A(){
        System.out.println("Passive Skill : Agi&Dex_UP");
        System.out.println("Active Skill : Adrenaline Rush");
    }
}
