package com.devansh.paging3_mvvm_compose.data.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class UserList(
    @SerialName("limit")
    var limit: Int,
    @SerialName("skip")
    var skip: Int,
    @SerialName("total")
    var total: Int,
    @SerialName("users")
    var users: List<User>
)