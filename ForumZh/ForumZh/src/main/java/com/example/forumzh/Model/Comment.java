package com.example.forumzh.Model;

public class Comment {
    private String content;
    private int authorId;


    public Comment(String content, int authorId) {
        this.content = content;
        this.authorId = authorId;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
}
