package com.compose.desktop.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

class EmailAddressValidatorPageViewModel {

    private val _emailAddress = remember { mutableStateOf("") }
    val emailAddress: MutableState<String> = _emailAddress

    fun updateEmailAddressInput(value: String) {
        _emailAddress.value = value
    }
}