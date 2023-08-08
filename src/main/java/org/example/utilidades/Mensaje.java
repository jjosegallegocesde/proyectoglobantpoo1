package org.example.utilidades;

public enum Mensaje {

    FORMATO_NOMBRE("revise el formato del nombr eingresado"),
    LONGITUD_NOMBRE("Revise la longitud dle nombre, es muy corta");

    private String mensaje;

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
