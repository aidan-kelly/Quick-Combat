package net.aidanjameskelly.quickcombat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CreateEncounterActivity extends AppCompatActivity {

    EditText enemyNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_encounter);

        enemyNameEditText = findViewById(R.id.enemyNameEditText);
    }

    public void addToList(View view){
        Toast.makeText(this, "Adding " + enemyNameEditText.getText() + " to the list!", Toast.LENGTH_SHORT).show();
    }

    public void saveList(View view){
        Toast.makeText(this, "Saving the list!", Toast.LENGTH_SHORT).show();
    }

}
