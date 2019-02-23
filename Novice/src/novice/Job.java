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
public class Job {
    public String tank;
    public String support;
    public String attack;
    
    
    public void setTank(String tank){
        this.tank = tank;
    }
    public void setSupport(String support){
        this.support = support;
    }
    public void setAttack(String attack){
        this.attack = attack;
    }
    public void showTank(){
        //System.out.println(""+ tank);
        System.out.println("Job of Novice is Swordman");
        
    }
     public void showSupport(){
        //System.out.println(""+ support);
        System.out.println("Job of Novice is Acolyte");
    }
    public void showAttack(){
        //System.out.println(""+ attack);
        System.out.println("Job of Novice is Archer or Merchant");
    }
   public void showJob(){
       System.out.println("No. 1) : Tank");
       System.out.println("No. 2) : Support");
       System.out.println("No. 3) : Attack");
   }
    
}
