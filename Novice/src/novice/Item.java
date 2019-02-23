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
public class Item extends Bag {
    public void print(){
        System.out.println("Food in bag: "+ food);
        System.out.println("Armor in bag: "+ armor);
        System.out.println("Weapon in bag: "+ weapon);
        System.out.println("Card in bag: "+ card);
    }
}
