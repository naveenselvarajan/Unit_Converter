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

import java.lang.reflect.Array;

/**
 * Created by Naveen on 3/20/2016.
 */
public class Angle_Activity extends AppCompatActivity
{
    private Spinner spinner_from;
    private Spinner spinner_to;
    private TextView Result_angle;
    private EditText Input_angle;
    private ImageButton convert_angle;
    ArrayAdapter<CharSequence>adapter1;
    ArrayAdapter<CharSequence>adapter2;
    public String optionfrom_ang;
    public String optionto_ang;



    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_);

        spinner_from=(Spinner)findViewById(R.id.option_1);
        spinner_to=(Spinner)findViewById(R.id.option_2);
        adapter1=ArrayAdapter.createFromResource(this,R.array.angle_array_opt1,android.R.layout.simple_spinner_dropdown_item);
        adapter2=ArrayAdapter.createFromResource(this,R.array.Angle_array_opt2,android.R.layout.simple_spinner_dropdown_item);
        spinner_from.setAdapter(adapter1);
        spinner_to.setAdapter(adapter2);
        Result_angle=(TextView)findViewById(R.id.result);
        Input_angle=(EditText)findViewById(R.id.input);
        convert_angle=(ImageButton)findViewById(R.id.convert);
        spinner_from.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " selected", Toast.LENGTH_SHORT).show();
                optionfrom_ang = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner_to.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " selected", Toast.LENGTH_SHORT).show();
                optionto_ang = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        convert_angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Input_angle.getText().toString().equals(""))
                {
                    double in=Double.parseDouble(Input_angle.getText().toString());
                    if(optionfrom_ang.equals("Angular mil"))
                    {
                       if (optionto_ang.equals("Angular mil")) {
                           Result_angle.setText(String.valueOf(in *1)+" Angular mil");
                       }
                        if(optionto_ang.equals("Degree"))
                        {
                            Result_angle.setText(String.valueOf(in*0.00911891)+" Degrees");
                        }
                        if(optionto_ang.equals("Gradian"))
                        {
                            Result_angle.setText(String.valueOf(in*0.0101321)+" Gradians");
                        }
                        if(optionto_ang.equals("Minuite of arc"))
                        {
                            Result_angle.setText(String.valueOf(in*0.547134)+" Minuit of arcs");
                        }
                        if(optionto_ang.equals("Radian"))
                        {
                            Result_angle.setText(String.valueOf(in*0.000159155)+" Radians");
                        }
                        if(optionto_ang.equals("Second of arc"))
                        {
                            Result_angle.setText(String.valueOf(in*32.8281)+" Second of arc");
                        }
                    }

                    if(optionfrom_ang.equals("Degree"))
                    {
                        if (optionto_ang.equals("Angular mil")) {
                            Result_angle.setText(String.valueOf(in *109.662)+" Angular mil");
                        }
                        if(optionto_ang.equals("Degree"))
                        {
                            Result_angle.setText(String.valueOf(in*1)+" Degrees");
                        }
                        if(optionto_ang.equals("Gradian"))
                        {
                            Result_angle.setText(String.valueOf(in*1.11111)+" Gradians");
                        }
                        if(optionto_ang.equals("Minuite of arc"))
                        {
                            Result_angle.setText(String.valueOf(in*60)+" Minuit of arcs");
                        }
                        if(optionto_ang.equals("Radian"))
                        {
                            Result_angle.setText(String.valueOf(in*0.0174533)+" Radians");
                        }
                        if(optionto_ang.equals("Second of arc"))
                        {
                            Result_angle.setText(String.valueOf(in*3600)+" Second of arcs");
                        }
                    }

                    if(optionfrom_ang.equals("Gradian"))
                    {
                        if (optionto_ang.equals("Angular mil")) {
                            Result_angle.setText(String.valueOf(in *98.696)+" Angular mil");
                        }
                        if(optionto_ang.equals("Degree"))
                        {
                            Result_angle.setText(String.valueOf(in*0.9)+" Degrees");
                        }
                        if(optionto_ang.equals("Gradian"))
                        {
                            Result_angle.setText(String.valueOf(in*1)+" Gradians");
                        }
                        if(optionto_ang.equals("Minuite of arc"))
                        {
                            Result_angle.setText(String.valueOf(in*54)+" Minuit of arcs");
                        }
                        if(optionto_ang.equals("Radian"))
                        {
                            Result_angle.setText(String.valueOf(in*0.015708)+" Radians");
                        }
                        if(optionto_ang.equals("Second of arc"))
                        {
                            Result_angle.setText(String.valueOf(in*3240)+" Second of arcs");
                        }
                    }

                    if(optionfrom_ang.equals("Minuite of arc"))
                    {
                        if (optionto_ang.equals("Angular mil")) {
                            Result_angle.setText(String.valueOf(in *1.8277)+" Angular mil");
                        }
                        if(optionto_ang.equals("Degree"))
                        {
                            Result_angle.setText(String.valueOf(in*0.0166667)+" Degrees");
                        }
                        if(optionto_ang.equals("Gradian"))
                        {
                            Result_angle.setText(String.valueOf(in*0.0185185)+" Gradians");
                        }
                        if(optionto_ang.equals("Minuite of arc"))
                        {
                            Result_angle.setText(String.valueOf(in*1)+" Minuit of arcs");
                        }
                        if(optionto_ang.equals("Radian"))
                        {
                            Result_angle.setText(String.valueOf(in*0.000290888)+" Radians");
                        }
                        if(optionto_ang.equals("Second of arc"))
                        {
                            Result_angle.setText(String.valueOf(in*60)+" Second of arc");
                        }
                    }

                    if(optionfrom_ang.equals("Radian"))
                    {
                        if (optionto_ang.equals("Angular mil")) {
                            Result_angle.setText(String.valueOf(in *6283.19)+" Angular mil");
                        }
                        if(optionto_ang.equals("Degree"))
                        {
                            Result_angle.setText(String.valueOf(in*0.0166667)+" Degrees");
                        }
                        if(optionto_ang.equals("Gradian"))
                        {
                            Result_angle.setText(String.valueOf(in*63.662)+" Gradians");
                        }
                        if(optionto_ang.equals("Minuite of arc"))
                        {
                            Result_angle.setText(String.valueOf(in*3437.75)+" Minuit of arcs");
                        }
                        if(optionto_ang.equals("Radian"))
                        {
                            Result_angle.setText(String.valueOf(in*1)+" Radians");
                        }
                        if(optionto_ang.equals("Second of arc"))
                        {
                            Result_angle.setText(String.valueOf(in*206265)+" Second of arc");
                        }
                    }
                    if(optionfrom_ang.equals("Second of arc"))
                    {
                        if (optionto_ang.equals("Angular mil")) {
                            Result_angle.setText(String.valueOf(in *0.0304617)+" Angular mil");
                        }
                        if(optionto_ang.equals("Degree"))
                        {
                            Result_angle.setText(String.valueOf(in*0.000277778)+" Degrees");
                        }
                        if(optionto_ang.equals("Gradian"))
                        {
                            Result_angle.setText(String.valueOf(in*0.000308642)+" Gradians");
                        }
                        if(optionto_ang.equals("Minuite of arc"))
                        {
                            Result_angle.setText(String.valueOf(in*0.0166667)+" Minuit of arcs");
                        }
                        if(optionto_ang.equals("Radian"))
                        {
                            Result_angle.setText(String.valueOf(in*4.8481e-6)+" Radians");
                        }
                        if(optionto_ang.equals("Second of arc"))
                        {
                            Result_angle.setText(String.valueOf(in*1)+" Second of arc");
                        }
                    }

                }
                else if(Input_angle.getText().toString().equals(""))
                    Result_angle.setText("Please give input");

            }
        });
    }
}
