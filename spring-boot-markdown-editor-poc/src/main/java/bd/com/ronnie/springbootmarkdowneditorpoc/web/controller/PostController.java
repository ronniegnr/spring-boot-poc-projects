package bd.com.ronnie.springbootmarkdowneditorpoc.web.controller;

import bd.com.ronnie.springbootmarkdowneditorpoc.entity.Post;
import bd.com.ronnie.springbootmarkdowneditorpoc.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static bd.com.ronnie.springbootmarkdowneditorpoc.constant.ViewConstant.POST_DETAIL_VIEW;
import static bd.com.ronnie.springbootmarkdowneditorpoc.constant.ViewConstant.POST_ENTRY_VIEW;
import static bd.com.ronnie.springbootmarkdowneditorpoc.constant.ViewConstant.POST_LIST_VIEW;
import static bd.com.ronnie.springbootmarkdowneditorpoc.utility.MarkdownUtility.markdownToHTML;

@RequestMapping("posts")
@Controller
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("list")
    public String getList(Model model) {
        Iterable<Post> posts = postService.getAllPosts();
        model.addAttribute("posts", posts);
        return POST_LIST_VIEW;
    }

    @GetMapping("entry")
    public String getEntry() {
        return POST_ENTRY_VIEW;
    }

    @PostMapping("entry")
    public String postEntry(@RequestParam String title, @RequestParam(value = "text-editor-markdown-doc") String markdownContent, @RequestParam Post.Status status) {
        String htmlContent = markdownToHTML(markdownContent);
        Post post = Post.newWithDefaults();
        post.setTitle(title);
        post.setMarkdownContent(markdownContent);
        post.setHtmlContent(htmlContent);
        post.setStatus(status);
        postService.savePost(post);
        return "redirect:/posts/entry";
    }

    @GetMapping("detail")
    public String getDetail(@RequestParam(name = "post_id") Long postId, Model model) {
        Post post = postService.getPost(postId);
        model.addAttribute("post", post);
        return POST_DETAIL_VIEW;
    }

}
