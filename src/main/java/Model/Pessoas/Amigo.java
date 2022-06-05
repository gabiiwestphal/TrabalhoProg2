/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Pessoas;

import DAO.CaixaDAO;
import Model.Caixa;
import Model.Emprestimo;
import Model.Pessoa;
import Model.Revista;

/**
 *
 * @author Gabriela
 */
public class Amigo extends Pessoa {
    
    public Amigo() {
        
    }
    
    public void devolverRevista(Revista r) {
        for(Emprestimo e : this.getEmprestimos()) {
            if(e.getRevista().getCodigoDeBarras().equals(r.getCodigoDeBarras())) {
                this.getEmprestimos().remove(e);               
            }
        }
        
        CaixaDAO caixaDAO = new CaixaDAO();
        for(Caixa c : caixaDAO.recuperarTodasCaixas()){
            if(r.getCaixa().getEtiqueta().equals(c.getEtiqueta())){
                c.addRevista(r);
                c.addRevistaContador();
            }
        }
    }
    
    @Override
    public String toString() {
        return "Tipo: Amigo " + super.toString();
    }
}
