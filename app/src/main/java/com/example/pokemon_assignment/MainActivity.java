package com.example.pokemon_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     Pokemon pokemon;
    EditText editText;
    Pokedex pokedex = new Pokedex();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText =findViewById(R.id.editText);
       pokemon= pokedex.createPokemon("first", "Purple", 3);
        Pokemon pokemon1 =pokedex.createPokemon("second", 3, "yellow");
        Pokemon pokemon2 = pokedex.createPokemon("third", 3, "blue");
        Log.e("",  pokedex.pokemonInfo(pokemon));

        pokedex.addPokemon(pokemon);
        pokedex.addPokemon(pokemon1);
        pokedex.addPokemon(pokemon2);
        pokedex.listPokemon();


        editText.setText(pokedex.getMyPokemon().get(2).toString());


    }
}