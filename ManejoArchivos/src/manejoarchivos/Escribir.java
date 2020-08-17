/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

import java.io.FileWriter;   // Importar la clase FileWriter
import java.io.IOException;  //Importar la clase IOException para manejar el error

public class Escribir {

    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("2Contenido para el archivo. Esto se escribirá.");
            myWriter.close();
            System.out.println("Se escribió el archivo");
        } catch (IOException e) {
            System.out.println("Ocurrió un error");
            //e.printStackTrace();
        }
    }
}
