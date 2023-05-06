/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;
import CambioColor.AzulSepia;
import CambioColor.BlancoNegro;
import CambioColor.RojoSepia;
import CambioColor.SepiaSepia;
import CambioColor.VerdeSepia;
import Handlers.BmpHandlerCopy;
import Handlers.JPEGHandler;

import Listas.ListaImagen;
import Listas.ListadeUsuarios;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author eliot
 */
public class Editor extends javax.swing.JFrame {
    String foto;
    ListaImagen li;
     public ListadeUsuarios listaUsuario = new ListadeUsuarios();
    /**
     * Creates new form Editor
     */
    public Editor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Blancoynegro = new javax.swing.JButton();
        btn_Buscar = new javax.swing.JButton();
        btn_Convertir = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        IDireccion = new javax.swing.JLabel();
        btn_Volver = new javax.swing.JButton();
        lbl_Imagen = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Blancoynegro.setBackground(new java.awt.Color(153, 204, 255));
        btn_Blancoynegro.setForeground(new java.awt.Color(0, 0, 0));
        btn_Blancoynegro.setText("Blanco y Negro");
        btn_Blancoynegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BlancoynegroActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Blancoynegro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 220, 40));

        btn_Buscar.setBackground(new java.awt.Color(153, 204, 255));
        btn_Buscar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Buscar.setText("Seleccionar Imagen");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 150, 40));

        btn_Convertir.setBackground(new java.awt.Color(153, 204, 255));
        btn_Convertir.setForeground(new java.awt.Color(0, 0, 0));
        btn_Convertir.setText("JPEG a BMP y viveversa");
        btn_Convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConvertirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Convertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 220, 40));

        jButton4.setBackground(new java.awt.Color(153, 204, 255));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Copiar JPEG");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 220, 40));

        jButton5.setBackground(new java.awt.Color(153, 204, 255));
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Rojo Verde Azul Sepia");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 220, 40));

        IDireccion.setBackground(new java.awt.Color(255, 255, 255));
        IDireccion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(IDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 470, 20));

        btn_Volver.setBackground(new java.awt.Color(153, 204, 255));
        btn_Volver.setForeground(new java.awt.Color(0, 0, 0));
        btn_Volver.setText("Volver");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 150, 40));
        jPanel1.add(lbl_Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 390, 250));

        jButton6.setBackground(new java.awt.Color(153, 204, 255));
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("Modificar Imagen");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 220, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed

        Menu menu = new Menu(listaUsuario);
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        this.setVisible(false);


        // TODO add your handling code here:
    }//GEN-LAST:event_btn_VolverActionPerformed
    File archivo;
    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed

            int resultado;
            Buscador buscar = new Buscador();
            FileNameExtensionFilter formato = new FileNameExtensionFilter("JPG, PNG y BMP", "jpg", "png","bmp");
            buscar.JCFImg.setFileFilter(formato);
            resultado = buscar.JCFImg.showOpenDialog(null);
            if (JFileChooser.APPROVE_OPTION==resultado) {
                archivo= buscar.JCFImg.getSelectedFile();
                IDireccion.setText(archivo.getAbsolutePath());
                try {
                   ImageIcon ImgIcon = new ImageIcon(archivo.toString());
                   Icon icono = new ImageIcon(ImgIcon.getImage().getScaledInstance(lbl_Imagen.getWidth(), lbl_Imagen.getHeight(), Image.SCALE_DEFAULT));
                   lbl_Imagen.setIcon(icono);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_BlancoynegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BlancoynegroActionPerformed
        // TODO add your handling code here:
        System.out.println("Ingreso ");
        BlancoNegro bn = new BlancoNegro(archivo.getAbsolutePath());
        try {
            JPEGHandler.runHandler(bn);
        } catch (Exception e) {
        }
            mostrarImagen(this.lbl_Imagen, "C:\\Users\\eliot\\OneDrive\\Documentos\\NetBeansProjects\\Ugallery\\src\\main\\java\\Ccolor\\BlancoNegro.jpg");     
    }//GEN-LAST:event_btn_BlancoynegroActionPerformed

    private void btn_ConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConvertirActionPerformed

                String extencion =archivo.getName();
                int i = extencion.lastIndexOf('.');
                String fe = "";
		if (i > 0) {
		  fe = extencion.substring(i+1);
		}
            if ("bmp".equals(fe)) {
                try {
                File file = new File(archivo.getAbsolutePath());
                BufferedImage bufferedImage = ImageIO.read(file);
                ImageIO.write(bufferedImage, "jpg", new File("C:\\Users\\eliot\\OneDrive\\Documentos\\NetBeansProjects\\Ugallery\\src\\main\\java\\Conversion\\Converted_"+archivo.getName()+".jpg"));
                JOptionPane.showMessageDialog(null, "Se creo una imagen con el formato indicado en la ruta correspondiente");
                } catch (IOException e) {
                    e.printStackTrace();
                  }   
        }
            if ("jpg".equals(fe)) {
                try {
                File file = new File(archivo.getAbsolutePath());
                BufferedImage bufferedImage = ImageIO.read(file);
                ImageIO.write(bufferedImage, "bmp", new File("C:\\Users\\eliot\\OneDrive\\Documentos\\NetBeansProjects\\Ugallery\\src\\main\\java\\Conversion\\Converted_"+archivo.getName()+".bmp"));
                JOptionPane.showMessageDialog(null, "Se creo una imagen con el formato indicado en la ruta correspondiente");
                
                
                
                } catch (IOException e) {
                e.printStackTrace();
                }  
        }
    }//GEN-LAST:event_btn_ConvertirActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        System.out.println("Ingreso");
         File file = new File(archivo.getAbsolutePath());
                BufferedImage bufferedImage;
        try {
            bufferedImage = ImageIO.read(file);
            ImageIO.write(bufferedImage, "bmp", new File("C:\\Users\\eliot\\OneDrive\\Documentos\\NetBeansProjects\\Ugallery\\src\\main\\java\\Copias\\Converted_"+archivo.getName()+".bmp"));
            System.out.println("Se convierte a bmp");
        } catch (IOException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        }       
        BmpHandlerCopy cp = new BmpHandlerCopy("C:\\Users\\eliot\\OneDrive\\Documentos\\NetBeansProjects\\Ugallery\\src\\main\\java\\Copias\\Converted_"+archivo.getName()+".bmp");
   
        try {
            cp.readFile();
            cp.generateFiles();
            System.out.println("Se crea una copia de bmp");
        } catch (Exception ex) {
            System.out.println("No se pudo generar la copia");
            System.out.println(ex.toString());
        }
         try {
                File file2 = new File("C:\\Users\\eliot\\OneDrive\\Documentos\\NetBeansProjects\\Ugallery\\src\\main\\java\\Copias\\copy-Converted_"+archivo.getName()+".bmp");
                BufferedImage bufferedImage2 = ImageIO.read(file2);
                ImageIO.write(bufferedImage2, "jpg", new File("C:\\Users\\eliot\\OneDrive\\Documentos\\NetBeansProjects\\Ugallery\\src\\main\\java\\Copias\\Converted_"+archivo.getName()+".jpg"));
                JOptionPane.showMessageDialog(null, "Se creo una imagen con el formato indicado en la ruta correspondiente");
                } catch (IOException e) {
                    e.printStackTrace();
                  }
        
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

         System.out.println("Ingreso ");
        RojoSepia bn = new RojoSepia(archivo.getAbsolutePath());
        AzulSepia an = new AzulSepia(archivo.getAbsolutePath());
        VerdeSepia vn = new VerdeSepia(archivo.getAbsolutePath());
        SepiaSepia rn = new SepiaSepia(archivo.getAbsolutePath());
        try {
            bn.readFile();
            bn.generateFiles();
            an.readFile();
            an.generateFiles();
            vn.readFile();
            vn.generateFiles();
            rn.readFile();
            rn.generateFiles();
            JOptionPane.showMessageDialog(null, "Se crearon las imagenes en la ruta correspondiente"); 
        } catch (Exception e) {
        }
                
         


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void mostrarImagen(JLabel cuadro, String ruta){
    
        if(!ruta.equals("")){
            Image img = new ImageIcon(ruta).getImage();
            img = img.getScaledInstance(lbl_Imagen.getWidth(), lbl_Imagen.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon imgI = new ImageIcon(img);
            cuadro.setIcon(imgI);
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDireccion;
    private javax.swing.JButton btn_Blancoynegro;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Convertir;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Imagen;
    // End of variables declaration//GEN-END:variables
}
