package com.example.crud_room_compose.room

import androidx.room.Database
import androidx.room.RoomDatabase

import com.example.crud_room_compose.models.Usuarios

@Database(
    entities = [Usuarios::class],
    version = 1,
    exportSchema = false
)
abstract class UsuariosDatabase: RoomDatabase() {
    abstract fun usuariosDao(): UsuariosDatabaseDao
}