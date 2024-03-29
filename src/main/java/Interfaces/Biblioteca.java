/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Listas.ListadeCategorias;
import Listas.ListadeUsuarios;
import Listas.NodoUsuario;
import Listas.NodoImagen;
import Listas.ListaImagen;
import java.awt.Image;
import java.io.File;
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
public class Biblioteca extends javax.swing.JFrame {
  
    String foto;
    /**
     * Creates new form Biblioteca
     */
    
    
    Menu padre;
    private NodoUsuario usuario = new NodoUsuario();
    
    public Biblioteca(Menu padre, String nombre) {
        this.padre=padre;
        this.usuario=padre.listaUsuario.getUsuario(nombre);
        
        initComponents();
        LlenarCombo();
       jlb_Nombre.setText(usuario.getNombreUsuario()); 
    }
    
      

    private void LlenarCombo(){
        for (int i = 0; i < usuario.getListaCategoria().getSize(); i++) {
              cbx_Categorias.addItem(usuario.getListaCategoria().getNodo(i).getCategoria());
        }
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
        btn_Eliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btn_eliminarCategoria = new javax.swing.JButton();
        btn_agregarCategoria = new javax.swing.JButton();
        btn_Anterior = new javax.swing.JButton();
        btn_Siguiente = new javax.swing.JButton();
        img1 = new javax.swing.JLabel();
        btn_Volver = new javax.swing.JButton();
        jlb_Nombre = new javax.swing.JLabel();
        cbx_Categorias = new javax.swing.JComboBox<>();
        txt_Categoria = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Eliminar.setBackground(new java.awt.Color(153, 204, 255));
        btn_Eliminar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Eliminar.setText("Eliminar Imagen");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 130, 40));

        btnBuscar.setBackground(new java.awt.Color(153, 204, 255));
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("Agregar Imagen");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 130, 40));

        btn_eliminarCategoria.setBackground(new java.awt.Color(153, 204, 255));
        btn_eliminarCategoria.setForeground(new java.awt.Color(0, 0, 0));
        btn_eliminarCategoria.setText("Eliminar Categoria");
        btn_eliminarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, -1, -1));

        btn_agregarCategoria.setBackground(new java.awt.Color(153, 204, 255));
        btn_agregarCategoria.setForeground(new java.awt.Color(0, 0, 0));
        btn_agregarCategoria.setText("Agregar Categoria");
        btn_agregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        btn_Anterior.setBackground(new java.awt.Color(153, 204, 255));
        btn_Anterior.setForeground(new java.awt.Color(0, 0, 0));
        btn_Anterior.setText("Anterior");
        btn_Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AnteriorActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        btn_Siguiente.setBackground(new java.awt.Color(153, 204, 255));
        btn_Siguiente.setForeground(new java.awt.Color(0, 0, 0));
        btn_Siguiente.setText("Siguiente");
        btn_Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, -1, -1));
        jPanel1.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 390, 290));

        btn_Volver.setBackground(new java.awt.Color(153, 204, 255));
        btn_Volver.setForeground(new java.awt.Color(0, 0, 0));
        btn_Volver.setText("Volver");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 120, 40));
        jPanel1.add(jlb_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 100, 30));

        cbx_Categorias.setBackground(new java.awt.Color(153, 204, 255));
        cbx_Categorias.setForeground(new java.awt.Color(0, 0, 0));
        cbx_Categorias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_CategoriasItemStateChanged(evt);
            }
        });
        cbx_Categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_CategoriasActionPerformed(evt);
            }
        });
        jPanel1.add(cbx_Categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 130, 30));

        txt_Categoria.setBackground(new java.awt.Color(153, 204, 255));
        txt_Categoria.setForeground(new java.awt.Color(0, 0, 0));
        txt_Categoria.setBorder(null);
        jPanel1.add(txt_Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 386, 170, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    File archivo;
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        
        agregarImageALista();

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        
        padre.setVisible(true);
        padre.setLocationRelativeTo(null);
        this.setVisible(false);

    }//GEN-LAST:event_btn_VolverActionPerformed

    private void btn_AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AnteriorActionPerformed
        
        NodoImagen actual = (NodoImagen)this.padre.listaUsuario.getUsuario(usuario.getNombreUsuario()).listaCategoria.getNodo(cbx_Categorias.getSelectedItem().toString()).listaImagenes.find(archivo.getName());
        if (actual!=null) {
            NodoImagen anterior = actual.getBack();
            if (anterior!=null) {
                System.out.println(anterior.getPath_());
                mostrarImagen(img1, anterior.getPath_());
                archivo = new File(anterior.getPath_());
                foto = anterior.getPath_();
            }
        }
        
    }//GEN-LAST:event_btn_AnteriorActionPerformed

    private void btn_agregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarCategoriaActionPerformed

        if (!txt_Categoria.getText().isEmpty()) {
            String nombre = txt_Categoria.getText();
            this.padre.listaUsuario.setCategoriasUsuario(usuario.getNombreUsuario(),nombre);
            cbx_Categorias.addItem(nombre);
            txt_Categoria.setText("");
            img1.setIcon(null);
            
        }else{
            JOptionPane.showMessageDialog(this,"El campo debe estar lleno");
             }

    }//GEN-LAST:event_btn_agregarCategoriaActionPerformed

    private void btn_SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SiguienteActionPerformed
        
        
        NodoImagen actual = (NodoImagen)this.padre.listaUsuario.getUsuario(usuario.getNombreUsuario()).listaCategoria.getNodo(cbx_Categorias.getSelectedItem().toString()).listaImagenes.find(archivo.getName());
        if (actual!=null) {
            NodoImagen siguiente = actual.getNext();
            if (siguiente!=null) {
                System.out.println(siguiente.getPath_());
                mostrarImagen(img1, siguiente.getPath_());
                archivo = new File(siguiente.getPath_());
                foto= siguiente.getPath_();
            }
            
        }
        
        
    }//GEN-LAST:event_btn_SiguienteActionPerformed

    private void cbx_CategoriasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_CategoriasItemStateChanged
        System.out.println("Se cambio la categoria");
            if (cbx_Categorias.getSelectedItem()!=null) {
            NodoImagen primero = this.padre.listaUsuario.getUsuario(usuario.getNombreUsuario()).listaCategoria.getNodo(cbx_Categorias.getSelectedItem().toString()).listaImagenes.get(1);
                if (primero != null) {
                    foto = primero.getPath_();
                    archivo = new File(foto);
                    mostrarImagen(img1, primero.getPath_());
                    
                    
                }else{
                img1.setIcon(null);
                archivo = null;
                foto= "";
                }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_CategoriasItemStateChanged

    private void cbx_CategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_CategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_CategoriasActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed

        System.out.println("Se ingreso a eliminar");
         this.padre.listaUsuario.getUsuario(usuario.getNombreUsuario()).listaCategoria.getNodo(cbx_Categorias.getSelectedItem().toString()).listaImagenes.delete(archivo.getName());
        NodoImagen primero = this.padre.listaUsuario.getUsuario(usuario.getNombreUsuario()).listaCategoria.getNodo(cbx_Categorias.getSelectedItem().toString()).listaImagenes.get(1);
        if (primero != null) {
                    foto = primero.getPath_();
                    archivo = new File(foto);
                    mostrarImagen(img1, primero.getPath_());
                    
                    
                }else{
                img1.setIcon(null);
                archivo = null;
                foto= "";
                }

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_eliminarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarCategoriaActionPerformed

            System.out.println("Se esta eliminando una categoria");
            if (cbx_Categorias.getSelectedItem()!=null) {
             this.padre.listaUsuario.getUsuario(usuario.getNombreUsuario()).listaCategoria.delete(cbx_Categorias.getSelectedItem().toString());
             cbx_Categorias.removeItem(cbx_Categorias.getSelectedItem());
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarCategoriaActionPerformed
    
     private void agregarImageALista(){
        NodoImagen actual = buscarImagen();
        foto = actual.getPath_();
        if(!foto.equals(""))
        {
            mostrarImagen(this.img1, foto);
            this.padre.listaUsuario.getUsuario(usuario.getNombreUsuario()).listaCategoria.getNodo(cbx_Categorias.getSelectedItem().toString()).listaImagenes.add(actual);
        }
    }
     private void mostrarImagen(JLabel cuadro, String ruta){
    
        if(!ruta.equals("")){
            Image img = new ImageIcon(ruta).getImage();
            img = img.getScaledInstance(326, 250   , Image.SCALE_SMOOTH);
            ImageIcon imgI = new ImageIcon(img);
            cuadro.setIcon(imgI);
        }
    }
     
     private NodoImagen buscarImagen(){
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("jpg, jpeg, png", "jpg", "jpeg", "png");
        fc.setFileFilter(filtro);
        int resp = fc.showOpenDialog(this);
        if(resp==JFileChooser.APPROVE_OPTION){
            String nombre = fc.getSelectedFile().getName();
            String ubicacion = fc.getSelectedFile().getPath();
            archivo=fc.getSelectedFile();
            return new NodoImagen(nombre, ubicacion);
        }
        return null;
    }
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btn_Anterior;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Siguiente;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JButton btn_agregarCategoria;
    private javax.swing.JButton btn_eliminarCategoria;
    private javax.swing.JComboBox<String> cbx_Categorias;
    private javax.swing.JLabel img1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlb_Nombre;
    private javax.swing.JTextField txt_Categoria;
    // End of variables declaration//GEN-END:variables
}
