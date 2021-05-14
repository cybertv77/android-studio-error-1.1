package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button Button;
    private Object TextView;
    private Object TextView2;
    private Object editTextnew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button = findViewById(R.id.button);
        TextView = findViewById(R.id.textView);
        TextView2 = findViewById(R.id.textView2);
        editTextnew = findViewById(R.id.editTextnew);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hi! Its Working", Toast.LENGTH_SHORT).show();
                String s = editTextnew.getText().toString();
                int kg = Integer.parseInt(s);
                double pound = 2.205 * kg;
                editTextnew.setText(" The corresponding value in Pound is " + pound);

            }
        });
        
    }
}
