package parkhaus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Die Klasse ParkKonfig enthaelt alle Funktionaliteanten zum  
 *    Umgang mit der Konfigurationsdatei der Parkhaus Uebung
 * @author ForouzanShebli
 */
public class ParkKonfig {
      // Konstanten ( Attribute mit final )
      // Attribute
      //private String path = "C:\\Users\\ForouzanShebli\\";
      private String path = ".\\";
      private String file = "parkhaus.conf";
      private File f = null;
      private int etagen = 1;
      private int plaetze = 1;
      
      // Konstruktoren 
      public ParkKonfig(String path, String file ){
            this.path = path;
            this.file = file;
      }
      public ParkKonfig() {
      }
      // Schnittstellen Methoden
      public boolean readFile() {
            boolean retVal = true; // kein Fehler
            String line = "";
            String[] input;
            File f = null;
            BufferedReader br = null;
            // 1. Datei oeffnen
            f = new File(path+file);
            // 2. Datei auf Existenz pruefen
            if(f.exists()){
                  retVal = false;
                  try {
            // 3. Datei auslesen
            br = new BufferedReader(
                      new InputStreamReader
                        (new FileInputStream(path+file)));
            do {
                 line = br.readLine();    // z.B. "[etagen] 15"
                 if(line == null) continue;
                 input = line.split(" "); // z.B. input[0]="[etagen]", input[1]= "15"
                 switch(line){
                       case "[etagen]": this.etagen = Integer.parseInt(input[1]);
                              break;
                       case "[plaetze]": this.plaetze = Integer.parseInt(input[1]);
                              break;
                       default: ; // Kommentarazeile ueberlesen
                 }
            } while (line!= null);
                   
            // 4. Datei schliessen
            br.close();
            }catch (Exception e) {
                        System.out.println("Fehler bei Zugriff auf Konfigurationdatei "
                                                + e.getMessage());
                  }
            }
            return  retVal;
      }
      public int getEtagen(){
            return this.etagen;
      }
      public int getPlaetze(){
            return this.plaetze;
      }
      
}
