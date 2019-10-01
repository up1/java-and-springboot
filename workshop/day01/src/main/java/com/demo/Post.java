package com.demo;

public class Post {

    private int id;
    private String name;

    public static int counter = 0;

    public Post(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Test2 {
    public static void main(String[] args) {
        Post post1 = new Post(1, "post 1");
        Post post2 = new Post(1, "post 1");
        Post.counter++;
        System.out.println(post1.counter);
        Post.counter = 100;
        System.out.println(post2.counter);
        System.out.println(Post.counter);
    }
}
