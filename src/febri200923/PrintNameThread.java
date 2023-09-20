/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package febri200923;

/**
 *
 * @author sryfe
 */
public class PrintNameThread extends Thread {
    PrintNameThread(String name) {
            super(name);
            // menjalankan thread dengan satu kali instantiate
        start(); }
        public void run() {
            String name = getName();
            for (int i = 0; i < 100; i++) {
            System.out.print(name);
        }
    }
}