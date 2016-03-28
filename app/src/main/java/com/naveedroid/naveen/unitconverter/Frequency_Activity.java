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
 * Created by Naveen on 3/23/2016.
 */
public class Frequency_Activity extends AppCompatActivity {
    private Spinner spinner_from;
    private Spinner spinner_to;
    private ImageButton convert_freq;
    private EditText input_freq;
    private TextView Result_freq;
    private String option_from;
    private String option_to;
    ArrayAdapter<CharSequence> adapter_1;
    ArrayAdapter<CharSequence>adapter_2;
    @Override

    public void onCreate(Bundle SavedInstanceState)
    {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_length_);

        convert_freq=(ImageButton)findViewById(R.id.convert);
        input_freq=(EditText)findViewById(R.id.input);
        Result_freq=(TextView)findViewById(R.id.result);
        spinner_from=(Spinner)findViewById(R.id.option_1);
        spinner_to=(Spinner)findViewById(R.id.option_2);

        adapter_1=ArrayAdapter.createFromResource(this,R.array.Frequency_array_opt1,android.R.layout.simple_spinner_dropdown_item);
        adapter_2=ArrayAdapter.createFromResource(this,R.array.Frequency_array_opt2,android.R.layout.simple_spinner_dropdown_item);
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

        convert_freq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!input_freq.getText().toString().equals(""))
                {
                    double in = Double.parseDouble(input_freq.getText().toString());
                    if (option_from.equals("Hertz"))
                    {
                        if (option_to.equals("Hertz"))
                        {
                            Result_freq.setText(String.valueOf(in*1)+" Hertz");
                        }
                        if (option_to.equals("Kilohertz"))
                        {
                            Result_freq.setText(String.valueOf(in*0.001)+" KiloHertz");
                        }
                        if (option_to.equals("Megahertz"))
                        {
                            Result_freq.setText(String.valueOf(in*1e-6)+" MegaHertz");
                        }
                        if (option_to.equals("Gigahertz"))
                        {
                            Result_freq.setText(String.valueOf(in*1e-9)+" Gigahertz");
                        }
                    }
                    if (option_from.equals("Kilohertz"))
                    {
                        if (option_to.equals("Hertz"))
                        {
                            Result_freq.setText(String.valueOf(in*1000)+" Hertz");
                        }
                        if (option_to.equals("Kilohertz"))
                        {
                            Result_freq.setText(String.valueOf(in*1)+" KiloHertz");
                        }
                        if (option_to.equals("Megahertz"))
                        {
                            Result_freq.setText(String.valueOf(in*0.001)+" MegaHertz");
                        }
                        if (option_to.equals("Gigahertz"))
                        {
                            Result_freq.setText(String.valueOf(in*1e-6)+" Gigahertz");
                        }
                    }
                    if (option_from.equals("Megahertz"))
                    {
                        if (option_to.equals("Hertz"))
                        {
                            Result_freq.setText(String.valueOf(in*1e+6)+" Hertz");
                        }
                        if (option_to.equals("Kilohertz"))
                        {
                            Result_freq.setText(String.valueOf(in*1000)+" KiloHertz");
                        }
                        if (option_to.equals("Megahertz"))
                        {
                            Result_freq.setText(String.valueOf(in*1)+" MegaHertz");
                        }
                        if (option_to.equals("Gigahertz"))
                        {
                            Result_freq.setText(String.valueOf(in*0.001)+" Gigahertz");
                        }
                    }
                    if (option_from.equals("Gigahertz"))
                    {
                        if (option_to.equals("Hertz"))
                        {
                            Result_freq.setText(String.valueOf(in*1e+9)+" Hertz");
                        }
                        if (option_to.equals("Kilohertz"))
                        {
                            Result_freq.setText(String.valueOf(in*1e+6)+" KiloHertz");
                        }
                        if (option_to.equals("Megahertz"))
                        {
                            Result_freq.setText(String.valueOf(in*1000)+" MegaHertz");
                        }
                        if (option_to.equals("Gigahertz"))
                        {
                            Result_freq.setText(String.valueOf(in*1)+" Gigahertz");
                        }
                    }

                }
                else if(input_freq.getText().toString().equals(""))
                    Result_freq.setText("Please give some input");
            }
        });
    }
}
