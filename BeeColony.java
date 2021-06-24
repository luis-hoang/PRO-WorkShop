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
public class BeeColony extends Colony implements Role {
    public String type ;
    public BeeColony(){
        type = null;
    }
    public BeeColony(int size , String type ,String place ) {
        this.type = type ;
        this.place = place ;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "the colony’s type is  " +type+", size about " + size + ",and the place field " + place +"";
    }
    @Override
    public void createWorker(){
        System.out.println("Worker bees perform all the work of the bees");
    }
}
