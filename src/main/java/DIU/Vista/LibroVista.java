/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU.Vista;
import DIU.Controlador.ConexionBDD;
import DIU.Modelo.LibroModelo;

import java.awt.List;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 *
 * @author alen
 */

    
public class LibroVista extends javax.swing.JInternalFrame {
 
private ArrayList<LibroModelo> libros = new ArrayList<>();


    /**
     * Creates new form insertar_libro
     */
    public LibroVista() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtISBN = new javax.swing.JTextField();
        txtPagina = new javax.swing.JTextField();
        txtEdicion = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtLugar = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JToggleButton();
        btnLimpiar = new javax.swing.JToggleButton();
        btnAgregarAlarray = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnIngresarArrayAlaBase = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("titulo Del Libro");

        jLabel2.setText("autor");

        jLabel3.setText("ISBN");

        jLabel4.setText("páginas");

        jLabel5.setText("edición");

        jLabel6.setText("editorial");

        jLabel7.setText("lugar");

        jLabel8.setText("fecha de edición");

        btnIngresar.setText("ingresar el libro");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("limpiar Datos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnAgregarAlarray.setText("aniadir al array");
        btnAgregarAlarray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlarrayActionPerformed(evt);
            }
        });

        btnVer.setText("ver array");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        btnIngresarArrayAlaBase.setText("Insertar En Base");
        btnIngresarArrayAlaBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarArrayAlaBaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtLugar)
                    .addComponent(txtEditorial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(txtEdicion)
                    .addComponent(txtISBN, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAutor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPagina, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAgregarAlarray)
                        .addGap(100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnIngresar))
                            .addComponent(btnVer)
                            .addComponent(btnIngresarArrayAlaBase))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtPagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIngresarArrayAlaBase)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnIngresar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgregarAlarray))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVer)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(208, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
 txtTitulo.setText("");      
    txtAutor.setText("");      
    txtISBN.setText("");       
    txtPagina.setText("");     
    txtEdicion.setText("");    
    txtEditorial.setText("");   
    txtLugar.setText("");       
    txtFecha.setText("");   
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
 String titulo = txtTitulo.getText().trim();
String autorCedula = txtAutor.getText().trim();
String ISBN = txtISBN.getText().trim();
String paginaStr = txtPagina.getText().trim();
String edicion = txtEdicion.getText().trim();
String editorial = txtEditorial.getText().trim();
String lugar = txtLugar.getText().trim();
String fecha = txtFecha.getText().trim();

// Validar que los campos no estén vacíos
if (titulo.isEmpty() || autorCedula.isEmpty() || ISBN.isEmpty() ||
    paginaStr.isEmpty() || edicion.isEmpty() || editorial.isEmpty() ||
    lugar.isEmpty() || fecha.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

int pagina;
try {
    pagina = Integer.parseInt(paginaStr);
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "El número de páginas debe ser un número entero", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

try {
    // Verificar si la cédula del autor existe en la tabla persona
    int autorId = -1;
    try (Connection con = ConexionBDD.getConnection();
         CallableStatement cs = con.prepareCall("{CALL ObtenerIdAutorPorCedula(?, ?)}")) {
        cs.setString(1, autorCedula);
        cs.registerOutParameter(2, Types.INTEGER);
        cs.execute();
        autorId = cs.getInt(2);
    }
    
    if (autorId == -1) {
        // Si la cédula del autor no existe, mostrar un mensaje de error
        JOptionPane.showMessageDialog(this, "El autor con cédula " + autorCedula + " no existe", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        // Si la cédula del autor existe, llamar al procedimiento almacenado para insertar el libro
        try (Connection con = ConexionBDD.getConnection();
             CallableStatement cs = con.prepareCall("{CALL IngresarLibro(?, ?, ?, ?, ?, ?, ?, ?)}")) {
            cs.setString(1, titulo);
            cs.setInt(2, autorId);
            cs.setString(3, ISBN);
            cs.setInt(4, pagina);
            cs.setString(5, edicion);
            cs.setString(6, editorial);
            cs.setString(7, lugar);
            cs.setString(8, fecha);
            cs.execute();
        }
        
        // Limpiar los campos
        txtTitulo.setText("");
        txtAutor.setText("");
        txtISBN.setText("");
        txtPagina.setText("");
        txtEdicion.setText("");
        txtEditorial.setText("");
        txtLugar.setText("");
        txtFecha.setText("");
        
        JOptionPane.showMessageDialog(this, "Libro ingresado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(this, "Error al insertar libro: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}


    }//GEN-LAST:event_btnIngresarActionPerformed
    private void btnAgregarAlarrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlarrayActionPerformed
 String titulo = txtTitulo.getText().trim();
        String autor = txtAutor.getText().trim();
        String ISBN = txtISBN.getText().trim();
        String paginaStr = txtPagina.getText().trim();
        String edicion = txtEdicion.getText().trim();
        String editorial = txtEditorial.getText().trim();
        String lugar = txtLugar.getText().trim();
        String fecha = txtFecha.getText().trim();

        // Validar que los campos no estén vacíos
        if (titulo.isEmpty() || autor.isEmpty() || ISBN.isEmpty() ||
                paginaStr.isEmpty() || edicion.isEmpty() || editorial.isEmpty() ||
                lugar.isEmpty() || fecha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int pagina;
        try {
            pagina = Integer.parseInt(paginaStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El número de páginas debe ser un número entero", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Crear un nuevo libro y agregarlo al ArrayList
        LibroModelo libro = new LibroModelo(titulo, autor, ISBN, pagina, edicion, editorial, lugar, fecha);
        libros.add(libro);

        // Ordenar los libros por título
        Collections.sort(libros, Comparator.comparing(LibroModelo::getTitulo));

        // También puedes imprimir los libros en consola para verificar que se estén ordenando correctamente
        for (LibroModelo l : libros) {
            System.out.println(l.getTitulo());
        }
    }//GEN-LAST:event_btnAgregarAlarrayActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
    // Limpiar el contenido del JTextArea
    txtArea.setText("");

    // Recorrer el array de libros y mostrar cada libro en el JTextArea
    for (LibroModelo libro : libros) {
        txtArea.append(libro.toString() + "\n");
    }    }//GEN-LAST:event_btnVerActionPerformed

    private void btnIngresarArrayAlaBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarArrayAlaBaseActionPerformed
         try {
        // Recorrer la lista de libros y ejecutar el procedimiento almacenado para insertar cada libro
        for (LibroModelo libro : libros) {
            try (Connection con = ConexionBDD.getConnection();
                 CallableStatement cs = con.prepareCall("{CALL IngresarLibro(?, ?, ?, ?, ?, ?, ?, ?)}")) {
                cs.setString(1, libro.getTitulo());
                cs.setInt(2, Integer.parseInt( libro.getAutor()));
                cs.setString(3, libro.getISBN());
                cs.setInt(4, libro.getPaginas());
                cs.setString(5, libro.getEdicion());
                cs.setString(6, libro.getEditorial());
                cs.setString(7, libro.getLugar());
                cs.setString(8, libro.getFecha());
                cs.execute();
            }
        }
        
        JOptionPane.showMessageDialog(this, "Libros ingresados correctamente a la base de datos", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al insertar libros en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnIngresarArrayAlaBaseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAlarray;
    private javax.swing.JToggleButton btnIngresar;
    private javax.swing.JButton btnIngresarArrayAlaBase;
    private javax.swing.JToggleButton btnLimpiar;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEdicion;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtPagina;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
