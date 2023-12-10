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
public class EggDishForm extends javax.swing.JDialog {
    
    private final RecipeService recipeService;

    /**
     * Creates new form EggDishForm
     */
    public EggDishForm(java.awt.Frame parent, boolean modal) {
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
        tblEggDish = new javax.swing.JTable();
        btnDetails = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Jela od jaja");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tblEggDish.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblEggDish);

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDetails))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDetails)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        populateTable();
    }//GEN-LAST:event_formWindowActivated

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        int selectedRow = tblEggDish.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Niste odabrali recepturu!");
        } else {
            TableModel tm = tblEggDish.getModel();
            TableRecipe tr = (TableRecipe) tm;
            Recipe recipe = tr.getRecipe(selectedRow);
            
            Session.getInstance().getMap().put("selected.recipe", recipe);
            
            new NormativeForm(null, true).setVisible(true);
        }
    }//GEN-LAST:event_btnDetailsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEggDish;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        try {
            List<Recipe> recipes = recipeService.getEggDishes();
            TableModel tm = new TableRecipe(recipes);
            tblEggDish.setModel(tm);
            setTable();
        } catch (Exception ex) {
        }
    }
    
    private void setTable() {
        tblEggDish.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblEggDish.getColumnModel().getColumn(0).setPreferredWidth(92);
        tblEggDish.getColumnModel().getColumn(1).setPreferredWidth(240);
    }
}
