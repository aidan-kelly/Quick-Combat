package net.aidanjameskelly.quickcombat;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

@Dao
public interface EncounterDao {

    @Insert
    void insert(Encounter encounter);
}
