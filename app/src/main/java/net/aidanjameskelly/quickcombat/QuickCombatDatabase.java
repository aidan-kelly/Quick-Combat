package net.aidanjameskelly.quickcombat;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Encounter.class, Enemy.class}, version = 1, exportSchema = false)
public abstract class QuickCombatDatabase extends RoomDatabase {
    public abstract EncounterDao getEncounterDao();
    public abstract EnemyDao getEnemyDao();
}
