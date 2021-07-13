package com.example.pokemon_assignment;

public class Pokemon {
    private String name;
    private int health;
    private String type;
    private static int count;

    public Pokemon(String name, String type, int health) {
        count++;
        this.health = health;
        this.name = name;
        this.type = type;

    }

    public void attackPokemon(Pokemon pokemon) {
        pokemon.health -= 10;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", type='" + type + '\'' +
                '}';
    }
}
