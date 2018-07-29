package kekproject.kekproject2.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @Column(name = "post_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    @Column(name = "title", length = 300, nullable = false)
    private String title;

    @Column(name = "content", columnDefinition = "TEXT", length = 3000, nullable = false)
    private String content;

    @Column(name= "posted_on", nullable = false)
    private Date postedOn;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "last_edited")
    private Date lastEdit;

    @Column(name = "is_edited")
    private boolean isEdited;

    @OneToMany(mappedBy = "parenPost")
    private List<Comment> comments;

    public Post(){}

    public Post(User author, String title, String content, Date postedOn, Category category, Date lastEdit, boolean isEdited, List<Comment> comments) {
        this.author = author;
        this.title = title;
        this.content = content;
        this.postedOn = postedOn;
        this.category = category;
        this.lastEdit = lastEdit;
        this.isEdited = isEdited;
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(Date postedOn) {
        this.postedOn = postedOn;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getLastEdit() {
        return lastEdit;
    }

    public void setLastEdit(Date lastEdit) {
        this.lastEdit = lastEdit;
    }

    public boolean isEdited() {
        return isEdited;
    }

    public void setEdited(boolean edited) {
        isEdited = edited;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
