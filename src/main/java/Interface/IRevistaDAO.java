/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import Model.Revista;
import java.util.List;

public interface IRevistaDAO {
    
    public void adicionarRevista(Revista a);
    public Revista recuperarRevista();
    public List<Revista> recuperarTodasRevistas();
   
}
