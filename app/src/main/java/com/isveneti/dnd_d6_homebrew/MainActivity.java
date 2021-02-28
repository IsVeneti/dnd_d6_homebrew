package com.isveneti.dnd_d6_homebrew;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button attbutton;
    private Button defbutton;
    private Button distbutton;
    private Button healbutton;
    private Button defbutton_c;
    private Button defbutton_m;
    private TextView attview;
    private TextView defview;
    private TextView distview;
    private TextView healview;
    private TextView defview_c;
    private TextView defview_m;
    SecureRandom rand;
    private int randnum;
    private String roll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        attview = (TextView)findViewById(R.id.attview);
        defview = (TextView)findViewById(R.id.defview);
        distview = (TextView)findViewById(R.id.distview);
        healview = (TextView)findViewById(R.id.healview);
        defview_c = (TextView)findViewById(R.id.defview_c);
        defview_m = (TextView)findViewById(R.id.defview_m);

        attbutton = (Button)findViewById(R.id.attbutton);
        defbutton = (Button)findViewById(R.id.defbutton);
        distbutton = (Button)findViewById(R.id.distbutton);
        healbutton = (Button)findViewById(R.id.healbutton);
        defbutton_c = (Button)findViewById(R.id.defbutton_c);
        defbutton_m = (Button)findViewById(R.id.defbutton_m);

        attbutton.setOnClickListener(this);
        defbutton.setOnClickListener(this);
        distbutton.setOnClickListener(this);
        healbutton.setOnClickListener(this);
        defbutton_c.setOnClickListener(this);
        defbutton_m.setOnClickListener(this);


        rand = new SecureRandom();

    }

    //TODO: make a main menu screen and put instructions

    public void onClick(View v) {
        try {
            SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        randnum = rand.nextInt(6)+1;
        switch (v.getId()) {
            case R.id.attbutton: {
                attview.setText(HashHelper.attmap.get(randnum));
                break;
            }
            case R.id.defbutton: {
                defview.setText(HashHelper.defmap.get(randnum));
                //Toast.makeText(MainActivity.this, Integer.valueOf(randnum), Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.defbutton_c: {
                defview_c.setText(HashHelper.defmapc.get(randnum));
                //Toast.makeText(MainActivity.this, Integer.valueOf(randnum), Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.defbutton_m: {
                defview_m.setText(HashHelper.defmapm.get(randnum));
                //Toast.makeText(MainActivity.this, Integer.valueOf(randnum), Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.distbutton: {
                distview.setText(HashHelper.distmap.get(randnum));
                break;
            }
            case R.id.healbutton: {
                healview.setText(HashHelper.healmap.get(randnum));
                break;
            }
        }
    }

    //button listener and textview
}
