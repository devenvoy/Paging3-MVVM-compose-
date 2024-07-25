package com.devansh.paging3_mvvm_compose.data.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class User(
    @SerialName("address")
    var address: Address,
    @SerialName("age")
    var age: Int,
    @SerialName("bank")
    var bank: Bank,
    @SerialName("birthDate")
    var birthDate: String,
    @SerialName("bloodGroup")
    var bloodGroup: String,
    @SerialName("company")
    var company: Company,
    @SerialName("crypto")
    var crypto: Crypto,
    @SerialName("ein")
    var ein: String,
    @SerialName("email")
    var email: String,
    @SerialName("eyeColor")
    var eyeColor: String,
    @SerialName("firstName")
    var firstName: String,
    @SerialName("gender")
    var gender: String,
    @SerialName("hair")
    var hair: Hair,
    @SerialName("height")
    var height: Double,
    @SerialName("id")
    var id: Int,
    @SerialName("image")
    var image: String,
    @SerialName("ip")
    var ip: String,
    @SerialName("lastName")
    var lastName: String,
    @SerialName("macAddress")
    var macAddress: String,
    @SerialName("maidenName")
    var maidenName: String,
    @SerialName("password")
    var password: String,
    @SerialName("phone")
    var phone: String,
    @SerialName("role")
    var role: String,
    @SerialName("ssn")
    var ssn: String,
    @SerialName("university")
    var university: String,
    @SerialName("userAgent")
    var userAgent: String,
    @SerialName("username")
    var username: String,
    @SerialName("weight")
    var weight: Double,
)