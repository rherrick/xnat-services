package org.nrg.xnat.web.application;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Implements shutdown functions for the XNAT application.
 */
@Slf4j
public class XnatShutdown {
    public static void main(String[] args) throws IOException {
        log.debug("Stopping application at default settings");
        try (final Socket socket = new Socket("localhost", 8005)) {
            if (socket.isConnected()) {
                try (final PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {
                    writer.println("shutdown-xnat");
                }
            }
        }
    }
}