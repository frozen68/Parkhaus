package parkhaus;

public class Parkplatz {
    // Attribute
    private int nummer;
    private boolean besetzt;
    private Parketagen etage;
    //Konstruktoren
    public Parkplatz(Parketagen etage) {
          this.nummer = 0;
          this.besetzt = false;
          this.etage = etage;
    }
    public Parkplatz(Parketagen etage, int num) {
          this.nummer = num;
          this.besetzt = false;
          this.etage = etage;
    }
    public Parkplatz() {
          this.nummer = 0;
          this.besetzt = false;
          this.etage = null;
    }
    // Datenschnittstellen Methoden Getter/Setter
      public int getNummer() {
            return nummer;
      }
      public void setNummer(int nummer) {
            this.nummer = nummer;
      }
      public boolean isBesetzt() {
            return besetzt;
      }
      public void setBesetzt(boolean besetzt) {
            this.besetzt = besetzt;
      }
      public Parketagen getEtage() {
            return etage;
      }
      public void setEtage(Parketagen etage) {
            this.etage = etage;
      }
    // Oeffentliche Methoden
    /**
     * Die Methode add() erweitert dynamisch das uebergebene Array um 
     *      das aktuelle Objekt (this).
     * @param array zu erweiterndes Array 
     * @return      erweitertes Array oder null im Fehlerfall
     */
    public Parkplatz[] add(Parkplatz[] array) {
        Parkplatz[] retVal = null;
        int i = 0;
        if(array == null){
              array = new Parkplatz[0];
        }
              // neues Array erzeugen
           if(array.length == 0){
                 retVal = new Parkplatz[1];
           } else {
                 retVal = new Parkplatz[array.length +1];
           }
           // neues Array befuellen
           for(i=0; i<array.length; i++){
                 retVal[i] = array[i]; // altes Array kopiert
           }
           retVal[i] = this; // neues Objekt anfuegen
        return retVal; 
    }
}
