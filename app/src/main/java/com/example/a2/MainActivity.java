package com.example.a2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    EditText input;
    Button submit;
    TextView result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







        input = findViewById(R.id.etInput);
        submit = findViewById(R.id.btnSubmit);
        result = findViewById(R.id.tvResults);
        result.setVisibility(View.GONE);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String warning = getString(R.string.warning);
                if (input.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                    return;
                }else{
                    int temperature ;

                    int nbChirps = Integer.parseInt(input.getText().toString().trim());

                    temperature = nbChirps/3 + 4;

                    String sTemperature = Integer.toString(temperature);
                    String outsideTemp = getString(R.string.temperature) +" "+ sTemperature +" " + getString(R.string.Celsius);

                    result.setText(outsideTemp);

                    result.setVisibility(View.VISIBLE);
                }

            }
        });

    }
}
