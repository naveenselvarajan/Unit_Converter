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
public class Volume_Activity extends AppCompatActivity {
    private Spinner spinner_from;
    private Spinner spinner_to;
    private ImageButton convert_volume;
    private EditText input_volume;
    private TextView Result_volume;
    private String option_from;
    private String option_to;
    ArrayAdapter<CharSequence> adapter_1;
    ArrayAdapter<CharSequence>adapter_2;
    @Override

    public void onCreate(Bundle SavedInstanceState)
    {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_length_);

        convert_volume=(ImageButton)findViewById(R.id.convert);
        input_volume=(EditText)findViewById(R.id.input);
        Result_volume=(TextView)findViewById(R.id.result);
        spinner_from=(Spinner)findViewById(R.id.option_1);
        spinner_to=(Spinner)findViewById(R.id.option_2);

        adapter_1=ArrayAdapter.createFromResource(this,R.array.Volume_array_opt1,android.R.layout.simple_spinner_dropdown_item);
        adapter_2=ArrayAdapter.createFromResource(this,R.array.Volume_array_opt2,android.R.layout.simple_spinner_dropdown_item);
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
        convert_volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!input_volume.getText().toString().equals(""))
                {
                    double in=Double.parseDouble(input_volume.getText().toString());
                    if (option_from.equals("US liquid gallon"))
                    {
                        if (option_to.equals("US liquid gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*1)+" US liquid gallon");
                        }
                        if (option_to.equals("US liquid quart"))
                        {
                            Result_volume.setText(String.valueOf(in*4)+" US liquid quart");
                        }
                        if (option_to.equals("US liquid pint"))
                        {
                            Result_volume.setText(String.valueOf(in*8)+" US liquid pint");
                        }
                        if (option_to.equals("US legal cup"))
                        {
                            Result_volume.setText(String.valueOf(in*15.7725)+" US legal cup");
                        }
                        if (option_to.equals("US fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*128)+" US fluid ounce");
                        }
                        if (option_to.equals("US tablespoon"))
                        {
                            Result_volume.setText(String.valueOf(in*256)+" US tablespoon");
                        }
                        if (option_to.equals("US teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*768)+" US teaspoon");
                        }
                        if (option_to.equals("Cubic metre"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00378541)+" Cubicmetre");
                        }
                        if (option_to.equals("Litre"))
                        {
                            Result_volume.setText(String.valueOf(in*3.78541)+" Litre");
                        }
                        if (option_to.equals("Milli litre"))
                        {
                            Result_volume.setText(String.valueOf(in*3785.41)+" milli litre");
                        }
                        if (option_to.equals("Imperial gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.832674)+" Imperial gallon");
                        }
                        if (option_to.equals("Imperial quart"))
                        {
                            Result_volume.setText(String.valueOf(in*3.3307)+" Imperial quart");
                        }
                        if (option_to.equals("Imperial pint"))
                        {
                            Result_volume.setText(String.valueOf(in*6.66139)+" Imperial pint");
                        }
                        if (option_to.equals("Imperial cup"))
                        {
                            Result_volume.setText(String.valueOf(in*13.3228)+" Imperial cup");
                        }
                        if (option_to.equals("Imperial fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*133.228)+" Imperial fluid ounce");
                        }
                        if (option_to.equals("Imperial tableSpoon"))
                        {
                            Result_volume.setText(String.valueOf(in*213.165)+" Imperial tablespoon");
                        }
                        if (option_to.equals("Imperial teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*639.494)+" Imperial teaspoon");
                        }
                        if (option_to.equals("Cubic foot"))
                        {
                            Result_volume.setText(String.valueOf(in*0.133681)+" Cubic foot");
                        }
                        if (option_to.equals("Cubic inch"))
                        {
                            Result_volume.setText(String.valueOf(in*231)+" Cubic inch");
                        }

                    }
                    if (option_from.equals("US liquid quart"))
                    {
                        if (option_to.equals("US liquid gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.25)+" US liquid gallon");
                        }
                        if (option_to.equals("US liquid quart"))
                        {
                            Result_volume.setText(String.valueOf(in*1)+" US liquid quart");
                        }
                        if (option_to.equals("US liquid pint"))
                        {
                            Result_volume.setText(String.valueOf(in*2)+" US liquid pint");
                        }
                        if (option_to.equals("US legal cup"))
                        {
                            Result_volume.setText(String.valueOf(in*3.94314)+" US legal cup");
                        }
                        if (option_to.equals("US fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*32)+" US fluid ounce");
                        }
                        if (option_to.equals("US tablespoon"))
                        {
                            Result_volume.setText(String.valueOf(in*64)+" US tablespoon");
                        }
                        if (option_to.equals("US teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*192)+" US teaspoon");
                        }
                        if (option_to.equals("Cubic metre"))
                        {
                            Result_volume.setText(String.valueOf(in*0.000946353)+" Cubicmetre");
                        }
                        if (option_to.equals("Litre"))
                        {
                            Result_volume.setText(String.valueOf(in*0.946353)+" Litre");
                        }
                        if (option_to.equals("Milli litre"))
                        {
                            Result_volume.setText(String.valueOf(in*946.353)+" milli litre");
                        }
                        if (option_to.equals("Imperial gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.208169)+" Imperial gallon");
                        }
                        if (option_to.equals("Imperial quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.832674)+" Imperial quart");
                        }
                        if (option_to.equals("Imperial pint"))
                        {
                            Result_volume.setText(String.valueOf(in*1.66535)+" Imperial pint");
                        }
                        if (option_to.equals("Imperial cup"))
                        {
                            Result_volume.setText(String.valueOf(in*3.3307)+" Imperial cup");
                        }
                        if (option_to.equals("Imperial fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*33.307)+" Imperial fluid ounce");
                        }
                        if (option_to.equals("Imperial tableSpoon"))
                        {
                            Result_volume.setText(String.valueOf(in*53.2911)+" Imperial tablespoon");
                        }
                        if (option_to.equals("Imperial teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*159.873)+" Imperial teaspoon");
                        }
                        if (option_to.equals("Cubic foot"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0334201)+" Cubic foot");
                        }
                        if (option_to.equals("Cubic inch"))
                        {
                            Result_volume.setText(String.valueOf(in*57.75)+" Cubic inch");
                        }

                    }
                    if (option_from.equals("US liquid pint"))
                    {
                        if (option_to.equals("US liquid gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.125)+" US liquid gallon");
                        }
                        if (option_to.equals("US liquid quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.5)+" US liquid quart");
                        }
                        if (option_to.equals("US liquid pint"))
                        {
                            Result_volume.setText(String.valueOf(in*1)+" US liquid pint");
                        }
                        if (option_to.equals("US legal cup"))
                        {
                            Result_volume.setText(String.valueOf(in*1.97157)+" US legal cup");
                        }
                        if (option_to.equals("US fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*16)+" US fluid ounce");
                        }
                        if (option_to.equals("US tablespoon"))
                        {
                            Result_volume.setText(String.valueOf(in*32)+" US tablespoon");
                        }
                        if (option_to.equals("US teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*96)+" US teaspoon");
                        }
                        if (option_to.equals("Cubic metre"))
                        {
                            Result_volume.setText(String.valueOf(in*0.000473176)+" Cubicmetre");
                        }
                        if (option_to.equals("Litre"))
                        {
                            Result_volume.setText(String.valueOf(in*0.473176)+" Litre");
                        }
                        if (option_to.equals("Milli litre"))
                        {
                            Result_volume.setText(String.valueOf(in*473.176)+" milli litre");
                        }
                        if (option_to.equals("Imperial gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.104084)+" Imperial gallon");
                        }
                        if (option_to.equals("Imperial quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.416337)+" Imperial quart");
                        }
                        if (option_to.equals("Imperial pint"))
                        {
                            Result_volume.setText(String.valueOf(in*0.832674)+" Imperial pint");
                        }
                        if (option_to.equals("Imperial cup"))
                        {
                            Result_volume.setText(String.valueOf(in*1.66535)+" Imperial cup");
                        }
                        if (option_to.equals("Imperial fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*16.6535)+" Imperial fluid ounce");
                        }
                        if (option_to.equals("Imperial tableSpoon"))
                        {
                            Result_volume.setText(String.valueOf(in*26.6456)+" Imperial tablespoon");
                        }
                        if (option_to.equals("Imperial teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*79.9367)+" Imperial teaspoon");
                        }
                        if (option_to.equals("Cubic foot"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0167101)+" Cubic foot");
                        }
                        if (option_to.equals("Cubic inch"))
                        {
                            Result_volume.setText(String.valueOf(in*28.875)+" Cubic inch");
                        }

                    }
                    if (option_from.equals("US legal cup"))
                    {
                        if (option_to.equals("US liquid gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0634013)+" US liquid gallon");
                        }
                        if (option_to.equals("US liquid quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.253605)+" US liquid quart");
                        }
                        if (option_to.equals("US liquid pint"))
                        {
                            Result_volume.setText(String.valueOf(in*0.50721)+" US liquid pint");
                        }
                        if (option_to.equals("US legal cup"))
                        {
                            Result_volume.setText(String.valueOf(in*1)+" US legal cup");
                        }
                        if (option_to.equals("US fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*8.11537)+" US fluid ounce");
                        }
                        if (option_to.equals("US tablespoon"))
                        {
                            Result_volume.setText(String.valueOf(in*16.2307)+" US tablespoon");
                        }
                        if (option_to.equals("US teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*48.6922)+" US teaspoon");
                        }
                        if (option_to.equals("Cubic metre"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00024)+" Cubicmetre");
                        }
                        if (option_to.equals("Litre"))
                        {
                            Result_volume.setText(String.valueOf(in*0.24)+" Litre");
                        }
                        if (option_to.equals("Milli litre"))
                        {
                            Result_volume.setText(String.valueOf(in*240)+" milli litre");
                        }
                        if (option_to.equals("Imperial gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0527926)+" Imperial gallon");
                        }
                        if (option_to.equals("Imperial quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.21117)+" Imperial quart");
                        }
                        if (option_to.equals("Imperial pint"))
                        {
                            Result_volume.setText(String.valueOf(in*0.422341)+" Imperial pint");
                        }
                        if (option_to.equals("Imperial cup"))
                        {
                            Result_volume.setText(String.valueOf(in*0.844682)+" Imperial cup");
                        }
                        if (option_to.equals("Imperial fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*8.44682)+" Imperial fluid ounce");
                        }
                        if (option_to.equals("Imperial tableSpoon"))
                        {
                            Result_volume.setText(String.valueOf(in*13.5149)+" Imperial tablespoon");
                        }
                        if (option_to.equals("Imperial teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*40.5447)+" Imperial teaspoon");
                        }
                        if (option_to.equals("Cubic foot"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00847552)+" Cubic foot");
                        }
                        if (option_to.equals("Cubic inch"))
                        {
                            Result_volume.setText(String.valueOf(in*14.6457)+" Cubic inch");
                        }

                    }
                    if (option_from.equals("US fluid ounce"))
                    {
                        if (option_to.equals("US liquid gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0078125)+" US liquid gallon");
                        }
                        if (option_to.equals("US liquid quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.03125)+" US liquid quart");
                        }
                        if (option_to.equals("US liquid pint"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0625)+" US liquid pint");
                        }
                        if (option_to.equals("US legal cup"))
                        {
                            Result_volume.setText(String.valueOf(in*0.123223)+" US legal cup");
                        }
                        if (option_to.equals("US fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*1)+" US fluid ounce");
                        }
                        if (option_to.equals("US tablespoon"))
                        {
                            Result_volume.setText(String.valueOf(in*2)+" US tablespoon");
                        }
                        if (option_to.equals("US teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*6)+" US teaspoon");
                        }
                        if (option_to.equals("Cubic metre"))
                        {
                            Result_volume.setText(String.valueOf(in*2.9574e-5)+" Cubicmetre");
                        }
                        if (option_to.equals("Litre"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0295735)+" Litre");
                        }
                        if (option_to.equals("Milli litre"))
                        {
                            Result_volume.setText(String.valueOf(in*29.5735)+" milli litre");
                        }
                        if (option_to.equals("Imperial gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00650527)+" Imperial gallon");
                        }
                        if (option_to.equals("Imperial quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0260211)+" Imperial quart");
                        }
                        if (option_to.equals("Imperial pint"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0520421)+" Imperial pint");
                        }
                        if (option_to.equals("Imperial cup"))
                        {
                            Result_volume.setText(String.valueOf(in*0.104084)+" Imperial cup");
                        }
                        if (option_to.equals("Imperial fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*1.04084)+" Imperial fluid ounce");
                        }
                        if (option_to.equals("Imperial tableSpoon"))
                        {
                            Result_volume.setText(String.valueOf(in*1.66535)+" Imperial tablespoon");
                        }
                        if (option_to.equals("Imperial teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*4.99604)+" Imperial teaspoon");
                        }
                        if (option_to.equals("Cubic foot"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00104438)+" Cubic foot");
                        }
                        if (option_to.equals("Cubic inch"))
                        {
                            Result_volume.setText(String.valueOf(in*1.80469)+" Cubic inch");
                        }

                    }
                    if (option_from.equals("US tablespoon"))
                    {
                        if (option_to.equals("US liquid gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00390625)+" US liquid gallon");
                        }
                        if (option_to.equals("US liquid quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.015625)+" US liquid quart");
                        }
                        if (option_to.equals("US liquid pint"))
                        {
                            Result_volume.setText(String.valueOf(in*0.03125)+" US liquid pint");
                        }
                        if (option_to.equals("US legal cup"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0616115)+" US legal cup");
                        }
                        if (option_to.equals("US fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*0.5)+" US fluid ounce");
                        }
                        if (option_to.equals("US tablespoon"))
                        {
                            Result_volume.setText(String.valueOf(in*1)+" US tablespoon");
                        }
                        if (option_to.equals("US teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*3)+" US teaspoon");
                        }
                        if (option_to.equals("Cubic metre"))
                        {
                            Result_volume.setText(String.valueOf(in*1.4787e-5)+" Cubicmetre");
                        }
                        if (option_to.equals("Litre"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0147868)+" Litre");
                        }
                        if (option_to.equals("Milli litre"))
                        {
                            Result_volume.setText(String.valueOf(in*14.7868)+" milli litre");
                        }
                        if (option_to.equals("Imperial gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00325263)+" Imperial gallon");
                        }
                        if (option_to.equals("Imperial quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0130105)+" Imperial quart");
                        }
                        if (option_to.equals("Imperial pint"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0260211)+" Imperial pint");
                        }
                        if (option_to.equals("Imperial cup"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0520421)+" Imperial cup");
                        }
                        if (option_to.equals("Imperial fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*0.520421)+" Imperial fluid ounce");
                        }
                        if (option_to.equals("Imperial tableSpoon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.832674)+" Imperial tablespoon");
                        }
                        if (option_to.equals("Imperial teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*2.49802)+" Imperial teaspoon");
                        }
                        if (option_to.equals("Cubic foot"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00052219)+" Cubic foot");
                        }
                        if (option_to.equals("Cubic inch"))
                        {
                            Result_volume.setText(String.valueOf(in*0.902344)+" Cubic inch");
                        }

                    }
                    if (option_from.equals("US teaspoon"))
                    {
                        if (option_to.equals("US liquid gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00130208)+" US liquid gallon");
                        }
                        if (option_to.equals("US liquid quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00520833)+" US liquid quart");
                        }
                        if (option_to.equals("US liquid pint"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0104167)+" US liquid pint");
                        }
                        if (option_to.equals("US legal cup"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0205372)+" US legal cup");
                        }
                        if (option_to.equals("US fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*0.166667)+" US fluid ounce");
                        }
                        if (option_to.equals("US tablespoon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.333333)+" US tablespoon");
                        }
                        if (option_to.equals("US teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*1)+" US teaspoon");
                        }
                        if (option_to.equals("Cubic metre"))
                        {
                            Result_volume.setText(String.valueOf(in*4.9289e-6)+" Cubicmetre");
                        }
                        if (option_to.equals("Litre"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00492892)+" Litre");
                        }
                        if (option_to.equals("Milli litre"))
                        {
                            Result_volume.setText(String.valueOf(in*4.92892)+" milli litre");
                        }
                        if (option_to.equals("Imperial gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00108421)+" Imperial gallon");
                        }
                        if (option_to.equals("Imperial quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00433684)+" Imperial quart");
                        }
                        if (option_to.equals("Imperial pint"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00867369)+" Imperial pint");
                        }
                        if (option_to.equals("Imperial cup"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0173474)+" Imperial cup");
                        }
                        if (option_to.equals("Imperial fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*0.173474)+" Imperial fluid ounce");
                        }
                        if (option_to.equals("Imperial tableSpoon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.277558)+" Imperial tablespoon");
                        }
                        if (option_to.equals("Imperial teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.832674)+" Imperial teaspoon");
                        }
                        if (option_to.equals("Cubic foot"))
                        {
                            Result_volume.setText(String.valueOf(in*0.000174063)+" Cubic foot");
                        }
                        if (option_to.equals("Cubic inch"))
                        {
                            Result_volume.setText(String.valueOf(in*0.300781)+" Cubic inch");
                        }

                    }
                    if (option_from.equals("Cubicmetre"))
                    {
                        if (option_to.equals("US liquid gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*264.172)+" US liquid gallon");
                        }
                        if (option_to.equals("US liquid quart"))
                        {
                            Result_volume.setText(String.valueOf(in*1056.69)+" US liquid quart");
                        }
                        if (option_to.equals("US liquid pint"))
                        {
                            Result_volume.setText(String.valueOf(in*2113.38)+" US liquid pint");
                        }
                        if (option_to.equals("US legal cup"))
                        {
                            Result_volume.setText(String.valueOf(in*4166.67)+" US legal cup");
                        }
                        if (option_to.equals("US fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*33814)+" US fluid ounce");
                        }
                        if (option_to.equals("US tablespoon"))
                        {
                            Result_volume.setText(String.valueOf(in*67628)+" US tablespoon");
                        }
                        if (option_to.equals("US teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*202884)+" US teaspoon");
                        }
                        if (option_to.equals("Cubic metre"))
                        {
                            Result_volume.setText(String.valueOf(in*1)+" Cubicmetre");
                        }
                        if (option_to.equals("Litre"))
                        {
                            Result_volume.setText(String.valueOf(in*1000)+" Litre");
                        }
                        if (option_to.equals("Milli litre"))
                        {
                            Result_volume.setText(String.valueOf(in*1e+6)+" milli litre");
                        }
                        if (option_to.equals("Imperial gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*219.969)+" Imperial gallon");
                        }
                        if (option_to.equals("Imperial quart"))
                        {
                            Result_volume.setText(String.valueOf(in*879.877)+" Imperial quart");
                        }
                        if (option_to.equals("Imperial pint"))
                        {
                            Result_volume.setText(String.valueOf(in*1759.75)+" Imperial pint");
                        }
                        if (option_to.equals("Imperial cup"))
                        {
                            Result_volume.setText(String.valueOf(in*3519.51)+" Imperial cup");
                        }
                        if (option_to.equals("Imperial fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*35195.1)+" Imperial fluid ounce");
                        }
                        if (option_to.equals("Imperial tableSpoon"))
                        {
                            Result_volume.setText(String.valueOf(in*56312.1)+" Imperial tablespoon");
                        }
                        if (option_to.equals("Imperial teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*168936)+" Imperial teaspoon");
                        }
                        if (option_to.equals("Cubic foot"))
                        {
                            Result_volume.setText(String.valueOf(in*35.3147)+" Cubic foot");
                        }
                        if (option_to.equals("Cubic inch"))
                        {
                            Result_volume.setText(String.valueOf(in*61023.7)+" Cubic inch");
                        }

                    }
                    if (option_from.equals("Litre"))
                    {
                        if (option_to.equals("US liquid gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.264172)+" US liquid gallon");
                        }
                        if (option_to.equals("US liquid quart"))
                        {
                            Result_volume.setText(String.valueOf(in*1.05669)+" US liquid quart");
                        }
                        if (option_to.equals("US liquid pint"))
                        {
                            Result_volume.setText(String.valueOf(in*2.11338)+" US liquid pint");
                        }
                        if (option_to.equals("US legal cup"))
                        {
                            Result_volume.setText(String.valueOf(in*4.16667)+" US legal cup");
                        }
                        if (option_to.equals("US fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*33.814)+" US fluid ounce");
                        }
                        if (option_to.equals("US tablespoon"))
                        {
                            Result_volume.setText(String.valueOf(in*67.628)+" US tablespoon");
                        }
                        if (option_to.equals("US teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*202.884)+" US teaspoon");
                        }
                        if (option_to.equals("Cubic metre"))
                        {
                            Result_volume.setText(String.valueOf(in*0.001)+" Cubicmetre");
                        }
                        if (option_to.equals("Litre"))
                        {
                            Result_volume.setText(String.valueOf(in*1)+" Litre");
                        }
                        if (option_to.equals("Milli litre"))
                        {
                            Result_volume.setText(String.valueOf(in*1000)+" milli litre");
                        }
                        if (option_to.equals("Imperial gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.219969)+" Imperial gallon");
                        }
                        if (option_to.equals("Imperial quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.879877)+" Imperial quart");
                        }
                        if (option_to.equals("Imperial pint"))
                        {
                            Result_volume.setText(String.valueOf(in*1.75975)+" Imperial pint");
                        }
                        if (option_to.equals("Imperial cup"))
                        {
                            Result_volume.setText(String.valueOf(in*3.51951)+" Imperial cup");
                        }
                        if (option_to.equals("Imperial fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*35.1951)+" Imperial fluid ounce");
                        }
                        if (option_to.equals("Imperial tableSpoon"))
                        {
                            Result_volume.setText(String.valueOf(in*56.3121)+" Imperial tablespoon");
                        }
                        if (option_to.equals("Imperial teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*168.936)+" Imperial teaspoon");
                        }
                        if (option_to.equals("Cubic foot"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0353147)+" Cubic foot");
                        }
                        if (option_to.equals("Cubic inch"))
                        {
                            Result_volume.setText(String.valueOf(in*61.0237)+" Cubic inch");
                        }

                    }
                    if (option_from.equals("Millilitre"))
                    {
                        if (option_to.equals("US liquid gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.000264172)+" US liquid gallon");
                        }
                        if (option_to.equals("US liquid quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00105669)+" US liquid quart");
                        }
                        if (option_to.equals("US liquid pint"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00211338)+" US liquid pint");
                        }
                        if (option_to.equals("US legal cup"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00416667)+" US legal cup");
                        }
                        if (option_to.equals("US fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*0.033814)+" US fluid ounce");
                        }
                        if (option_to.equals("US tablespoon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.067628)+" US tablespoon");
                        }
                        if (option_to.equals("US teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.202884)+" US teaspoon");
                        }
                        if (option_to.equals("Cubic metre"))
                        {
                            Result_volume.setText(String.valueOf(in*0.000001)+" Cubicmetre");
                        }
                        if (option_to.equals("Litre"))
                        {
                            Result_volume.setText(String.valueOf(in*0.001)+" Litre");
                        }
                        if (option_to.equals("Milli litre"))
                        {
                            Result_volume.setText(String.valueOf(in*1)+" milli litre");
                        }
                        if (option_to.equals("Imperial gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.000219969)+" Imperial gallon");
                        }
                        if (option_to.equals("Imperial quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.000879877)+" Imperial quart");
                        }
                        if (option_to.equals("Imperial pint"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00175975)+" Imperial pint");
                        }
                        if (option_to.equals("Imperial cup"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00351951)+" Imperial cup");
                        }
                        if (option_to.equals("Imperial fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0351951)+" Imperial fluid ounce");
                        }
                        if (option_to.equals("Imperial tableSpoon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0563121)+" Imperial tablespoon");
                        }
                        if (option_to.equals("Imperial teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.168936)+" Imperial teaspoon");
                        }
                        if (option_to.equals("Cubic foot"))
                        {
                            Result_volume.setText(String.valueOf(in*3.5315e-5)+" Cubic foot");
                        }
                        if (option_to.equals("Cubic inch"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0610237)+" Cubic inch");
                        }

                    }
                    if (option_from.equals("Imperial gallon"))
                    {
                        if (option_to.equals("US liquid gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*1.20095)+" US liquid gallon");
                        }
                        if (option_to.equals("US liquid quart"))
                        {
                            Result_volume.setText(String.valueOf(in*4.8038)+" US liquid quart");
                        }
                        if (option_to.equals("US liquid pint"))
                        {
                            Result_volume.setText(String.valueOf(in*9.6076)+" US liquid pint");
                        }
                        if (option_to.equals("US legal cup"))
                        {
                            Result_volume.setText(String.valueOf(in*18.942)+" US legal cup");
                        }
                        if (option_to.equals("US fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*153.722)+" US fluid ounce");
                        }
                        if (option_to.equals("US tablespoon"))
                        {
                            Result_volume.setText(String.valueOf(in*307.443)+" US tablespoon");
                        }
                        if (option_to.equals("US teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*922.33)+" US teaspoon");
                        }
                        if (option_to.equals("Cubic metre"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00454609)+" Cubicmetre");
                        }
                        if (option_to.equals("Litre"))
                        {
                            Result_volume.setText(String.valueOf(in*4.54609)+" Litre");
                        }
                        if (option_to.equals("Milli litre"))
                        {
                            Result_volume.setText(String.valueOf(in*4546.09)+" milli litre");
                        }
                        if (option_to.equals("Imperial gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*1)+" Imperial gallon");
                        }
                        if (option_to.equals("Imperial quart"))
                        {
                            Result_volume.setText(String.valueOf(in*4)+" Imperial quart");
                        }
                        if (option_to.equals("Imperial pint"))
                        {
                            Result_volume.setText(String.valueOf(in*8)+" Imperial pint");
                        }
                        if (option_to.equals("Imperial cup"))
                        {
                            Result_volume.setText(String.valueOf(in*16)+" Imperial cup");
                        }
                        if (option_to.equals("Imperial fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*160)+" Imperial fluid ounce");
                        }
                        if (option_to.equals("Imperial tableSpoon"))
                        {
                            Result_volume.setText(String.valueOf(in*256)+" Imperial tablespoon");
                        }
                        if (option_to.equals("Imperial teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*768)+" Imperial teaspoon");
                        }
                        if (option_to.equals("Cubic foot"))
                        {
                            Result_volume.setText(String.valueOf(in*0.160544)+" Cubic foot");
                        }
                        if (option_to.equals("Cubic inch"))
                        {
                            Result_volume.setText(String.valueOf(in*277.419)+" Cubic inch");
                        }

                    }
                    if (option_from.equals("Imperial quart"))
                    {
                        if (option_to.equals("US liquid gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.300237)+" US liquid gallon");
                        }
                        if (option_to.equals("US liquid quart"))
                        {
                            Result_volume.setText(String.valueOf(in*1.20095)+" US liquid quart");
                        }
                        if (option_to.equals("US liquid pint"))
                        {
                            Result_volume.setText(String.valueOf(in*2.4019)+" US liquid pint");
                        }
                        if (option_to.equals("US legal cup"))
                        {
                            Result_volume.setText(String.valueOf(in*4.73551)+" US legal cup");
                        }
                        if (option_to.equals("US fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*38.4304)+" US fluid ounce");
                        }
                        if (option_to.equals("US tablespoon"))
                        {
                            Result_volume.setText(String.valueOf(in*76.8608)+" US tablespoon");
                        }
                        if (option_to.equals("US teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*230.582)+" US teaspoon");
                        }
                        if (option_to.equals("Cubic metre"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00113652)+" Cubicmetre");
                        }
                        if (option_to.equals("Litre"))
                        {
                            Result_volume.setText(String.valueOf(in*1.13652)+" Litre");
                        }
                        if (option_to.equals("Milli litre"))
                        {
                            Result_volume.setText(String.valueOf(in*1136.52)+" milli litre");
                        }
                        if (option_to.equals("Imperial gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.25)+" Imperial gallon");
                        }
                        if (option_to.equals("Imperial quart"))
                        {
                            Result_volume.setText(String.valueOf(in*1)+" Imperial quart");
                        }
                        if (option_to.equals("Imperial pint"))
                        {
                            Result_volume.setText(String.valueOf(in*2)+" Imperial pint");
                        }
                        if (option_to.equals("Imperial cup"))
                        {
                            Result_volume.setText(String.valueOf(in*4)+" Imperial cup");
                        }
                        if (option_to.equals("Imperial fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*40)+" Imperial fluid ounce");
                        }
                        if (option_to.equals("Imperial tableSpoon"))
                        {
                            Result_volume.setText(String.valueOf(in*64)+" Imperial tablespoon");
                        }
                        if (option_to.equals("Imperial teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*192)+" Imperial teaspoon");
                        }
                        if (option_to.equals("Cubic foot"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0401359)+" Cubic foot");
                        }
                        if (option_to.equals("Cubic inch"))
                        {
                            Result_volume.setText(String.valueOf(in*69.3549)+" Cubic inch");
                        }

                    }
                    if (option_from.equals("Imperial pint"))
                    {
                        if (option_to.equals("US liquid gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.150119)+" US liquid gallon");
                        }
                        if (option_to.equals("US liquid quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.600475)+" US liquid quart");
                        }
                        if (option_to.equals("US liquid pint"))
                        {
                            Result_volume.setText(String.valueOf(in*1.20095)+" US liquid pint");
                        }
                        if (option_to.equals("US legal cup"))
                        {
                            Result_volume.setText(String.valueOf(in*2.36776)+" US legal cup");
                        }
                        if (option_to.equals("US fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*19.2152)+" US fluid ounce");
                        }
                        if (option_to.equals("US tablespoon"))
                        {
                            Result_volume.setText(String.valueOf(in*38.4304)+" US tablespoon");
                        }
                        if (option_to.equals("US teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*115.291)+" US teaspoon");
                        }
                        if (option_to.equals("Cubic metre"))
                        {
                            Result_volume.setText(String.valueOf(in*0.000568261)+" Cubicmetre");
                        }
                        if (option_to.equals("Litre"))
                        {
                            Result_volume.setText(String.valueOf(in*0.568261)+" Litre");
                        }
                        if (option_to.equals("Milli litre"))
                        {
                            Result_volume.setText(String.valueOf(in*568.261)+" milli litre");
                        }
                        if (option_to.equals("Imperial gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.125)+" Imperial gallon");
                        }
                        if (option_to.equals("Imperial quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.5)+" Imperial quart");
                        }
                        if (option_to.equals("Imperial pint"))
                        {
                            Result_volume.setText(String.valueOf(in*1)+" Imperial pint");
                        }
                        if (option_to.equals("Imperial cup"))
                        {
                            Result_volume.setText(String.valueOf(in*2)+" Imperial cup");
                        }
                        if (option_to.equals("Imperial fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*20)+" Imperial fluid ounce");
                        }
                        if (option_to.equals("Imperial tableSpoon"))
                        {
                            Result_volume.setText(String.valueOf(in*32)+" Imperial tablespoon");
                        }
                        if (option_to.equals("Imperial teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*96)+" Imperial teaspoon");
                        }
                        if (option_to.equals("Cubic foot"))
                        {
                            Result_volume.setText(String.valueOf(in*0.020068)+" Cubic foot");
                        }
                        if (option_to.equals("Cubic inch"))
                        {
                            Result_volume.setText(String.valueOf(in*34.6774)+" Cubic inch");
                        }

                    }
                    if (option_from.equals("Imperial cup"))
                    {
                        if (option_to.equals("US liquid gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0750594)+" US liquid gallon");
                        }
                        if (option_to.equals("US liquid quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.300237)+" US liquid quart");
                        }
                        if (option_to.equals("US liquid pint"))
                        {
                            Result_volume.setText(String.valueOf(in*0.600475)+" US liquid pint");
                        }
                        if (option_to.equals("US legal cup"))
                        {
                            Result_volume.setText(String.valueOf(in*1.18388)+" US legal cup");
                        }
                        if (option_to.equals("US fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*9.6076)+" US fluid ounce");
                        }
                        if (option_to.equals("US tablespoon"))
                        {
                            Result_volume.setText(String.valueOf(in*19.2152)+" US tablespoon");
                        }
                        if (option_to.equals("US teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*57.6456)+" US teaspoon");
                        }
                        if (option_to.equals("Cubic metre"))
                        {
                            Result_volume.setText(String.valueOf(in*0.000284131)+" Cubicmetre");
                        }
                        if (option_to.equals("Litre"))
                        {
                            Result_volume.setText(String.valueOf(in*0.284131)+" Litre");
                        }
                        if (option_to.equals("Milli litre"))
                        {
                            Result_volume.setText(String.valueOf(in*284.131)+" milli litre");
                        }
                        if (option_to.equals("Imperial gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0625)+" Imperial gallon");
                        }
                        if (option_to.equals("Imperial quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.25)+" Imperial quart");
                        }
                        if (option_to.equals("Imperial pint"))
                        {
                            Result_volume.setText(String.valueOf(in*0.5)+" Imperial pint");
                        }
                        if (option_to.equals("Imperial cup"))
                        {
                            Result_volume.setText(String.valueOf(in*1)+" Imperial cup");
                        }
                        if (option_to.equals("Imperial fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*10)+" Imperial fluid ounce");
                        }
                        if (option_to.equals("Imperial tableSpoon"))
                        {
                            Result_volume.setText(String.valueOf(in*16)+" Imperial tablespoon");
                        }
                        if (option_to.equals("Imperial teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*48)+" Imperial teaspoon");
                        }
                        if (option_to.equals("Cubic foot"))
                        {
                            Result_volume.setText(String.valueOf(in*0.010034)+" Cubic foot");
                        }
                        if (option_to.equals("Cubic inch"))
                        {
                            Result_volume.setText(String.valueOf(in*17.3387)+" Cubic inch");
                        }

                    }
                    if (option_from.equals("Imperial fluid ounce"))
                    {
                        if (option_to.equals("US liquid gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00750594)+" US liquid gallon");
                        }
                        if (option_to.equals("US liquid quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0300237)+" US liquid quart");
                        }
                        if (option_to.equals("US liquid pint"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0600475)+" US liquid pint");
                        }
                        if (option_to.equals("US legal cup"))
                        {
                            Result_volume.setText(String.valueOf(in*0.118388)+" US legal cup");
                        }
                        if (option_to.equals("US fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*0.96076)+" US fluid ounce");
                        }
                        if (option_to.equals("US tablespoon"))
                        {
                            Result_volume.setText(String.valueOf(in*1.92152)+" US tablespoon");
                        }
                        if (option_to.equals("US teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*5.76456)+" US teaspoon");
                        }
                        if (option_to.equals("Cubic metre"))
                        {
                            Result_volume.setText(String.valueOf(in*2.8413e-5)+" Cubicmetre");
                        }
                        if (option_to.equals("Litre"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0284131)+" Litre");
                        }
                        if (option_to.equals("Milli litre"))
                        {
                            Result_volume.setText(String.valueOf(in*28.4131)+" milli litre");
                        }
                        if (option_to.equals("Imperial gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00625)+" Imperial gallon");
                        }
                        if (option_to.equals("Imperial quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.025)+" Imperial quart");
                        }
                        if (option_to.equals("Imperial pint"))
                        {
                            Result_volume.setText(String.valueOf(in*0.05)+" Imperial pint");
                        }
                        if (option_to.equals("Imperial cup"))
                        {
                            Result_volume.setText(String.valueOf(in*0.1)+" Imperial cup");
                        }
                        if (option_to.equals("Imperial fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*1)+" Imperial fluid ounce");
                        }
                        if (option_to.equals("Imperial tableSpoon"))
                        {
                            Result_volume.setText(String.valueOf(in*1.6)+" Imperial tablespoon");
                        }
                        if (option_to.equals("Imperial teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*4.8)+" Imperial teaspoon");
                        }
                        if (option_to.equals("Cubic foot"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0010034)+" Cubic foot");
                        }
                        if (option_to.equals("Cubic inch"))
                        {
                            Result_volume.setText(String.valueOf(in*1.73387)+" Cubic inch");
                        }

                    }
                    if (option_from.equals("Imperial tableSpoon"))
                    {
                        if (option_to.equals("US liquid gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00469121)+" US liquid gallon");
                        }
                        if (option_to.equals("US liquid quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0187649)+" US liquid quart");
                        }
                        if (option_to.equals("US liquid pint"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0375297)+" US liquid pint");
                        }
                        if (option_to.equals("US legal cup"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0739924)+" US legal cup");
                        }
                        if (option_to.equals("US fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*0.600475)+" US fluid ounce");
                        }
                        if (option_to.equals("US tablespoon"))
                        {
                            Result_volume.setText(String.valueOf(in*1.92152)+" US tablespoon");
                        }
                        if (option_to.equals("US teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*3.60285)+" US teaspoon");
                        }
                        if (option_to.equals("Cubic metre"))
                        {
                            Result_volume.setText(String.valueOf(in*1.7758e-5)+" Cubicmetre");
                        }
                        if (option_to.equals("Litre"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0177582)+" Litre");
                        }
                        if (option_to.equals("Milli litre"))
                        {
                            Result_volume.setText(String.valueOf(in*17.7582)+" milli litre");
                        }
                        if (option_to.equals("Imperial gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00390625)+" Imperial gallon");
                        }
                        if (option_to.equals("Imperial quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.015625)+" Imperial quart");
                        }
                        if (option_to.equals("Imperial pint"))
                        {
                            Result_volume.setText(String.valueOf(in*0.03125)+" Imperial pint");
                        }
                        if (option_to.equals("Imperial cup"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0625)+" Imperial cup");
                        }
                        if (option_to.equals("Imperial fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*0.625)+" Imperial fluid ounce");
                        }
                        if (option_to.equals("Imperial tableSpoon"))
                        {
                            Result_volume.setText(String.valueOf(in*1)+" Imperial tablespoon");
                        }
                        if (option_to.equals("Imperial teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*3)+" Imperial teaspoon");
                        }
                        if (option_to.equals("Cubic foot"))
                        {
                            Result_volume.setText(String.valueOf(in*0.000627124)+" Cubic foot");
                        }
                        if (option_to.equals("Cubic inch"))
                        {
                            Result_volume.setText(String.valueOf(in*1.08367)+" Cubic inch");
                        }

                    }
                    if (option_from.equals("Imperial teaspoon"))
                    {
                        if (option_to.equals("US liquid gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00156374)+" US liquid gallon");
                        }
                        if (option_to.equals("US liquid quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00625495)+" US liquid quart");
                        }
                        if (option_to.equals("US liquid pint"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0125099)+" US liquid pint");
                        }
                        if (option_to.equals("US legal cup"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0246641)+" US legal cup");
                        }
                        if (option_to.equals("US fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*0.200158)+" US fluid ounce");
                        }
                        if (option_to.equals("US tablespoon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.400317)+" US tablespoon");
                        }
                        if (option_to.equals("US teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*1.20095)+" US teaspoon");
                        }
                        if (option_to.equals("Cubic metre"))
                        {
                            Result_volume.setText(String.valueOf(in*5.9194e-6)+" Cubicmetre");
                        }
                        if (option_to.equals("Litre"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00591939)+" Litre");
                        }
                        if (option_to.equals("Milli litre"))
                        {
                            Result_volume.setText(String.valueOf(in*5.91939)+" milli litre");
                        }
                        if (option_to.equals("Imperial gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00130208)+" Imperial gallon");
                        }
                        if (option_to.equals("Imperial quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00520834)+" Imperial quart");
                        }
                        if (option_to.equals("Imperial pint"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0104167)+" Imperial pint");
                        }
                        if (option_to.equals("Imperial cup"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0208333)+" Imperial cup");
                        }
                        if (option_to.equals("Imperial fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*0.208333)+" Imperial fluid ounce");
                        }
                        if (option_to.equals("Imperial tableSpoon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.333333)+" Imperial tablespoon");
                        }
                        if (option_to.equals("Imperial teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*1)+" Imperial teaspoon");
                        }
                        if (option_to.equals("Cubic foot"))
                        {
                            Result_volume.setText(String.valueOf(in*0.000209041)+" Cubic foot");
                        }
                        if (option_to.equals("Cubic inch"))
                        {
                            Result_volume.setText(String.valueOf(in*0.361223)+" Cubic inch");
                        }
                    }
                    if (option_from.equals("Cubic foot"))
                    {
                        if (option_to.equals("US liquid gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*7.48052)+" US liquid gallon");
                        }
                        if (option_to.equals("US liquid quart"))
                        {
                            Result_volume.setText(String.valueOf(in*29.9221)+" US liquid quart");
                        }
                        if (option_to.equals("US liquid pint"))
                        {
                            Result_volume.setText(String.valueOf(in*59.8442)+" US liquid pint");
                        }
                        if (option_to.equals("US legal cup"))
                        {
                            Result_volume.setText(String.valueOf(in*117.987)+" US legal cup");
                        }
                        if (option_to.equals("US fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*957.506)+" US fluid ounce");
                        }
                        if (option_to.equals("US tablespoon"))
                        {
                            Result_volume.setText(String.valueOf(in*1915.01)+" US tablespoon");
                        }
                        if (option_to.equals("US teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*5745.04)+" US teaspoon");
                        }
                        if (option_to.equals("Cubic metre"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0283168)+" Cubicmetre");
                        }
                        if (option_to.equals("Litre"))
                        {
                            Result_volume.setText(String.valueOf(in*28.3168)+" Litre");
                        }
                        if (option_to.equals("Milli litre"))
                        {
                            Result_volume.setText(String.valueOf(in*28316.8)+" milli litre");
                        }
                        if (option_to.equals("Imperial gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*6.22884)+" Imperial gallon");
                        }
                        if (option_to.equals("Imperial quart"))
                        {
                            Result_volume.setText(String.valueOf(in*24.9153)+" Imperial quart");
                        }
                        if (option_to.equals("Imperial pint"))
                        {
                            Result_volume.setText(String.valueOf(in*49.8307)+" Imperial pint");
                        }
                        if (option_to.equals("Imperial cup"))
                        {
                            Result_volume.setText(String.valueOf(in*99.6614)+" Imperial cup");
                        }
                        if (option_to.equals("Imperial fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*996.614)+" Imperial fluid ounce");
                        }
                        if (option_to.equals("Imperial tableSpoon"))
                        {
                            Result_volume.setText(String.valueOf(in*1594.58)+" Imperial tablespoon");
                        }
                        if (option_to.equals("Imperial teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*4783.74)+" Imperial teaspoon");
                        }
                        if (option_to.equals("Cubic foot"))
                        {
                            Result_volume.setText(String.valueOf(in*1)+" Cubic foot");
                        }
                        if (option_to.equals("Cubic inch"))
                        {
                            Result_volume.setText(String.valueOf(in*1728)+" Cubic inch");
                        }

                    }

                    if (option_from.equals("Cubic inch"))
                    {
                        if (option_to.equals("US liquid gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.004329)+" US liquid gallon");
                        }
                        if (option_to.equals("US liquid quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.017316)+" US liquid quart");
                        }
                        if (option_to.equals("US liquid pint"))
                        {
                            Result_volume.setText(String.valueOf(in*0.034632)+" US liquid pint");
                        }
                        if (option_to.equals("US legal cup"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0682794)+" US legal cup");
                        }
                        if (option_to.equals("US fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*0.554113)+" US fluid ounce");
                        }
                        if (option_to.equals("US tablespoon"))
                        {
                            Result_volume.setText(String.valueOf(in*1.10823)+" US tablespoon");
                        }
                        if (option_to.equals("US teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*3.32468)+" US teaspoon");
                        }
                        if (option_to.equals("Cubic metre"))
                        {
                            Result_volume.setText(String.valueOf(in*1.6387e-5)+" Cubicmetre");
                        }
                        if (option_to.equals("Litre"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0163871)+" Litre");
                        }
                        if (option_to.equals("Milli litre"))
                        {
                            Result_volume.setText(String.valueOf(in*16.3871)+" milli litre");
                        }
                        if (option_to.equals("Imperial gallon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.00360465)+" Imperial gallon");
                        }
                        if (option_to.equals("Imperial quart"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0144186)+" Imperial quart");
                        }
                        if (option_to.equals("Imperial pint"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0288372)+" Imperial pint");
                        }
                        if (option_to.equals("Imperial cup"))
                        {
                            Result_volume.setText(String.valueOf(in*0.0576744)+" Imperial cup");
                        }
                        if (option_to.equals("Imperial fluid ounce"))
                        {
                            Result_volume.setText(String.valueOf(in*0.576744)+" Imperial fluid ounce");
                        }
                        if (option_to.equals("Imperial tableSpoon"))
                        {
                            Result_volume.setText(String.valueOf(in*0.92279)+" Imperial tablespoon");
                        }
                        if (option_to.equals("Imperial teaspoon"))
                        {
                            Result_volume.setText(String.valueOf(in*2.76837)+" Imperial teaspoon");
                        }
                        if (option_to.equals("Cubic foot"))
                        {
                            Result_volume.setText(String.valueOf(in*0.000578704)+" Cubic foot");
                        }
                        if (option_to.equals("Cubic inch"))
                        {
                            Result_volume.setText(String.valueOf(in*1)+" Cubic inch");
                        }

                    }

                }
                else if(input_volume.getText().toString().equals(""))
                    Result_volume.setText("Please give some input");
            }
        });
    }
}
