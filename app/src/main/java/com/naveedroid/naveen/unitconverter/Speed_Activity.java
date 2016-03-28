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
public class Speed_Activity extends AppCompatActivity {
    private Spinner spinner_from;
    private Spinner spinner_to;
    private ImageButton convert_speed;
    private EditText input_speed;
    private TextView Result_speed;
    private String option_from;
    private String option_to;
    ArrayAdapter<CharSequence> adapter_1;
    ArrayAdapter<CharSequence>adapter_2;
    @Override

    public void onCreate(Bundle SavedInstanceState)
    {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_length_);

        convert_speed=(ImageButton)findViewById(R.id.convert);
        input_speed=(EditText)findViewById(R.id.input);
        Result_speed=(TextView)findViewById(R.id.result);
        spinner_from=(Spinner)findViewById(R.id.option_1);
        spinner_to=(Spinner)findViewById(R.id.option_2);

        adapter_1=ArrayAdapter.createFromResource(this,R.array.Speed_array_opt1,android.R.layout.simple_spinner_dropdown_item);
        adapter_2=ArrayAdapter.createFromResource(this,R.array.Speed_array_opt2,android.R.layout.simple_spinner_dropdown_item);
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

        convert_speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!input_speed.getText().toString().equals(""))
                {
                    double in = Double.parseDouble(input_speed.getText().toString());
                    if(option_from.equals("Miles/hour"))
                    {
                        if (option_to.equals("Miles/hour"))
                        {
                            Result_speed.setText(String.valueOf(in*1)+" miles/hour");
                        }
                        if (option_to.equals("Foot/Second"))
                        {
                            Result_speed.setText(String.valueOf(in*1.46667)+" Foot/Second");
                        }
                        if (option_to.equals("Metre/second"))
                        {
                            Result_speed.setText(String.valueOf(in*0.44704)+" Metre/Second");
                        }
                        if (option_to.equals("Kilometre/hour"))
                        {
                            Result_speed.setText(String.valueOf(in*1.60934)+" Kilometre/hour");
                        }
                        if (option_to.equals("Knot"))
                        {
                            Result_speed.setText(String.valueOf(in*0.868976)+" knot");
                        }

                    }

                    if(option_from.equals("Foot/Second"))
                    {
                        if (option_to.equals("Miles/hour"))
                        {
                            Result_speed.setText(String.valueOf(in*0.681818)+" miles/hour");
                        }
                        if (option_to.equals("Foot/Second"))
                        {
                            Result_speed.setText(String.valueOf(in*1)+" Foot/Second");
                        }
                        if (option_to.equals("Metre/second"))
                        {
                            Result_speed.setText(String.valueOf(in*0.3048)+" Metre/Second");
                        }
                        if (option_to.equals("Kilometre/hour"))
                        {
                            Result_speed.setText(String.valueOf(in*1.09728)+" Kilometre/hour");
                        }
                        if (option_to.equals("Knot"))
                        {
                            Result_speed.setText(String.valueOf(in*0.592484)+" knot");
                        }

                    }

                    if(option_from.equals("Metre/second"))
                    {
                        if (option_to.equals("Miles/hour"))
                        {
                            Result_speed.setText(String.valueOf(in*2.23694)+" miles/hour");
                        }
                        if (option_to.equals("Foot/Second"))
                        {
                            Result_speed.setText(String.valueOf(in*3.28084)+" Foot/Second");
                        }
                        if (option_to.equals("Metre/second"))
                        {
                            Result_speed.setText(String.valueOf(in*1)+" Metre/Second");
                        }
                        if (option_to.equals("Kilometre/hour"))
                        {
                            Result_speed.setText(String.valueOf(in*3.6)+" Kilometre/hour");
                        }
                        if (option_to.equals("Knot"))
                        {
                            Result_speed.setText(String.valueOf(in*1.94384)+" knot");
                        }

                    }

                    if(option_from.equals("Kilometre/hour"))
                    {
                        if (option_to.equals("Miles/hour"))
                        {
                            Result_speed.setText(String.valueOf(in*0.621371)+" miles/hour");
                        }
                        if (option_to.equals("Foot/Second"))
                        {
                            Result_speed.setText(String.valueOf(in*0.911344)+" Foot/Second");
                        }
                        if (option_to.equals("Metre/second"))
                        {
                            Result_speed.setText(String.valueOf(in*0.277778)+" Metre/Second");
                        }
                        if (option_to.equals("Kilometre/hour"))
                        {
                            Result_speed.setText(String.valueOf(in*1)+" Kilometre/hour");
                        }
                        if (option_to.equals("Knot"))
                        {
                            Result_speed.setText(String.valueOf(in*0.539957)+" knot");
                        }

                    }

                    if(option_from.equals("Knot"))
                    {
                        if (option_to.equals("Miles/hour"))
                        {
                            Result_speed.setText(String.valueOf(in*1.15078)+" miles/hour");
                        }
                        if (option_to.equals("Foot/Second"))
                        {
                            Result_speed.setText(String.valueOf(in*1.68781)+" Foot/Second");
                        }
                        if (option_to.equals("Metre/second"))
                        {
                            Result_speed.setText(String.valueOf(in*0.514444)+" Metre/Second");
                        }
                        if (option_to.equals("Kilometre/hour"))
                        {
                            Result_speed.setText(String.valueOf(in*1.852)+" Kilometre/hour");
                        }
                        if (option_to.equals("Knot"))
                        {
                            Result_speed.setText(String.valueOf(in*1)+" knot");
                        }

                    }
                }

                else if(input_speed.getText().toString().equals(""))
                    Result_speed.setText("Please give some input");
            }
        });
    }
    
}
