/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DAO.RevistaDAO;
import Exception.CampoVazioException;
import Exception.CodigoDeBarraExistenteException;
import java.util.Objects;

public class Revista{
    
    private String nome;
    private int ano;
    private String colecao;
    private int edicao;
    private String codigoDeBarras;
    private String categoria;
    private Caixa caixa;
    
    public Revista() {
 
    }
    
    public void setCodigoDeBarra(String codigoDeBarra) throws CodigoDeBarraExistenteException, CampoVazioException {
        RevistaDAO revistaDAO = new RevistaDAO();
        
        for(Revista r : revistaDAO.recuperarTodasRevistas()) {
            if(r.getCodigoDeBarras().equals(codigoDeBarra)) {
                throw new CodigoDeBarraExistenteException();
            }
        }
        
        if(codigoDeBarra.isBlank()) {
            throw new CampoVazioException();
        }
        
        this.codigoDeBarras = codigoDeBarra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws CampoVazioException {
        if(nome.isBlank()) {
            throw new CampoVazioException();
        }
        
        this.nome = nome;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }   
    
    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }  

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) throws CampoVazioException {
        if(categoria.isBlank()){
            throw new CampoVazioException();
        }
        this.categoria = categoria;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) throws CampoVazioException {
        if(String.valueOf(ano).isBlank()) {
            throw new CampoVazioException();
        }
        
        this.ano = ano;
      
    }

    public String getColecao() {
        return colecao;
    }

    public void setColecao(String colecao) throws CampoVazioException{
       if(colecao.isBlank()){
           throw new CampoVazioException();
       }
        this.colecao = colecao;
    }

    public int getEdicao() {
        return edicao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Revista other = (Revista) obj;
        return Objects.equals(this.codigoDeBarras, other.codigoDeBarras);
    }

    public void setEdicao(int edicao) throws CampoVazioException{
        if(String.valueOf(edicao).isBlank()){
            throw new CampoVazioException();
        }
        this.edicao = edicao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Ano: " + ano + ", Coleção: " + colecao
                + ", Edição: " + edicao + "Categoria: " + categoria + ", Código: " + codigoDeBarras;
    }
}
