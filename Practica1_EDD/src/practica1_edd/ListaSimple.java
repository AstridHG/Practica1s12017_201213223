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
public class ListaSimple {
    
    private ListaSimpleNodo inicio;
    private int tama;
    
    public void Lista(){
        inicio = null;
        tama = 0;
    }
    public boolean Vacia(){
        return inicio == null;
    }
    
    public int getTama(){
        return tama;
    }
   
    public void agregar(int valor){
        ListaSimpleNodo Nodo = new ListaSimpleNodo();
        Nodo.setValor(valor);
        
        if(Vacia()){
            inicio = Nodo;
            
        }else{
            ListaSimpleNodo auxiliar = inicio;
            
            while(auxiliar.getSiguiente()!=null){
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(Nodo);
                    
        }
        
        tama++;
    }
}
