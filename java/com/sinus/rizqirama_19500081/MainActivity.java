package com.sinus.rizqirama_19500081;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    
    TextView textView;
    CheckBox checkBox1, checkBox2, checkBox3;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView3_081);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox_081);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2_081);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3_081);
        button = (Button) findViewById(R.id.button_081);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == button.getId()) {
            if (checkBox1.isChecked() && checkBox2.isChecked()) {
                textView.setText("Benar!");
                textView.setTextColor(Color.GREEN);
            } else {
                textView.setText("Salah!");
                textView.setTextColor(Color.RED);
            }
        }
    }
}