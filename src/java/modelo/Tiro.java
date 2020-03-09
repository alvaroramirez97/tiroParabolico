/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static java.lang.Math.pow;
import static java.lang.Math.sin;

/**
 *
 * @author DAW202
 */
public class Tiro {
    
    public int velocidadInicial;
    public int angulo;
    public double gravedad;
    public double alcanceMaximo;
    public double alturaMaxima;

    public Tiro(int velocidadInicial, int angulo) {
        this.velocidadInicial = velocidadInicial;
        this.angulo = angulo;
        this.gravedad = 9.8;
        double radianes = Utilidades.gradosAradianes(angulo);
        this.alcanceMaximo = pow(velocidadInicial, 2)*sin(2*radianes)/9.8;
        this.alturaMaxima = pow(velocidadInicial, 2)*pow(sin(radianes),2)/2*9.8;
    }

    public int getVelocidadInicial() {
        return velocidadInicial;
    }

    public int getAngulo() {
        return angulo;
    }

    public double getGravedad() {
        return gravedad;
    }

    public double getAlcanceMaximo() {
        return alcanceMaximo;
    }

    public double getAlturaMaxima() {
        return alturaMaxima;
    }

    
    
    
    
    
}
