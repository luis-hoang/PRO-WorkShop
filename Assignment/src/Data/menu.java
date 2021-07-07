/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class menu {
     static Scanner sc= new Scanner(System.in);
     public static int getChoice(ArrayList options){
        int choice ;
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i+1)+"-"+options.get(i));
        }
        System.out.print("Your choice 1...."+options.size()+": ");
        choice = Integer.parseInt(sc.nextLine()) ;
        return choice ;
    }
    public static int getChoice(Object[] obj){
        int choice ;
        for (int i = 0; i < obj.length; i++) {
            System.out.println((i+1)+"-"+obj[i]);
        }
        System.out.print("Your choice 1...."+obj.length+": ");
        choice = Integer.parseInt(sc.nextLine()) ;
        return choice ;
    }
}
