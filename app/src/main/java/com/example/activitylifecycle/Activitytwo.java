package com.example.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Activitytwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytwo);
        Toast.makeText(this, "onCreate2", Toast.LENGTH_SHORT).show();
    }
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume2", Toast.LENGTH_SHORT).show();

    }

    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause2", Toast.LENGTH_SHORT).show();


    }

    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy2", Toast.LENGTH_SHORT).show();
    }

    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop2", Toast.LENGTH_SHORT).show();
    }

    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart2", Toast.LENGTH_SHORT).show();
    }

}
