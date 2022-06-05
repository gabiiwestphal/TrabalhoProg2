/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Interface.IEmprestimoDAO;
import Model.Emprestimo;
import java.util.ArrayList;
import java.util.List;

public class EmprestimoDAO implements IEmprestimoDAO {
    
    public static List<Emprestimo> emprestimos = new ArrayList<>();

    @Override
    public void adicionarEmprestimo(Emprestimo e) {
        emprestimos.add(e);
    }

    @Override
    public List<Emprestimo> recuperarTodosEmprestimos() {
        return emprestimos;
    }

    @Override
    public Emprestimo recuperarEmprestimo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
