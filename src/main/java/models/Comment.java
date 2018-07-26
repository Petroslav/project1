package models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Comment {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int authorId;
    private int parenPostId;
    private int replyTo;
    private String content;
    private Date postedOn;
    private Date lastEdit;
    private boolean isEdited;

    public Comment(){}

    public Comment(int authorId, int parenPostId, int replyTo, String content, Date postedOn, Date lastEdit, boolean isEdited) {
        this.authorId = authorId;
        this.parenPostId = parenPostId;
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

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getParenPostId() {
        return parenPostId;
    }

    public void setParenPostId(int parenPostId) {
        this.parenPostId = parenPostId;
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
