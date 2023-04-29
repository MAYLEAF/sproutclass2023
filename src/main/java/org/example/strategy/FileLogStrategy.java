package org.example.strategy;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileLogStrategy implements LogStrategy {
    private static BufferedOutputStream bout;


    public FileLogStrategy(String path) throws FileNotFoundException {
        FileOutputStream fout = new FileOutputStream(new File(path),true);
        bout = new BufferedOutputStream(fout);
    }

    @Override
    public void log(String msg) {
        try {
            bout.write(msg.getBytes(), 0, msg.length());
            bout.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
