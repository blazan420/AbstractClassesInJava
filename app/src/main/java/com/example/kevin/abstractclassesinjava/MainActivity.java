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
        TextView txtSpaceForceComputer = (TextView) findViewById(R.id.txtSpaceForceComputer);
        TextView txtTabletComputer = (TextView) findViewById(R.id.txtTabletComputer);

        TextView txtDesktopComputerPerformance = (TextView) findViewById(R.id.txtDesktopComputerPerformance);
        TextView txtLaptopComputerPerformance = (TextView) findViewById(R.id.txtLabtopComputerPerformance);
        TextView txtSpaceForceComputerPerformance = (TextView) findViewById(R.id.txtSpaceForceComputerPerformance);
        TextView txtTabletComputerPerformance = (TextView) findViewById(R.id.txtTabletComputerPerformance);


        DesktopComputer desktopComputer = new DesktopComputer("iMac", "High Quality Screen", "Physical Keyboard",
                "physical mouse", 2000, 1000);
        LaptopComputer laptopComputer = new LaptopComputer("Macbook Pro", "High Quality Screen", "Physical Keyboard", "Physical Mouse", 2000, 1500, "High Quality Touch Pad");

        SpaceForceComputer spaceForceComputer = new SpaceForceComputer("VK-World S8", "HiRes", "Virtual Keyboard", "Android 7.0", 4000, 4);
        TabletComputer tabletComputer = new TabletComputer("iPad", "Retina Screen", "Virtual Keyboard", "iOS", 800, 700, 10);


        txtDesktopComputerPerformance.setText("Performance: " + desktopComputer.evaluatePerformance() + "\n");
        txtLaptopComputerPerformance.setText("Performance: " + laptopComputer.evaluatePerformance() + "\n");
        txtSpaceForceComputerPerformance.setText("Performance: " + spaceForceComputer.evaluatePerformance() + "\n");
        txtTabletComputerPerformance.setText("Performance: " + tabletComputer.evaluatePerformance() + "\n");


        Computer[] computers = new Computer[4];
        computers[0] = desktopComputer;
        computers[1] = laptopComputer;
        computers[2] = spaceForceComputer;
        computers[3] = tabletComputer;


        for (Computer computer : computers) {

            if (computer instanceof DesktopComputer) {
                DesktopComputer currentDesktopComputer = (DesktopComputer) computer;
                txtDesktopComputer.setText(currentDesktopComputer.toString());
            }
            if (computer instanceof LaptopComputer) {
                LaptopComputer currentLaptopComputer = (LaptopComputer) computer;
                txtLaptopComputer.setText(currentLaptopComputer.toString());
            }
            if (computer instanceof SpaceForceComputer) {
                if (!(computer instanceof TabletComputer)) {
                    SpaceForceComputer currentSpaceForceComputer = (SpaceForceComputer) computer;
                    txtSpaceForceComputer.setText(currentSpaceForceComputer.toString());
                }
            }
            if (computer instanceof TabletComputer) {
                TabletComputer currentTabletComputer = (TabletComputer) computer;
                txtTabletComputer.setText(currentTabletComputer.toString());
            }
        }


    }
}
