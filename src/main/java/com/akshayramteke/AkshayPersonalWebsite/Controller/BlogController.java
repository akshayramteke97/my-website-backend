package com.akshayramteke.AkshayPersonalWebsite.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/blogs")
@CrossOrigin(origins = "https://akshayramteke97.github.io\")")
public class BlogController {

    @GetMapping
    public List<String> getBlogs() {
        return List.of("Blog 1", "Blog 2", "Blog 3"); // Example data
    }
}
