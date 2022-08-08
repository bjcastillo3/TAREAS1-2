/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utpltec.com.videojuego;

/**
 *
 * @author bryan
 */
public class Jugador {
    
    private String nombre;
    private String edad;
    private String puntaje;
    
    
    public Jugador (String nombre, String edad, String puntaje){
    this.nombre = nombre;
    this.edad = edad;
    this.puntaje = puntaje;
    
    }
    
    public String getnombre(){
            return nombre;
    }
    
    public String getedad(){
            return edad;
    }   
    
    public String getpuntaje(){
            return puntaje;
    }        
    
   public void imprimirInf2(){
            System.out.println("\nNombre de jugador: "+nombre+
                 "\nEdad: "+edad+
                 "\nPuntaje: "+puntaje);    
                  
     }
}