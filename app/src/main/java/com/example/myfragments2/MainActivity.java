package com.example.myfragments2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.gotoFrag).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TestFrag testFrag =new TestFrag();
                FragmentManager fragmentManager = getSupportFragmentManager();

                fragmentManager.beginTransaction()
                        .replace(R.id.frame_frag,testFrag)  //id of the frame layout in the activity
                        .commit();
            }
        });
    }
}