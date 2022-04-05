package com.geektech.homework2_3month;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface AppDao {
    @Insert
    void save(NoteModel item);


    @Update
    void update(NoteModel item);

    @Query("SELECT * FROM notemodel")
    List<NoteModel> getAll();

    @Query("SELECT * FROM notemodel WHERE id IN (:id)")
    NoteModel getCaseById(int id);
}
