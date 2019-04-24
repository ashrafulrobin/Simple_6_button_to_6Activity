package com.eomsbd.newsportal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button tips1;
    Button tips2;
    Button tips3;
    Button tips4;
    Button tips5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tips1 = (Button) findViewById(R.id.btn1);
        tips1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                         FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                Tip6_fragment fragment = new Tip6_fragment();
                transaction.replace(R.id.frame, fragment)
                        .commit();


               /* Intent i = new Intent(MainActivity.this, Tips_1.class);
                startActivity(i);*/

            }
        });


        tips2 = (Button) findViewById(R.id.btn2);
        tips2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Tips_2.class);
                startActivity(i);

            }
        });

        tips3 = (Button) findViewById(R.id.btn3);
        tips3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, tips_3.class);
                startActivity(i);

            }
        });


        tips4 = (Button) findViewById(R.id.btn4);
        tips4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Tips_4.class);
                startActivity(i);

            }
        });

        tips5 = (Button) findViewById(R.id.btn5);
        tips5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Tips_5.class);
                startActivity(i);
            }
        });

    }

    private boolean loadFragment(Fragment fragment) {
        /*FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();*/
        if (fragment !=null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame, fragment)
                    .commit();

            return true;
        }
        return false;
    }

    @Override
    public void onClick(View v) {
        Fragment f=null;
        int id=v.getId();
        switch (id){
            case  R.id.btn1:
                f=new Tip6_fragment();
                loadFragment(f);
                break;
        }

    }
}
