/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexcepciones;


/**
 *
 * @author ingri
 */
public class ManejoExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int a[] = new int[2];
            System.out.println(a[5]);
        } catch (Exception err) {
            System.out.println(err.toString());
            System.out.println("Ocurrió un error");
        } finally {
            System.out.println("Esto siempre se imprime");
        }
    }

    int div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division entre cero");
        } else {
            return a / b;
        }
    }
}
