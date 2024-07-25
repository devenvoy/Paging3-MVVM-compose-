package com.devansh.paging3_mvvm_compose.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Address(
    @SerialName("address")
    var address: String,
    @SerialName("city")
    var city: String,
    @SerialName("coordinates")
    var coordinates: Coordinates,
    @SerialName("country")
    var country: String,
    @SerialName("postalCode")
    var postalCode: String,
    @SerialName("state")
    var state: String,
    @SerialName("stateCode")
    var stateCode: String
)