package com.postblogapi.springbootcrudexample.controller;

import com.postblogapi.springbootcrudexample.entity.Blog;
import com.postblogapi.springbootcrudexample.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BlogController {
    @Autowired
    private BlogService service;

    @PostMapping("/addProduct")
    public Blog addBlog(@RequestBody Blog blog){
        return service.saveBlog(blog);

    }
    @PostMapping("/addProducts")
    public List<Blog> addBlogs(@RequestBody List<Blog> blogs){
        return service.saveblog(blogs);
    }
    @GetMapping("/products")
    public  List<Blog>findAllBlogs(){
        return service.getBlogs();
    }
    @GetMapping("/blog/{id}")
    public Blog findBlogById(@PathVariable int id){
        return service.getBlogById(id);
    }
    @PostMapping("/blog/{tittle}")
    public Blog findBlogByTittle(@PathVariable String tittle) {
        return service.getBlogByTittle(tittle);
    }
    @PutMapping("/update")
    public Blog updateBlog(@RequestBody Blog blog) {
        return service.updateBlog(blog);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBlog(@PathVariable int id){
        return service.deleteBlog(id);
    }
}
