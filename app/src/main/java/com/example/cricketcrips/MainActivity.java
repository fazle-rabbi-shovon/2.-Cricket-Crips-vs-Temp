package com.example.cricketcrips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText etChrips;
    Button btnCalculate;
    TextView tvResult;
    DecimalFormat formatter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etChrips = findViewById(R.id.etChrips);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvResult = findViewById(R.id.tvResult);
        formatter = new DecimalFormat("#0.0");

        tvResult.setVisibility(View.GONE);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(etChrips.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter the number of chrips", Toast.LENGTH_SHORT).show();
                }
                else{
                    int chrips = Integer.parseInt(etChrips.getText().toString().trim());
                    Double temp = (chrips/3.0)+4;
                    String result = "The approximate temperature of outside is " + formatter.format(temp) + "degree celcius.";
                    tvResult.setText(result);
                    tvResult.setVisibility(View.VISIBLE);
                }


            }
        });






    }
}
