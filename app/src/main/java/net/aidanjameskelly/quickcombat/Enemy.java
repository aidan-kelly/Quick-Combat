package net.aidanjameskelly.quickcombat;

import android.arch.persistence.room.*;

@Entity(tableName = "enemy_table",primaryKeys = {"encID", "eneID"})
public class Enemy {

    public int encID;
    public int eneID;
    public String eneName;
    public int eneHP;
    public int eneDexMod;

}
