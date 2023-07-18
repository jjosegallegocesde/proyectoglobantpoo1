package org.example.modelos;

public class Usuario {

    //ATRIBUTOS=VARIABLES=DATOS
    private Integer id;
    private String nombres;
    private String documento;
    private Integer ubicacion;
    private String correoElectronico;

    //METODOS=FUNCIONES=ACCIONES
    //METODOS ESPECIALES

    public Usuario() { //constructor vacio
    }

    public Usuario(Integer id, String nombres, String documento, Integer ubicacion, String correoElectronico) {
        this.id = id;
        this.nombres = nombres;
        this.documento = documento;
        this.ubicacion = ubicacion;
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", documento='" + documento + '\'' +
                ", ubicacion=" + ubicacion +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {

        this.nombres = nombres;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
