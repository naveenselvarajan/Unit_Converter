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
public class Mass_Activity extends AppCompatActivity {
    private Spinner spinner_from;
    private Spinner spinner_to;
    private ImageButton convert_mass;
    private EditText input_mass;
    private TextView Result_mass;
    private String option_from;
    private String option_to;
    ArrayAdapter<CharSequence> adapter_1;
    ArrayAdapter<CharSequence>adapter_2;
    @Override
    public void onCreate(Bundle SavedInstanceState)
    {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_length_);

        convert_mass=(ImageButton)findViewById(R.id.convert);
        input_mass=(EditText)findViewById(R.id.input);
        Result_mass=(TextView)findViewById(R.id.result);
        spinner_from=(Spinner)findViewById(R.id.option_1);
        spinner_to=(Spinner)findViewById(R.id.option_2);

        adapter_1=ArrayAdapter.createFromResource(this,R.array.Mass_array_opt1,android.R.layout.simple_spinner_dropdown_item);
        adapter_2=ArrayAdapter.createFromResource(this,R.array.Mass_array_opt2,android.R.layout.simple_spinner_dropdown_item);
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

        convert_mass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!input_mass.getText().toString().equals(""))
                {
                    double in =Double.parseDouble(input_mass.getText().toString());
                    if (option_from.equals("Tonne"))
                    {
                        if (option_to.equals("Kilogram"))
                        {
                            Result_mass.setText(String.valueOf(in*1000)+" kilogram");
                        }
                        if (option_to.equals("Gram"))
                        {
                            Result_mass.setText(String.valueOf(in*1e+6)+" gram");
                        }
                        if (option_to.equals("Milligram"))
                        {
                            Result_mass.setText(String.valueOf(in*1e+9)+" milligram");
                        }
                        if (option_to.equals("Micrograms"))
                        {
                            Result_mass.setText(String.valueOf(in*1e+12)+" microgram");
                        }
                        if (option_to.equals("Imperial ton"))
                        {
                            Result_mass.setText(String.valueOf(in*0.984207)+" imperial ton");
                        }
                        if (option_to.equals("Tonne"))
                        {
                            Result_mass.setText(String.valueOf(in*1)+" ton");
                        }
                        if (option_to.equals("US ton"))
                        {
                            Result_mass.setText(String.valueOf(in*1.10231)+" US ton");
                        }
                        if (option_to.equals("Stone"))
                        {
                            Result_mass.setText(String.valueOf(in*157.473)+" stone");
                        }
                        if (option_to.equals("Pound"))
                        {
                            Result_mass.setText(String.valueOf(in*2204.62)+" Pound");
                        }
                        if (option_to.equals("Ounce"))
                        {
                            Result_mass.setText(String.valueOf(in*35274)+" Ounce");
                        }
                    }

                    if (option_from.equals("Kilogram"))
                    {
                        if (option_to.equals("Kilogram"))
                        {
                            Result_mass.setText(String.valueOf(in*1)+" kilogram");
                        }
                        if (option_to.equals("Gram"))
                        {
                            Result_mass.setText(String.valueOf(in*1000)+" gram");
                        }
                        if (option_to.equals("Milligram"))
                        {
                            Result_mass.setText(String.valueOf(in*1e+6)+" milligram");
                        }
                        if (option_to.equals("Micrograms"))
                        {
                            Result_mass.setText(String.valueOf(in*1e+9)+" microgram");
                        }
                        if (option_to.equals("Imperial ton"))
                        {
                            Result_mass.setText(String.valueOf(in*0.000984207)+" imperial ton");
                        }
                        if (option_to.equals("Tonne"))
                        {
                            Result_mass.setText(String.valueOf(in*0.001)+" ton");
                        }
                        if (option_to.equals("US ton"))
                        {
                            Result_mass.setText(String.valueOf(in*0.00110231)+" US ton");
                        }
                        if (option_to.equals("Stone"))
                        {
                            Result_mass.setText(String.valueOf(in*0.157473)+" stone");
                        }
                        if (option_to.equals("Pound"))
                        {
                            Result_mass.setText(String.valueOf(in*2.20462)+" Pound");
                        }
                        if (option_to.equals("Ounce"))
                        {
                            Result_mass.setText(String.valueOf(in*35.274)+" Ounce");
                        }
                    }

                    if (option_from.equals("Gram"))
                    {
                        if (option_to.equals("Kilogram"))
                        {
                            Result_mass.setText(String.valueOf(in*0.001)+" kilogram");
                        }
                        if (option_to.equals("Gram"))
                        {
                            Result_mass.setText(String.valueOf(in*1)+" gram");
                        }
                        if (option_to.equals("Milligram"))
                        {
                            Result_mass.setText(String.valueOf(in*1000)+" milligram");
                        }
                        if (option_to.equals("Micrograms"))
                        {
                            Result_mass.setText(String.valueOf(in*1e+6)+" microgram");
                        }
                        if (option_to.equals("Imperial ton"))
                        {
                            Result_mass.setText(String.valueOf(in*9.8421e-7)+" imperial ton");
                        }
                        if (option_to.equals("Tonne"))
                        {
                            Result_mass.setText(String.valueOf(in*1e-6)+" ton");
                        }
                        if (option_to.equals("US ton"))
                        {
                            Result_mass.setText(String.valueOf(in*1.1023e-6)+" US ton");
                        }
                        if (option_to.equals("Stone"))
                        {
                            Result_mass.setText(String.valueOf(in*0.000157473)+" stone");
                        }
                        if (option_to.equals("Pound"))
                        {
                            Result_mass.setText(String.valueOf(in*0.00220462)+" Pound");
                        }
                        if (option_to.equals("Ounce"))
                        {
                            Result_mass.setText(String.valueOf(in*0.035274)+" Ounce");
                        }
                    }

                    if (option_from.equals("Milligram"))
                    {
                        if (option_to.equals("Kilogram"))
                        {
                            Result_mass.setText(String.valueOf(in*1e-6)+" kilogram");
                        }
                        if (option_to.equals("Gram"))
                        {
                            Result_mass.setText(String.valueOf(in*0.001)+" gram");
                        }
                        if (option_to.equals("Milligram"))
                        {
                            Result_mass.setText(String.valueOf(in*1)+" milligram");
                        }
                        if (option_to.equals("Micrograms"))
                        {
                            Result_mass.setText(String.valueOf(in*1000)+" microgram");
                        }
                        if (option_to.equals("Imperial ton"))
                        {
                            Result_mass.setText(String.valueOf(in*9.8421e-10)+" imperial ton");
                        }
                        if (option_to.equals("Tonne"))
                        {
                            Result_mass.setText(String.valueOf(in*1e-9)+" ton");
                        }
                        if (option_to.equals("US ton"))
                        {
                            Result_mass.setText(String.valueOf(in*1.1023e-6)+" US ton");
                        }
                        if (option_to.equals("Stone"))
                        {
                            Result_mass.setText(String.valueOf(in*1.5747e-7)+" stone");
                        }
                        if (option_to.equals("Pound"))
                        {
                            Result_mass.setText(String.valueOf(in*2.2046e-6)+" Pound");
                        }
                        if (option_to.equals("Ounce"))
                        {
                            Result_mass.setText(String.valueOf(in*3.5274e-5)+" Ounce");
                        }
                    }

                    if (option_from.equals("Microgram"))
                    {
                        if (option_to.equals("Kilogram"))
                        {
                            Result_mass.setText(String.valueOf(in*1e-9)+" kilogram");
                        }
                        if (option_to.equals("Gram"))
                        {
                            Result_mass.setText(String.valueOf(in*1e-6)+" gram");
                        }
                        if (option_to.equals("Milligram"))
                        {
                            Result_mass.setText(String.valueOf(in*0.001)+" milligram");
                        }
                        if (option_to.equals("Micrograms"))
                        {
                            Result_mass.setText(String.valueOf(in*1)+" microgram");
                        }
                        if (option_to.equals("Imperial ton"))
                        {
                            Result_mass.setText(String.valueOf(in*9.8421e-13)+" imperial ton");
                        }
                        if (option_to.equals("Tonne"))
                        {
                            Result_mass.setText(String.valueOf(in*1e-9)+" ton");
                        }
                        if (option_to.equals("US ton"))
                        {
                            Result_mass.setText(String.valueOf(in*1.1023e-12)+" US ton");
                        }
                        if (option_to.equals("Stone"))
                        {
                            Result_mass.setText(String.valueOf(in*1.5747e-10)+" stone");
                        }
                        if (option_to.equals("Pound"))
                        {
                            Result_mass.setText(String.valueOf(in*2.2046e-9)+" Pound");
                        }
                        if (option_to.equals("Ounce"))
                        {
                            Result_mass.setText(String.valueOf(in*3.5274e-8)+" Ounce");
                        }
                    }

                    if (option_from.equals("Imperial ton"))
                    {
                        if (option_to.equals("Kilogram"))
                        {
                            Result_mass.setText(String.valueOf(in*1016.05)+" kilogram");
                        }
                        if (option_to.equals("Gram"))
                        {
                            Result_mass.setText(String.valueOf(in*1.016e+6)+" gram");
                        }
                        if (option_to.equals("Milligram"))
                        {
                            Result_mass.setText(String.valueOf(in*1.016e+9)+" milligram");
                        }
                        if (option_to.equals("Micrograms"))
                        {
                            Result_mass.setText(String.valueOf(in*1.016e+12)+" microgram");
                        }
                        if (option_to.equals("Imperial ton"))
                        {
                            Result_mass.setText(String.valueOf(in*1)+" imperial ton");
                        }
                        if (option_to.equals("Tonne"))
                        {
                            Result_mass.setText(String.valueOf(in*1.01605)+" ton");
                        }
                        if (option_to.equals("US ton"))
                        {
                            Result_mass.setText(String.valueOf(in*1.12)+" US ton");
                        }
                        if (option_to.equals("Stone"))
                        {
                            Result_mass.setText(String.valueOf(in*160)+" stone");
                        }
                        if (option_to.equals("Pound"))
                        {
                            Result_mass.setText(String.valueOf(in*2240)+" Pound");
                        }
                        if (option_to.equals("Ounce"))
                        {
                            Result_mass.setText(String.valueOf(in*35840)+" Ounce");
                        }
                    }

                    if (option_from.equals("US ton"))
                    {
                        if (option_to.equals("Kilogram"))
                        {
                            Result_mass.setText(String.valueOf(in*907.185)+" kilogram");
                        }
                        if (option_to.equals("Gram"))
                        {
                            Result_mass.setText(String.valueOf(in*907185)+" gram");
                        }
                        if (option_to.equals("Milligram"))
                        {
                            Result_mass.setText(String.valueOf(in*9.072e+8)+" milligram");
                        }
                        if (option_to.equals("Micrograms"))
                        {
                            Result_mass.setText(String.valueOf(in*9.072e+11)+" microgram");
                        }
                        if (option_to.equals("Imperial ton"))
                        {
                            Result_mass.setText(String.valueOf(in*0.892857)+" imperial ton");
                        }
                        if (option_to.equals("Tonne"))
                        {
                            Result_mass.setText(String.valueOf(in*0.907185)+" tonne");
                        }
                        if (option_to.equals("US ton"))
                        {
                            Result_mass.setText(String.valueOf(in*1.10231)+" US ton");
                        }
                        if (option_to.equals("Stone"))
                        {
                            Result_mass.setText(String.valueOf(in*142.857)+" stone");
                        }
                        if (option_to.equals("Pound"))
                        {
                            Result_mass.setText(String.valueOf(in*2000)+" Pound");
                        }
                        if (option_to.equals("Ounce"))
                        {
                            Result_mass.setText(String.valueOf(in*32000)+" Ounce");
                        }
                    }

                    if (option_from.equals("Stone"))
                    {
                        if (option_to.equals("Kilogram"))
                        {
                            Result_mass.setText(String.valueOf(in*6.35029)+" kilogram");
                        }
                        if (option_to.equals("Gram"))
                        {
                            Result_mass.setText(String.valueOf(in*6350.29)+" gram");
                        }
                        if (option_to.equals("Milligram"))
                        {
                            Result_mass.setText(String.valueOf(in*6.35e+6)+" milligram");
                        }
                        if (option_to.equals("Micrograms"))
                        {
                            Result_mass.setText(String.valueOf(in*6.35e+9)+" microgram");
                        }
                        if (option_to.equals("Imperial ton"))
                        {
                            Result_mass.setText(String.valueOf(in*0.00625)+" imperial ton");
                        }
                        if (option_to.equals("Tonne"))
                        {
                            Result_mass.setText(String.valueOf(in*0.00635029)+" tonne");
                        }
                        if (option_to.equals("US ton"))
                        {
                            Result_mass.setText(String.valueOf(in*0.007)+" US ton");
                        }
                        if (option_to.equals("Stone"))
                        {
                            Result_mass.setText(String.valueOf(in*1)+" stone");
                        }
                        if (option_to.equals("Pound"))
                        {
                            Result_mass.setText(String.valueOf(in*14)+" Pound");
                        }
                        if (option_to.equals("Ounce"))
                        {
                            Result_mass.setText(String.valueOf(in*224)+" Ounce");
                        }
                    }

                    if (option_from.equals("Pound"))
                    {
                        if (option_to.equals("Kilogram"))
                        {
                            Result_mass.setText(String.valueOf(in*0.453592)+" kilogram");
                        }
                        if (option_to.equals("Gram"))
                        {
                            Result_mass.setText(String.valueOf(in*453.592)+" gram");
                        }
                        if (option_to.equals("Milligram"))
                        {
                            Result_mass.setText(String.valueOf(in*453592)+" milligram");
                        }
                        if (option_to.equals("Micrograms"))
                        {
                            Result_mass.setText(String.valueOf(in*4.536e+8)+" microgram");
                        }
                        if (option_to.equals("Imperial ton"))
                        {
                            Result_mass.setText(String.valueOf(in*0.000446429)+" imperial ton");
                        }
                        if (option_to.equals("Tonne"))
                        {
                            Result_mass.setText(String.valueOf(in*0.000453592)+" tonne");
                        }
                        if (option_to.equals("US ton"))
                        {
                            Result_mass.setText(String.valueOf(in*0.0005)+" US ton");
                        }
                        if (option_to.equals("Stone"))
                        {
                            Result_mass.setText(String.valueOf(in*0.0714286)+" stone");
                        }
                        if (option_to.equals("Pound"))
                        {
                            Result_mass.setText(String.valueOf(in*1)+" Pound");
                        }
                        if (option_to.equals("Ounce"))
                        {
                            Result_mass.setText(String.valueOf(in*16)+" Ounce");
                        }
                    }

                    if (option_from.equals("Ounce"))
                    {
                        if (option_to.equals("Kilogram"))
                        {
                            Result_mass.setText(String.valueOf(in*0.0283495)+" kilogram");
                        }
                        if (option_to.equals("Gram"))
                        {
                            Result_mass.setText(String.valueOf(in*28.3495)+" gram");
                        }
                        if (option_to.equals("Milligram"))
                        {
                            Result_mass.setText(String.valueOf(in*28349.5)+" milligram");
                        }
                        if (option_to.equals("Micrograms"))
                        {
                            Result_mass.setText(String.valueOf(in*2.835e+7)+" microgram");
                        }
                        if (option_to.equals("Imperial ton"))
                        {
                            Result_mass.setText(String.valueOf(in*2.7902e-5)+" imperial ton");
                        }
                        if (option_to.equals("Tonne"))
                        {
                            Result_mass.setText(String.valueOf(in*2.835e-5)+" tonne");
                        }
                        if (option_to.equals("US ton"))
                        {
                            Result_mass.setText(String.valueOf(in*3.125e-5)+" US ton");
                        }
                        if (option_to.equals("Stone"))
                        {
                            Result_mass.setText(String.valueOf(in*0.00446429)+" stone");
                        }
                        if (option_to.equals("Pound"))
                        {
                            Result_mass.setText(String.valueOf(in*0.0625)+" Pound");
                        }
                        if (option_to.equals("Ounce"))
                        {
                            Result_mass.setText(String.valueOf(in*1)+" Ounce");
                        }
                    }

                }
                else if(input_mass.getText().toString().equals(""))
                    Result_mass.setText("Please give input");
            }
        });
    }

}
