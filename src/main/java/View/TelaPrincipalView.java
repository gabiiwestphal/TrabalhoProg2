/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import View.Caixa.AddRevistaCaixaView;
import View.Caixa.BuscarRevistaView;
import View.Caixa.CaixaCreateView;
import View.Caixa.CaixaListView;
import View.Caixa.RemoveRevistaView;
import View.Pessoa.EmprestarView;
import View.Pessoa.PessoaCreateView;
import View.Pessoa.PessoaListView;
import View.Pessoa.DevolverView;
import View.Revista.RevistaCreateView;
import View.Revista.RevistaListView;

public class TelaPrincipalView extends javax.swing.JFrame {
 
    public TelaPrincipalView() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pessoa = new javax.swing.JMenuBar();
        mnCaixa = new javax.swing.JMenu();
        miCriarCaixa = new javax.swing.JMenuItem();
        miListarCaixas = new javax.swing.JMenuItem();
        miAddRevista = new javax.swing.JMenuItem();
        miBuscarRevista = new javax.swing.JMenuItem();
        miRemoverRevista = new javax.swing.JMenuItem();
        mnRevista = new javax.swing.JMenu();
        miCriarRevista = new javax.swing.JMenuItem();
        miListarRevistas = new javax.swing.JMenuItem();
        mnPessoa = new javax.swing.JMenu();
        miCriarPessoa = new javax.swing.JMenuItem();
        miListarPessoa = new javax.swing.JMenuItem();
        mnEmprestimo = new javax.swing.JMenu();
        miEmprestar = new javax.swing.JMenuItem();
        miDevolver = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnCaixa.setText("Caixa");

        miCriarCaixa.setText("Criar");
        miCriarCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarRevistaView(evt);
            }
        });
        mnCaixa.add(miCriarCaixa);

        miListarCaixas.setText("Listar Caixas");
        miListarCaixas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarCaixasActionPerformed(evt);
            }
        });
        mnCaixa.add(miListarCaixas);

        miAddRevista.setText("Adicionar Revista");
        miAddRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddRevistaActionPerformed(evt);
            }
        });
        mnCaixa.add(miAddRevista);

        miBuscarRevista.setText("Buscar Revista");
        miBuscarRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBuscarRevistaActionPerformed(evt);
            }
        });
        mnCaixa.add(miBuscarRevista);

        miRemoverRevista.setText("Remover Revista da Caixa");
        miRemoverRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRemoverRevistaActionPerformed(evt);
            }
        });
        mnCaixa.add(miRemoverRevista);

        Pessoa.add(mnCaixa);

        mnRevista.setText("Revista");

        miCriarRevista.setText("Criar");
        miCriarRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCriarRevistacriarRevistaView(evt);
            }
        });
        mnRevista.add(miCriarRevista);

        miListarRevistas.setText("Listar revistas");
        miListarRevistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarRevistasActionPerformed(evt);
            }
        });
        mnRevista.add(miListarRevistas);

        Pessoa.add(mnRevista);

        mnPessoa.setText("Pessoa");

        miCriarPessoa.setText("Criar pessoa");
        miCriarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCriarPessoaActionPerformed(evt);
            }
        });
        mnPessoa.add(miCriarPessoa);

        miListarPessoa.setText("Listar Pessoas");
        miListarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarPessoaActionPerformed(evt);
            }
        });
        mnPessoa.add(miListarPessoa);

        Pessoa.add(mnPessoa);

        mnEmprestimo.setText("Empréstimo");

        miEmprestar.setText("Emprestar");
        miEmprestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEmprestarActionPerformed(evt);
            }
        });
        mnEmprestimo.add(miEmprestar);

        miDevolver.setText("Devolver");
        miDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDevolverActionPerformed(evt);
            }
        });
        mnEmprestimo.add(miDevolver);

        Pessoa.add(mnEmprestimo);

        setJMenuBar(Pessoa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void criarRevistaView(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarRevistaView
        CaixaCreateView ccv = new CaixaCreateView();
        
        ccv.setVisible(true);
    }//GEN-LAST:event_criarRevistaView

    private void miCriarRevistacriarRevistaView(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCriarRevistacriarRevistaView
        RevistaCreateView rcv = new RevistaCreateView();
        
        rcv.setVisible(true);
    }//GEN-LAST:event_miCriarRevistacriarRevistaView

    private void miAddRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddRevistaActionPerformed
        AddRevistaCaixaView adrcv = new AddRevistaCaixaView();
        
        adrcv.setVisible(true);
    }//GEN-LAST:event_miAddRevistaActionPerformed

    private void miListarCaixasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarCaixasActionPerformed
        CaixaListView clv = new CaixaListView();
        
        clv.setVisible(true);
    }//GEN-LAST:event_miListarCaixasActionPerformed

    private void miBuscarRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBuscarRevistaActionPerformed
        BuscarRevistaView brv = new BuscarRevistaView();
        
        brv.setVisible(true);
    }//GEN-LAST:event_miBuscarRevistaActionPerformed

    private void miRemoverRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRemoverRevistaActionPerformed
        RemoveRevistaView rrv = new RemoveRevistaView();
        
        rrv.setVisible(true);
    }//GEN-LAST:event_miRemoverRevistaActionPerformed

    private void miListarRevistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarRevistasActionPerformed
        RevistaListView rlv = new RevistaListView();
        
        rlv.setVisible(true);
    }//GEN-LAST:event_miListarRevistasActionPerformed

    private void miCriarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCriarPessoaActionPerformed
       PessoaCreateView pcv = new PessoaCreateView();
       
       pcv.setVisible(true);
    }//GEN-LAST:event_miCriarPessoaActionPerformed

    private void miEmprestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEmprestarActionPerformed
        EmprestarView aep = new EmprestarView();
        
        aep.setVisible(true);
    }//GEN-LAST:event_miEmprestarActionPerformed

    private void miDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDevolverActionPerformed
        DevolverView rev = new DevolverView();
        
        rev.setVisible(true);
    }//GEN-LAST:event_miDevolverActionPerformed

    private void miListarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarPessoaActionPerformed
        PessoaListView plv = new PessoaListView();
        
        plv.setVisible(true);
    }//GEN-LAST:event_miListarPessoaActionPerformed

    public static void main(String args[]) {
        TelaPrincipalView tpv = new TelaPrincipalView();
        
        tpv.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Pessoa;
    private javax.swing.JMenuItem miAddRevista;
    private javax.swing.JMenuItem miBuscarRevista;
    private javax.swing.JMenuItem miCriarCaixa;
    private javax.swing.JMenuItem miCriarPessoa;
    private javax.swing.JMenuItem miCriarRevista;
    private javax.swing.JMenuItem miDevolver;
    private javax.swing.JMenuItem miEmprestar;
    private javax.swing.JMenuItem miListarCaixas;
    private javax.swing.JMenuItem miListarPessoa;
    private javax.swing.JMenuItem miListarRevistas;
    private javax.swing.JMenuItem miRemoverRevista;
    private javax.swing.JMenu mnCaixa;
    private javax.swing.JMenu mnEmprestimo;
    private javax.swing.JMenu mnPessoa;
    private javax.swing.JMenu mnRevista;
    // End of variables declaration//GEN-END:variables
}
