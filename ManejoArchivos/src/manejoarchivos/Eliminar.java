/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

import java.io.File;  //Importa la clase File

public class Eliminar {

    public static void main(String[] args) {
        File myObj = new File("filename.txt");
        if (myObj.delete()) {
            System.out.println("Eliminó el archivo: " + myObj.getName());
        } else {
            System.out.println("Falló al eliminar el archivo");
        }
    }
}
