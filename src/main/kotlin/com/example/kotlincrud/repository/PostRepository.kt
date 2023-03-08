package com.example.kotlincrud.repository

import com.example.kotlincrud.entity.Post
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PostRepository: JpaRepository<Post,Long> {
}