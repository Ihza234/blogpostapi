package com.postblogapi.springbootcrudexample.repository;


import com.postblogapi.springbootcrudexample.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,Integer> {
    Blog findByTittle(String tittle);
}
