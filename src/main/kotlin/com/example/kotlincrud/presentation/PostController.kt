package com.example.kotlincrud.presentation

import com.example.kotlincrud.presentation.dto.request.WritePostRequest
import com.example.kotlincrud.service.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/board")
class PostController @Autowired constructor(val postService: PostService) {
    @PostMapping
    fun writePost(@RequestBody writePostRequest: WritePostRequest): ResponseEntity<Any>{
        val post = postService.write(writePostRequest)
        return ResponseEntity.ok().body(post)
    }
}