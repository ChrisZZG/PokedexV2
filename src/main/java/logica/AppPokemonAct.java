/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package logica;

/**
 *
 * @author EQUIPO
 */
public class AppPokemonAct {

    public static void main(String[] args) {
        
        Pikachu pikachu = new Pikachu();
        Bulbasaur bulbasaur = new Bulbasaur();
        Charmander charmander = new Charmander();
        Squirtle squirtle = new Squirtle();
        
        System.out.println("----ATAQUES DE PIKACHU-----");
        pikachu.atacarAranazo();
        pikachu.atacarRayo();
        
        System.out.println("---ATAQUES DE SQUIRTLE-----");
        squirtle.atacarPistolaAgua();
        squirtle.atacarHidropulso();
    }
}
