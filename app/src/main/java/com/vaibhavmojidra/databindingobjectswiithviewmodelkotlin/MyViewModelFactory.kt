package com.vaibhavmojidra.databindingobjectswiithviewmodelkotlin

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalStateException

class MyViewModelFactory(private val startingValue:Int) :ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MyViewModel::class.java)){
            return MyViewModel(startingValue) as T
        }
        throw IllegalStateException("Unable to find view Modal")
    }
}