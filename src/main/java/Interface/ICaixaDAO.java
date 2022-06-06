/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import Model.Caixa;
import java.util.List;

public interface ICaixaDAO {
    public void adicionarCaixa(Caixa a);
    public Caixa recuperarCaixa();
    public List<Caixa> recuperarTodasCaixas();
}
