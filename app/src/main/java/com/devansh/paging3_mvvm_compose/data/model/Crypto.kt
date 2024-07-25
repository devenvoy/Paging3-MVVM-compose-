package com.devansh.paging3_mvvm_compose.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Crypto(
    @SerialName("coin")
    var coin: String,
    @SerialName("network")
    var network: String,
    @SerialName("wallet")
    var wallet: String
)