package net.aidanjameskelly.quickcombat;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

@Dao
public interface EnemyDao {

    @Insert
    void insert(Enemy enemy);

}
