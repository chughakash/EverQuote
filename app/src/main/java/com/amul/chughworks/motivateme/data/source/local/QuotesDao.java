package com.amul.chughworks.motivateme.data.source.local;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.amul.chughworks.motivateme.data.source.Quotes;

/**
 * Created by Akash Chugh on 3/7/18.
 */

@Dao
public interface QuotesDao {

    @Query("SELECT * FROM Quotes")
    Quotes getAllQuotes();

    @Query("SELECT * FROM Quotes where Id = :mID")
     Quotes getQuote(int mID);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
     void insertQuote(Quotes quote);

    @Update
    int updateQuote(Quotes quote);

    @Query("DELETE FROM Quotes WHERE Id = :mID")
    int deleteQuteById(int mID );

   @Query("DELETE FROM Quotes")
    int deleteAllQuotes();
}
