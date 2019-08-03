package com.programmingworld.mak.roomdatabasejetpack.Entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "contacts")
public class Contact {

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ColumnInfo(name = "contact_email")
    private String email;

    @ColumnInfo(name = "contact_name")
    private  String name;

    @ColumnInfo(name = "contact_id")
    @PrimaryKey(autoGenerate = true)
    private long id;

    public Contact() {

    }

    public Contact(long id,String email, String name) {
        this.email = email;
        this.name = name;
        this.id = id;
    }


}
