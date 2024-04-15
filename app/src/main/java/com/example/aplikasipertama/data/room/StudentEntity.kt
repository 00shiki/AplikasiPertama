package com.example.aplikasipertama.data.room

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.aplikasipertama.model.Student

@Entity(tableName = "students")
data class StudentEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long? = 0,
    val name: String,
    val major: String
)

fun StudentEntity.toModel() = Student(
    id,
    name,
    major
)