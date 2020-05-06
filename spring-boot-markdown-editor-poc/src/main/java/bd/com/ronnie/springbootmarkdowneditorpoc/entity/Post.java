package bd.com.ronnie.springbootmarkdowneditorpoc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 5, max = 1023)
    private String title;

    @NotNull
    @Column(columnDefinition = "TEXT")
    private String htmlContent;

    @NotNull
    @Column(columnDefinition = "TEXT")
    private String markdownContent;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;

    private Instant createdAt;

    public static Post newWithDefaults() {
        Post post = new Post();
        post.status = Status.INACTIVE;
        post.createdAt = Instant.now();
        return post;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(String content) {
        this.htmlContent = content;
    }

    public String getMarkdownContent() {
        return markdownContent;
    }

    public void setMarkdownContent(String markdownContent) {
        this.markdownContent = markdownContent;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public enum Status {ACTIVE, DRAFT, INACTIVE}

}
