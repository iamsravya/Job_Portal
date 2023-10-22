package com.jobportal.server.controller;

import com.jobportal.server.constants.APIConstants;
import com.jobportal.server.dto.PostDTO;
import com.jobportal.server.model.PostModel;
import com.jobportal.server.service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin
public class PostController {

    final PostService postService;

    @PostMapping(APIConstants.SAVE_POST)
    public PostModel savePost(@Valid @RequestBody PostDTO postDTORequest) {
        log.info("Saving post #####");
        return this.postService.savePost(postDTORequest);
    }



    @GetMapping(APIConstants.GET_ALL_POSTS)
    public List<PostModel> getAllPosts() {
        log.info("Getting all the posts #####");
        return this.postService.getAllPosts();
    }
}
