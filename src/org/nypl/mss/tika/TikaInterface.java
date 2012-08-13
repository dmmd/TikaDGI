package org.nypl.mss.tika;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class TikaInterface {
    private static ArrayList<File> files;

    private static void testDir(String fileIn) {
        files = new ArrayList<File>(Arrays.asList(new File(fileIn).listFiles()));
    }
    
    TikaInterface(){

    }
    
    public static void main(String[] args){
        testDir("files");
        TikaInterface ti = new TikaInterface();
    }
}