/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author EQUIPO
 */
public class Pikachu extends Pokemon implements IElectrico{

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy PIKACHU --- ");
        System.out.println("Estoy atacando con PLACAJE");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Soy PIKACHU --- ");
        System.out.println("Estoy atacando con ARAÑAZO");
    }

    @Override
    protected void atacarMoridsco() {
        System.out.println("Soy PIKACHU --- ");
        System.out.println("Estoy atacando con MORDISCO");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Soy PIKACHU --- ");
        System.out.println("Estoy atacando con IMPACTRUENO");
    }

    @Override
    public void atacarPunoTrueno() {
        System.out.println("Soy PIKACHU --- ");
        System.out.println("Estoy atacando con PUÑO TRUENO");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Soy PIKACHU --- ");
        System.out.println("Estoy atacando con RAYO");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Soy PIKACHU --- ");
        System.out.println("Estoy atacando con RAYO CARGA");
    }
    
}
