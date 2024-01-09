package com.example.demo.post;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.*;

@Controller
public class PostController {
    private PostService postService;

    PostController() {
        this.postService = new PostService();
    }

//    사용턴에게 data return

    @GetMapping("/csr/json")
//    @CrossOrigin(origins = "http://127.0.0.1:5500/") //해당 메소드에 한해서만 적용됨! -> 별도의 코드 필요 (@ CorsConfig.java file)
    @ResponseBody
    public List<Post> findAll() {
        return this.postService.findAll();
    }
    //    사용턴에게 화면 +data return
    @GetMapping("/ssr")
    public String findAllSSR(Model model) {
        List<Post> posts = postService.findAll();
        model.addAttribute("posts", posts);
        return "post_list";
    }
}