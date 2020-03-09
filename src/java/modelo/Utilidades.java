package modelo;


import static java.lang.Math.cos;
import static java.lang.Math.pow;
import static java.lang.Math.tan;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAW202
 */
public class Utilidades {
    
     public static ArrayList<String> getAngulos() {
         
       ArrayList<String> lista = new ArrayList<String>();
       for (int i = 0; i <= 18; i++){
           int valor_mes = i*10;
           lista.add(String.valueOf(valor_mes));
       }
       return lista;
    }
     
     public static Double gradosAradianes(int grados){
         Double radianes = grados*Math.PI/180.0;
         return radianes;
     }
     
     public static ArrayList<Coordenada> generaCoordenadasCreadoPorMi(double alcance, double vel_inicial, int angulo){
         double intervalo = alcance/10;
         double radianes = gradosAradianes(angulo);
         ArrayList<Coordenada> lista = new ArrayList<Coordenada>();
         for (int i = 0; i <= 10; i++){
           
           double x = i*intervalo;
           double y = x * tan(radianes)-9.8 * pow(x,2)/(2*pow(vel_inicial,2) * pow(cos(radianes),2));
           Coordenada coor = new Coordenada(x,y);
           lista.add(coor);
       }
         return lista;
     }
    
}
