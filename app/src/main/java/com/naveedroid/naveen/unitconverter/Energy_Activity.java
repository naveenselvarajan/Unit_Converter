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

public class Energy_Activity extends AppCompatActivity {
    private Spinner spinnerfrom;
    private Spinner spinnerto;
    private ImageButton convert_energy;
    public EditText input_energy;
    private TextView Result_energy;
    private String optionfrom;
    private String optionto;
    ArrayAdapter<CharSequence>adapter_1;
    ArrayAdapter<CharSequence>adapter_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energy_);
        convert_energy=(ImageButton)findViewById(R.id.energy_convert);
        input_energy=(EditText)findViewById(R.id.energy_input);
        spinnerfrom=(Spinner)findViewById(R.id.energy_option_1);
        spinnerto=(Spinner)findViewById(R.id.energy_option_2);


        Result_energy=(TextView)findViewById(R.id.resultenergy);
        adapter_1=ArrayAdapter.createFromResource(this,R.array.energy_array_opt1,android.R.layout.simple_spinner_dropdown_item);
        adapter_2=ArrayAdapter.createFromResource(this,R.array.energy_array_opt2,android.R.layout.simple_spinner_dropdown_item);
        spinnerfrom.setAdapter(adapter_1);
        spinnerto.setAdapter(adapter_2);
        spinnerfrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view1, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " selected", Toast.LENGTH_SHORT).show();
                optionfrom = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinnerto.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view2, int position2, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position2) + " selected", Toast.LENGTH_SHORT).show();
                optionto=parent.getItemAtPosition(position2).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        convert_energy.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!input_energy.getText().toString().equals(""))
                {
                    double in=Double.parseDouble(input_energy.getText().toString());
                    if(optionfrom.equals("Jule"))
                    {
                        if (optionto.equals("Jule"))
                        {
                            Result_energy.setText(String.valueOf(in*1)+" Jule");
                        }
                        else if (optionto.equals("KiloJule"))
                        {
                            Result_energy.setText(String.valueOf(in*0.001)+" K.Jule");
                        }
                        else if (optionto.equals("GramCalorie"))
                        {
                            Result_energy.setText(String.valueOf(in*0.239006)+" G.Cal");
                        }
                        else if (optionto.equals("KiloCalorie"))
                        {
                            Result_energy.setText(String.valueOf(in*0.000239006)+" K.Cal");
                        }
                        else if (optionto.equals("WattHour"))
                        {
                            Result_energy.setText(String.valueOf(in*0.000277778)+" WH");
                        }
                        else if (optionto.equals("KilowattHour"))
                        {
                            Result_energy.setText(String.valueOf(in*2.7778e-7)+" KWH");
                        }
                        else if (optionto.equals("electronVolt"))
                        {
                            Result_energy.setText(String.valueOf(in*6.242e+18)+" eV");
                        }


                    }
                    else if(optionfrom.equals("KiloJule"))
                    {
                        if (optionto.equals("Jule"))
                        {
                            Result_energy.setText(String.valueOf(in*1000)+" Jule");
                        }
                        else if (optionto.equals("KiloJule"))
                        {
                            Result_energy.setText(String.valueOf(in*1)+" K.Jule");
                        }
                        else if (optionto.equals("GramCalorie"))
                        {
                            Result_energy.setText(String.valueOf(in*239.006)+" G.Cal");
                        }
                        else if (optionto.equals("KiloCalorie"))
                        {
                            Result_energy.setText(String.valueOf(in*0.239006)+" K.Cal");
                        }
                        else if (optionto.equals("WattHour"))
                        {
                            Result_energy.setText(String.valueOf(in*0.277778)+" WH");
                        }
                        else if (optionto.equals("KilowattHour"))
                        {
                            Result_energy.setText(String.valueOf(in*0.000277778)+" Kwh");
                        }
                        else if (optionto.equals("electronVolt"))
                        {
                            Result_energy.setText(String.valueOf(in*6.242e+21)+" eV");
                        }

                    }
                    else if(optionfrom.equals("GramCalorie"))
                    {
                        if (optionto.equals("Jule"))
                        {
                            Result_energy.setText(String.valueOf(in*4.184)+" Jule");
                        }
                        else if (optionto.equals("KiloJule"))
                        {
                            Result_energy.setText(String.valueOf(in*0.004184)+" K.Jule");
                        }
                        else if (optionto.equals("GramCalorie"))
                        {
                            Result_energy.setText(String.valueOf(in*1)+" G.Cal");
                        }
                        else if (optionto.equals("KiloCalorie"))
                        {
                            Result_energy.setText(String.valueOf(in*0.001)+" K.Cal");
                        }
                        else if (optionto.equals("WattHour"))
                        {
                            Result_energy.setText(String.valueOf(in*0.00116222)+" WH");
                        }
                        else if (optionto.equals("KilowattHour"))
                        {
                            Result_energy.setText(String.valueOf(in*1.1622e-6)+" KWH");
                        }
                        else if (optionto.equals("electronVolt"))
                        {
                            Result_energy.setText(String.valueOf(in*2.611e+19)+" eV");
                        }

                    }
                    else if(optionfrom.equals("KiloCalorie"))
                    {
                        if (optionto.equals("Jule"))
                        {
                            Result_energy.setText(String.valueOf(in*4184)+" Jule");
                        }
                        else if (optionto.equals("KiloJule"))
                        {
                            Result_energy.setText(String.valueOf(in*4.184)+" K.Jule");
                        }
                        else if (optionto.equals("GramCalorie"))
                        {
                            Result_energy.setText(String.valueOf(in*1000)+" G.Cal");
                        }
                        else if (optionto.equals("KiloCalorie"))
                        {
                            Result_energy.setText(String.valueOf(in*1)+" K.Cal");
                        }
                        else if (optionto.equals("WattHour"))
                        {
                            Result_energy.setText(String.valueOf(in*1.16222)+" Wh");
                        }
                        else if (optionto.equals("KilowattHour"))
                        {
                            Result_energy.setText(String.valueOf(in*0.00116222)+" KWH");
                        }
                        else if (optionto.equals("electronVolt"))
                        {
                            Result_energy.setText(String.valueOf(in*2.611e+22)+" eV");
                        }

                    }
                    else if(optionfrom.equals("WattHour"))
                    {
                        if (optionto.equals("Jule"))
                        {
                            Result_energy.setText(String.valueOf(in*3600)+" Jule");
                        }
                        else if (optionto.equals("KiloJule"))
                        {
                            Result_energy.setText(String.valueOf(in*3.6)+" K.Jule");
                        }
                        else if (optionto.equals("GramCalorie"))
                        {
                            Result_energy.setText(String.valueOf(in*860.421)+" Gram.Cal");
                        }
                        else if (optionto.equals("KiloCalorie"))
                        {
                            Result_energy.setText(String.valueOf(in*0.860421)+" K.cal");
                        }
                        else if (optionto.equals("WattHour"))
                        {
                            Result_energy.setText(String.valueOf(in*1)+" WattHour");
                        }
                        else if (optionto.equals("KilowattHour"))
                        {
                            Result_energy.setText(String.valueOf(in*0.001)+" kiloWattHour");
                        }
                        else if (optionto.equals("electronVolt"))
                        {
                            Result_energy.setText(String.valueOf(in*2.247e+22)+" eV");
                        }

                    }
                    else if(optionfrom.equals("KilowattHour"))
                    {
                        if (optionto.equals("Jule"))
                        {
                            Result_energy.setText(String.valueOf(in*3.6e+6)+" Jule");
                        }
                        else if (optionto.equals("KiloJule"))
                        {
                            Result_energy.setText(String.valueOf(in*3600)+" K.Jule");
                        }
                        else if (optionto.equals("GramCalorie"))
                        {
                            Result_energy.setText(String.valueOf(in*860421)+" G.Cal");
                        }
                        else if (optionto.equals("KiloCalorie"))
                        {
                            Result_energy.setText(String.valueOf(in*860.421)+" K.Cal");
                        }
                        else if (optionto.equals("WattHour"))
                        {
                            Result_energy.setText(String.valueOf(in*1000)+" Wh");
                        }
                        else if (optionto.equals("KilowattHour"))
                        {
                            Result_energy.setText(String.valueOf(in*1)+" KWH");
                        }
                        else if (optionto.equals("electronVolt"))
                        {
                            Result_energy.setText(String.valueOf(in*2.247e+25)+" eV");
                        }

                    }
                    else if(optionfrom.equals("electronVolt"))
                    {
                        if (optionto.equals("Jule"))
                        {
                            Result_energy.setText(String.valueOf(in*1.6022e-19)+" Jule");
                        }
                        else if (optionto.equals("KiloJule"))
                        {
                            Result_energy.setText(String.valueOf(in*1.6022e-22)+" K.Jule");
                        }
                        else if (optionto.equals("GramCalorie"))
                        {
                            Result_energy.setText(String.valueOf(in*3.8293e-20)+" Gram.Cal");
                        }
                        else if (optionto.equals("KiloCalorie"))
                        {
                            Result_energy.setText(String.valueOf(in*3.8293e-23)+" K.cal");
                        }
                        else if (optionto.equals("WattHour"))
                        {
                            Result_energy.setText(String.valueOf(in*4.4505e-23)+" WattHour");
                        }
                        else if (optionto.equals("KilowattHour"))
                        {
                            Result_energy.setText(String.valueOf(in*4.4505e-26)+" K.WattHour");
                        }
                        else if (optionto.equals("electronVolt"))
                        {
                            Result_energy.setText(String.valueOf(in*1)+" eV");
                        }

                    }

                }

                else if(input_energy.getText().toString().equals(""))
                    Result_energy.setText("Please give input");
            }
        });

    }
}
