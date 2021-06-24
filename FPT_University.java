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
public class FPT_University extends University implements Role {
    private String address ;
    
    public FPT_University() {
        address = null ;
    }
    public FPT_University(int size , String place , String address) {
        this.size = size ;
        this.name = place ;
        this.address = address ;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "“FPTU has four campuses Hanoi,HCM, DaNang, CanTho, QuyNhon";
    }
    @Override  
    public void createWorker(){
        System.out.println("providing humans resource");
    } 
    
}
