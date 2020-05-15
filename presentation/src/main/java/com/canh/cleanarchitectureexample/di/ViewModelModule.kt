package com.canh.cleanarchitectureexample.di

import com.canh.cleanarchitectureexample.addnote.AddNoteViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { AddNoteViewModel(get(), get()) }
}