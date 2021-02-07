package com.pattern.chain;

/**
 * @author Yong
 * @date 2021/2/7
 */
public class Response {
    private final String content;

    public Response(String content) {
        this.content = content;
    }

    public static Response agree() {
        return new Response("同意");
    }

    public static Response disagree() {
        return new Response("不同意");
    }

    @Override
    public String toString() {
        return "Response{" +
                "content='" + content + '\'' +
                '}';
    }
}
