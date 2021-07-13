package com.example.pokemon_assignment;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
    private ArrayList<Pokemon> myPokemon;


    public Pokedex() {

        myPokemon = new ArrayList<>();

    }

    public void addPokemon(Pokemon pokemon) {
        myPokemon.add(pokemon);
    }

    public ArrayList<Pokemon> getMyPokemon() {
        return myPokemon;
    }

    public void setMyPokemon(ArrayList<Pokemon> myPokemon) {
        this.myPokemon = myPokemon;
    }

    @Override
    public void listPokemon() {

        for (int i = 0; i < myPokemon.size(); i++) {
            myPokemonList += myPokemon.get(i).getName();
        }
    }


    public String getMyPokemonList() {
        return myPokemonList;
    }


    public Pokemon createPokemon(String name, int health, String type) {
        addPokemon(super.createPokemon(name, type, health));
        ;
        return super.createPokemon(name, type, health);
    }

    @Override
    public String pokemonInfo(Pokemon pokemon) {
        return super.pokemonInfo(pokemon);
    }

}
