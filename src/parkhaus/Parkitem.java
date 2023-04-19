package parkhaus;

/**
 *
 * @author ForouzanShebli
 */
public class Parkitem {
      // Attribut 
      Fahrzeuge kfz = null;
      String so = "";
      // Spezialkonstruktor
      public Parkitem(Fahrzeuge kfz, String standort) {
            this.kfz = kfz;
            this.so = standort;
      }
      public Parkitem() {
      }
      // Getter/Setter
      public Fahrzeuge getKfz() {      
            return kfz; 
      }
      public void setKfz(Fahrzeuge kfz) {
            this.kfz = kfz;
      }
      public String getSo() {
            return so;
      }
      public void setSo(String so) {      
            this.so = so;
      }
      //Ueberladung der Methode toString
      @Override
      public String toString() {
            // Kennenzeichen, Standort
            return kfz.getKfzId() + ""+so; //KO
      }
      /*
      new javax.swing.AbstractListModel<Parkitem>() {
                  Parkitem[] items = new Parkitem[0];
                  public int getSize() { return items.length; }
                  public Parkitem getElementAt(int i) { return items[i];} 
                  public void setItems(Parkitem[] items){
                  this.items=items;}}
      */
}
