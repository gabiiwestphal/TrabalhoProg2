/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Pessoa;
import java.util.ArrayList;
import java.util.List;
import Interface.IPessoaDAO;

public class PessoaDAO implements IPessoaDAO {
    
    public static List<Pessoa> pessoas = new ArrayList<>();

    @Override
    public void adicionarPessoa(Pessoa a) {
        pessoas.add(a);
    }

    @Override
    public Pessoa recuperarPessoa() {
        throw new UnsupportedOperationException("");
    }

    @Override
    public List<Pessoa> recuperarTodasPessoas() {
        return pessoas;
    }
}
