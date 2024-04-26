package com.postblogapi.springbootcrudexample.service;

import com.postblogapi.springbootcrudexample.entity.Blog;
import com.postblogapi.springbootcrudexample.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {
    @Autowired
    private BlogRepository repository;

    public Blog saveBlog(Blog blog){
      return repository.save(blog);
    }
    public List<Blog> saveblog(List<Blog> blog){
        return repository.saveAll(blog);
    }

    public  List<Blog>getBlogs(){
        return repository.findAll();
    }
    public Blog getBlogById(int id) {
        return repository.findById(id).orElse(null);
    }

        public Blog getBlogByTittle (String tittle){
            return repository.findByTittle(tittle);
        }
        public  String deleteBlog(int id){
                repository.deleteById(id);
                return " blog berhasil dihapus "+id;

    }
    public Blog updateBlog(Blog blog){
     Blog exixstingBlog=repository.findById(blog.getId()).orElse(null);
     exixstingBlog.setTittle(blog.getTittle());
     exixstingBlog.setBody(blog.getBody());
     exixstingBlog.setAuthor(blog.getAuthor());
     return repository.save(exixstingBlog);
    }

}
