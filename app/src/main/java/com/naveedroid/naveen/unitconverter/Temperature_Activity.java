package com.naveedroid.naveen.unitconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Naveen on 3/22/2016.
 */
public class Temperature_Activity extends AppCompatActivity {
    private Spinner spinner_from;
    private Spinner spinner_to;
    private ImageButton convert_temp;
    private EditText input_temp;
    private TextView Result_temp;
    private String option_from;
    private String option_to;
    ArrayAdapter<CharSequence> adapter_1;
    ArrayAdapter<CharSequence>adapter_2;

    @Override
    public void onCreate(Bundle SavedInstanceState)
    {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_length_);
        convert_temp=(ImageButton)findViewById(R.id.convert);
        input_temp=(EditText)findViewById(R.id.input);
        Result_temp=(TextView)findViewById(R.id.result);
        spinner_from=(Spinner)findViewById(R.id.option_1);
        spinner_to=(Spinner)findViewById(R.id.option_2);

        adapter_1=ArrayAdapter.createFromResource(this,R.array.Temperature_array_opt1,android.R.layout.simple_spinner_dropdown_item);
        adapter_2=ArrayAdapter.createFromResource(this,R.array.Temperature_array_opt2,android.R.layout.simple_spinner_dropdown_item);
        spinner_from.setAdapter(adapter_1);
        spinner_to.setAdapter(adapter_2);

        spinner_from.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view1, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " selected", Toast.LENGTH_SHORT).show();
                option_from = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner_to.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view1, int position2, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position2) + " selected", Toast.LENGTH_SHORT).show();
                option_to = parent.getItemAtPosition(position2).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        convert_temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!input_temp.getText().toString().equals(""))
                {
                    double in = Double.parseDouble(input_temp.getText().toString());
                    if (option_from.equals("Celsius"))
                    {
                        if (option_to.equals("Celsius")) {
                            Result_temp.setText(String.valueOf(in +0) + " Deg.Celsius");
                        }
                        if (option_to.equals("Fahrenheit")) {
                            Result_temp.setText(String.valueOf(in*9/5+32) + " Fahrenheit");
                        }
                        if (option_to.equals("Kelvin")) {
                            Result_temp.setText(String.valueOf(in +273.15) + " kelvin");
                        }
                    }

                    if (option_from.equals("Fahrenheit"))
                    {
                        if (option_to.equals("Celsius")) {
                            Result_temp.setText(String.valueOf((in-32)*5/9) + " Deg.Celsius");
                        }
                        if (option_to.equals("Fahrenheit")) {
                            Result_temp.setText(String.valueOf(in+0) + " Fahrenheit");
                        }
                        if (option_to.equals("Kelvin")) {
                            Result_temp.setText(String.valueOf((in+459.67)*5/9) + " kelvin");
                        }
                    }

                    if (option_from.equals("Kelvin"))
                    {
                        if (option_to.equals("Celsius")) {
                            Result_temp.setText(String.valueOf(in-273.15) + " Deg.Celsius");
                        }
                        if (option_to.equals("Fahrenheit")) {
                            Result_temp.setText(String.valueOf(in*9/5-459.67) + " Fahrenheit");
                        }
                        if (option_to.equals("Kelvin")) {
                            Result_temp.setText(String.valueOf(in +0) + " kelvin");
                        }
                    }
                }
            }
        });
    }
}
