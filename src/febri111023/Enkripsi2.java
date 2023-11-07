/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package febri111023;

/**
 *
 * @author sryfe
 */
public class Enkripsi2 {
    public static void main (String []args){
        String text ="Selamat Datang";
        String temp ="";
        int key = 5;
        for(int i=0; i<text.length(); i++){
            int h = (int) (text.charAt(i)); 
            char k = (char)(h ^ key);
            temp += k; 
            System.out.println(h);
            System.out.println(k);
            
    }
        System.out.println("Sebelum :" +text);
        System.out.println("Hasil :" +temp);
    }
}
