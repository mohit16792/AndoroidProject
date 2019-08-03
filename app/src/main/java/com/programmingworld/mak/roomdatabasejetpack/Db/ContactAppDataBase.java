package com.programmingworld.mak.roomdatabasejetpack.Db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.programmingworld.mak.roomdatabasejetpack.Entity.Contact;

@Database(entities = {Contact.class},version = 1)
public abstract class ContactAppDataBase extends RoomDatabase {
    public abstract ContactDAO getContactDAO();
}
