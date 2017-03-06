package com.example.dell.testvibration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {


    //public class VibracionActivity extends Activity {
        /** Called when the activity is first created. */
        private Button b_tressegundos;
        private Button b_patron;
        private Button b_verdocumentacion;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            b_tressegundos = (Button) this.findViewById( R.id.id_tressegundos);
            b_patron = (Button)this.findViewById(R.id.id_patron);
            b_verdocumentacion = (Button) this.findViewById(R.id.id_verdocumentacion);

            b_tressegundos.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    // TODO Auto-generated method stub
                    Vibrator v = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                    v.vibrate(3000);
                }
            });

            b_patron.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    // TODO Auto-generated method stub
                    Vibrator v = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                    long [] patron = {0, 500, 300, 1000, 500};
                    v.vibrate(patron,3);
                }
            });

            b_verdocumentacion.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View v) {
                    Vibrator v1 = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                    long [] patron = {0, 600, 100, 9000, 600};
                    v1.vibrate(patron,3);
                }
            });

        }
    }

