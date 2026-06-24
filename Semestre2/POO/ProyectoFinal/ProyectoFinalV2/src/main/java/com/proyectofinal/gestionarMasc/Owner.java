package com.proyectofinal.gestionarMasc;

public class Owner {
    // Atributos privados (encapsulamiento)
    private String nombre;
    private String paterno;
    private String materno;
    private String calle;
    private String colonia;
    private String ciudad;
    private String tel;
    private String mail;
    private int membresia;

    // <<constructor>>
    public Owner() {
    }

    public Owner(String nombre, String paterno, String materno, String calle, 
                 String colonia, String ciudad, String tel, String mail, int membresia) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.calle = calle;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.tel = tel;
        this.mail = mail;
        this.membresia = membresia;
    }

    // <<get, set>>
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPaterno() { return paterno; }
    public void setPaterno(String paterno) { this.paterno = paterno; }

    public String getMaterno() { return materno; }
    public void setMaterno(String materno) { this.materno = materno; }

    public String getCalle() { return calle; }
    public void setCalle(String calle) { this.calle = calle; }

    public String getColonia() { return colonia; }
    public void setColonia(String colonia) { this.colonia = colonia; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public String getTel() { return tel; }
    public void setTel(String tel) { this.tel = tel; }

    public String getMail() { return mail; }
    public void setMail(String mail) { this.mail = mail; }

    public int getMembresia() { return membresia; }
    public void setMembresia(int membresia) { this.membresia = membresia; }

    // <<toString>>
    @Override
    public String toString() {
        return "Owner{" +
                "nombre='" + nombre + '\'' +
                ", paterno='" + paterno + '\'' +
                ", materno='" + materno + '\'' +
                ", calle='" + calle + '\'' +
                ", colonia='" + colonia + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", tel='" + tel + '\'' +
                ", mail='" + mail + '\'' +
                ", membresia=" + membresia +
                '}';
    }
}