/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

import java.io.File;  //Importa la clase File
import java.io.FileNotFoundException;  //Importa esta clase para manejar errores
import java.util.Scanner; //Importa el Scanner

public class Leer {

    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ocurrió un error");
            e.printStackTrace();
        }
    }
}
