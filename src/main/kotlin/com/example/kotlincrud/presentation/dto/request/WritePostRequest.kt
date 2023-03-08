package com.example.kotlincrud.presentation.dto.request

import com.example.kotlincrud.entity.Post


class WritePostRequest(
    var title:String,
    var content:String,
    var writer:String)
{
    fun toEntity(): Post = Post(
        title = title,
        content = content,
        writer = writer
    )
}