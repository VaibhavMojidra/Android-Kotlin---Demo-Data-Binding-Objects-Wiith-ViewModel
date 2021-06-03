package com.vaibhavmojidra.databindingobjectswiithviewmodelkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.vaibhavmojidra.databindingobjectswiithviewmodelkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MyViewModel
    private lateinit var viewModelFactory: MyViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModelFactory= MyViewModelFactory(5)
        viewModel=ViewModelProvider(this,viewModelFactory).get(MyViewModel::class.java)
        binding.myViewModal=viewModel
        viewModel.count.observe(this,{
            binding.result.text = it.toString()
        })

    }
}