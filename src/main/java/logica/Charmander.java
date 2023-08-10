/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author EQUIPO
 */
public class Charmander extends Pokemon implements IFuego{

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy CHARMANDER --- ");
        System.out.println("Estoy atacando con PLACAJE");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Soy CHARMANDER --- ");
        System.out.println("Estoy atacando con ARAÑAZO");
    }

    @Override
    protected void atacarMoridsco() {
        System.out.println("Soy CHARMANDER --- ");
        System.out.println("Estoy atacando con MORDISCO");
    }

    @Override
    public void atacarPunoFuego() {
        System.out.println("Soy CHARMANDER --- ");
        System.out.println("Estoy atacando con PUÑO FUEGO");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy CHARMANDER --- ");
        System.out.println("Estoy atacando con ASCUAS");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy CHARMANDER --- ");
        System.out.println("Estoy atacando con LANZA LLAMAS");
    }
    
}
