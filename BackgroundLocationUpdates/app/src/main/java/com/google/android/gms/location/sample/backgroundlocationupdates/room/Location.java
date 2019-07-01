package com.google.android.gms.location.sample.backgroundlocationupdates.room;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Location {
    @PrimaryKey
    @NonNull
    public String id;

    @ColumnInfo(name = "latitude")
    public double latitude;

    @ColumnInfo(name = "longitude")
    public double longitude;

    @ColumnInfo(name = "battery_percentage")
    public double batteryPercentage;

    @ColumnInfo(name = "timestamp")
    public long timestamp;

    @ColumnInfo(name = "acknowledgement")
    public int acknowledgement;

    public Location(String id, double latitude, double longitude, double batteryPercentage, long timestamp, int acknowledgement) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.batteryPercentage = batteryPercentage;
        this.timestamp = timestamp;
        this.acknowledgement = acknowledgement;
    }
}
