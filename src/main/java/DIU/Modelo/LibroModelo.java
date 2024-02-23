/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Modelo;

/**
 *
 * @author tutut
 */
public class LibroModelo {

    private String titulo;
    private String autor;
    private String ISBN;
    private int paginas;
    private int edicion;
    private String editorial;
    private String lugarCiudad;
    private String lugarPais;
    private String fechaEdicion;

    public LibroModelo() {
    }

    public LibroModelo(String titulo, String autor, String ISBN, int paginas, int edicion, String editorial, String lugarCiudad, String lugarPais, String fechaEdicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.paginas = paginas;
        this.edicion = edicion;
        this.editorial = editorial;
        this.lugarCiudad = lugarCiudad;
        this.lugarPais = lugarPais;
        this.fechaEdicion = fechaEdicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getLugarCiudad() {
        return lugarCiudad;
    }

    public void setLugarCiudad(String lugarCiudad) {
        this.lugarCiudad = lugarCiudad;
    }

    public String getLugarPais() {
        return lugarPais;
    }

    public void setLugarPais(String lugarPais) {
        this.lugarPais = lugarPais;
    }

    public String getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(String fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
