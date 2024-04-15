/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package britcouncil_ahmimtiaj;

/**
 *
 * @author a.h.m.imtiaj
 */
class Rectruitment_HRM_Bin {
    private String employeeName;
    private String employeeEducation;
    private String experience;
    private String joiningDate;

    public Rectruitment_HRM_Bin(String employeeName, String employeeEducation, String experience, String joiningDate) {
        this.employeeName = employeeName;
        this.employeeEducation = employeeEducation;
        this.experience = experience;
        this.joiningDate = joiningDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEducation() {
        return employeeEducation;
    }

    public void setEmployeeEducation(String employeeEducation) {
        this.employeeEducation = employeeEducation;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return "Rectruitment_HRM_Bin{" + "employeeName=" + employeeName + ", employeeEducation=" + employeeEducation + ", experience=" + experience + ", joiningDate=" + joiningDate + '}';
    }
    
    
}
