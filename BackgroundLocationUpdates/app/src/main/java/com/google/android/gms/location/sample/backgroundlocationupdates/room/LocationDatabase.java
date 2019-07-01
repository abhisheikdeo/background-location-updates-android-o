package com.google.android.gms.location.sample.backgroundlocationupdates.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = Location.class, exportSchema = false, version = 1)
public abstract class LocationDatabase extends RoomDatabase {
    private static final String DB_NAME = "location_db";
    private static LocationDatabase _locationDatabaseInstance;

    public static synchronized LocationDatabase getInstance(Context context) {
        if (_locationDatabaseInstance == null) {
            _locationDatabaseInstance = Room.databaseBuilder(context.getApplicationContext(), LocationDatabase.class, DB_NAME)
                    .fallbackToDestructiveMigration()
                    .build();
        }

        return _locationDatabaseInstance;
    }

    public abstract LocationDao locationDao();
}
