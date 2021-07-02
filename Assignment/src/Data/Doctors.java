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

    public String getSpacialization() {
        return Specialization;
    }

    public void setSpacialization(String Specialization) {
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
        return "|"+Code+"|"+name+"|"+Specialization+"|"+Availability+"|"+"\n" ;
    }
}
