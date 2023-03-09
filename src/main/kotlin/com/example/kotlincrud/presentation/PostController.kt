package com.example.kotlincrud.presentation

import com.example.kotlincrud.entity.Post
import com.example.kotlincrud.presentation.dto.request.WritePostRequest
import com.example.kotlincrud.service.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/board")
class PostController @Autowired constructor(val postService: PostService) {
    @PostMapping
    fun writePost(@RequestBody writePostRequest: WritePostRequest): ResponseEntity<Void>{
        postService.write(writePostRequest)
        return ResponseEntity.ok().build()
    }
    @GetMapping
    fun viewPost():ResponseEntity<List<Post>>{
        val posts = postService.view()
        return ResponseEntity.ok(posts)
    }
    @GetMapping("/{id}")
    fun viewPostById(@PathVariable id:Long) : ResponseEntity<Post>{
        val post = postService.viewById(id)
        return ResponseEntity.ok(post)
    }
    @PatchMapping("/{id}")
    fun updatePost(@PathVariable id:Long,@RequestBody writePostRequest: WritePostRequest): ResponseEntity<Void>{
        postService.update(id,writePostRequest)
        return ResponseEntity.ok().build()
    }
}