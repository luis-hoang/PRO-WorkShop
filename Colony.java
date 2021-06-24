
package DTO;

/**
 *
 * @author Admin
 */
public class Colony extends Organization  {
    public String place;

    public Colony() {
        this.place = " ";
    }

    public Colony(int size,String place) {
        this.size = size ;
        this.place = place;
    }
    @Override
    public void communicationByTool(){
        System.out.println("“the colony communicate by sound");
    }
    public void grow(){
        System.out.println("“an annual cycle of growth that begins in spring");
    }
    public void reproduce() {
        System.out.println("“Colony can reproduce itself through a process");
    }

    @Override
    public String toString() {
        return "the colony’size is " + size + ",and the place field " + place +"";
    }

    public void createWorker() {
       
    }
}
