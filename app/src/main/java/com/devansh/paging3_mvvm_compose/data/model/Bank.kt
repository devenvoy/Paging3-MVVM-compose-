package com.devansh.paging3_mvvm_compose.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Bank(
    @SerialName("cardExpire")
    var cardExpire: String,
    @SerialName("cardNumber")
    var cardNumber: String,
    @SerialName("cardType")
    var cardType: String,
    @SerialName("currency")
    var currency: String,
    @SerialName("iban")
    var iban: String
)