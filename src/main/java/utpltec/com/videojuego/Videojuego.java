/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package utpltec.com.videojuego;

/**
 *
 * @author bryan
 */
public class Videojuego {

    public static void main(String[] args) {
        Pacman Pacman = new Pacman("Pacman", "Facil", "Arcade","Nivel 5");
        
        Pacman.imprimirInf();
        
     Jugador Jugador = new Jugador("Brayan","26","500");
        
        Jugador.imprimirInf2();   
        
    }
}
