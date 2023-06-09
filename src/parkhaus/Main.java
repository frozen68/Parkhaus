/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkhaus;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author ForouzanShebli
 */
public class Main extends javax.swing.JFrame {
      // Attribute
      private Parkhaus garage;
      private int anzEtagen = 2; // Default
      private int anzPlaetze = 2; // Default
     
      /**
       * Creates new form Main
       */
      public Main() {
            ParkKonfig io = new ParkKonfig();
            Parketagen[] etagen = null;
            Parkplatz[] plaetze = null;
            initComponents();
            // Lade Konfigurationsdatei
            io.readFile();
            anzEtagen = io.getEtagen();
            anzPlaetze = io.getPlaetze();
            // Initialisiere Garage
            garage = new Parkhaus();            // Objekt garage erzeugen
            garage.setAnzahlEtagen(anzEtagen);  // anzEtagen nach Obj. garage kopieren
            etagen = new Parketagen[anzEtagen]; // Array-Objekt etagen erzeugen
            garage.setEtagen(etagen);           // etagen Obj-ID nach Obj. garage kopieren
            for(int i=0; i<anzEtagen; i++){
                  etagen[i] = new Parketagen(); // Erzeugt etagenobjekt
                  etagen[i].setAnzahlPlaetze(anzPlaetze); // Anzahl Parkplaetze/etage in Obj. kopiert
                  etagen[i].setEtagenNr(i);               // Etagen Nummer in Obj. kopiert
            }
            // Initialisierung der Parketagen Objekte
            for(int e=0; e<etagen.length; e++){ // Etagen Schleife
                  plaetze = new Parkplatz[anzPlaetze];
                  for( int p=0; p<anzPlaetze; p++){ // Parkplatz Schleife
                        // Parkplatz mit Etagen Obj-Id und fortlaufender Platznr. initialisiert
                        plaetze[p] = new Parkplatz(etagen[e],(e*anzPlaetze)+p+1);
                  }
                  // aktuelles Parkplaetze Array in Etagen Objekt speichern
                  etagen[e].setParkplaetze(plaetze); 
            }
            this.lfFree.setText(""+garage.freiePlaetze());
      }

      /**
       * This method is called from within the constructor to initialize the form. WARNING: Do NOT
       * modify this code. The content of this method is always regenerated by the Form Editor.
       */
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            buttonGroup1 = new javax.swing.ButtonGroup();
            jLabel1 = new javax.swing.JLabel();
            lfFree = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            cbType = new javax.swing.JComboBox<>();
            tfKfzId = new javax.swing.JTextField();
            lfStandort = new javax.swing.JLabel();
            btOut = new javax.swing.JButton();
            btsearch = new javax.swing.JButton();
            btExit = new javax.swing.JButton();
            btIn = new javax.swing.JButton();
            btInfo = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jLabel1.setText("Frei Parkplätze:");

            lfFree.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
            lfFree.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lfFree.setText("0");
            lfFree.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

            jLabel2.setText("Fahrzeugetype:");

            jLabel3.setText("Kennzeichen:");

            jLabel4.setText("Standort:");

            cbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Auto", "Motorrad" }));

            lfStandort.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lfStandort.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

            btOut.setText("Ausgang");
            btOut.setEnabled(false);
            btOut.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btOutActionPerformed(evt);
                  }
            });

            btsearch.setText("Suchen");
            btsearch.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btsearchActionPerformed(evt);
                  }
            });

            btExit.setText("Beenden");
            btExit.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btExitActionPerformed(evt);
                  }
            });

            btIn.setText("Zugang");
            btIn.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btInActionPerformed(evt);
                  }
            });

            btInfo.setText("Belegung...");
            btInfo.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btInfoActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(jLabel2)
                                                      .addComponent(jLabel3)
                                                      .addComponent(jLabel4))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                      .addComponent(cbType, 0, 153, Short.MAX_VALUE)
                                                      .addComponent(tfKfzId)
                                                      .addComponent(lfStandort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                          .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(lfFree, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(btIn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btOut)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(btExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(15, 15, 15))
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel1)
                              .addComponent(lfFree)
                              .addComponent(btInfo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel2)
                              .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(jLabel3)
                                          .addComponent(tfKfzId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(jLabel4)
                                          .addComponent(lfStandort, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(btsearch)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(btOut)
                              .addComponent(btExit)
                              .addComponent(btIn))
                        .addContainerGap(23, Short.MAX_VALUE))
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void btInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInActionPerformed
        String sign = tfKfzId.getText();
        Parkplatz pz = garage.zuweisen();
        int free;
        if (garage.getPostKfz(sign).equals("")) {
            if (!sign.equals("") && (pz != null)) {
                garage.einfahren(sign, cbType.getSelectedItem().toString(), pz);
                free = garage.freiePlaetze(); // freie Plaetze ermittel
                lfFree.setText("" + free);
                if(!btOut.isEnabled()) btOut.setEnabled(true);
                if(free==0){
                      btIn.setEnabled(false);//Button deaktivieren
                      btIn.setForeground(Color.RED);// Schtiftfarbe rot
                }
            }
        } else {
            lfStandort.setText("Fahrzeug schon abgestellt!");
        }
      }//GEN-LAST:event_btInActionPerformed

      private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
            System.exit(0);
      }//GEN-LAST:event_btExitActionPerformed

      private void btsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsearchActionPerformed
            String text = garage.getPostKfz(tfKfzId.getText());
        if (text.equals("")) {
            text = "Nicht gefunden!";
        }
        lfStandort.setText(text);
      }//GEN-LAST:event_btsearchActionPerformed

      private void btOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOutActionPerformed
            garage.verlassen(tfKfzId.getText());
            lfFree.setText(""+garage.freiePlaetze());
            // Parkhaus auf Belegung pruefen
            if(! btIn.isEnabled()){
                 this.btIn.setForeground(Color.BLACK); // Schrift wieder Schwarz
                 this.btIn.setEnabled(true);           // Button Zugang aktivieren 
            }
            if(this.anzEtagen*this.anzPlaetze == garage.freiePlaetze()){
                  this.btOut.setEnabled(false);         // Button Ausgang deaktivieren
            }
//            Fahrzeuge kfz = null;
//            String sign =tfKfzId.getText();
//            int free;
//            if(!sign.equals("")){
//                  kfz = garage.verlassen(sign);
//                  if(kfz!=null){
//                  // Platzzaehler aktualisieren
//                        free=garage.freiePlaetze();
//                        lfFree.setText(""+free);
//                  //Parkhaus auf Leerstand pruefen
//                        if(garage.getEtagen().length *
//                                  garage.getEtagen()[0].getParkplaetze().length
//                                  ==free) //btOut.setEnabled(false);
//                  //Button Zugang aktiviren 
//                        if(!btIn.isEnabled()){
//                              btIn.setEnabled(true);
//                              btIn.setForeground(Color.BLACK);
//                        }
//                  }
//            }
      }//GEN-LAST:event_btOutActionPerformed

      private void btInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInfoActionPerformed
            garage.belegung(this);
      }//GEN-LAST:event_btInfoActionPerformed

      public JLabel getLfStandort() {
            return lfStandort;
      }
      public void setLfStandort(String lfStandort) {
            this.lfStandort.setText(lfStandort);
      }
      public JTextField getTfKfzId() {
            return tfKfzId;
      }
      public void setTfKfzId(String tfKfzId) {
            this.tfKfzId.setText(tfKfzId);
      }
      // Schnittstellen Methoden
      
      /**
       * @param args the command line arguments
       */
      public static void main(String args[]) {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
             */
            try {
                  for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                              javax.swing.UIManager.setLookAndFeel(info.getClassName());
                              break;
                        }
                  }
            } catch (ClassNotFoundException ex) {
                  java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        Main obj = new Main();
                        obj.setLocationRelativeTo(null);
                        obj.setVisible(true);
                  }
            });
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton btExit;
      private javax.swing.JButton btIn;
      private javax.swing.JButton btInfo;
      private javax.swing.JButton btOut;
      private javax.swing.JButton btsearch;
      private javax.swing.ButtonGroup buttonGroup1;
      private javax.swing.JComboBox<String> cbType;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel lfFree;
      private javax.swing.JLabel lfStandort;
      private javax.swing.JTextField tfKfzId;
      // End of variables declaration//GEN-END:variables
}
