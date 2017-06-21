package com.example.Filehandling;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import static java.nio.file.FileVisitResult.CONTINUE;

public class DeleteFileDirectory {

	public static void main(String[] args) {
		String path="D:\\TestJjar\\ega.txt\\ega.txt";
		deleteDirectory(path);
		deleteDirectory("D:\\TestJjar\\bega.txt\\bega.txt");
	}
	
	public static void deleteDirectory(String path)
    {
        if(path == null)
        {
            return;
        }
        Path dir = Paths.get(path);
        try
        {
            Files.walkFileTree(dir, new SimpleFileVisitor<Path>()
            {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
                    throws IOException
                {                    
                    Files.delete(file);
                    return CONTINUE;
                }
                @Override
                public FileVisitResult postVisitDirectory(Path dir, IOException exc)
                    throws IOException
                {                    
                    if (exc == null)
                    {
                        Files.delete(dir);
                        return CONTINUE;
                    }
                    else
                    {
                        throw exc;
                    }
                }

            });
        }
        catch (IOException e)
        {
        	System.out.println(e.getMessage());
        }
    }

}
