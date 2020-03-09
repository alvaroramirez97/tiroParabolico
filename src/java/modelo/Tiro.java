/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author DAW202
 */
public class Tiro {
    
    public int velocidadInicial;
    public int angulo;
    public double gravedad;

    public Tiro(int velocidadInicial, int angulo) {
        this.velocidadInicial = velocidadInicial;
        this.angulo = angulo;
        this.gravedad = 9.8;
    }

    
    
    
}
