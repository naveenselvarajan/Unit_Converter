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
 * Created by Naveen on 3/18/2016.
 */
public class Pressure_activity extends AppCompatActivity {
    private Spinner spinnerfrom;
    private Spinner spinnerto;
    private ImageButton convert_pressure;
    public EditText input_pressure;
    private TextView Result_pressure;
    public String optionfrom_pre;
    private String optionto_pre;
    ArrayAdapter<CharSequence> adapter_1;
    ArrayAdapter<CharSequence>adapter_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_);

        convert_pressure=(ImageButton)findViewById(R.id.convert);
        input_pressure=(EditText)findViewById(R.id.input);
        spinnerfrom=(Spinner)findViewById(R.id.option_1);
        spinnerto=(Spinner)findViewById(R.id.option_2);
        Result_pressure=(TextView)findViewById(R.id.result);


        adapter_1=ArrayAdapter.createFromResource(this,R.array.pressure_array_opt1,android.R.layout.simple_spinner_dropdown_item);
        adapter_2=ArrayAdapter.createFromResource(this,R.array.pressure_array_opt2,android.R.layout.simple_spinner_dropdown_item);
        spinnerfrom.setAdapter(adapter_1);
        spinnerto.setAdapter(adapter_2);
        spinnerfrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view1, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " selected", Toast.LENGTH_SHORT).show();
                optionfrom_pre = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerto.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view1, int position2, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position2) + " selected", Toast.LENGTH_SHORT).show();
                optionto_pre = parent.getItemAtPosition(position2).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        convert_pressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  double in=Double.parseDouble(input_pressure.getText().toString());
              // Toast.makeText(getBaseContext(),"clicked",Toast.LENGTH_LONG).show();
                if(!input_pressure.getText().toString().equals(""))
                {
                    double in=Double.parseDouble(input_pressure.getText().toString());
                    if(optionfrom_pre.equals("Atmosphere")) {
                      //  Result_pressure.setText(String.valueOf(in));
                        if(optionto_pre.equals("Atmosphere"))
                        {
                            Result_pressure.setText(String.valueOf(in*1)+" atm");
                        }
                        if(optionto_pre.equals("Bar"))
                        {
                            Result_pressure.setText(String.valueOf(in*1.01325)+" Bar");
                        }
                        if(optionto_pre.equals("Pascal"))
                        {
                            Result_pressure.setText(String.valueOf(in*101325)+" Pascal");
                        }
                        if (optionto_pre.equals("Pound-Force/Sq.Inch"))
                        {
                            Result_pressure.setText(String.valueOf(in*14.6959)+" Pound_Force/Sq.inch");
                        }
                        if (optionto_pre.equals("Torr"))
                        {
                            Result_pressure.setText(String.valueOf(in*760)+" Torr");
                        }
                    }
                    else if(optionfrom_pre.equals("Bar"))

                    {
                        if(optionto_pre.equals("Atmosphere"))
                        {
                            Result_pressure.setText(String.valueOf(in*0.986923)+" atm");
                        }
                        if(optionto_pre.equals("Bar"))
                        {
                            Result_pressure.setText(String.valueOf(in * 1) + " Bar");
                        }
                        if(optionto_pre.equals("Pascal"))
                        {
                            Result_pressure.setText(String.valueOf(in *100000) + "Bar");
                        }
                        if(optionto_pre.equals("Pound-Force/Sq.inch"))
                        {
                            Result_pressure.setText(String.valueOf(in *14.5038) + "Pound-Force/Sq.inch");
                        }
                        if(optionto_pre.equals("Torr"))
                        {
                            Result_pressure.setText(String.valueOf(in *750.062) + "Torr");
                        }
                    }
                    else if (optionfrom_pre.equals("Pascal"))
                    {
                        if(optionto_pre.equals("Atmosphere"))
                        {
                            Result_pressure.setText(String.valueOf(in*9.8692e-6)+"atm");
                        }
                        if(optionto_pre.equals("Bar"))
                        {
                            Result_pressure.setText(String.valueOf(in*1e-5)+"bar");
                        }
                        if(optionto_pre.equals("Pascal"))
                        {
                            Result_pressure.setText(String.valueOf(in*1)+"pascal");
                        }

                        if(optionto_pre.equals("Pound-Force/Sq.Inch"))
                        {
                            Result_pressure.setText(String.valueOf(in*0.000145038)+"Pound-Force/Sq.Inch");
                        }
                        if(optionto_pre.equals("Torr"))
                        {
                            Result_pressure.setText(String.valueOf(in*0.00750062)+"Torr");
                        }

                    }
                    if(optionfrom_pre.equals("Pound-Force/Sq.Inch"))
                    {
                        if (optionto_pre.equals("Atmosphere"))
                        {
                            Result_pressure.setText(String.valueOf(in*0.068046)+"atm");
                        }
                        if (optionto_pre.equals("Bar"))
                        {
                            Result_pressure.setText(String.valueOf(in*0.0689476)+"bar");
                        }
                        if (optionto_pre.equals("Pascal"))
                        {
                            Result_pressure.setText(String.valueOf(in*6894.76)+"pascal");
                        }
                        if (optionto_pre.equals("Pound-Force/Sq.Inch"))
                        {
                            Result_pressure.setText(String.valueOf(in*0.000145038)+"Pound-Force/Sq.Inch");
                        }
                        if (optionto_pre.equals("Torr"))
                        {
                            Result_pressure.setText(String.valueOf(in*0.00750062)+"Torr");
                        }

                    }
                    if(optionfrom_pre.equals("Torr"))
                    {
                        if (optionto_pre.equals("Atmosphere"))
                        {
                            Result_pressure.setText(String.valueOf(in*0.00131579)+"atm");
                        }
                        if (optionto_pre.equals("Bar"))
                        {
                            Result_pressure.setText(String.valueOf(in*0.00133322)+"bar");
                        }
                        if (optionto_pre.equals("Pascal"))
                        {
                            Result_pressure.setText(String.valueOf(in*133.322)+"pascal");
                        }
                        if (optionto_pre.equals("Pound-Force/Sq.Inch"))
                        {
                            Result_pressure.setText(String.valueOf(in*0.0193368)+"Pound-Force/Sq.Inch");
                        }
                        if (optionto_pre.equals("Torr"))
                        {
                            Result_pressure.setText(String.valueOf(in*51.7149)+"Torr");
                        }
                    }

                }

                else if(input_pressure.getText().toString().equals(""))
                    Result_pressure.setText("Please give input");
            }
        });
    }

}
