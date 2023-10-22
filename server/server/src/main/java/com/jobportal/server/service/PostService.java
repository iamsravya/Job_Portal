package com.jobportal.server.service;

import com.jobportal.server.dto.PostDTO;
import com.jobportal.server.model.PostModel;

import java.util.List;

public interface PostService {

    public PostModel savePost(PostDTO postDTO);

    public List<PostModel> getAllPosts();
}
