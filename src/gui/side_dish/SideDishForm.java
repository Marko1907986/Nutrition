package gui.side_dish;

import domain.SideDish;
import java.util.List;
import javax.swing.*;
import javax.swing.table.TableModel;
import service.imp.SideDishServiceImp;
import session.Session;
import table.TableSideDish;
import service.SideDishService;

/**
 *
 * @author Marko Milosevic
 */
public class SideDishForm extends javax.swing.JDialog {

    private final SideDishService sideDishService;

    /**
     * Creates new form SideDishForm
     */
    public SideDishForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        sideDishService = new SideDishServiceImp();
        populateTable();
        setTable();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableSideDish = new javax.swing.JTable();
        btnDetails = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Namirnice koje se daju uz jela iz receptura");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tableSideDish.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableSideDish);

        btnDetails.setText("Detalji");
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDetails)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDetails)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        populateTable();
    }//GEN-LAST:event_formWindowActivated

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        // uzmi selektovani red tabele
        int selectedRow = tableSideDish.getSelectedRow();
        if (selectedRow == -1) { // ako red nije selektovan, upozori korisnika
            JOptionPane.showMessageDialog(this, "Niste izabrali namirnicu!");
        } else { // uzmi podatke o selektovanom redu i prosledi u mapu, kako bi prikazao podatke na novoj formi
            TableModel tm = tableSideDish.getModel();
            TableSideDish tsd = (TableSideDish) tm;
            SideDish sideDish = tsd.getSideDish(selectedRow);

            Session.getInstance().getMap().put("selected.sideDish", sideDish);

            try { // otvori novu formu
                new DetailsSideDish(null, true).setVisible(true);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btnDetailsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSideDish;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        try {
            List<SideDish> sideDishes = sideDishService.getAll();
            TableModel tm = new TableSideDish(sideDishes);
            tableSideDish.setModel(tm);
            setTable();
        } catch (Exception ex) {
        }
    }

    private void setTable() {
        tableSideDish.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableSideDish.getColumnModel().getColumn(0).setPreferredWidth(30);
        tableSideDish.getColumnModel().getColumn(1).setPreferredWidth(352);
        tableSideDish.getColumnModel().getColumn(2).setPreferredWidth(100);
    }
}
