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
        int choice  ;
        String[] options = {"Add a new doctor","Update doctor","Delete doctor","Search doctor","Print the list of doctor"};
        HashMap h = new HashMap() ;
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
            }
        } while (choice > 0 && choice < 6);
    }
}
