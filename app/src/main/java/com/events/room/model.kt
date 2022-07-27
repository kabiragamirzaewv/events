package com.events.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "profile")
data class Profile(
    @PrimaryKey(autoGenerate = true) val id: Long?,
    @ColumnInfo(name = "avatar") val avatar: String?,
    @ColumnInfo(name = "username") val username: String?,
    @ColumnInfo(name = "lastName") val lastName:String?,
    @ColumnInfo(name = "about") val about:String?,
)

@Entity(tableName = "subscribe")
data class Subscribe(
    @PrimaryKey(autoGenerate = true) val id: Long?,
    @ColumnInfo(name = "user_id") val user_id: String?,
    @ColumnInfo(name = "name") val name: String?,
    @ColumnInfo(name = "icon") val icon: String?,
)