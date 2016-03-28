package com.naveedroid.naveen.unitconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private static ImageButton energy_btn_1;
    private static ImageButton length_btn_1;
    private static ImageButton pressure_btn1;
    private static ImageButton angle_btn_1;
    private static ImageButton temperature_btn_1;
    private static ImageButton mass_btn_1;
    private static ImageButton area_btn_1;
    public static ImageButton speed_btn_1;
    public static ImageButton frequency_btn_1;
    public static ImageButton volume_btn_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickEnergy_btn();
        onClickLength_btn();
        onClickPressure_btn();
        onClickAngle_btn();
        onClickTemperature_btn();
        onClickMass_btn();
        onClickArea_btn();
        onClickSpeed_btn();
        onClickFrequency_btn();
        onClickVolume_btn();
    }

    public void onClickEnergy_btn() {
        energy_btn_1 = (ImageButton) findViewById(R.id.energy_btn);
        energy_btn_1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent_energy = new Intent("com.naveedroid.naveen.unitconverter.Energy_Activity");
                        startActivity(intent_energy);

                    }
                }
        );
    }

    public void onClickLength_btn() {
        length_btn_1 = (ImageButton) findViewById(R.id.length_btn);
        length_btn_1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent_length = new Intent("com.naveedroid.naveen.unitconverter.Length_Activity");
                        startActivity(intent_length);

                    }
                }
        );
    }

    public void onClickPressure_btn() {
        pressure_btn1 = (ImageButton) findViewById(R.id.pressure_btn);
        pressure_btn1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent_Pressure = new Intent("com.naveedroid.naveen.unitconverter.Pressure_activity");
                        startActivity(intent_Pressure);

                    }
                }
        );
    }

    public void onClickAngle_btn() {
        angle_btn_1 = (ImageButton) findViewById(R.id.angle_btn);
        angle_btn_1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent_Angle = new Intent("com.naveedroid.naveen.unitconverter.Angle_Activity");
                        startActivity(intent_Angle);
                    }
                });
    }

    public void onClickTemperature_btn()
    {
        temperature_btn_1=(ImageButton)findViewById(R.id.temperature_btn);
        temperature_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_temperature = new Intent("com.naveedroid.naveen.unitconverter.Temperature_Activity");
                startActivity(intent_temperature);
            }
        });
    }

    public void onClickMass_btn()
    {
        mass_btn_1=(ImageButton)findViewById(R.id.mass_btn);
        mass_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_mass = new Intent("com.naveedroid.naveen.unitconverter.Mass_Activity");
                startActivity(intent_mass);
            }
        });
    }

    public void onClickArea_btn()
    {
        area_btn_1=(ImageButton)findViewById(R.id.area_btn);
        area_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_area=new Intent("com.naveedroid.naveen.unitconverter.Area_Activity");
                startActivity(intent_area);
            }
        });
    }

    public void onClickSpeed_btn()
    {
        speed_btn_1=(ImageButton)findViewById(R.id.speed_btn);
        speed_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_speed=new Intent("com.naveedroid.naveen.unitconverter.Speed_Activity");
                startActivity(intent_speed);
            }
        });
    }
    public void onClickFrequency_btn()
    {
        frequency_btn_1=(ImageButton)findViewById(R.id.frequency_btn);
        frequency_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_frequency=new Intent("com.naveedroid.naveen.unitconverter.Frequency_Activity");
                startActivity(intent_frequency);
            }
        });
    }

    public void onClickVolume_btn()
    {
        volume_btn_1=(ImageButton)findViewById(R.id.volume_btn);
        volume_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_volume = new Intent("com.naveedroid.naveen.unitconverter.Volume_Activity");
                startActivity(intent_volume);
            }
        });
    }
}
