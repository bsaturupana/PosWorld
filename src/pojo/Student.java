/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pojo;

//      https://www.tutorialspoint.com/hibernate/hibernate_mapping_files

//      Google Search:      https://www.tutorialspoint.com/hibernate/hibernate_mapping_files


/**
 *
 * @author MYPC
 */
public class Student {
    private Integer studentId;
    private String studentFirstName;
    private String studentLastName;

    /**
     * @return the studentId
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the studentFirstName
     */
    public String getStudentFirstName() {
        return studentFirstName;
    }

    /**
     * @param studentFirstName the studentFirstName to set
     */
    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    /**
     * @return the studentLastName
     */
    public String getStudentLastName() {
        return studentLastName;
    }

    /**
     * @param studentLastName the studentLastName to set
     */
    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }
}
