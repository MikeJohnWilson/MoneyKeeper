package me.bakumon.moneykeeper.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import io.reactivex.Flowable;
import me.bakumon.moneykeeper.database.entity.Record;

/**
 * @author Bakumon https://bakumon.me
 */
@Dao
public interface RecordDao {
    @Query("SELECT * FROM record ORDER BY time DESC")
    Flowable<List<Record>> getAll();

    @Insert
    void insert(Record record);

}
