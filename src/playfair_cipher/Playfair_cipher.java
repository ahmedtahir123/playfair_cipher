/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playfair_cipher;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;  
import java.util.regex.Matcher;
import java.util.regex.Pattern;  



/**
 *
 * @author dell
 */
public class Playfair_cipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
       ArrayList<String> A1 = new ArrayList<String>();
        ArrayList<String> A2 = new ArrayList<String>();
        
        
        INC_OR_DEC A = new INC_OR_DEC();
        
   FileReader fr;
        String s = "C:\\Users\\dell\\Documents\\NetBeansProjects\\playfair_cipher\\src\\playfair_cipher\\Plaintext.txt";
        BufferedReader br = new BufferedReader(new FileReader(s));
        String h=br.readLine();
        String w[] = h.split("");
        
        
        
        System.out.println("Input Key");
        Scanner input = new Scanner(System.in);
        h = input.nextLine();
        String[] w1 = h.split("");
        System.out.println("select a option you want \n1-incrip \n2-decrip");
        h = input.nextLine();
       
        A.func(A1,A2,w,w1);

          
        
        switch (h) {
            case "1":
                System.out.println(A.Incrip(A1, A2));
                break;
            case "2":
                System.out.println(A.Incrip(A1, A2));
                break;
            default:
                System.out.println("wrong choise");
                break;
                
                
                
                
        }

    }} 
      
