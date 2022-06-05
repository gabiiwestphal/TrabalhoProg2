/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Caixa;

import DAO.CaixaDAO;
import DAO.RevistaDAO;
import Model.Caixa;
import Model.Revista;
import View.TelaPrincipalView;
import javax.swing.JOptionPane;

public class RemoveRevistaView extends javax.swing.JFrame {

    CaixaDAO caixaDAO = new CaixaDAO();
    RevistaDAO revistaDAO = new RevistaDAO();

    public RemoveRevistaView() {
        initComponents();
        preencherCB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbRevista = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbCaixa = new javax.swing.JComboBox<>();
        btRemover = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Revista:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Caixa:");

        btRemover.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btRemover.setLabel("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoveraddRevistaNaCaixa(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbRevista, 0, 439, Short.MAX_VALUE)
                            .addComponent(cbCaixa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btRemoveraddRevistaNaCaixa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveraddRevistaNaCaixa
        Caixa c = (Caixa) cbCaixa.getSelectedItem();
        Revista r = (Revista) cbRevista.getSelectedItem();

        c.getRevistas().remove(r);
        c.reduzirRevistaContador();
        JOptionPane.showMessageDialog(null, "Revista removida com sucesso!");

        cbCaixa.removeAllItems();
        cbCaixa.removeAllItems();
        preencherCB();
    }//GEN-LAST:event_btRemoveraddRevistaNaCaixa

    private void preencherCB() {
        for (Caixa c : caixaDAO.recuperarTodasCaixas()) {
            cbCaixa.addItem(c);
        }

        for (Revista r : revistaDAO.recuperarTodasRevistas()) {
            cbRevista.addItem(r);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btRemover;
    private javax.swing.JComboBox<Caixa> cbCaixa;
    private javax.swing.JComboBox<Revista> cbRevista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
