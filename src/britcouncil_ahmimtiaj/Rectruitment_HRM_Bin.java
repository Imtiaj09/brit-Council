/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package britcouncil_ahmimtiaj;

/**
 *
 * @author a.h.m.imtiaj
 */
public class Rectruitment_HRM_Bin {
    private String EmlopyeName;
    private String Education;
    private String Experience;

    public Rectruitment_HRM_Bin(String EmlopyeName, String Education, String Experience) {
        this.EmlopyeName = EmlopyeName;
        this.Education = Education;
        this.Experience = Experience;
    }

    public String getEmlopyeName() {
        return EmlopyeName;
    }

    public void setEmlopyeName(String EmlopyeName) {
        this.EmlopyeName = EmlopyeName;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String Education) {
        this.Education = Education;
    }

    public String getExperience() {
        return Experience;
    }

    public void setExperience(String Experience) {
        this.Experience = Experience;
    }

    @Override
    public String toString() {
        return "Rectruitment_HRM_Bin{" + "EmlopyeName=" + EmlopyeName + ", Education=" + Education + ", Experience=" + Experience + '}';
    }
 
  
       
    
}
