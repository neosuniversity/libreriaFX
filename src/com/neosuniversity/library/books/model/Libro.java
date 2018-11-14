package com.neosuniversity.library.books.model;


public class Libro  {

    private int id;
    private String nombreLibro;
    private String autor;
    private String editorial;

    public Libro(){
    }

    public Libro(String nombreLibro, String autor, String editorial) {
        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.editorial = editorial;
    }
    public Libro(int id, String nombreLibro, String autor, String editorial) {
        this.id = id;
        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", nombreLibro='" + nombreLibro + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
