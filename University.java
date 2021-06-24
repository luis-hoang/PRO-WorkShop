/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Admin
 */
public class University extends Organization {
    public String name ;
    
    public University() {
        name = null ;
    }

    public University(String name) {
        this.name = name;
    }
    @Override 
    public void communicationByTool(){
        System.out.println( "In the university,people communication by voice") ;
    } 
    public void enroll(){
        System.out.println("the university, people communicate by voice");
    }
    public void educate(){
        System.out.println("Provide the university educate standard");
    }

    @Override
    public String toString() {
        return "encourage the advancement and development of knowledge";
    }
    public void createWorker(){
        
    }
    
}
