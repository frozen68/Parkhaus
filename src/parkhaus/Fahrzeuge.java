package parkhaus;

public class Fahrzeuge {
    // Attribute
    private String kfzId;
    private String type;
    private Parkplatz platz;
    // Konstruktoren
    public Fahrzeuge(String kfzId, String type, Parkplatz platz) {
          this.kfzId = kfzId;
          this.type = type;
          this.platz = platz;
    }
    public Fahrzeuge(String kfzId, String type) {
          this.kfzId = kfzId;
          this.type = type;
          this.platz = null;
    }
    public Fahrzeuge() {
          this.kfzId = "";
          this.type = "";
          this.platz = null;
    }
    // Datenschnittstellen Methoden Getter/Setter
      public String getKfzId() {
            return kfzId;
      }
      public void setKfzId(String kfzId) {
            this.kfzId = kfzId;
      }
      public String getType() {
            return type;
      }
      public void setType(String type) {
            this.type = type;
      }
      public Parkplatz getPlatz() {
            return platz;
      }
      public void setPlatz(Parkplatz platz) {
            this.platz = platz;
      }
    // Oeffentliche Methoden  
    /**
     * Die Methode add() erweitert dynamisch das uebergebene Array um 
     *      das aktuelle Objekt (this).
     * @param array zu erweiterndes Array 
     * @return      erweitertes Array oder null im Fehlerfall
     */  
    public Fahrzeuge[] add(Fahrzeuge[] array) {
        Fahrzeuge[] retVal = null;
        int i = 0;
        if(array == null){
            array = new Fahrzeuge[0];
        }
              // neues Array erzeugen
           if(array.length == 0){
                 retVal = new Fahrzeuge[1];
           } else {
                 retVal = new Fahrzeuge[array.length +1];
           }
           // neues Array befuellen
           for(i=0; i<array.length; i++){
                 retVal[i] = array[i]; // altes Array kopiert
           }
           retVal[i] = this; // neues Objekt anfuegen
        return retVal;
    }
}
