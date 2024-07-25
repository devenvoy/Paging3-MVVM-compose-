package com.devansh.paging3_mvvm_compose.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Company(
    @SerialName("address")
    var address: Address,
    @SerialName("department")
    var department: String,
    @SerialName("name")
    var name: String,
    @SerialName("title")
    var title: String
)