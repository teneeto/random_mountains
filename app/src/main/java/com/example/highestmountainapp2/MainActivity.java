package com.example.highestmountainapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button genMountains;
    private TextView Mountains;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        genMountains = findViewById(R.id.gen_mountains);
        Mountains = findViewById(R.id.mountains);
        final String [] mountains = {"Everest", "Kilimanjaro", "Makulu", "Kamet", "Trivor", "K12", "Ulter", "Mana", "Buka", "Spokane"};

        genMountains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int genRand = rand.nextInt(mountains.length);

                Mountains.setText(mountains[genRand]);

            }
        });
    }
}
