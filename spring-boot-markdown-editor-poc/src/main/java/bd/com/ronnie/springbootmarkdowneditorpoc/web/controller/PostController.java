package bd.com.ronnie.springbootmarkdowneditorpoc.web.controller;

import bd.com.ronnie.springbootmarkdowneditorpoc.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static bd.com.ronnie.springbootmarkdowneditorpoc.constant.ViewConstant.POST_DETAIL_VIEW;
import static bd.com.ronnie.springbootmarkdowneditorpoc.constant.ViewConstant.POST_ENTRY_VIEW;
import static bd.com.ronnie.springbootmarkdowneditorpoc.constant.ViewConstant.POST_LIST_VIEW;

@RequestMapping("posts")
@Controller
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("list")
    public String getList() {
        return POST_LIST_VIEW;
    }

    @GetMapping("entry")
    public String getEntry() {
        return POST_ENTRY_VIEW;
    }

    @PostMapping("entry")
    public String postEntry() {
        return POST_ENTRY_VIEW;
    }

    @GetMapping("detail")
    public String getDetail() {
        return POST_DETAIL_VIEW;
    }

}
