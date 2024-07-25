package com.devansh.paging3_mvvm_compose.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Coordinates(
    @SerialName("lat")
    var lat: Double,
    @SerialName("lng")
    var lng: Double
)