package net.aidanjameskelly.quickcombat;

import android.arch.persistence.room.*;

@Entity(tableName = "encounter_table")
public class Encounter {

    @PrimaryKey(autoGenerate = true)
    public int encID;

    public String encName;
    public int numPlayers;
}
