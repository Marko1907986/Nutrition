package gui.calculator;

import service.imp.CalculatorServiceImp;
import service.CalculatorService;

/**
 *
 * @author Marko Milosevic
 */
public class CalculatorForm extends javax.swing.JDialog {

    private final CalculatorService calculatorService;

    /**
     * Creates new form CalculatorForm
     */
    public CalculatorForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        calculatorService = new CalculatorServiceImp();
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

        pnlCalculator = new javax.swing.JPanel();
        lblHeight = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        lblWeight = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        lblBMI = new javax.swing.JLabel();
        txtBMI = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kalkulator indeksa telesne mase");

        lblHeight.setText("Visina u cm:");

        lblWeight.setText("Tezina u kg:");

        btnCalculate.setText("Izracunaj");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        lblBMI.setText("Indeks telesne mase:");

        txtBMI.setEditable(false);
        txtBMI.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtText.setEditable(false);
        txtText.setColumns(20);
        txtText.setRows(5);
        jScrollPane1.setViewportView(txtText);

        javax.swing.GroupLayout pnlCalculatorLayout = new javax.swing.GroupLayout(pnlCalculator);
        pnlCalculator.setLayout(pnlCalculatorLayout);
        pnlCalculatorLayout.setHorizontalGroup(
            pnlCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCalculatorLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(pnlCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCalculate)
                    .addGroup(pnlCalculatorLayout.createSequentialGroup()
                        .addGroup(pnlCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBMI)
                            .addComponent(lblHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(pnlCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtWeight)
                            .addComponent(txtBMI, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(txtHeight)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        pnlCalculatorLayout.setVerticalGroup(
            pnlCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCalculatorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeight)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCalculate)
                .addGap(18, 18, 18)
                .addGroup(pnlCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBMI)
                    .addComponent(txtBMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        double height = Double.parseDouble(txtHeight.getText().trim()) / 100; // uzmi vrednost sa forme za visinu
        double weight = Double.parseDouble(txtWeight.getText().trim()); // uzmi vrednost sa forme za tezinu
        double index = calculatorService.calculate(height, weight); // izracunaj vrednost indeksa
        txtBMI.setText(String.valueOf(index)); // prikazi dobijeni index
        txtText.setText(calculatorService.write(index));// u zavisnosti od vrednosti indeksa prikazi odgovarajucu poruku        
    }//GEN-LAST:event_btnCalculateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBMI;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JPanel pnlCalculator;
    private javax.swing.JTextField txtBMI;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextArea txtText;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables

}
