/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_edd;

/**
 *
 * @author Astrid Hernandez
 */
public class ListaSimpleNodo {
    private int valor;
    private ListaSimpleNodo siguiente;
    
    public void Nodo(){
    
        this.valor= 0;
        this.siguiente=null;
}
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ListaSimpleNodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(ListaSimpleNodo siguiente) {
        this.siguiente = siguiente;
    }   
}

