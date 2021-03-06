package com.canh.cleanarchitectureexample.di

import com.canh.data.NoteRepositoryImpl
import com.canh.domain.repository.NoteRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<NoteRepository> { NoteRepositoryImpl(get(), get()) }
}
