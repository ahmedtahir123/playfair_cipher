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
       
        {////String chcking
        int k=0;
        int p=0;
        for ( k = 0; k <w.length; k++) {
            if (w[k].charAt(0) == (char)127) {
            } else {
               
               if(k>0){
                    if(A1.get(p-1).equals((Character.toString(w[k].charAt(0))))){
                        A1.add("x");
                        
                       A1.add((Character.toString(w[k].charAt(0))));
                       p+=2;
                    }else{
                        p++;
                                        A1.add((Character.toString(w[k].charAt(0))));

                    }
                }else{
                   p++;
                A1.add((Character.toString(w[k].charAt(0))));    
                }
            }
        }
       
               if(A1.size()%2!=0){
                  A1.add("x");
               }
        
                   }////String chcking
            int u=0;
          for (int i = 0; i < 25; i++) {
            if(u<w1.length){
            if(A2.contains(w1[u])){
                i-=1;
                u++;
            }else{
          A2.add((Character.toString(w1[u].charAt(0))));
            u++;
            }
            }else{
                char q=(char)97;
          
                for ( i = i; i < 25; i++) {
             if(A2.contains(Character.toString(q))){
                 q++;
                i--;
                
            }else{
                 if(Character.toString(q).equals("j") && A2.contains("i")){
                     q++;
                     i--;
                 }
                 else  if(Character.toString(q).equals("i") && A2.contains("j")){
                     q++;
                     i--;
                 }
          A2.add(Character.toString(q));
            q++;
            }       
                }
            }
        }
          
//          System.out.println(A2.size());
//        for (int i = 0; i < A2.size(); i++) {
//        System.out.print(A2.get(i));
//        }
      
          for (int i = 0; i < A1.size(); i++) {
        System.out.print(A1.get(i));
        }

        INC_OR_DEC A = new INC_OR_DEC();
        switch (h) {
            case "1":
                System.out.println(A.Incrip(A1, A2));
                break;
            case "2":
                System.out.println(A.Decrip(A1, A2));
                break;
            default:
                System.out.println("wrong choise");
                break;
                
                
                
                
        }

    }} 
      
