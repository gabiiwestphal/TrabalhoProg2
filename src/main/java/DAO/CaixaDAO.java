/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Interface.ICaixaDAO;
import Model.Caixa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriela
 */
public class CaixaDAO implements ICaixaDAO {
    
    public static List<Caixa> caixas = new ArrayList<>();

    @Override
    public void adicionarCaixa(Caixa a) {
        caixas.add(a);
    }

    @Override
    public Caixa recuperarCaixa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Caixa> recuperarTodasCaixas() {
        return caixas;
    }

    
}
