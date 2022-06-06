/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Caixa;


import DAO.CaixaDAO;
import Model.Caixa;
import Model.Revista;
import java.util.Collections;
import java.util.Comparator;

public class CaixaListView extends javax.swing.JFrame {
    
    private CaixaDAO caixaDAO = new CaixaDAO();
    
    public CaixaListView() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btListar = new java.awt.Button();
        btListar2 = new java.awt.Button();
        btLimparTela = new java.awt.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        taListar = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listar Caixas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        btListar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btListar.setLabel("Listar Caixas por Ordem Alfabética");
        btListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarlistarCaixas(evt);
            }
        });

        btListar2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btListar2.setLabel("Listar Caixas por Quantidade de Revistas");
        btListar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarCaixasQtdRevistas(evt);
            }
        });

        btLimparTela.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btLimparTela.setLabel("LimparTela");
        btLimparTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparTelalimparTela(evt);
            }
        });

        taListar.setColumns(20);
        taListar.setRows(5);
        jScrollPane2.setViewportView(taListar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btListar, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btListar2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btLimparTela, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btListar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btLimparTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btListarlistarCaixas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarlistarCaixas
        caixaDAO.recuperarTodasCaixas().sort(new Comparator<Caixa>() {
            @Override
            public int compare(Caixa c1, Caixa c2) {
                return c1.getCor().compareTo(c2.getCor());
            }
        });

        for(Caixa c : caixaDAO.recuperarTodasCaixas()) {
            taListar.append(c.toString() + "\n");
            
            for(Revista r : c.getRevistas()) {
                taListar.append(r.toString() + "\n");
            }
        }
    }//GEN-LAST:event_btListarlistarCaixas

    private void btLimparTelalimparTela(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparTelalimparTela
        taListar.setText("");
    }//GEN-LAST:event_btLimparTelalimparTela

    private void listarCaixasQtdRevistas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarCaixasQtdRevistas
        Collections.sort(this.caixaDAO.recuperarTodasCaixas());
        
        for(Caixa c : this.caixaDAO.recuperarTodasCaixas()) {
            taListar.append(c.toString() + "\n");
        }
    }//GEN-LAST:event_listarCaixasQtdRevistas


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btLimparTela;
    private java.awt.Button btListar;
    private java.awt.Button btListar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea taListar;
    // End of variables declaration//GEN-END:variables
}
