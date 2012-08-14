package org.nypl.mss.tika;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.tika.Tika;

public class TikaInterface {
    
    private static ArrayList<File> files;
    private File currentFile;
    private static final Tika tika = new Tika();


    TikaInterface(File file) throws IOException {
        //System.out.println(file.getName());
        getType(file);
        getLanguage(file);
        //getMetadata();
        //getText()
    }


    private void getType(File file) throws IOException {
        TikaType tt = new TikaType(file);
        System.out.println("tikaId: " + tt.getType());
    }
    
    private void getLanguage(File file) throws IOException {
        TikaLanguage tl = new TikaLanguage(file, tika);
        if(tl.getLanguage() != null)
            System.out.println("tikaLanguage: " + tl.getLanguage());
    }
    
    public static void main(String[] args) throws IOException{
        File file = new File(args[0]);
        TikaInterface ti = new TikaInterface(file);
    }
}