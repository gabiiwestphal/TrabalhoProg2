/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Interface.IRevistaDAO;
import Model.Pessoa;
import Model.Revista;
import java.util.ArrayList;
import java.util.List;
import Interface.IPessoaDAO;

/**
 *
 * @author Gabriela
 */
public class RevistaDAO implements IRevistaDAO {
    
    public static List<Revista> revistas = new ArrayList<>();

    @Override
    public void adicionarRevista(Revista a) {
        revistas.add(a);
    }

    @Override
    public Revista recuperarRevista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Revista> recuperarTodasRevistas() {
        return revistas;
    }


   
}
