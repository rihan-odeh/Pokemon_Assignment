package com.example.pokemon_assignment;


import java.util.ArrayList;

public abstract class AbstractPokemon implements PokemonInterface {
    ArrayList<Pokemon> myPokemon = new ArrayList<>();
    ;
    String myPokemonList = "";

    @Override
    public Pokemon createPokemon(String name, String type, int health) {
        return new Pokemon(name, type, health);
    }

    @Override
    public String pokemonInfo(Pokemon pokemon) {
        return pokemon.toString();
    }

}
