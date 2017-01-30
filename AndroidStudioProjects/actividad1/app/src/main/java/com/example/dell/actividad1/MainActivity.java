package com.example.dell.actividad1;

/**
 * Created by DELL on 1/23/2017.
 */
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getSimpleName();
   private TextView mTxtVwInfo  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);


        Button button=(Button) findViewById(R.id.button);
        button.setOnClickListener(this);

        Button button2=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3=(Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        this.mTxtVwInfo= (TextView) findViewById(R.id.tv_show);
        this.mTxtVwInfo.setHeight(0);


        //  View view = findViewById(R.id.button);
//       Button StartButton= (Button) findViewById(R.id.button);
//
//        StartButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                starseconactivity(v);
//                Log.i(MainActivity.TAG,"111111111111111111111");
//            }
//        });
//
//        Button StartButton2= (Button) findViewById(R.id.button2);
//
//        StartButton2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.e(MainActivity.TAG,"2222222222222222222");
//            }
//        });
//        Button StartButton3= (Button) findViewById(R.id.button3);
//
//        StartButton3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d(MainActivity.TAG,"333333333333333333");
//            }
//        });
//        Toast.makeText(this,"onCreate", Toast.LENGTH_SHORT).show();
//        Log.i(MainActivity.TAG,"In-onCreate");


    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume", Toast.LENGTH_SHORT).show();



    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy", Toast.LENGTH_SHORT).show();

    }
    public void starseconactivity(View view){

        Intent activityinteIntentnt = new  Intent(this,SecondActivity.class);
    //    startActivity(activityinteIntentnt);
           startActivityForResult(activityinteIntentnt,0);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.button)
        {
            Log.i("OnClickClass()","1111111111");
        }
        else if (v.getId()==R.id.button2)
        {
            starseconactivity(v);

        }
        else if (v.getId()==R.id.button3)
        {
            Log.e("OnClickClass()","33333333333");

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e(MainActivity.TAG,"Return Info Secont Activity");
        if (requestCode==0 && resultCode== Activity.RESULT_OK)
        {
            String returndata = data.getStringExtra("Data");
            Log.e(MainActivity.TAG, "return message " + returndata);
            this.mTxtVwInfo.setText(returndata);
            this.mTxtVwInfo.setVisibility(View.VISIBLE);
            this.mTxtVwInfo.setHeight(400);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("My Text Value",this.mTxtVwInfo.getText().toString());
             outState.putInt("My Height Value",this.mTxtVwInfo.getHeight());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String returnString = savedInstanceState.getString("My Text Value");
             int returnHeight = savedInstanceState.getInt("My Height Value");
        this.mTxtVwInfo.setText(returnString);
                this.mTxtVwInfo.setVisibility(View.VISIBLE);
        this.mTxtVwInfo.setHeight(returnHeight);
    }
}
