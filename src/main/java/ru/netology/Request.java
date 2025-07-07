package ru.netology;

public class Request {

    private final String method;
    private final String path;
    private Request request;

    public Request(String method, String path) {
        this.method = method;
        this.path = path;
    }

    public Request getRequest() {
        return request;
    }

    public void getHeaders() {
    }

    public void getBody() {
    }

    public String getMethod() {
        return method;
    }

    public String getPath() {
        return path;
    }
}
