package com.canh.cleanarchitectureexample.di

import com.canh.domain.usecase.AddNoteUseCase
import org.koin.dsl.module

val usecaseModule = module {
    single { AddNoteUseCase(get()) }
}
