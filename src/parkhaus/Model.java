/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkhaus;

import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author ForouzanShebli
 */
public class Model implements ListModel {

    private Parkitem[] items = new Parkitem[0];

    public int getSize() {
        return items.length;
    }

    public Parkitem getElementAt(int i) {
        return items[i];
    }

    public void setItems(Parkitem[] items) {
        this.items = items;
    }
    public void addListDataListener(ListDataListener ll){};

    public void removeListDataListener(ListDataListener ll){};
}
