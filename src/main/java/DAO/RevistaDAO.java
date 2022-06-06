/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Interface.IRevistaDAO;
import Model.Revista;
import java.util.ArrayList;
import java.util.List;

public class RevistaDAO implements IRevistaDAO {
    
    public static List<Revista> revistas = new ArrayList<>();

    @Override
    public void adicionarRevista(Revista a) {
        revistas.add(a);
    }

    @Override
    public Revista recuperarRevista() {
        throw new UnsupportedOperationException(""); 
    }

    @Override
    public List<Revista> recuperarTodasRevistas() {
        return revistas;
    }
}
