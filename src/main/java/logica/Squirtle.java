/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author EQUIPO
 */
public class Squirtle extends Pokemon implements IAgua{

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy SQUIRTLE --- ");
        System.out.println("Estoy atacando con PLACAJE");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Soy SQUIRTLE --- ");
        System.out.println("Estoy atacando con ARAÑAZO");
    }

    @Override
    protected void atacarMoridsco() {
        System.out.println("Soy SQUIRTLE --- ");
        System.out.println("Estoy atacando con MORDISCO");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Soy SQUIRTLE --- ");
        System.out.println("Estoy atacando con HIDROBOMBA");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy SQUIRTLE --- ");
        System.out.println("Estoy atacando con PISTOLA AGUA");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy SQUIRTLE --- ");
        System.out.println("Estoy atacando con BURBUJA");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Soy SQUIRTLE --- ");
        System.out.println("Estoy atacando con HIDROPULSO");
    }
    
}
