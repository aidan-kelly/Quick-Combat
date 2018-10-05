package net.aidanjameskelly.quickcombat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CreateEncounterActivity extends AppCompatActivity {

    EditText enemyNameEditText;
    ListView listView;
    ArrayList<String> listOfEnemies;
    ArrayAdapter<String> ourAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_encounter);
        listView = findViewById(R.id.listView);
        listOfEnemies = new ArrayList<String>();

        enemyNameEditText = findViewById(R.id.enemyNameEditText);

        ourAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listOfEnemies);
        listView.setAdapter(ourAdapter);
    }

    public void addToList(View view){
        listOfEnemies.add(enemyNameEditText.getText().toString());
        ourAdapter.notifyDataSetChanged();
        Toast.makeText(this, "Adding " + enemyNameEditText.getText() + " to the list!", Toast.LENGTH_SHORT).show();
    }

    public void saveList(View view){
        Toast.makeText(this, "Saving the list!", Toast.LENGTH_SHORT).show();
    }

}
