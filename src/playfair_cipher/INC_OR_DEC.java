/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playfair_cipher;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
class INC_OR_DEC {

    String arr[][]=new String[5][5];
    
   String Incrip(ArrayList<String> A1, ArrayList<String> A2) {
       return "";
    }

    String  Decrip(ArrayList<String> A1, ArrayList<String> A2) {
       return "";
    }
    
    
   
    void func(ArrayList<String> A1, ArrayList<String> A2, String[] w, String[] w1) {
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
            }else if("i".equals(w1[u]) && A2.contains("j")){
                i-=1;
                u++;
            }
            else if("j".equals(w1[u]) && A2.contains("i")){
                i-=1;
                u++;
            }
            else{
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
//     int u1=0;   
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                arr[i][j]=A2.get(u1);
//                u1++;
//            }
//        }
//        
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
//        
//      
//          for (int i = 0; i < A1.size(); i++) {
//        System.out.print(A1.get(i));
//        }
    }
}
