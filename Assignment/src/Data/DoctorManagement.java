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
import java.util.Set;
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
        String information ;
        if(h.isEmpty()){
            System.out.println("The list is empty");
            return false;
        } 
        System.out.println("Enter the code of doctor: ");
        information  = sc.nextLine() ;
            if(h.containsKey(information)== false){
            System.out.println("The doctor " + information + "doesn't exist");
            return false;
        } else{
        System.out.println("The doctor : "+h.get(information));
        return true ;
            }
        }
      
    public static void removeDoctor(HashMap<String,String> h){
        String sCode ;
        System.out.println("Enter the code you want to remove: ");
        sCode = sc.nextLine() ;
        h.remove(sCode) ;
        System.out.println("Remove successfull");
    }
    public static void updateDoctors(HashMap<String,Doctors> h){
       
        if(h.isEmpty()){
            System.out.println("Empty list ! No update can be performed");
        } else{
               System.out.println("Enter the code: ");
               String code = sc.nextLine() ;
               Doctors dt = getDoctorByCode(h, code) ;
               if(h.containsKey(code) == false){
                   System.out.println("The doctor " +code+ " doesn't exist");
                   return ;
               } else {
                   System.out.println("Enter new name: ");
                   String newName = sc.nextLine() ;
                   
                   System.out.println("Enter new speacialization: ");
                   String newSpeacialization = sc.nextLine() ;
                   
                   System.out.println("Enter new avalibility: ");
                   String newAvalibility = sc.nextLine() ;
                   dt.setName(newName);
                   dt.setSpecialization(newSpeacialization);
                   dt.setAvailability(newAvalibility);
                   
                   System.out.println("The doctor " + code + " is updated successful");
                } 
        }
    }
    public static void printList(HashMap<String,Doctors> h){
            System.out.println(h);
        }
    public static boolean checkInforChange(Doctors dt , String code ,
                    String name,String speacialization ,String Avalibility) {
        if(dt.getCode().equalsIgnoreCase(code)
                && dt.getName().equalsIgnoreCase(name)
                && dt.getSpecialization().equalsIgnoreCase(speacialization)
                && dt.getAvailability().equalsIgnoreCase(Avalibility)){
            return false ;
        }
        return true ;
    }
    public static Doctors getDoctorByCode(HashMap<String ,Doctors> h ,String code){
        Set<Map.Entry<String ,Doctors>> entries = h.entrySet();
        for (Map.Entry doctor : entries) {
            if(doctor.getKey().equals(code)){
                return (Doctors) doctor.getValue();
            }
        }
        return null ;
    }
    
}
