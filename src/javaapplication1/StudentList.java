/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author sartaj
 */
public class StudentList {
        public static void main(String args[]){
        Student s1 = new Student(1,"Harleen");
        Student[] studentList = new Student[4];
        studentList[0]=s1;
        studentList[1] = new Student(2,"Pawan");
        studentList[2] = new Student(3,"Pawanjot");
        for (int i=0; i<studentList.length;i++){
            System.out.println(studentList[i].getSname()+ " " + studentList[i].getsId());
        }
    }

}
