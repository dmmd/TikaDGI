/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nypl.mss.tika;

import java.io.*;
import org.apache.tika.Tika;
import org.apache.tika.language.ProfilingWriter;

public class TikaLanguage {
    private final File file;
    private String language;
    private Tika tika;
    
    TikaLanguage(File file, Tika tika) throws FileNotFoundException, IOException{
        this.file = file;
        this.tika = tika;
        parse(file);
    }
    
    private void parse(File file) throws FileNotFoundException, IOException{
       BufferedReader reader = new BufferedReader(tika.parse(new FileInputStream(file)));
       ProfilingWriter pw = new ProfilingWriter();
       
       String line;
       while((line = reader.readLine()) != null){
           pw.append(line);
       }

       if(pw.getProfile().getCount() > 0){
           language = pw.getLanguage().getLanguage();
       }
       else
           language = null;
    }
    
    public String getLanguage(){
        return language;
    }
    
}
