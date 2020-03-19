package com.distributedsystems;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Broker {
    public static void main(String args[]) {
        new Broker().openServer();
    }

    ServerSocket providerSocket;
    Socket connection = null;

    void openServer() {
        try {

            providerSocket = new ServerSocket(4321, 10);

            while (true) {
                connection = providerSocket.accept();
                System.out.println("Client connected.");
                publisher add=new publisher (connection)
                System.out.println("Handler created.");
                new Thread(add).start();
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                providerSocket.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}
