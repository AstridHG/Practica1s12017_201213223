/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_edd;



public class Ortogonal {
    NodoOrtogonal primero;
    int dimension;
 NodoOrtogonal ultimo;
  
    String dato;
     NodoOrtogonal nuevo = new NodoOrtogonal();
    NodoOrtogonal anterior;
    NodoOrtogonal siguiente;
     
     
     public void ListaVertical(){
         primero=null;
         ultimo=null;
     }
     
     public void inse(NodoOrtogonal inser ){
         if(Vacio()){
             primero=ultimo;
             ultimo=inser;
             
         }else{
             if(inser.posy<primero.posy){
                 InsertarFrente(inser);
             }else if(inser.posy>ultimo.posy){
             InsertarFinal(inser);
         }else{
                 InsertarMedio(inser);
             }
                 
             
         }
     }
     
     public void InsertarFrente(NodoOrtogonal inser){
     primero.arriba=inser;
     inser.abajo=primero;
     primero=primero.arriba;
     }
     public void InsertarFinal(NodoOrtogonal inser){
         ultimo.abajo=inser;
         inser.arriba=ultimo;
         ultimo=ultimo.abajo;
     }
     
     public void InsertarMedio(NodoOrtogonal inser){
         NodoOrtogonal tem1 = new NodoOrtogonal();
         NodoOrtogonal tem2 = new NodoOrtogonal();
         tem1=primero;
         while(tem1.posy<inser.posy){
             tem1=tem1.abajo;
             
             
         }
         tem2=tem1.arriba;
         tem1.arriba=inser;
        inser.abajo=tem1;
        inser.arriba=tem2;
     }
     public boolean Vacio(){
         if(primero==null){
            return true; 
         }else{
             return false;
         }
     }

     
        public void Insertar(){
            
            for(int i=0; i<=dimension; i++){ 
                 for(int j=0; j<=dimension;j++){
                     if(primero.derecha==null){
                       primero.derecha = nuevo;
                   
                     }else{
                         primero.izquierda = nuevo;
                     }
                  if(primero.abajo==null){
                        primero.abajo = nuevo;
                     }
                         primero.arriba = nuevo;
                 
                
            }
               
         
                    
                    }    
        }
        }
