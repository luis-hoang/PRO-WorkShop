/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.Scanner;
import java.util.HashMap ;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
/**
 *
 * @author Admin
 */
public class DoctorManagement extends Doctors{
    static Scanner sc = new Scanner(System.in);
     static Map<String,Doctors> h = new HashMap();
    public static void addDoctor(HashMap<String,Doctors> h){
        String newCode ;
        String newName ;
        String newSpeacialization;
        String newAvalibility;
        boolean codeDuplicate = false;
        do{
        System.out.println("Enter code: ");
        newCode = sc.nextLine();
        codeDuplicate = h.containsKey(newCode) ;
        if(codeDuplicate == true ){
            System.out.println("The code is duplicated");
            }
        }while(codeDuplicate ); 
        System.out.println("Enter name: ");
        newName = sc.nextLine();
        System.out.println("Enter specialization: ");
        newSpeacialization = sc.nextLine();
        System.out.println("Enter avalibility: ");
        newAvalibility = sc.nextLine();
        
        h.put(newCode,new Doctors(newCode, newName, newSpeacialization, newAvalibility)) ;
    } 
    public static boolean searchDoctor(HashMap<String,Doctors> h) {
        String sCode ;
        if(h.isEmpty()){
            System.out.println("The list is empty");
            return false;
        } 
        System.out.println("Enter the code of doctor: ");
        sCode = sc.nextLine() ;
        if(h.containsKey(sCode)== false){
            System.out.println("The code " + sCode + "doesn't exist");
            return false;
        }
        System.out.println("The doctor : "+h.get(sCode));
        return true ;
    }
    public static void removeDoctor(HashMap<String,String> h){
        String sCode ;
        System.out.println("Enter the code you want to remove: ");
        sCode = sc.nextLine() ;
        h.remove(sCode) ;
        System.out.println("Remove successfull");
    }
    public static void updateDoctors(HashMap<String,Doctors> h){
        
    }
    public static void printList(HashMap<String,Doctors> h){
            System.out.println(h);
        }
    
}
