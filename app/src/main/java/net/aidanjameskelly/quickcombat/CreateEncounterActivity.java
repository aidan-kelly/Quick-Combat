package net.aidanjameskelly.quickcombat;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CreateEncounterActivity extends AppCompatActivity {

    SQLiteDatabase database;
    EditText enemyNameEditText;
    ListView listView;
    ArrayList<String> listOfEnemies;
    ArrayAdapter<String> ourAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_encounter);

        //sets up the ListView to show the names of added creatures
        listView = findViewById(R.id.listView);
        listOfEnemies = new ArrayList<String>();
        enemyNameEditText = findViewById(R.id.enemyNameEditText);

        //link the ListView with the ArrayList via ourAdapter
        ourAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listOfEnemies);
        listView.setAdapter(ourAdapter);
    }



    public void addToList(View view){
        //on click we add the enemy name to the list and update the ListView via the adapter
        listOfEnemies.add(enemyNameEditText.getText().toString());
        ourAdapter.notifyDataSetChanged();
        Toast.makeText(this, "Adding " + enemyNameEditText.getText() + " to the list!", Toast.LENGTH_SHORT).show();
    }

    public void saveList(View view){
        Toast.makeText(this, "Saving the list!", Toast.LENGTH_SHORT).show();
    }

}
