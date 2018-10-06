package net.aidanjameskelly.quickcombat;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //database setup
        database = openOrCreateDatabase("Encounters", MODE_PRIVATE, null);

    }

    public void goToCreateEncounter(View view){
        Intent intent = new Intent(getApplicationContext(), CreateEncounterActivity.class);
        startActivity(intent);
    }
}
