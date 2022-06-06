/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Multa implements Taxa {
   
   private int valor;

    public Multa(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public String toString() {
        return "valor: " + this.valor;
    }

    @Override
    public double calcularTaxa(long dias) {
        return this.valor * dias;
    }   
}
