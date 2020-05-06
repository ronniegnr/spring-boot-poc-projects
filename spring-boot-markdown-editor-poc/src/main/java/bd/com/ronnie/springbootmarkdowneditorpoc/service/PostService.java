package bd.com.ronnie.springbootmarkdowneditorpoc.service;

import bd.com.ronnie.springbootmarkdowneditorpoc.entity.Post;
import bd.com.ronnie.springbootmarkdowneditorpoc.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    public Iterable<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post getPost(Long postId) {
        return postRepository.findById(postId)
                .orElseThrow();
    }
}
