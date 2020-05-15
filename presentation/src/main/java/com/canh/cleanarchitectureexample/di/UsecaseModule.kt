package com.canh.cleanarchitectureexample.di

import com.canh.domain.usecase.AddNoteUseCase
import com.canh.domain.usecase.GetNotesUseCase
import org.koin.dsl.module

val usecaseModule = module {
    single { AddNoteUseCase(get()) }
    single { GetNotesUseCase(get()) }
}
