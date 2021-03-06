/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Pessoa;

import DAO.CaixaDAO;
import DAO.EmprestimoDAO;
import DAO.PessoaDAO;
import DAO.RevistaDAO;
import Model.Emprestimo;
import Model.Multa;
import Model.Pessoa;
import Model.Pessoas.Amigo;
import Model.Pessoas.Dono;
import Model.Revista;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriela
 */
public class DevolverView extends javax.swing.JFrame {

    PessoaDAO pessoaDAO = new PessoaDAO();
    RevistaDAO revistaDAO = new RevistaDAO();
    EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
    CaixaDAO caixaDAO = new CaixaDAO();
    /**
     * Creates new form RemoveEmprestimoView
     */
    public DevolverView() {
        initComponents();
        preencherComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jAmigo = new javax.swing.JLabel();
        btDevolver = new java.awt.Button();
        cbAmigo = new javax.swing.JComboBox<>();
        jLRevista = new javax.swing.JLabel();
        cbRevista = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cbDono = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Devolver", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jAmigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jAmigo.setText("Amigo");

        btDevolver.setActionCommand("Adicionar");
        btDevolver.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btDevolver.setLabel("Devolver");
        btDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDevolverEmprestimo(evt);
            }
        });

        jLRevista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLRevista.setText("Revista");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Dono");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLRevista)
                    .addComponent(jAmigo)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbDono, 0, 379, Short.MAX_VALUE)
                    .addComponent(cbAmigo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbRevista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbDono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAmigo))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRevista)
                    .addComponent(cbRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btDevolverEmprestimo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDevolverEmprestimo

        Dono dono = (Dono) cbDono.getSelectedItem();
        Amigo amigo = (Amigo) cbAmigo.getSelectedItem();
        Revista rev = (Revista) cbRevista.getSelectedItem();
        
        for (Emprestimo e : emprestimoDAO.recuperarTodosEmprestimos()) {
            if (e.getRevista().getCodigoDeBarras().equals(rev.getCodigoDeBarras())) {
                if (verificarDataDevolucao(e)) {
                    amigo.devolverRevista(rev);
                    JOptionPane.showMessageDialog(null, "Devolu????o realizada com sucesso!");
                    return;
                } else {
                    Multa multa = new Multa(1);
                    amigo.devolverRevista(rev);
                    JOptionPane.showMessageDialog(null, "Devolu????o realizada com sucesso! Multa pendente: " + Math.abs(multa.calcularTaxa(subtrairDatas(e))));
                    return;
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "Emprestimo n encontrado");
    }//GEN-LAST:event_btDevolverEmprestimo

    private boolean verificarDataDevolucao(Emprestimo e) {
        LocalDate diaAtual = LocalDate.now();

        return diaAtual.isBefore(e.getDataEntrega());
    }

    private long subtrairDatas(Emprestimo e) {
        LocalDate diaAtual = LocalDate.now();

        Period period = Period.between(diaAtual, e.getDataEntrega());

        return period.getDays();
    }

    private void preencherComboBox() {
        for (Pessoa a : pessoaDAO.recuperarTodasPessoas()) {
            if (a instanceof Amigo) {
                cbAmigo.addItem(a);
            } else {
                cbDono.addItem(a);
            }
        }
        for (Revista r : revistaDAO.recuperarTodasRevistas()) {
            cbRevista.addItem(r);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btDevolver;
    private javax.swing.JComboBox<Pessoa> cbAmigo;
    private javax.swing.JComboBox<Pessoa> cbDono;
    private javax.swing.JComboBox<Revista> cbRevista;
    private javax.swing.JLabel jAmigo;
    private javax.swing.JLabel jLRevista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
