package bd.com.ronnie.springbootmarkdowneditorpoc.service;

import bd.com.ronnie.springbootmarkdowneditorpoc.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

}
