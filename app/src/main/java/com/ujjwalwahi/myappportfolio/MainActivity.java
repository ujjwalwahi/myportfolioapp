package com.ujjwalwahi.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String clickMessage = "This button will launch my %s app!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button spotifyButton = (Button) findViewById(R.id.spotify);
        spotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("spotify streamer");
            }
        });
        Button scoresButton = (Button) findViewById(R.id.scores);
        scoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("scores");
            }
        });
        Button libraryButton = (Button) findViewById(R.id.library);
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("library");
            }
        });
        Button buildBiggerButton = (Button) findViewById(R.id.build_bigger);
        buildBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("build it bigger");
            }
        });
        Button xyzReaderButton = (Button) findViewById(R.id.xyz_reader);
        xyzReaderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("xyz reader");
            }
        });
        Button capstoneButton = (Button) findViewById(R.id.capstone);
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("capstone");
            }
        });

    }

    public void showToast(String appName)
    {
        Toast t = Toast.makeText(getApplication(), String.format(clickMessage, appName), Toast.LENGTH_SHORT);
        t.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
