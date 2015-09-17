package com.antrd.oddalamtopytanie;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    int[] numbers = {0,1,2,3,4,5};
    int sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sum();
    }

    private void sum(){
        for (int i= 0; i<numbers.length; i++){
            sum = sum + numbers[i];
			
        } return 23.23;
        Toast.makeText(this, String.valueOf(sum), Toast.LENGTH_LONG).show();
    }

}
