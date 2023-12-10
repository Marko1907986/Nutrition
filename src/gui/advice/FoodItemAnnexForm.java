package gui.advice;

import domain.FoodItemAnnex;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import service.imp.FoodItemAnnexServiceImp;
import table.TableFoodItemAnnex;
import service.FoodItemAnnexService;

/**
 *
 * @author Marko Milosevic
 */
public class FoodItemAnnexForm extends javax.swing.JDialog {

    private final FoodItemAnnexService foodItemAnnexService;

    /**
     * Creates new form FoodItemAnnexForm
     */
    public FoodItemAnnexForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        foodItemAnnexService = new FoodItemAnnexServiceImp();
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

        pnlForm = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFoodItem = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tezina u odnosu na zapreminu nekih namirnica koje se u tehnoloskom procesu pripremanja raznih jela dodaju u malim kolicinama");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        pnlForm.setBorder(javax.swing.BorderFactory.createTitledBorder("Vrsta posude sadrzi grama"));

        tblFoodItem.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblFoodItem);

        javax.swing.GroupLayout pnlFormLayout = new javax.swing.GroupLayout(pnlForm);
        pnlForm.setLayout(pnlFormLayout);
        pnlFormLayout.setHorizontalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
        );
        pnlFormLayout.setVerticalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(pnlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        populateTable();
    }//GEN-LAST:event_formWindowActivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlForm;
    private javax.swing.JTable tblFoodItem;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        try {
            List<FoodItemAnnex> foodItems = foodItemAnnexService.getAll();
            TableModel tm = new TableFoodItemAnnex(foodItems);
            tblFoodItem.setModel(tm);
            setTable();
        } catch (Exception ex) {
        }
    }

    private void setTable() {
        tblFoodItem.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblFoodItem.getColumnModel().getColumn(0).setPreferredWidth(30);
        tblFoodItem.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblFoodItem.getColumnModel().getColumn(2).setPreferredWidth(110);
        tblFoodItem.getColumnModel().getColumn(3).setPreferredWidth(110);
        tblFoodItem.getColumnModel().getColumn(4).setPreferredWidth(110);
        tblFoodItem.getColumnModel().getColumn(5).setPreferredWidth(110);
        tblFoodItem.getColumnModel().getColumn(6).setPreferredWidth(110);
    }
}
