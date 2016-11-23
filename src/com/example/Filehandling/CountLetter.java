package com.example.Filehandling;

import java.io.*;
import java.nio.file.*;

public class CountLetter {
    private char lookFor;
    private Path file;

    CountLetter(char lookFor, Path file) {
        this.lookFor = lookFor;
        this.file = file;
    }

    public int count() throws IOException {
        int count = 0;
        try (InputStream in = Files.newInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(in)))
            {
            String line = null;
            while ((line = reader.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (lookFor == line.charAt(i)) {
                        count++;
                    }
                }
            }
        } catch (IOException x) {
            System.err.println(x);
        }
        return count;
    }

    public static void main(String[] args) throws IOException {

        char lookFor = 'E';
        Path file = Paths.get("D:/Projects/TestWorkspace/JavaSample/src/com/example/blob/p1.xml");
        int count = new CountLetter(lookFor, file).count();
        System.out.format("File '%s' has %d instances of letter '%c'.%n",
                file, count, lookFor);
    }
}