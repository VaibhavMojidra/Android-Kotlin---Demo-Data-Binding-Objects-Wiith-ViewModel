package com.vaibhavmojidra.databindingobjectswiithviewmodelkotlin

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel(staringValue:Int) :ViewModel() {
    var count=MutableLiveData<Int>(0)
    init {
        count.value=staringValue
    }
    fun updateValue(){
        count.value=count.value?.plus(1)
    }
}