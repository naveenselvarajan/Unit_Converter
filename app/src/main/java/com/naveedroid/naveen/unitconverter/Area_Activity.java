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
public class Area_Activity extends AppCompatActivity {
    private Spinner spinner_from;
    private Spinner spinner_to;
    private ImageButton convert_area;
    private EditText input_area;
    private TextView Result_area;
    private String option_from;
    private String option_to;
    ArrayAdapter<CharSequence> adapter_1;
    ArrayAdapter<CharSequence>adapter_2;
    @Override
    public void onCreate(Bundle SavedInstanceState)
    {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_length_);

        convert_area=(ImageButton)findViewById(R.id.convert);
        input_area=(EditText)findViewById(R.id.input);
        Result_area=(TextView)findViewById(R.id.result);
        spinner_from=(Spinner)findViewById(R.id.option_1);
        spinner_to=(Spinner)findViewById(R.id.option_2);

        adapter_1=ArrayAdapter.createFromResource(this,R.array.Area_array_opt1,android.R.layout.simple_spinner_dropdown_item);
        adapter_2=ArrayAdapter.createFromResource(this,R.array.Area_array_opt2,android.R.layout.simple_spinner_dropdown_item);
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

        convert_area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!input_area.getText().toString().equals(""))
                {
                    double in = Double.parseDouble(input_area.getText().toString());
                    if (option_from.equals("Square Meter"))
                    {
                        if (option_to.equals("Square Meter"))
                        {
                            Result_area.setText(String.valueOf(in*1)+" Sq.metre");
                        }
                        if (option_to.equals("Square Kilometer"))
                        {
                            Result_area.setText(String.valueOf(in*1e-6)+" Sq.kilometre");
                        }
                        if (option_to.equals("Square Mile"))
                        {
                            Result_area.setText(String.valueOf(in*3.861e-7)+" Sq.mile");
                        }
                        if (option_to.equals("Square Yard"))
                        {
                            Result_area.setText(String.valueOf(in*1.19599)+" Sq.yard");
                        }
                        if (option_to.equals("Square Foot"))
                        {
                            Result_area.setText(String.valueOf(in*10.7639)+" Sq.feet");
                        }
                        if (option_to.equals("Square Inch"))
                        {
                            Result_area.setText(String.valueOf(in*1550)+" Sq.inch");
                        }

                        if (option_to.equals("Hectare"))
                        {
                            Result_area.setText(String.valueOf(in*1e-4)+" hectare");
                        }
                        if (option_to.equals("Acre"))
                        {
                            Result_area.setText(String.valueOf(in*0.000247105)+" acre");
                        }
                    }

                    if (option_from.equals("Square Kilometer"))
                    {
                        if (option_to.equals("Square Meter"))
                        {
                            Result_area.setText(String.valueOf(in*1e+6)+" Sq.metre");
                        }
                        if (option_to.equals("Square Kilometer"))
                        {
                            Result_area.setText(String.valueOf(in*1)+" Sq.kilometre");
                        }
                        if (option_to.equals("Square Mile"))
                        {
                            Result_area.setText(String.valueOf(in*0.386102)+" Sq.mile");
                        }
                        if (option_to.equals("Square Yard"))
                        {
                            Result_area.setText(String.valueOf(in*1.196e+6)+" Sq.yard");
                        }
                        if (option_to.equals("Square Foot"))
                        {
                            Result_area.setText(String.valueOf(in*1.076e+7)+" Sq.feet");
                        }
                        if (option_to.equals("Square Inch"))
                        {
                            Result_area.setText(String.valueOf(in*1.55e+9)+" Sq.inch");
                        }

                        if (option_to.equals("Hectare"))
                        {
                            Result_area.setText(String.valueOf(in*100)+" hectare");
                        }
                        if (option_to.equals("Acre"))
                        {
                            Result_area.setText(String.valueOf(in*247.105)+" acre");
                        }
                    }

                    if (option_from.equals("Square Mile"))
                    {
                        if (option_to.equals("Square Meter"))
                        {
                            Result_area.setText(String.valueOf(in*2.59e+6)+" Sq.metre");
                        }
                        if (option_to.equals("Square Kilometer"))
                        {
                            Result_area.setText(String.valueOf(in*2.58999)+" Sq.kilometre");
                        }
                        if (option_to.equals("Square Mile"))
                        {
                            Result_area.setText(String.valueOf(in*1)+" Sq.mile");
                        }
                        if (option_to.equals("Square Yard"))
                        {
                            Result_area.setText(String.valueOf(in*3.098e+6)+" Sq.yard");
                        }
                        if (option_to.equals("Square Foot"))
                        {
                            Result_area.setText(String.valueOf(in*2.788e+7)+" Sq.feet");
                        }
                        if (option_to.equals("Square Inch"))
                        {
                            Result_area.setText(String.valueOf(in*4.014e+9)+" Sq.inch");
                        }

                        if (option_to.equals("Hectare"))
                        {
                            Result_area.setText(String.valueOf(in*258.999)+" hectare");
                        }
                        if (option_to.equals("Acre"))
                        {
                            Result_area.setText(String.valueOf(in*640)+" acre");
                        }
                    }


                    if (option_from.equals("Square Yard"))
                    {
                        if (option_to.equals("Square Meter"))
                        {
                            Result_area.setText(String.valueOf(in*0.836127)+" Sq.metre");
                        }
                        if (option_to.equals("Square Kilometer"))
                        {
                            Result_area.setText(String.valueOf(in*8.3613e-7)+" Sq.kilometre");
                        }
                        if (option_to.equals("Square Mile"))
                        {
                            Result_area.setText(String.valueOf(in*3.2283e-7)+" Sq.mile");
                        }
                        if (option_to.equals("Square Yard"))
                        {
                            Result_area.setText(String.valueOf(in*1)+" Sq.yard");
                        }
                        if (option_to.equals("Square Foot"))
                        {
                            Result_area.setText(String.valueOf(in*9)+" Sq.feet");
                        }
                        if (option_to.equals("Square Inch"))
                        {
                            Result_area.setText(String.valueOf(in*1296)+" Sq.inch");
                        }

                        if (option_to.equals("Hectare"))
                        {
                            Result_area.setText(String.valueOf(in*8.3613e-5)+" hectare");
                        }
                        if (option_to.equals("Acre"))
                        {
                            Result_area.setText(String.valueOf(in*0.000206612)+" acre");
                        }
                    }

                    if (option_from.equals("Square Foot"))
                    {
                        if (option_to.equals("Square Meter"))
                        {
                            Result_area.setText(String.valueOf(in*0.092903)+" Sq.metre");
                        }
                        if (option_to.equals("Square Kilometer"))
                        {
                            Result_area.setText(String.valueOf(in*9.2903e-8)+" Sq.kilometre");
                        }
                        if (option_to.equals("Square Mile"))
                        {
                            Result_area.setText(String.valueOf(in*3.587e-8)+" Sq.mile");
                        }
                        if (option_to.equals("Square Yard"))
                        {
                            Result_area.setText(String.valueOf(in*0.111111)+" Sq.yard");
                        }
                        if (option_to.equals("Square Foot"))
                        {
                            Result_area.setText(String.valueOf(in*1)+" Sq.feet");
                        }
                        if (option_to.equals("Square Inch"))
                        {
                            Result_area.setText(String.valueOf(in*144)+" Sq.inch");
                        }

                        if (option_to.equals("Hectare"))
                        {
                            Result_area.setText(String.valueOf(in*9.2903e-6)+" hectare");
                        }
                        if (option_to.equals("Acre"))
                        {
                            Result_area.setText(String.valueOf(in*2.2957e-5)+" acre");
                        }
                    }

                    if (option_from.equals("Square Inch"))
                    {
                        if (option_to.equals("Square Meter"))
                        {
                            Result_area.setText(String.valueOf(in*0.00064516)+" Sq.metre");
                        }
                        if (option_to.equals("Square Kilometer"))
                        {
                            Result_area.setText(String.valueOf(in*6.4516e-10)+" Sq.kilometre");
                        }
                        if (option_to.equals("Square Mile"))
                        {
                            Result_area.setText(String.valueOf(in*2.491e-10)+" Sq.mile");
                        }
                        if (option_to.equals("Square Yard"))
                        {
                            Result_area.setText(String.valueOf(in*0.000771605)+" Sq.yard");
                        }
                        if (option_to.equals("Square Foot"))
                        {
                            Result_area.setText(String.valueOf(in*0.00694444)+" Sq.feet");
                        }
                        if (option_to.equals("Square Inch"))
                        {
                            Result_area.setText(String.valueOf(in*1)+" Sq.inch");
                        }

                        if (option_to.equals("Hectare"))
                        {
                            Result_area.setText(String.valueOf(in*6.4516e-8)+" hectare");
                        }
                        if (option_to.equals("Acre"))
                        {
                            Result_area.setText(String.valueOf(in*1.5942e-7)+" acre");
                        }
                    }

                    if (option_from.equals("Hectare"))
                    {
                        if (option_to.equals("Square Meter"))
                        {
                            Result_area.setText(String.valueOf(in*10000)+" Sq.metre");
                        }
                        if (option_to.equals("Square Kilometer"))
                        {
                            Result_area.setText(String.valueOf(in*0.01)+" Sq.kilometre");
                        }
                        if (option_to.equals("Square Mile"))
                        {
                            Result_area.setText(String.valueOf(in*0.00386102)+" Sq.mile");
                        }
                        if (option_to.equals("Square Yard"))
                        {
                            Result_area.setText(String.valueOf(in*11959.9)+" Sq.yard");
                        }
                        if (option_to.equals("Square Foot"))
                        {
                            Result_area.setText(String.valueOf(in*107639)+" Sq.feet");
                        }
                        if (option_to.equals("Square Inch"))
                        {
                            Result_area.setText(String.valueOf(in*1.55e+7)+" Sq.inch");
                        }

                        if (option_to.equals("Hectare"))
                        {
                            Result_area.setText(String.valueOf(in*1)+" hectare");
                        }
                        if (option_to.equals("Acre"))
                        {
                            Result_area.setText(String.valueOf(in*2.47105)+" acre");
                        }
                    }

                    if (option_from.equals("Acre"))
                    {
                        if (option_to.equals("Square Meter"))
                        {
                            Result_area.setText(String.valueOf(in*4046.86)+" Sq.metre");
                        }
                        if (option_to.equals("Square Kilometer"))
                        {
                            Result_area.setText(String.valueOf(in*0.00404686)+" Sq.kilometre");
                        }
                        if (option_to.equals("Square Mile"))
                        {
                            Result_area.setText(String.valueOf(in*0.0015625)+" Sq.mile");
                        }
                        if (option_to.equals("Square Yard"))
                        {
                            Result_area.setText(String.valueOf(in*4840)+" Sq.yard");
                        }
                        if (option_to.equals("Square Foot"))
                        {
                            Result_area.setText(String.valueOf(in*43560)+" Sq.feet");
                        }
                        if (option_to.equals("Square Inch"))
                        {
                            Result_area.setText(String.valueOf(in*6.273e+6)+" Sq.inch");
                        }

                        if (option_to.equals("Hectare"))
                        {
                            Result_area.setText(String.valueOf(in*0.404686)+" hectare");
                        }
                        if (option_to.equals("Acre"))
                        {
                            Result_area.setText(String.valueOf(in*1)+" acre");
                        }
                    }

                }
                else if(input_area.getText().toString().equals(""))
                    Result_area.setText("Please give input");
            }
        });
    }
}
