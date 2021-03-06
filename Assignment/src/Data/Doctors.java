/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import static Data.DoctorManagement.sc;

/**
 *
 * @author Admin
 */
public class Doctors {

    protected String Code;
    protected String name;
    protected String Specialization;
    protected String Availability;

    public Doctors() {

    }

    public Doctors(String Code, String name, String Specialization, String Availability) {
        this.Code = Code;
        this.name = name;
        this.Specialization = Specialization;
        this.Availability = Availability;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public String getAvailability() {
        return Availability;
    }

    public void setAvailability(String Availability) {
        this.Availability = Availability;
    }

    @Override
    public String toString() {
        return "Doctors{" + "Code=" + Code + ", name=" + name + ", Specialization=" + Specialization + ", Availability=" + Availability + '}';
    }

    public void output(){
        System.out.format("|-10%s|-15%s|-25%s|-20%s","CODE","NAME","SPEACIALIZATION","AVALIBILITY");
        String msg = String.format("|-10%s|-15%s|-25%s|-20%s",Code,name,Specialization,Availability) ;
        System.out.println(msg);
    }
}
