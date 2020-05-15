package com.canh.cleanarchitectureexample.di

import com.canh.cleanarchitectureexample.main.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainViewModel(get()) }
}