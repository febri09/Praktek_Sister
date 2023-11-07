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
public class Enkripsi1 {
    public static void main (String [] args){
        char[] kr = {'0','1','2','3','4','5','6','7','8','9',' ',',','.' + 
                     'a','b','c','d','e','f','g','f','g','h','i','j','k','l','m' +
                     'n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String bantu1 = "";
        String text = "Selamat Datang";
        int geser = 1;
        // enkripsi
        char[] cArray1 = (text.toCharArray());
        
        for (char c1 : cArray1){
            for (int i=0; i<kr.length; i++){
            if(c1 == kr[i]){
                i = i+(geser);
                if(i>=kr.length){
                    i = i-kr.length;
                }
                c1 = kr[i];
                bantu1 = bantu1 + c1;
            }
        }
        System.out.println("Sebelum :" +text);
        System.out.println("Hasil :" +bantu1);
       }
    }
}
