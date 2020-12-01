package com.example.myapplication

class Student(course:SchoolCourse,friend:Friend) {
    val course: SchoolCourse = SchoolCourse();
    val friend: Friend = Friend();

    fun studFun()
    {
        course.study()
        friend.hangout()
    }
}

class SchoolCourse {
    fun study() {
        println("study")
    }
}

class Friend {
    fun hangout() {
        println("hangout")
    }
}