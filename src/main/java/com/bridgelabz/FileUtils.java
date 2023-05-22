package com.bridgelabz;
import java.io.File;
public class FileUtils {
    public static boolean deleteFiles(File contensToDelete){
        File[] allContents = contensToDelete.listFiles();
        if(allContents!=null) {
            for (File file : allContents) {
                deleteFiles(file);
            }
        }
        return contensToDelete.delete();
    }
}
