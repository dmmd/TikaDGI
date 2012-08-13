package org.nypl.mss.tika;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class TikaInterface {
    
    private static ArrayList<File> files;
    private File currentFile;

    
    TikaInterface(String fileIn) throws IOException{
        files = new ArrayList<File>(Arrays.asList(new File(fileIn).listFiles()));
        
        for(File file: files){
            System.out.println(file.getName());
            getType(file);
            getLanguage(file);
            //getMetadata();
            //getText()
            System.out.println();
        }
    }


    private void getType(File file) throws IOException {
        TikaType tt = new TikaType(file);
        System.out.println("tikaId: " + tt.getType());
    }
    
    private void getLanguage(File file) throws IOException {
        TikaLanguage tl = new TikaLanguage(file);
        System.out.println("tikaLanguage: " + tl.getLanguage());
    }
    
        
    public static void main(String[] args) throws IOException{
        TikaInterface ti = new TikaInterface("files");
    }
}