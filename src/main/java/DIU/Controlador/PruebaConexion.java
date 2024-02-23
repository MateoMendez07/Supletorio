/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Controlador.ConexionBDD;

/**
 *
 * @author tutut
 */
public class PruebaConexion {
    public static void main(String[] args) {
        ConexionBDD conectar = new ConexionBDD();
        conectar.conectar();
    }
}
