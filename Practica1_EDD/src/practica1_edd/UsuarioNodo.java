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
public class UsuarioNodo {
    UsuarioNodo siguiente;
    UsuarioNodo anterior;
    String nombre;
    
    public UsuarioNodo (){
    siguiente = null;
    anterior = null;
    nombre = null;
}
    public UsuarioNodo(String nom){
        nombre = nom;
        anterior = null;
                siguiente=null;
    }
}

