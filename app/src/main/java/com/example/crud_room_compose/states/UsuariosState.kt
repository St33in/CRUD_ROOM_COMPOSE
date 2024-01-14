package com.example.crud_room_compose.states

import com.example.crud_room_compose.models.Usuarios

data class UsuariosState(
    val listaUsuarios: List<Usuarios> = emptyList()
)