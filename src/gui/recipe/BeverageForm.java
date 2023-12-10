package gui.recipe;

import domain.Recipe;
import gui.recipe.normative.NormativeForm;
import java.util.List;
import javax.swing.*;
import javax.swing.table.TableModel;
import service.imp.RecipeServiceImp;
import session.Session;
import table.TableRecipe;
import service.RecipeService;

/**
 *
 * @author Marko Milosevic
 */
public class BeverageForm extends javax.swing.JDialog {

    private final RecipeService recipeService;

    /**
     * Creates new form BeverageForm
     */
    public BeverageForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        recipeService = new RecipeServiceImp();
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
        tblRecipe = new javax.swing.JTable();
        btnDetails = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Napici");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tblRecipe.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblRecipe);

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDetails)
                        .addGap(0, 213, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDetails)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        populateTable();
    }//GEN-LAST:event_formWindowActivated

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        int selectedRow = tblRecipe.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Niste odabrali recepturu!");
        } else {
            TableModel tm = tblRecipe.getModel();
            TableRecipe tr = (TableRecipe) tm;
            Recipe recipe = tr.getRecipe(selectedRow);

            Session.getInstance().getMap().put("selected.recipe", recipe);

            new NormativeForm(null, true).setVisible(true);
        }
    }//GEN-LAST:event_btnDetailsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRecipe;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        try {
            List<Recipe> recipes = recipeService.getBeverages();
            TableModel tm = new TableRecipe(recipes);
            tblRecipe.setModel(tm);
            setTable();
        } catch (Exception ex) {
        }
    }

    private void setTable() {
        tblRecipe.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblRecipe.getColumnModel().getColumn(0).setPreferredWidth(84);
        tblRecipe.getColumnModel().getColumn(1).setPreferredWidth(180);
    }
}
