package com.example.kevin.abstractclassesinjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtDesktopComputer = (TextView) findViewById(R.id.txtDesktopComputer);
        TextView txtLaptopComputer = (TextView) findViewById(R.id.txtLabtopComputer);
        TextView txtSpaceForceComputer = (TextView)findViewById(R.id.txtSpaceForceComputer);
        TextView txtTabletComputer = (TextView) findViewById(R.id.txtTabletComputer);

        TextView txtDesktopComputerPerformance = (TextView)findViewById(R.id.txtDesktopComputerPerformance);
        TextView txtLaptopComputerPerformance = (TextView)findViewById(R.id.txtLabtopComputerPerformance);
        TextView txtSpaceForceComputerPerformance = (TextView)findViewById(R.id.txtSpaceForceComputerPerformance);
        TextView txtTabletComputerPerformance = (TextView)findViewById(R.id.txtTabletComputerPerformance);








    }
}
