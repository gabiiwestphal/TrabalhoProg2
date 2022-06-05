/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Pessoa;
import java.util.ArrayList;
import java.util.List;
import Interface.IPessoaDAO;

/**
 *
 * @author Gabriela
 */
public class PessoaDAO implements IPessoaDAO {
    
    public static List<Pessoa> pessoas = new ArrayList<>();

    @Override
    public void adicionarPessoa(Pessoa a) {
        pessoas.add(a);
    }

    @Override
    public Pessoa recuperarPessoa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pessoa> recuperarTodasPessoas() {
        return pessoas;
    }
   
}
