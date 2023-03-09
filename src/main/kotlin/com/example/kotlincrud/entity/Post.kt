package com.example.kotlincrud.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Post(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var title: String,
    var content: String,
    var writer: String
    ){
    fun update(title:String, content:String){
        this.title = title
        this.content = content
    }

}