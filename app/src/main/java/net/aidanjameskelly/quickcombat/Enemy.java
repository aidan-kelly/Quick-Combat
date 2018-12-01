package net.aidanjameskelly.quickcombat;

import android.arch.persistence.room.*;

@Entity(tableName = "enemy_table")
public class Enemy {

    @ForeignKey(entity = Encounter.class, parentColumns = "encID", childColumns = "encID")
    public int encID;

    @PrimaryKey(autoGenerate = true)
    public int eneID;

    public String eneName;
    public int eneHP;
    public int eneDexMod;

}
