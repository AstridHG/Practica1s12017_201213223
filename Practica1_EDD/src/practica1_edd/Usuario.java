/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_edd;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Astrid Hernandez
 */
public class Usuario extends javax.swing.JFrame {

    UsuarioNodo primero;
    UsuarioNodo ultimo;
   
    
    int contador;
    Cola Letraentrega = null;
    Cola inicioLetra = null;
    Cola ultimaLetra = null;
    Cola colasale = new Cola();
    int cA=12;
    int ca=0;
    int cB=2;
    int cb=0;
    int cC=4;
    int cc=0;
    int cD=5;
     int cd=0;
    int cE=12;
     int ce=0;
    int cF=1;
     int cf=0;
    int cG=2;
     int cg=0;
    int cH=2;
     int ch=0;
    int cI=6;
     int ci=0;
    int cJ=1;
     int cj=0;
   
    int cL=4;
     int cl=0;
    int cM=2;
     int cm=0;
    int cN=5;
     int cn=0;
      int cÑ=1;
     int cñ=0;
    int cO=9;
     int co=0;
    int cP=2;
     int cp=0;
    int cQ=1;
     int cq=0;
    int cR=5;
     int cr=0;
    int cS=6;
     int cs=0;
    int cT=4;
     int ct=0;
    int cU=5;
     int cu=0;
    int cV=1;
     int cv=0;
  
    int cX=1;
     int cx=0;
   int cY=1;
   int cy = 0;
    int cZ=1;
     int cz=0;
    
    

   
    public void IngresarUsuario(){
        UsuarioNodo nombre = new UsuarioNodo(jTextField1.getText());
    if(primero == null){
        primero= nombre ;
        ultimo = nombre;
        
        // jTextArea1.setText(nombre.nombre);
        System.out.println("nomb"+nombre.nombre);
    }   else {
       ultimo.siguiente= nombre;
             ultimo= nombre;
               ultimo.siguiente=null; //cambiar a primero
              // jTextArea1.setText(nombre.nombre);
               System.out.println("nombres"+nombre.nombre);
             
    } 
   
                
    }
    
      
    

    public boolean buscar(String dato){
        UsuarioNodo aux = new UsuarioNodo();
                aux = primero;
        boolean encontrado = false;
       
        do{
            if(dato == aux.nombre) {
                
                encontrado = true;
                
            
            }
            else{
                aux=aux.siguiente;
                
            }
        } while(aux != primero && encontrado != true);
       
            return encontrado;
            
           
            
           
           
       
    }
    
    public Usuario() {
        initComponents();
        primero = null;
        ultimo = null;
       
     
        
    
    }
    public void DiagramaArchivo(){
    String texArchivo = "digraph ListaJugadores"+contador +"{\n";
    UsuarioNodo bandera = new UsuarioNodo();
    bandera = primero;
    do{
         if(bandera== primero && bandera==ultimo){
           texArchivo = texArchivo+bandera.nombre+";";
       
        }
         else if(bandera == primero){
             texArchivo = texArchivo + bandera.nombre;
             
        } else if(bandera== ultimo){
            texArchivo = texArchivo +"->"+ bandera.nombre+"->"+primero.nombre+";\n";
            
       }
    else{
             texArchivo = texArchivo +"->"+ bandera.nombre+";\n"+bandera.nombre;
        }
            
       bandera = bandera.siguiente;
    }while(bandera != null);
     texArchivo = texArchivo + "}";
    // jTextArea1.setText(texArchivo);
     
     try{
         File archi = new File("C:\\release\\EDD\\Jugadores.txt");
         FileWriter fw = new FileWriter(archi,true);
         fw.write(texArchivo);
         fw.close();
         
     }catch(IOException ex){
    }
     
    }
    public void agregarLetra(Cola Letraactual, int ingreso){
        if(inicioLetra == null){
            inicioLetra = Letraactual;
            ultimaLetra = Letraactual;
            
        }else{
            ultimaLetra.siguiente = Letraactual;
            ultimaLetra = Letraactual;
        }
            
        }
    
    
    
    public void RandomCola(int valor){
        //hacer el random para llenar cola
        int random=(int)(Math.random()*25)+1;
        switch(random){
            case 1:
                if(ca<cA){
                   Cola la = new Cola("A",1);
                 agregarLetra(la,valor);
                 ca++;
                 
                }
            break;
            case 2:
            if(cb<cB){
                   Cola lb = new Cola("B",3);
                 agregarLetra(lb,valor);
                 cb++;
                 
                } 
            break;
            case 3:
            if(cc<cC){
                   Cola lc = new Cola("C",3);
                 agregarLetra(lc,valor);
                 cc++;
                 
                }
            break;
            case 4:
                if(cd<cD){
                   Cola ld = new Cola("D",2);
                 agregarLetra(ld,valor);
                 cd++;
                 
                }
                break;
            case 5:
            if(ce<cE){
                   Cola le = new Cola("E",1);
                 agregarLetra(le,valor);
                 ce++;
                 
                }
            break;
            case 6:
                if(cf<cF){
                   Cola lf = new Cola("F",4);
                 agregarLetra(lf,valor);
                 cf++;
                 
                }
            break;
            case 7:
                if(cg<cG){
                   Cola lg = new Cola("G",2);
                 agregarLetra(lg,valor);
                 cg++;
                 
                }
            break;
            case 8:
                if(ch<cH){
                   Cola lh = new Cola("H",4);
                 agregarLetra(lh,valor);
                 ch++;
                 
                }
            break;
            case 9:
                if(ci<cI){
                   Cola li = new Cola("I",1);
                 agregarLetra(li,valor);
                 ci++;
                 
                }
            break;
            case 10:
                if(cj<cJ){
                   Cola lj = new Cola("J",8);
                 agregarLetra(lj,valor);
                 cj++;
                 
                }
            break;
            case 11:
                if(cl<cL){
                   Cola ll = new Cola("L",1);
                 agregarLetra(ll,valor);
                 cl++;
                 
                }
            break;
            case 12:
                if(cm<cM){
                   Cola lm = new Cola("M",3);
                 agregarLetra(lm,valor);
                 cm++;
                 
                }
            break;
            case 13:
                if(cn<cN){
                   Cola ln = new Cola("N",1);
                 agregarLetra(ln,valor);
                 cn++;
                 
                }
            break;
                    case 14:
                        if(cñ<cÑ){
                   Cola lñ = new Cola("Ñ",8);
                 agregarLetra(lñ,valor);
                 cñ++;
                 
                }
                    break;
                    case 15:
                        if(co<cO){
                   Cola lo = new Cola("O",1);
                 agregarLetra(lo,valor);
                 co++;
                 
                }
                   break;
                    case 16:
                        if(cp<cP){
                   Cola lp = new Cola("P",3);
                 agregarLetra(lp,valor);
                 cp++;
                 
                }
                    break;
                    case 17:
                        if(cq<cQ){
                   Cola lq = new Cola("Q",5);
                 agregarLetra(lq,valor);
                 cq++;
                 
                }
                    break;
                    case 18:
                        if(cr<cR){
                   Cola lr = new Cola("R",1);
                 agregarLetra(lr,valor);
                 cr++;
                 
                }
                    break;
                    case 19:
                        if(cs<cS){
                   Cola ls = new Cola("S",1);
                 agregarLetra(ls,valor);
                 cs++;
                 
                }
                    break;
                    case 20:
                        if(ct<cT){
                   Cola lt = new Cola("T",1);
                 agregarLetra(lt,valor);
                 ct++;
                 
                }
                    break;
                    case 21:
                        if(cu<cU){
                   Cola lu = new Cola("U",1);
                 agregarLetra(lu,valor);
                 cu++;
                 
                }
                    break;
                    case 22:
                        if(cv<cV){
                   Cola lv = new Cola("V",4);
                 agregarLetra(lv,valor);
                 cv++;
                 
                }
                    break;
                    case 23:
                        if(cx<cX){
                   Cola lx = new Cola("X",8);
                 agregarLetra(lx,valor);
                 cx++;
                 
                }
                    break;
                    case 24:
                        if(cy<cY){
                   Cola ly = new Cola("Y",4);
                 agregarLetra(ly,valor);
                 cy++;
                 
                }
                    break;
                    case 25:
                        if(cz<cZ){
                   Cola lz = new Cola("Z",10);
                 agregarLetra(lz,valor);
                 cz++;
                 
                }
                    break;
                    default:
                        break;
        }
        }
    
    
public void agrCola(){
    for(int valor = 1; valor<96;valor++){
       RandomCola(valor);
     
    }
}
public void recorrerCola(){
    int conta = 1;
    Cola aux = new Cola();
    aux=inicioLetra;
    do{
        
    aux=aux.siguiente;
    conta++;
        
    } while(aux != ultimaLetra.siguiente);
    System.out.println("tantas letras"+conta);
 

}

public void sacarCola(){
    colasale = inicioLetra;
    Cola nuevo = new Cola();
    nuevo = inicioLetra.siguiente;
    inicioLetra=nuevo;
    recorrerCola();
    
        recorrerCola();
    System.out.println("sale"+nuevo.letra);
       

}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("StateOfDreaming", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Ingreso Usuarios");

        jLabel2.setFont(new java.awt.Font("StateOfDreaming", 0, 14)); // NOI18N
        jLabel2.setText("Nombre Jugador");

        jTextField1.setBackground(new java.awt.Color(153, 255, 204));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("StateOfDreaming", 1, 14)); // NOI18N
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 51));
        jButton2.setFont(new java.awt.Font("StateOfDreaming", 0, 14)); // NOI18N
        jButton2.setText("Siguiente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(59, 59, 59)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(55, 55, 55)))
                        .addGap(146, 146, 146))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
IngresarUsuario();      


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      // buscar(jTextField1.getText());
//DiagramaArchivo();
  Tablero tablero= new Tablero();
 

 tablero.CrearImg();
  DiagramaArchivo();
   tablero.setVisible(true);
 

   
  
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
