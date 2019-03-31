/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playfair_cipher;

/**
 *
 * @author dell
 */
public class index {
    int a;
    int b;

    public index(int a, int b) {
        this.a = a;
        this.b = b;
    }

   

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "index{" + "a=" + a + ", b=" + b + '}';
    }
    
    
}
