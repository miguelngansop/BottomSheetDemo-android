package com.example.fruits;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.openBottomSheetButton).setOnClickListener(v -> {
            FruitBottomSheetDialog dialog = new FruitBottomSheetDialog();
            dialog.show(getSupportFragmentManager(), "FruitBottomSheetDialog");
        });
    }

}
