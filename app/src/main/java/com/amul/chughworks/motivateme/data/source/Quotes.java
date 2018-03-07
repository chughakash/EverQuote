package com.amul.chughworks.motivateme.data.source;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by Akash Chugh on 3/7/18.
 */

//Immutable model for Quotes
@Entity(tableName = "Quotes")
public final class Quotes {

    @PrimaryKey
    @ColumnInfo(name = "Id")
    private final int mId;

    @NonNull
    @ColumnInfo(name = "quote")
    private final String mQuote;

    @NonNull
    @ColumnInfo(name = "author")
    private final String mAuthor;

    @ColumnInfo(name = "category")
    private final String mCategory;

    public Quotes(int Id,@NonNull String quote, @NonNull String author, @Nullable String category){
        mId = Id;
        mQuote = quote;
        mAuthor = author;
        mCategory = category;
    }

    public Quotes(int Id, @NonNull String quote, @NonNull String author) {
        this(Id, quote, author, null);
    }

    public int getId() {return mId;}

    @NonNull
    public String getQuote() {return mQuote;}

    @NonNull
    public String getAuthor() {return mAuthor;}

    @Nullable
    public String getCategory() {return mCategory;}

    //TODO Add hashcode and equals method
}
