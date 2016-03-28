package com.naveedroid.naveen.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Length_Activity extends AppCompatActivity {
     private Spinner spinner_from;
    private Spinner spinner_to;
    private ImageButton convert_length;
    private EditText input_length;
    private TextView Result_length;
    private String option_from;
    private String option_to;
    ArrayAdapter<CharSequence>adapter_1;
    ArrayAdapter<CharSequence>adapter_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_);
        spinner_from=(Spinner)findViewById(R.id.option_1);
        spinner_to=(Spinner)findViewById(R.id.option_2);
        adapter_1=ArrayAdapter.createFromResource(this,R.array.length_array_opt1,android.R.layout.simple_spinner_dropdown_item);
        adapter_2=ArrayAdapter.createFromResource(this,R.array.length_array_opt2,android.R.layout.simple_spinner_dropdown_item);
        spinner_from.setAdapter(adapter_1);
        spinner_to.setAdapter(adapter_2);
        convert_length=(ImageButton)findViewById(R.id.convert);
        input_length=(EditText)findViewById(R.id.input);
        Result_length=(TextView)findViewById(R.id.result);
        spinner_from.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " selected", Toast.LENGTH_SHORT).show();
                option_from = parent.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner_to.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " selected", Toast.LENGTH_SHORT).show();
                option_to = parent.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        convert_length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!input_length.getText().toString().equals(""))
                {
                    double in = Double.parseDouble(input_length.getText().toString());
                    if (option_from.equals("Metre"))
                    {
                        if (option_to.equals("Metre"))
                        {
                            Result_length.setText(String.valueOf(in*1)+" metre");
                        }
                        if (option_to.equals("Kilometre"))
                        {
                            Result_length.setText(String.valueOf(in*0.001)+" Kilometre");
                        }
                        if (option_to.equals("Centimetre"))
                        {
                            Result_length.setText(String.valueOf(in*100)+" Centimetre");
                        }
                        if (option_to.equals("Millimetre"))
                        {
                            Result_length.setText(String.valueOf(in*1000)+" millimetre");
                        }
                        if (option_to.equals("Micrometre"))
                        {
                            Result_length.setText(String.valueOf(in*1e+6)+" micrometre");
                        }
                        if (option_to.equals("Nanometre"))
                        {
                            Result_length.setText(String.valueOf(in*1e+9)+" nanometre");
                        }
                        if (option_to.equals("Mile"))
                        {
                            Result_length.setText(String.valueOf(in*0.000621371)+" Mile");
                        }
                        if (option_to.equals("Yard"))
                        {
                            Result_length.setText(String.valueOf(in*1.09361)+" Yard");
                        }
                        if (option_to.equals("Foot"))
                        {
                            Result_length.setText(String.valueOf(in*3.28084)+" Feet");
                        }
                        if (option_to.equals("Inch"))
                        {
                            Result_length.setText(String.valueOf(in*39.3701)+" inch");
                        }
                        if (option_to.equals("Nautical Mile"))
                        {
                            Result_length.setText(String.valueOf(in*0.000539957)+" Nautical mile");
                        }
                    }

                    if (option_from.equals("KiloMetre"))
                    {
                        if (option_to.equals("Metre"))
                        {
                            Result_length.setText(String.valueOf(in*1000)+" metre");
                        }
                        if (option_to.equals("Kilometre"))
                        {
                            Result_length.setText(String.valueOf(in*1)+" Kilometre");
                        }
                        if (option_to.equals("Centimetre"))
                        {
                            Result_length.setText(String.valueOf(in*100000)+" Centimetre");
                        }
                        if (option_to.equals("Millimetre"))
                        {
                            Result_length.setText(String.valueOf(in*1e+6)+" millimetre");
                        }
                        if (option_to.equals("Micrometre"))
                        {
                            Result_length.setText(String.valueOf(in*1e+9)+" micrometre");
                        }
                        if (option_to.equals("Nanometre"))
                        {
                            Result_length.setText(String.valueOf(in*1e+12)+" nanometre");
                        }
                        if (option_to.equals("Mile"))
                        {
                            Result_length.setText(String.valueOf(in*0.621371)+" Mile");
                        }
                        if (option_to.equals("Yard"))
                        {
                            Result_length.setText(String.valueOf(in*1093.61)+" Yard");
                        }
                        if (option_to.equals("Foot"))
                        {
                            Result_length.setText(String.valueOf(in*3280.84)+" Feet");
                        }
                        if (option_to.equals("Inch"))
                        {
                            Result_length.setText(String.valueOf(in*39370.1)+" inch");
                        }
                        if (option_to.equals("Nautical Mile"))
                        {
                            Result_length.setText(String.valueOf(in*0.539957)+" Nautical mile");
                        }
                    }

                    if (option_from.equals("Centimetre"))
                    {
                        if (option_to.equals("Metre"))
                        {
                            Result_length.setText(String.valueOf(in*0.01)+" metre");
                        }
                        if (option_to.equals("Kilometre"))
                        {
                            Result_length.setText(String.valueOf(in*1e-5)+" Kilometre");
                        }
                        if (option_to.equals("Centimetre"))
                        {
                            Result_length.setText(String.valueOf(in*1)+" Centimetre");
                        }
                        if (option_to.equals("Millimetre"))
                        {
                            Result_length.setText(String.valueOf(in*10)+" millimetre");
                        }
                        if (option_to.equals("Micrometre"))
                        {
                            Result_length.setText(String.valueOf(in*10000)+" micrometre");
                        }
                        if (option_to.equals("Nanometre"))
                        {
                            Result_length.setText(String.valueOf(in*1e+7)+" nanometre");
                        }
                        if (option_to.equals("Mile"))
                        {
                            Result_length.setText(String.valueOf(in*6.2137e-6)+" Mile");
                        }
                        if (option_to.equals("Yard"))
                        {
                            Result_length.setText(String.valueOf(in*0.0109361)+" Yard");
                        }
                        if (option_to.equals("Foot"))
                        {
                            Result_length.setText(String.valueOf(in*0.0328084)+" Feet");
                        }
                        if (option_to.equals("Inch"))
                        {
                            Result_length.setText(String.valueOf(in*0.393701)+" inch");
                        }
                        if (option_to.equals("Nautical Mile"))
                        {
                            Result_length.setText(String.valueOf(in*5.3996e-6)+" Nautical mile");
                        }
                    }


                    if (option_from.equals("Millimetre"))
                    {
                        if (option_to.equals("Metre"))
                        {
                            Result_length.setText(String.valueOf(in*0.001)+" metre");
                        }
                        if (option_to.equals("Kilometre"))
                        {
                            Result_length.setText(String.valueOf(in*1e-6)+" Kilometre");
                        }
                        if (option_to.equals("Centimetre"))
                        {
                            Result_length.setText(String.valueOf(in*0.1)+" Centimetre");
                        }
                        if (option_to.equals("Millimetre"))
                        {
                            Result_length.setText(String.valueOf(in*1)+" millimetre");
                        }
                        if (option_to.equals("Micrometre"))
                        {
                            Result_length.setText(String.valueOf(in*1000)+" micrometre");
                        }
                        if (option_to.equals("Nanometre"))
                        {
                            Result_length.setText(String.valueOf(in*1e+6)+" nanometre");
                        }
                        if (option_to.equals("Mile"))
                        {
                            Result_length.setText(String.valueOf(in*6.2137e-7)+" Mile");
                        }
                        if (option_to.equals("Yard"))
                        {
                            Result_length.setText(String.valueOf(in*0.00109361)+" Yard");
                        }
                        if (option_to.equals("Foot"))
                        {
                            Result_length.setText(String.valueOf(in*0.00328084)+" Feet");
                        }
                        if (option_to.equals("Inch"))
                        {
                            Result_length.setText(String.valueOf(in*0.0393701)+" inch");
                        }
                        if (option_to.equals("Nautical Mile"))
                        {
                            Result_length.setText(String.valueOf(in*5.3996e-7)+" Nautical mile");
                        }
                    }

                    if (option_from.equals("Micrometre"))
                    {
                        if (option_to.equals("Metre"))
                        {
                            Result_length.setText(String.valueOf(in*1e-6)+" metre");
                        }
                        if (option_to.equals("Kilometre"))
                        {
                            Result_length.setText(String.valueOf(in*1e-9)+" Kilometre");
                        }
                        if (option_to.equals("Centimetre"))
                        {
                            Result_length.setText(String.valueOf(in*1e-4)+" Centimetre");
                        }
                        if (option_to.equals("Millimetre"))
                        {
                            Result_length.setText(String.valueOf(in*0.001)+" millimetre");
                        }
                        if (option_to.equals("Micrometre"))
                        {
                            Result_length.setText(String.valueOf(in*1)+" micrometre");
                        }
                        if (option_to.equals("Nanometre"))
                        {
                            Result_length.setText(String.valueOf(in*1000)+" nanometre");
                        }
                        if (option_to.equals("Mile"))
                        {
                            Result_length.setText(String.valueOf(in*6.2137e-10)+" Mile");
                        }
                        if (option_to.equals("Yard"))
                        {
                            Result_length.setText(String.valueOf(in*1.0936e-6)+" Yard");
                        }
                        if (option_to.equals("Foot"))
                        {
                            Result_length.setText(String.valueOf(in*3.2808e-6)+" Feet");
                        }
                        if (option_to.equals("Inch"))
                        {
                            Result_length.setText(String.valueOf(in*3.937e-5)+" inch");
                        }
                        if (option_to.equals("Nautical Mile"))
                        {
                            Result_length.setText(String.valueOf(in*5.3996e-10)+" Nautical mile");
                        }
                    }


                    if (option_from.equals("Nanometre"))
                    {
                        if (option_to.equals("Metre"))
                        {
                            Result_length.setText(String.valueOf(in*1e-9)+" metre");
                        }
                        if (option_to.equals("Kilometre"))
                        {
                            Result_length.setText(String.valueOf(in*1e-12)+" Kilometre");
                        }
                        if (option_to.equals("Centimetre"))
                        {
                            Result_length.setText(String.valueOf(in*1e-7)+" Centimetre");
                        }
                        if (option_to.equals("Millimetre"))
                        {
                            Result_length.setText(String.valueOf(in*1e-6)+" millimetre");
                        }
                        if (option_to.equals("Micrometre"))
                        {
                            Result_length.setText(String.valueOf(in*0.001)+" micrometre");
                        }
                        if (option_to.equals("Nanometre"))
                        {
                            Result_length.setText(String.valueOf(in*1)+" nanometre");
                        }
                        if (option_to.equals("Mile"))
                        {
                            Result_length.setText(String.valueOf(in*6.2137e-13)+" Mile");
                        }
                        if (option_to.equals("Yard"))
                        {
                            Result_length.setText(String.valueOf(in*1.0936e-9)+" Yard");
                        }
                        if (option_to.equals("Foot"))
                        {
                            Result_length.setText(String.valueOf(in*3.2808e-9)+" Feet");
                        }
                        if (option_to.equals("Inch"))
                        {
                            Result_length.setText(String.valueOf(in*3.937e-8)+" inch");
                        }
                        if (option_to.equals("Nautical Mile"))
                        {
                            Result_length.setText(String.valueOf(in*5.3996e-13)+" Nautical mile");
                        }
                    }

                    if (option_from.equals("Mile"))
                    {
                        if (option_to.equals("Metre"))
                        {
                            Result_length.setText(String.valueOf(in*1609.34)+" metre");
                        }
                        if (option_to.equals("Kilometre"))
                        {
                            Result_length.setText(String.valueOf(in*1.60934)+" Kilometre");
                        }
                        if (option_to.equals("Centimetre"))
                        {
                            Result_length.setText(String.valueOf(in*160934)+" Centimetre");
                        }
                        if (option_to.equals("Millimetre"))
                        {
                            Result_length.setText(String.valueOf(in*1.609e+6)+" millimetre");
                        }
                        if (option_to.equals("Micrometre"))
                        {
                            Result_length.setText(String.valueOf(in*1.609e+9)+" micrometre");
                        }
                        if (option_to.equals("Nanometre"))
                        {
                            Result_length.setText(String.valueOf(in*1.609e+12)+" nanometre");
                        }
                        if (option_to.equals("Mile"))
                        {
                            Result_length.setText(String.valueOf(in*1)+" Mile");
                        }
                        if (option_to.equals("Yard"))
                        {
                            Result_length.setText(String.valueOf(in*1760)+" Yard");
                        }
                        if (option_to.equals("Foot"))
                        {
                            Result_length.setText(String.valueOf(in*5280)+" Feet");
                        }
                        if (option_to.equals("Inch"))
                        {
                            Result_length.setText(String.valueOf(in*63360)+" inch");
                        }
                        if (option_to.equals("Nautical Mile"))
                        {
                            Result_length.setText(String.valueOf(in*0.868976)+" Nautical mile");
                        }
                    }

                    if (option_from.equals("Yard"))
                    {
                        if (option_to.equals("Metre"))
                        {
                            Result_length.setText(String.valueOf(in*0.9144)+" metre");
                        }
                        if (option_to.equals("Kilometre"))
                        {
                            Result_length.setText(String.valueOf(in*0.0009144)+" Kilometre");
                        }
                        if (option_to.equals("Centimetre"))
                        {
                            Result_length.setText(String.valueOf(in*91.44)+" Centimetre");
                        }
                        if (option_to.equals("Millimetre"))
                        {
                            Result_length.setText(String.valueOf(in*914.4)+" millimetre");
                        }
                        if (option_to.equals("Micrometre"))
                        {
                            Result_length.setText(String.valueOf(in*914400)+" micrometre");
                        }
                        if (option_to.equals("Nanometre"))
                        {
                            Result_length.setText(String.valueOf(in*9.144e+8)+" nanometre");
                        }
                        if (option_to.equals("Mile"))
                        {
                            Result_length.setText(String.valueOf(in*0.000568182)+" Mile");
                        }
                        if (option_to.equals("Yard"))
                        {
                            Result_length.setText(String.valueOf(in*1)+" Yard");
                        }
                        if (option_to.equals("Foot"))
                        {
                            Result_length.setText(String.valueOf(in*3)+" Feet");
                        }
                        if (option_to.equals("Inch"))
                        {
                            Result_length.setText(String.valueOf(in*36)+" inch");
                        }
                        if (option_to.equals("Nautical Mile"))
                        {
                            Result_length.setText(String.valueOf(in*0.000493737)+" Nautical mile");
                        }
                    }

                    if (option_from.equals("Foot"))
                    {
                        if (option_to.equals("Metre"))
                        {
                            Result_length.setText(String.valueOf(in*0.3048)+" metre");
                        }
                        if (option_to.equals("Kilometre"))
                        {
                            Result_length.setText(String.valueOf(in*0.0003048)+" Kilometre");
                        }
                        if (option_to.equals("Centimetre"))
                        {
                            Result_length.setText(String.valueOf(in*30.48)+" Centimetre");
                        }
                        if (option_to.equals("Millimetre"))
                        {
                            Result_length.setText(String.valueOf(in*304.8)+" millimetre");
                        }
                        if (option_to.equals("Micrometre"))
                        {
                            Result_length.setText(String.valueOf(in*304800)+" micrometre");
                        }
                        if (option_to.equals("Nanometre"))
                        {
                            Result_length.setText(String.valueOf(in*3.048e+8)+" nanometre");
                        }
                        if (option_to.equals("Mile"))
                        {
                            Result_length.setText(String.valueOf(in*0.000189394)+" Mile");
                        }
                        if (option_to.equals("Yard"))
                        {
                            Result_length.setText(String.valueOf(in*0.333333)+" Yard");
                        }
                        if (option_to.equals("Foot"))
                        {
                            Result_length.setText(String.valueOf(in*1)+" Feet");
                        }
                        if (option_to.equals("Inch"))
                        {
                            Result_length.setText(String.valueOf(in*12)+" inch");
                        }
                        if (option_to.equals("Nautical Mile"))
                        {
                            Result_length.setText(String.valueOf(in*0.000164579)+" Nautical mile");
                        }
                    }

                    if (option_from.equals("Inch"))
                    {
                        if (option_to.equals("Metre"))
                        {
                            Result_length.setText(String.valueOf(in*0.0254)+" metre");
                        }
                        if (option_to.equals("Kilometre"))
                        {
                            Result_length.setText(String.valueOf(in*2.54e-5)+" Kilometre");
                        }
                        if (option_to.equals("Centimetre"))
                        {
                            Result_length.setText(String.valueOf(in*2.54)+" Centimetre");
                        }
                        if (option_to.equals("Millimetre"))
                        {
                            Result_length.setText(String.valueOf(in*25.4)+" millimetre");
                        }
                        if (option_to.equals("Micrometre"))
                        {
                            Result_length.setText(String.valueOf(in*25400)+" micrometre");
                        }
                        if (option_to.equals("Nanometre"))
                        {
                            Result_length.setText(String.valueOf(in*2.54e+7)+" nanometre");
                        }
                        if (option_to.equals("Mile"))
                        {
                            Result_length.setText(String.valueOf(in*1.5783e-5)+" Mile");
                        }
                        if (option_to.equals("Yard"))
                        {
                            Result_length.setText(String.valueOf(in*0.0277778)+" Yard");
                        }
                        if (option_to.equals("Foot"))
                        {
                            Result_length.setText(String.valueOf(in*0.0833333)+" Feet");
                        }
                        if (option_to.equals("Inch"))
                        {
                            Result_length.setText(String.valueOf(in*1)+" inch");
                        }
                        if (option_to.equals("Nautical Mile"))
                        {
                            Result_length.setText(String.valueOf(in*1.3715e-5)+" Nautical mile");
                        }
                    }

                    if (option_from.equals("Nautical Mile"))
                    {
                        if (option_to.equals("Metre"))
                        {
                            Result_length.setText(String.valueOf(in*1852)+" metre");
                        }
                        if (option_to.equals("Kilometre"))
                        {
                            Result_length.setText(String.valueOf(in*1.852)+" Kilometre");
                        }
                        if (option_to.equals("Centimetre"))
                        {
                            Result_length.setText(String.valueOf(in*185200)+" Centimetre");
                        }
                        if (option_to.equals("Millimetre"))
                        {
                            Result_length.setText(String.valueOf(in*1.852e+6)+" millimetre");
                        }
                        if (option_to.equals("Micrometre"))
                        {
                            Result_length.setText(String.valueOf(in*1.852e+9)+" micrometre");
                        }
                        if (option_to.equals("Nanometre"))
                        {
                            Result_length.setText(String.valueOf(in*1.852e+12)+" nanometre");
                        }
                        if (option_to.equals("Mile"))
                        {
                            Result_length.setText(String.valueOf(in*1.15078)+" Mile");
                        }
                        if (option_to.equals("Yard"))
                        {
                            Result_length.setText(String.valueOf(in*2025.37)+" Yard");
                        }
                        if (option_to.equals("Foot"))
                        {
                            Result_length.setText(String.valueOf(in*6076.12)+" Feet");
                        }
                        if (option_to.equals("Inch"))
                        {
                            Result_length.setText(String.valueOf(in*72913.4)+" inch");
                        }
                        if (option_to.equals("Nautical Mile"))
                        {
                            Result_length.setText(String.valueOf(in*1)+" Nautical mile");
                        }
                    }
                }
                else if(input_length.getText().toString().equals(""))
                    Result_length.setText("Please give input");

            }
        });
    }
}
