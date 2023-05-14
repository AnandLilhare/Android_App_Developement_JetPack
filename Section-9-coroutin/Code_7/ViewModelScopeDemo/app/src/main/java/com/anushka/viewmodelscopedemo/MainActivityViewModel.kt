package com.anushka.viewmodelscopedemo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch


class MainActivityViewModel : ViewModel() {

    fun getUserData(){
        viewModelScope.launch {
            //write some code
        }
    }


}