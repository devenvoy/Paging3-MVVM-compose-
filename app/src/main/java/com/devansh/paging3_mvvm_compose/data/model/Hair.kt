package com.devansh.paging3_mvvm_compose.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Hair(
    @SerialName("color")
    var color: String,
    @SerialName("type")
    var type: String
)