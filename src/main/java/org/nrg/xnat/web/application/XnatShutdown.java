package org.nrg.xnat.web.application;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class XnatShutdown {
    public static void main(String[] args) throws IOException {
        try (final Socket socket = new Socket("localhost", 8005)) {
            if (socket.isConnected()) {
                try (final PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {
                    writer.println("shutdown-xnat");
                }
            }
        }
    }
}