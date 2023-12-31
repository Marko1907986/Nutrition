package gui.recipe;

import domain.Recipe;
import gui.recipe.normative.NormativeForm;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import service.RecipeService;
import service.imp.RecipeServiceImp;
import session.Session;
import table.TableRecipe;

/**
 *
 * @author Marko Milosevic
 */
public class VegetableDishForm extends javax.swing.JDialog {
    
    private final RecipeService recipeService;

    /**
     * Creates new form VegetableDishForm
     */
    public VegetableDishForm(java.awt.Frame parent, boolean modal) {
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

        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVegetableDishes = new javax.swing.JTable();
        btnDetails = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Samostalna jela i prilozi od povrca i variva");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lblSearch.setText("Uneti naziv za pretragu:");

        btnSearch.setText("Pretrazi");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblVegetableDishes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblVegetableDishes);

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
                    .addComponent(btnDetails)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDetails)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        populateTable();
        txtSearch.setText("");
    }//GEN-LAST:event_formWindowActivated

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            String model = txtSearch.getText().trim();
            List<Recipe> recipes;
            if (model.isEmpty()) {
                populateTable();
            } else {
                recipes = recipeService.findVegetableDishesByQuery(model);
                TableModel tm = new TableRecipe(recipes);
                tblVegetableDishes.setModel(tm);
                tblVegetableDishes.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        int selectedRow = tblVegetableDishes.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Niste odabrali recepturu!");
        } else {
            TableModel tm = tblVegetableDishes.getModel();
            TableRecipe tr = (TableRecipe) tm;
            Recipe recipe = tr.getRecipe(selectedRow);
            
            Session.getInstance().getMap().put("selected.recipe", recipe);
            
            new NormativeForm(null, true).setVisible(true);
        }
    }//GEN-LAST:event_btnDetailsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable tblVegetableDishes;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        try {
            List<Recipe> recipes = recipeService.getVegetableDishes();
            TableModel tm = new TableRecipe(recipes);
            tblVegetableDishes.setModel(tm);
            setTable();
        } catch (Exception ex) {
        }
    }
    
    private void setTable() {
        tblVegetableDishes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblVegetableDishes.getColumnModel().getColumn(0).setPreferredWidth(90);
        tblVegetableDishes.getColumnModel().getColumn(1).setPreferredWidth(321);
    }
}
