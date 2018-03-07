package com.amul.chughworks.motivateme.data.source.local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.amul.chughworks.motivateme.data.source.Quotes;

/**
 * Created by Akash Chugh on 3/7/18.
 */

@Database(entities = Quotes.class,version = 1)
public abstract class QuotesDatabase extends RoomDatabase{

    public abstract QuotesDao  quotesDao();

    private static QuotesDatabase INSTANCE;

    public static QuotesDatabase getInstance(Context context) {

        if(INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),QuotesDatabase.class, "Quotes.db").build();
        }
        return INSTANCE;
    }
}
