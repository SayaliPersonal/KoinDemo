package com.example.myapplication

import org.koin.dsl.module

val presentationModule = module {
    single { Student(get(),get()) }
    single { Friend() }
    single { SchoolCourse() }
}