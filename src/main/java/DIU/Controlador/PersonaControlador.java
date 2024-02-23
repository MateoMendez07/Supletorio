/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;
import DIU.Controlador.ConexionBDD;
import DIU.Modelo.PersonaModelo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *i
 */
    public class PersonaControlador {

    private PersonaModelo persona;
    private Connection conectado;
    private ConexionBDD conexionBDD = new ConexionBDD(); 

    public PersonaControlador() {
        // Inicializar la conexión en el constructor
      
        
    }

    public PersonaModelo getPersona() {
        return persona;
    }

    public void setPersona(PersonaModelo persona) {
        this.persona = persona;
    }

    public void insertarPersona(String cedula, String nombre) {
        try (CallableStatement cs = conectado.prepareCall("{CALL InsertarPersona(?, ?)}")) {
            cs.setString(1, cedula);
            cs.setString(2, nombre);
            cs.execute();
        } catch (SQLException e) {
            // Manejo de la excepción si ocurre algún error al insertar la persona
            e.printStackTrace();
            throw new RuntimeException("Error al insertar persona: " + e.getMessage());
        }
    }
}