package modelo;


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
    
}
