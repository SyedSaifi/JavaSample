package com.example.Filehandling;

import java.io.File;

public class DeleteFolderRecursively {
	 
    public static void main(String[] args) {
        String folder = "D:\\TestJjar\\bega.txt\\ega.txt";
        String path = folder.substring(0,folder.lastIndexOf("\\"));
        System.out.println(path);
        recursiveDelete(new File(path));
    }
     
    public static void recursiveDelete(File file) {
        if (!file.exists())
            return;
         
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                recursiveDelete(f);
            }
        }
        file.delete();
        System.out.println("Deleted file/folder: "+file.getAbsolutePath());
    }
 
}