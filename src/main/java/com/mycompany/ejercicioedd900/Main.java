/*
  * This program asks the user for data on the screen, reads it from the keyboard, 
  *calculates the volume of a cone with it and shows the same volume 
  *of the cone on the screen. It also provides some humor at the end.
  */
package com.mycompany.ejercicioedd900;

import java.util.Scanner;

/**
 *
 * @author Ricardo Santiago Tomé RicardoSantom en Github
 * @since 20/11/2020
 * @version 2.0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Cono conoUsuario = new Cono();
        
        System.out.println("Introduzca altura del cono: ");
        Scanner reader = new Scanner(System.in);
        conoUsuario.setAltura (reader.nextFloat());
        
        System.out.println("Introduzca radio del cono: ");
        conoUsuario.setRadio (reader.nextFloat());
        
        System.out.println("Introduzca valor estimado para PI: ");
        conoUsuario.setPi (reader.nextFloat());
        
        System.out.println("El volumen del cono introducido es: "+conoUsuario.calcularVolumen());
        
         
         float alturaFijada = 9.0f;
        float radioFijado = 9.0f;
        float piFijado=3.1414f;

        Cono conoDesarrollador =new Cono(alturaFijada, radioFijado, piFijado);
        System.out.println("El volumen del cono creado por el desarrollador es: " + conoDesarrollador.calcularVolumen());
        
        if(conoDesarrollador.calcularVolumen()>conoUsuario.calcularVolumen()){
            System.out.println("ja,ja,ja! El mío es más grande que el tuyo...");
        } 
        else {
            System.out.println("Donde vas con tanto cono, abusón!");
        }

    }
    
}
