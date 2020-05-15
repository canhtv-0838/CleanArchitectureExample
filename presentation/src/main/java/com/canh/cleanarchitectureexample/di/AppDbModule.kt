package com.canh.cleanarchitectureexample.di

import com.canh.data.local.db.createNoteDao
import org.koin.dsl.module

val dbModule = module {
    single { createNoteDao(get()) }
}
