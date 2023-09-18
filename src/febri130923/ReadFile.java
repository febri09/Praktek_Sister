/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package febri130923;

/**
 *
 * @author sryfe
 */
import java.io.*;
class ReadFile {
    public static void main(String args[]) throws IOException{
        System.out.println("Nama File?");
        String filename;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        filename = br.readLine();
        System.out.println("Now reading from" + filename + "...");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filename);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        }
        try {
            char data;
            int temp;
            do {                
                temp = fis.read();
                data = (char) temp;
                if (temp != -1) {
                    System.out.print(data);
                    System.out.print("-");
                    System.out.print(temp);
                }
            } while (temp != -1);
        } catch (IOException ex) {
            System.out.println("Problem in reading from the file.");
        }
        
    }
}
