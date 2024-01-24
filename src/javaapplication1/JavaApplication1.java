/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author sartaj
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
        System.out.println("Enter a word");
        Scanner c = new Scanner(System.in);
        String word = c.nextLine();
        System.out.println(word);
        
        char[] myLetters = new char[word.length()];
        for (int i=0;i<myLetters.length;i++){
            
            myLetters[i]=word.charAt(i);
        }
        
        for (int i=myLetters.length-1;i>=0;i--){
            System.out.println(myLetters[i]);
        }
    }
}   
