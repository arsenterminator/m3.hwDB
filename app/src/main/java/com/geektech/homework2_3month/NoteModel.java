package com.geektech.homework2_3month;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class NoteModel {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "case_title")
    public String title;

    @ColumnInfo(name = "case_description")
    public String description;

    @ColumnInfo(name = "case_date")
    public String date;

    public NoteModel(String title, String description, String date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }

    @Ignore
    public NoteModel(int id, String title, String description, String date) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }
}
