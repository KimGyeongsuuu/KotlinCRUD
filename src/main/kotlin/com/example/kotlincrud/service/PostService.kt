package com.example.kotlincrud.service

import com.example.kotlincrud.entity.Post
import com.example.kotlincrud.presentation.dto.request.WritePostRequest
import com.example.kotlincrud.repository.PostRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class PostService @Autowired constructor(
    val postRepository: PostRepository
){
    @Transactional
    fun write(writePostRequest: WritePostRequest): Post = postRepository.save(writePostRequest.toEntity())

    @Transactional
    fun view(): List<Post> = postRepository.findAll()

    @Transactional
    fun viewById(postId:Long): Post = postRepository.findByIdOrNull(postId) ?: throw IllegalArgumentException("게시글을 찾을 수 없습니다.")

}