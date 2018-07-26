package kekproject.kekproject2.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @Column(name = "comment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User author;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post parenPost;

    @Column(name = "reply_id")
    private int replyTo;

    @Column(name = "content", columnDefinition = "text", nullable = false, length = 3000)
    private String content;

    @Column(name = "post_date", nullable = false)
    private Date postedOn;

    @Column(name = "last_edit")
    private Date lastEdit;

    @Column(name = "is_edited")
    private boolean isEdited;

    public Comment(){}

    public Comment(User author, Post parenPost, int replyTo, String content, Date postedOn, Date lastEdit, boolean isEdited) {
        this.author = author;
        this.parenPost = parenPost;
        this.replyTo = replyTo;
        this.content = content;
        this.postedOn = postedOn;
        this.lastEdit = lastEdit;
        this.isEdited = isEdited;
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

    public void setAuthorId(User author) {
        this.author = author;
    }

    public Post getParenPost() {
        return parenPost;
    }

    public void setParenPost(Post parenPost) {
        this.parenPost = parenPost;
    }

    public int getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(int replyTo) {
        this.replyTo = replyTo;
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
}
