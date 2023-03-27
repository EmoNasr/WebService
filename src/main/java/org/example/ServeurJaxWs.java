package org.example;

import jakarta.xml.ws.Endpoint;

public class ServeurJaxWs {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:5252/",new Converter());
    }
}