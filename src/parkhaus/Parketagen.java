package parkhaus;

public class Parketagen {
      // Attribute

      private int anzahlPlaetze;
      private int etagenNr;
      private Parkplatz[] parkplaetze;
      private boolean voll;
      // Konstruktoren 

      public Parketagen(int anzP, int eNr, Parkplatz[] array) {
            this.anzahlPlaetze = anzP;
            this.etagenNr = eNr;
            this.parkplaetze = array;
            this.voll = false;
      }

      public Parketagen() {
            this.anzahlPlaetze = 0;
            this.etagenNr = 0;
            this.parkplaetze = null;
            this.voll = false;

      }
      // Datenschnittstellen Methoden Getter/Setter

      public int getAnzahlPlaetze() {
            return anzahlPlaetze;
      }

      public void setAnzahlPlaetze(int anzahlPlaetze) {
            this.anzahlPlaetze = anzahlPlaetze;
      }

      public int getEtagenNr() {
            return etagenNr;
      }

      public void setEtagenNr(int etagenNr) {
            this.etagenNr = etagenNr;
      }

      public Parkplatz[] getParkplaetze() {
            return parkplaetze;
      }

      public void setParkplaetze(Parkplatz[] parkplaetze) {
            this.parkplaetze = parkplaetze;
      }

      public boolean isVoll() {
            return voll;
      }

      public void setVoll(boolean voll) {
            this.voll = voll;
      }
      // Oeffentliche Methoden

      /**
       * Die Methode add() erweitert dynamisch das uebergebene Array um das aktuelle Objekt (this).
       *
       * @param array zu erweiterndes Array
       * @return erweitertes Array oder null im Fehlerfall
       */
      public Parketagen[] add(Parketagen[] array) {
            Parketagen[] retVal = null;
            int i = 0;
            if (array == null) {
                  array = new Parketagen[1];
            }
            // neues Array erzeugen
            if (array.length == 0) {
                  retVal = new Parketagen[1];
            } else {
                  retVal = new Parketagen[array.length + 1];
            }
            // neues Array befuellen
            for (i = 0; i < array.length; i++) {
                  retVal[i] = array[i]; // altes Array kopiert
            }
            retVal[i] = this; // neues Objekt anfuegen

            return retVal;
      }

      /**
       * Die Methode freiePlaetze() liefert die Anzahl der freien Parkplaetze die aktuellen Etage.
       *
       * @return Anzahl der freien Plaetze der Etage
       */
      public int freiePlaetze() {
            int retVal = 0;
            for (int i = 0; i < parkplaetze.length; i++) {
                  if (!parkplaetze[i].isBesetzt()) {
                        retVal++;
                  }
            }
            return retVal;
      }
}
