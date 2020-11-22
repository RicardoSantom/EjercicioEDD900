/*
 * This program asks the user for data on the screen, reads it from the keyboard, 
*calculates the volume of a cone with it and shows the same volume 
*of the cone on the screen. It also provides some humor at the end.
 */
package com.mycompany.ejercicioedd900;

/**
 *
 * @author Ricardo Santiago Tomé RicardoSantom en Github
 * @since 20/11/2020
 * @version 2.0
 */
public class Cono {
    private float radio;
    private float altura;
    private float pi;

    
     Cono(float radio, float altura,float pi) {
        this.radio = radio;
        this.altura = altura;
        this.pi = pi;
    }

    Cono() {
    }
    
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }
/**
 * This function returns the value of the volume of the cone.
 * @return volume of the cone.
 */
    float calcularVolumen(){
        return (pi*radio*radio*altura)/3f;
    }

}
