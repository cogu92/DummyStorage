package com.example.dell.actividad1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button BtnReturn=(Button) findViewById(R.id.button_Return_Info);
        BtnReturn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.button_Return_Info)
        {
            Log.i("SecondActivity()","Hello Nicolas");
            Intent returnIntent=new Intent();
            returnIntent.putExtra("Data", "My First App");
            setResult(Activity.RESULT_OK,returnIntent);
            finish();
        }
    }
}

