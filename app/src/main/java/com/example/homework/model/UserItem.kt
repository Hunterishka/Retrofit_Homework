package com.example.homework.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class UserItem(
    val address: Address,
    val company: Company,
    val email: String,
    val id: Int,
    val name: String,
    val phone: String,
    val username: String,
    val website: String
):Parcelable