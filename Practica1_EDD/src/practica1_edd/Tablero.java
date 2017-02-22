package practica1_edd;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.TransferHandler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Astrid Hernandez
 */
public class Tablero extends javax.swing.JFrame {

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
    
    
    
    public Tablero() {
        
        initComponents();
     //  CrearImg();
    //   CrearImg2();
      //turno();
 agrCola();
 
 
jLabel3.setBounds(14, 34,14 ,34);
jLabel4.setBounds(14,34,14,34);
jLabel5.setBounds(14, 34,14 ,34);
jLabel6.setBounds(14,34,14,34);
jLabel7.setBounds(14, 34,14 ,34);
jLabel8.setBounds(14,34,14,34);
jLabel9.setBounds(14, 34,14 ,34);

 MouseListener ml = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent me) {
                
            }

            @Override
            public void mousePressed(MouseEvent me) {
               JComponent jc = (JComponent)me.getSource();
               TransferHandler th = jc.getTransferHandler();
               th.exportAsDrag(jc, me, TransferHandler.COPY);
            }

            @Override
            public void mouseReleased(MouseEvent me) {
               
            }

            @Override
            public void mouseEntered(MouseEvent me) {
               }

            @Override
            public void mouseExited(MouseEvent me) {
                
            }
        };
 
jLabel3.addMouseListener(ml);
jLabel3.setTransferHandler(new TransferHandler("text"));
jLabel4.addMouseListener(ml);
jLabel4.setTransferHandler(new TransferHandler("text"));
jLabel5.addMouseListener(ml);
jLabel5.setTransferHandler(new TransferHandler("text"));
jLabel6.addMouseListener(ml);
jLabel6.setTransferHandler(new TransferHandler("text"));
jLabel7.addMouseListener(ml);
jLabel7.setTransferHandler(new TransferHandler("text"));
jLabel8.addMouseListener(ml);
jLabel8.setTransferHandler(new TransferHandler("text"));
jLabel9.addMouseListener(ml);
jLabel9.setTransferHandler(new TransferHandler("text"));
    }
public void CrearImg(){
   
    try {
    
      
      String dotPath = "C:\\release\\bin\\dot.exe";
      
      String fileInputPath = "C:\\release\\EDD\\Jugadores.txt";
      String fileOutputPath = "C:\\Users\\Astrid Hernandez\\Documents\\GitHub\\Practica1s12017_201213223\\Practica1_EDD\\src\\practica1_edd\\Imagenes\\Jugadores.png";
      
      String tParam = "-Tjpg";
      String tOParam = "-o";
        
      String[] cmd = new String[5];
      cmd[0] = dotPath;
      cmd[1] = tParam;
      cmd[2] = fileInputPath;
      cmd[3] = tOParam;
      cmd[4] = fileOutputPath;
                  
      Runtime rt = Runtime.getRuntime();
      
      rt.exec( cmd );
      
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
    }

}

public void CrearImg2(){
    try {
      
      String dotPath = "C:\\release\\bin\\dot.exe";
      
      String fileInputPath = "C:\\release\\EDD\\Palabras.txt";
      String fileOutputPath = "C:\\Users\\Astrid Hernandez\\Documents\\GitHub\\Practica1s12017_201213223\\Practica1_EDD\\src\\practica1_edd\\Imagenes\\Palabras.png";
      
      String tParam = "-Tjpg";
      String tOParam = "-o";
        
      String[] cmd = new String[5];
      cmd[0] = dotPath;
      cmd[1] = tParam;
      cmd[2] = fileInputPath;
      cmd[3] = tOParam;
      cmd[4] = fileOutputPath;
                  
      Runtime rt = Runtime.getRuntime();
      
      rt.exec( cmd );
      
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
        
    }
}
public void crear(int dimension){
    
    for (int j = 0; j < dimension; j++) {
            for (int i = 0; i < dimension; i++) {

        

            }
        }
}


    /**(
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jButton8 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton8.setText("Asignar Letra");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Astrid Hernandez\\Documents\\GitHub\\Practica1s12017_201213223\\Practica1_EDD\\src\\practica1_edd\\Imagenes\\Palabras.png")); // NOI18N
        jScrollPane1.setViewportView(jLabel1);

        jTabbedPane1.addTab("Lista Palabras", jScrollPane1);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Astrid Hernandez\\Documents\\GitHub\\Practica1s12017_201213223\\Practica1_EDD\\src\\practica1_edd\\Imagenes\\Jugadores.png")); // NOI18N
        jScrollPane2.setViewportView(jLabel2);

        jTabbedPane1.addTab("Lista Jugador", jScrollPane2);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Astrid Hernandez\\Documents\\GitHub\\Practica1s12017_201213223\\Practica1_EDD\\src\\practica1_edd\\Imagenes\\Cola.png")); // NOI18N
        jLabel10.setText("jLabel10");
        jScrollPane3.setViewportView(jLabel10);

        jTabbedPane1.addTab("Cola", jScrollPane3);

        jButton1.setText("Crear Imagen");
        jButton1.setActionCommand("CrearCola");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        jLabel9.setText("jLabel9");

        jLabel11.setText("jLabel11");

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel4)))))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(105, 105, 105))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)))))
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel11)
                        .addGap(33, 33, 33)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))))
                .addGap(11, 11, 11)
                .addComponent(jLabel9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       
        
       sacarCola();
      
        
       
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
            // TODO add your handling code here:
            
            DiagramaArchivo();
            CrearImgCola();
            
            
            
            
        
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
    int tab=0;
        switch(tab){
            case 0:
                
      tab = jTabbedPane1.getSelectedIndex();
    
        break;
            case 1:
                tab = jTabbedPane1.getSelectedIndex();
            break;    
            case 2:
                tab = jTabbedPane1.getSelectedIndex();
                break;
    }   // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1StateChanged

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
   Usuario usu = new Usuario();
    colasale = inicioLetra;
    Cola nuevo = new Cola();
    nuevo = inicioLetra.siguiente;
    inicioLetra=nuevo;
    recorrerCola();
    
        recorrerCola();
    System.out.println("sale"+nuevo.letra);
      jLabel3.setText(nuevo.letra);
     
      jLabel4.setText(nuevo.siguiente.letra);
            jLabel5.setText(nuevo.siguiente.siguiente.letra);
             jLabel6.setText(nuevo.siguiente.siguiente.siguiente.letra);
              jLabel7.setText(nuevo.siguiente.siguiente.siguiente.siguiente.letra);
               jLabel8.setText(nuevo.siguiente.siguiente.siguiente.siguiente.siguiente.letra);
                jLabel9.setText(nuevo.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.letra);
            
    
}
 public void DiagramaArchivo(){
    String texArchivo = "digraph ListaCola"+contador +"{\n";
    Cola bandera = new Cola();
    bandera = inicioLetra;
    do{
         if(bandera== inicioLetra && bandera==ultimaLetra){
           texArchivo = texArchivo+bandera.letra+";";
       
        }
         else if(bandera == inicioLetra){
             texArchivo = texArchivo + bandera.letra;
             
        } else if(bandera== ultimaLetra){
            texArchivo = texArchivo +"->"+ bandera.letra+"->"+inicioLetra.letra+";\n";
            
       }
    else{
             texArchivo = texArchivo +"->"+ bandera.letra+";\n"+bandera.letra;
        }
            
       bandera = bandera.siguiente;
    }while(bandera != null);
     texArchivo = texArchivo + "}";
   // jTextArea1.setText(texArchivo);
     
     try{
         File archi = new File("C:\\release\\EDD\\Cola.txt");
         FileWriter fw = new FileWriter(archi,true);
         fw.write(texArchivo);
         fw.close();
         
     }catch(IOException ex){
    }
 }
 
 public void CrearImgCola(){
   
    try {
    
      
      String dotPath = "C:\\release\\bin\\dot.exe";
      
      String fileInputPath = "C:\\release\\EDD\\Cola.txt";
      String fileOutputPath = "C:\\Users\\Astrid Hernandez\\Documents\\GitHub\\Practica1s12017_201213223\\Practica1_EDD\\src\\practica1_edd\\Imagenes\\Cola.png";
      
      String tParam = "-Tjpg";
      String tOParam = "-o";
        
      String[] cmd = new String[5];
      cmd[0] = dotPath;
      cmd[1] = tParam;
      cmd[2] = fileInputPath;
      cmd[3] = tOParam;
      cmd[4] = fileOutputPath;
                  
      Runtime rt = Runtime.getRuntime();
      
      rt.exec( cmd );
      
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
    }

}
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
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
