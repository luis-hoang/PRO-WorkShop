/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

import java.util.HashMap;
import java.util.Scanner;
import Data.menu ;
import Data.DoctorManagement;
import Data.Doctors;
/**
 *
 * @author Admin
 */
public class DoctorsMGT {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in) ;
         String fName = "Data.txt" ;
        int choice  ;
        String[] options = {"Add a new doctor","Update doctor","Delete doctor","Search doctor","Print the list of doctor","Save list to file"};
        HashMap h = new HashMap() ;
        DoctorManagement.loadFromFile(fName);
        System.out.println("\n");
        do {       
            choice = menu.getChoice(options) ;
            switch(choice){
                case 1:DoctorManagement.addDoctor(h);
                       break;
                case 2 :DoctorManagement.updateDoctors(h);
                         break;
                case 3:DoctorManagement.removeDoctor(h);
                       break;
                case 4:DoctorManagement.searchDoctor(h);
                       break;
                case 5 : DoctorManagement.printList(h);
                         break;
                case 6 :DoctorManagement.saveToFile(h, fName);
                        break ;
            }
        } while (choice > 0 && choice < 7);
    }
}
