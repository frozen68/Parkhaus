package parkhaus;

import java.security.KeyFactory;

public class Parkhaus {
    // Attribute
    private int anzahlEtagen = 1;
    private Parketagen[] etagen = null;
    private Fahrzeuge[] fahrzeuge = null;
    private Main parent = null;
    private ParkInfo pInfo = null;
    
    // Oeffentliche Methoden
    public void belegung(Main parent){
        this.parent = parent;
        pInfo=new ParkInfo(parent, true);
        pInfo.refresh(getParkitems());
        pInfo.setVisible(true);
    }
    /**
     * Fie Methode einfahren() erzeugt und regestriert ein Objekt der Klasse 
     *      Fahrzeuge unter Verwendung der uebergebene Informationen und weist 
     *      dem Fahrzeug seinen Platz zu.
     * @param kfzId  Fahrzeug Kennzeichen
     * @param typ    Fahrzeugart (z.B. Auto, Motorrad)   
     * @param platz  Parkplatz in der Garage
     */
    void einfahren(String kfzId, String typ, Parkplatz platz){
          int i = 0;
          // 1. Fahrzeug erstellen
          Fahrzeuge kfz = new Fahrzeuge(kfzId, typ, platz);
          // 2. Fahrzeug registieren
          if(fahrzeuge == null){
                fahrzeuge = kfz.add(fahrzeuge); // Erstes Fahrzeug registrieren
          }else{
                for(i=0; i<fahrzeuge.length; i++){
                      if(fahrzeuge[i]==null){
                            fahrzeuge[i] = kfz;
                            break;
                      }
                }
                if(i==fahrzeuge.length){ 
                      fahrzeuge = kfz.add(fahrzeuge); // Feld anfuengen und Fahrzeug registrieren 
                }
          }
          // 3. Parkplatz belegen
          platz.setBesetzt(true);
          // 4. Etagen Status aendern
          if(platz.getEtage().freiePlaetze() == 0)
            platz.getEtage().setVoll(true);
    }
    /**
     * Die Methode zuweisen() liefert den naechsten freien Parkplatz oder 
     *      den Wert null im Fehlerfall.
     * @return Parkplatz-ID oder null
     */
    public Parkplatz zuweisen() {
        Parkplatz retVal = null;
        Parkplatz[] pz = null;
        if(freiePlaetze()!= 0){ // Wenn noch Parkplaetze frei sind...
             for(int e=0; e<etagen.length; e++){
                   pz = etagen[e].getParkplaetze();
                   for(int p=0; p<pz.length; p++){
                         if(!pz[p].isBesetzt()){
                               retVal = pz[p];
                               break;
                         }
                   }
                   // Abbruck
                   if(retVal != null)  
                         break;
             } 
        }
        return retVal;
    }
    /**
     * Die Methode verlassen() entfernt das ubergebene Fahrzeuge Objekt aus
     *      dem Parkhaus. Der Parkplatz wird wieder freigegebender Etagen-Status 
     *      angepasst.
     * @param kfz objektreferenz des verlassenden Fahrzeuges
     * @return    objektreferenz kfz oder null im Fehlerfall
     */
    public Fahrzeuge verlassen(Fahrzeuge kfz) {
        Fahrzeuge retVal = kfz;
        if(kfz!=null) {
        // 1. KFZ suchen und Platz freigeben
        kfz.getPlatz().setBesetzt(false);
        // 2. Etage freigeben
        kfz.getPlatz().getEtage().setVoll(false);
        // 3. KFZ aus Array fahrzeuge entfernen
        for(int i=0; i<fahrzeuge.length; i++){
              if(kfz == fahrzeuge[i]){
                    fahrzeuge[i] = null; // KFZ entfernen
                    break;
              }
        }
        }
        return retVal;
    }
    /**
     * Die Methode verlassen() entfernt das Fahrzeug mit der ubergebenen 
     *      Fahrzeugekennzeichen(kfzID) Objekt aus dem Parkhaus. 
     *      Der Parkplatz wird wieder freigegebender Etagen-Status angepasst.
     * @param kfzId Fahrzeugekennzeichen des verlassenden Fahrzeuges
     * @return      objektreferenz des Fahrzeuges oder null im Fehlerfall
     */
    public Fahrzeuge verlassen(String kfzId) {
          return (verlassen(sucheKfz(kfzId)));
    }
    /**
     * Die Methode getPostKfz() liefert die Position eines Fahrzeugs als String
     *      im Format "Etage X Parkplatz Y" oder Leerstring im Fehlerfall
     * @param kfzId Fahrzeugekennzeichen des Fahrzeuges
     * @return      Etage und Platzoder oder ""
     */
    public String getPostKfz(String kfzId) {
        String retVal = "";
        Fahrzeuge kfz;
        // 1.Fahrzeuge Objekt besorgen
        kfz = sucheKfz(kfzId);
        // 2.kfz auf Existenz pruefen
        if(kfz != null){
        // 3.Parkplatznummer ermitteln und in retVal uebernehmen
            retVal = "Parkplatz " + kfz.getPlatz().getNummer();          
        // 4.Etagennummer ermitteln und retVal uebernehmen
            retVal = "Etage " + kfz.getPlatz().getEtage().getEtagenNr() + retVal;
        }
        return retVal;
    }
    /**
     * Die Methode freiePlaetze() liefert die aktuellen Anzahl stand der noch 
     *      nicht belegten Parkpleatz aller Etagen.
     * @return Anzahl freier Parkplaete oder -1 wenn voll.
     */
    public int freiePlaetze() {
        int retVal = 0;
        for(int e=0; e<etagen.length; e++){
              if(!etagen[e].isVoll()){                // Etagen Ueberpruefung aufvoll
                  retVal += etagen[e].freiePlaetze();  // Zaehle freien Parkplatz
              }
        }
        return retVal;
    }  
    // DatenSchnittstellen Methoden
      public int getAnzahlEtagen() {
            return anzahlEtagen;
    }
      public void setAnzahlEtagen(int anzahlEtagen) {
            this.anzahlEtagen = anzahlEtagen;
      }
      public Parketagen[] getEtagen() {
            return etagen;
      }
      public void setEtagen(Parketagen[] etagen) {
            this.etagen = etagen;
      }
      public Fahrzeuge[] getFahrzeuge() {
            return fahrzeuge;
      }
      public void setFahrzeuge(Fahrzeuge[] fahrzeuge) {
            this.fahrzeuge = fahrzeuge;
      }
      // Interne Methoden
      /**
       * Die Methode sucheKfz() sucht anhang des Kennzeichen Strings im 
       *    Array fahrzeuge nach der zugehoerigen Objekt-ID des Fahrzeugs.
       * @param kfzId Zeichenkette mit Fahrzeugkennzeichen
       * @return      Liefert Objekt-ID oder im Fehlerfall null
       */
      private Fahrzeuge sucheKfz(String kfzId) {
            Fahrzeuge retVal = null;
            if(fahrzeuge != null){ // Pruefe Array auf Existenz
                  for(int i=0; i<fahrzeuge.length; i++){
                  //if(fahrzeuge[i] == null) continue; 
                        if(fahrzeuge[i] != null) { // Pruefe Fahrzeuge Obj. auf Existenz
                              if(fahrzeuge[i].getKfzId().equals(kfzId)){
                                    retVal =fahrzeuge[i];
                                    break;
                              }
                        }
                  }
            }
            return retVal;
      }
      /**
       * Die Methode ablehnen() liefert den Wert true falls keine Parkplaetze 
       *    frei sind und sonst false.
       * @return Ja/Nein
       */
    private boolean ablehnen() {
        boolean retVal = true;
        Parkplatz[] pz;
        for(int e=0; e<etagen.length; e++){
              if(!etagen[e].isVoll()){
              pz = etagen[e].getParkplaetze(); // Etagen Parkplatz Array
              for(int p=0; p<pz.length; p++){
                    if(!(pz[p].isBesetzt())){ // Freien Platz gefunden
                          retVal = false;
                          break;
                    }
              }
              if(!retVal) {
                  break;    // Abbruch Etagen-Schleife wenn Platz frei ist.
              } 
        }
        }
        return retVal;
    }

     private Parkitem[] getParkitems() {
        Parkitem[] retVal = null;
        Fahrzeuge[] temp = new Fahrzeuge[0];
        // 1. Array temp befuellen
        for(int i=0; i<fahrzeuge.length; i++){
            if(fahrzeuge[i]!=null){
                // gefundenes KFZ in temp Array einfuegen
                temp = fahrzeuge[i].add(temp);
            }
        }
        // 2. Array fuer retVal in Laenge von Array temp erzeugen
        retVal = new Parkitem[temp.length];
        // 3. Parkplatz ermitteln
        for(int i=0; i<temp.length; i++){
        // 4. Fahrzeuge von temp u. Parkplatz nach retVal uebergeben
            retVal[i] = new Parkitem(temp[i],getPostKfz(temp[i].getKfzId()));
        }
        // 5. Array fahrzeuge reinitialisieren
        this.fahrzeuge = temp;
        return retVal;
    }
}
