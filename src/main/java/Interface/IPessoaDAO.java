/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import Model.Pessoa;
import java.util.List;

/**
 *
 * @author Gabriela
 */
public interface IPessoaDAO {
    
    public void adicionarPessoa(Pessoa a);
    public Pessoa recuperarPessoa();
    public List<Pessoa> recuperarTodasPessoas();
   
}
