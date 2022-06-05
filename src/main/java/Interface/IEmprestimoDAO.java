/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import Model.Emprestimo;
import java.util.List;

public interface IEmprestimoDAO {
    
    public void adicionarEmprestimo(Emprestimo e);
    public Emprestimo recuperarEmprestimo();
    public List<Emprestimo> recuperarTodosEmprestimos();
}
