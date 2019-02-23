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
import java.util.*;
public class Novice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("All tpye job of novice");
        Job job_all = new Job();
        job_all.showJob();
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------");
        System.out.print("Please Enter Number of type job: ");
        int tj = sc.nextInt();
        if(tj == 1){
            job1();
        }
        if(tj == 2){
            job2();
        }
        if(tj == 3){
            job3();
        }
        else {
            System.out.println("Your Enter Nunber of job incorrect Please Enter 1 or 2 or 3 ");
        }
        System.out.println("---------------------------------------");
       
       
    }
    public static void job1(){
        Skill n1 = new Skill();
        System.out.println("---------------------------------------");
        n1.showTank();
        System.out.println("---------------------------------------");
        n1.setSkill_T();
        System.out.println("---------------------------------------");
        Item bag1 = new Item();
        bag1.setFood("Warmdish");
        bag1.setArmor("Full Plate");
        bag1.setWeapon("Claymore");
        bag1.setCard("Pecopeco Card");
        bag1.print();
    }
    public static void job2(){
        Skill n2 = new Skill();
        System.out.println("---------------------------------------");
        n2.showSupport();
        System.out.println("---------------------------------------");
        n2.setSkill_S();
        System.out.println("---------------------------------------");
        Item bag2 = new Item();
        bag2.setFood("IntDish LevelB");
        bag2.setArmor("Silver Robe");
        bag2.setWeapon("Rod");
        bag2.setCard("Pen Card");
        bag2.print();
        
    }
    public static void job3(){
        Skill n3 = new Skill();
        System.out.println("---------------------------------------");
        n3.showAttack();
        System.out.println("---------------------------------------");
        n3.setSkill_A();
        System.out.println("---------------------------------------");
        Item bag3 = new Item();
        bag3.setFood("AgiDish LevelB");
        bag3.setArmor("Tight");
        bag3.setWeapon("Bow and Axe");
        bag3.setCard("Zerom Card");
        bag3.print();
    }
}
