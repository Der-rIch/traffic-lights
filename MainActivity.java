"Светофор"


package ru.unitech_mo.study_p2_22.androrid;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity{
 @Override
 protected vold onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 ConstraintLayout view = findViewById(R.id.button_red);
 red.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         view.setBackgroundColor(Color.RED);
     }
 });
 Button yellow = findViewById(R.id.buttn_yellow);
 yellow.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         view.setBackgroundColor(Color.YELLOW);
     }
 });
 Button green = findViewById(R.id.button_green);
 green.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
     view.setBackgroundColor(Color.GREEN);
 }
 });
 }
}