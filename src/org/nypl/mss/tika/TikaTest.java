package org.nypl.mss.tika;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class TikaTest {
    private final ArrayList<File> files;

    public TikaTest() throws IOException {
        files = new ArrayList<File>(Arrays.asList(new File("files").listFiles()));
        
        for(File file: files){
            TikaInterface ti = new TikaInterface(file);
        }
    }
    
    public static void main(String[] args) throws IOException{
        TikaTest tt = new TikaTest();
    }
    
}
