package ru.netology;


import java.io.IOException;

public class Main {

    private static final int PORT = 9999;

    public static void main(String[] args) {

        Server server = new Server(64);


        server.addHandler("GET", "/messages", (request, responseStream) -> {
            try {
                server.responseWithoutContent(responseStream, "200", "OK");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        server.addHandler("POST", "/messages", ((request, responseStream) -> server.responseWithoutContent(responseStream, "500", "Service Unavailable")));

        server.addHandler("GET", "/", ((request, outputStream) -> server.defaultHandler(outputStream, "index.html")));


        server.start(PORT);
    }
}

