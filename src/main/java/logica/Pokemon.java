/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author EQUIPO
 */
public abstract class Pokemon {
    
    protected int num_pokedex;
    protected String nombrePokemon;
    protected double pesoPokemon;
    protected char sexo;
    protected int temporadaAparicion;
    protected String tipo;

    public Pokemon() {
    }

    public Pokemon(int num_pokedex, String nombrePokemon, double pesoPokemon, char sexo, int temporadaAparicion, String tipo) {
        this.num_pokedex = num_pokedex;
        this.nombrePokemon = nombrePokemon;
        this.pesoPokemon = pesoPokemon;
        this.sexo = sexo;
        this.temporadaAparicion = temporadaAparicion;
        this.tipo = tipo;
    }
    
    
    
    protected abstract void atacarPlacaje();
    
    protected abstract void atacarAranazo();
    
    protected abstract void atacarMoridsco();
}
