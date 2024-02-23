/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Modelo.LibroModelo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author tutut
 */
public class LibroControlador {
    private Connection conectado;

    public LibroControlador(Connection conectado) {
        this.conectado = conectado;
}
public ArrayList<LibroModelo> listarLibrosPorTituloAlfabeticamente() {
        ArrayList<LibroModelo> listaLibros = new ArrayList<>();
        try {
            String sql = "CALL sp_ListarLibrosPorTituloAlfabeticamente()";
            PreparedStatement statement = conectado.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();

            while (resultado.next()) {
                // Modificar para incluir el nombre del autor
                LibroModelo libro = new LibroModelo(
                    resultado.getString("titulo"),
                    resultado.getString("autor"), // Cambiar a obtener el nombre del autor
                    resultado.getString("ISBN"),
                    resultado.getInt("paginas"),
                    resultado.getInt("edicion"),
                    resultado.getString("editorial"),
                    resultado.getString("lugar_ciudad"),
                    resultado.getString("lugar_pais"),
                    resultado.getString("fecha_edicion")
                );
                listaLibros.add(libro);
            }
            resultado.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaLibros;
    }
public void agregarLibro(LibroModelo libro) {
        try {
            // Llamar al procedimiento almacenado para agregar el libro
            String sql = "CALL sp_AgregarLibro(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            CallableStatement statement = conectado.prepareCall(sql);
            
            // Establecer los parámetros del procedimiento almacenado
            statement.setString(1, libro.getTitulo());
            statement.setString(2, libro.getAutor());
            statement.setString(3, libro.getISBN());
            statement.setInt(4, libro.getPaginas());
            statement.setInt(5, libro.getEdicion());
            statement.setString(6, libro.getEditorial());
            statement.setString(7, libro.getLugarCiudad());
            statement.setString(8, libro.getLugarPais());
            statement.setString(9, libro.getFechaEdicion());
            
            // Ejecutar el procedimiento almacenado
            statement.execute();
            
            // Cerrar la declaración
            statement.close();
            
            System.out.println("Libro agregado exitosamente.");
        } catch (SQLException e) {
            System.out.println("Error al agregar el libro: " + e.getMessage());
        }
    }
}