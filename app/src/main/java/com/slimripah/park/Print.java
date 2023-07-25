package com.slimripah.park;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Print extends AppCompatActivity {

    ImageView ptCar;
    TextView ptPlate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print);

        ptCar = findViewById(R.id.printImage);
        ptPlate = findViewById(R.id.printText);

        byte[] byteArray = getIntent().getByteArrayExtra("image");
        Bitmap bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        ptCar.setImageBitmap(bitmap);

        String plateText = getIntent().getStringExtra("plate");
        ptPlate.setText(plateText);

    }
}