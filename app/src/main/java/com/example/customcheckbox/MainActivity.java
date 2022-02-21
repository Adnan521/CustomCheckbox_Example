package com.example.customcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox=findViewById(R.id.checkbox);

    }


    public void Submit(View view) {

        if (checkBox.isChecked()){
            Toast.makeText(MainActivity.this, "Please Subscribe "+checkBox.getText().toString(), Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this, "Noting is Selected", Toast.LENGTH_SHORT).show();
        }

    }
}