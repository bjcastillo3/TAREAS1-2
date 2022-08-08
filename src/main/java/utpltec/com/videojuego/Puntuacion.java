/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utpltec.com.videojuego;

/**
 *
 * @author bryan
* 
*  */
public class Puntuacion extends Jugador {
    
    
    private int puntaje;
    
    public Puntuacion (String nombre, int edad, int puntaje){
    super (nombre, edad);
    this.puntaje = puntaje;    
        
    }
    
     public void imprimirInf2(){
            System.out.println("\nNombre de jugador: "+getnombre());
           
            System.out.println("\nNombre de jugador: "+getedad()+
                    "\nPuntaje: "+puntaje);
           
    }

}
