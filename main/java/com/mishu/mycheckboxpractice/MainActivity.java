package com.mishu.mycheckboxpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBoxSakibKhan, checkBoxOmorSani, checkBoxManna, checkBoxAnantaJalil;

    Button buttonAdd;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdd = (Button) findViewById(R.id.ButtonAdd);
        linearLayout = (LinearLayout) findViewById(R.id.LinearLayout);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String> strings = new ArrayList<String>();

                for (int i = 0; i < linearLayout.getChildCount(); i++){
                    View view1 = linearLayout.getChildAt(i);
                    if (view1 instanceof CheckBox){
                        CheckBox checkBox = (CheckBox) view1;
                        if (checkBox.isChecked()){
                            String data = checkBox.getText().toString();
                            strings.add(data);
                        }
                    }
                }
                Toast.makeText(MainActivity.this, strings.toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
