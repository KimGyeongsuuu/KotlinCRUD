package com.example.kotlincrud.presentation.dto.request

import com.example.kotlincrud.entity.Post
import javax.validation.constraints.NotBlank


class WritePostRequest(
    @NotBlank
    var title:String,
    @NotBlank
    var content:String,
    @NotBlank
    var writer:String)
{
    fun toEntity(): Post = Post(
        title = title,
        content = content,
        writer = writer
    )
}