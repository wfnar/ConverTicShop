package com.tienda.converticstore.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "ciudades")
public class Ciudades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ciudad")
    private Integer idCiudad;
    private String ciudad;
    @Column(name = "id_pais")
    private Integer idPais;

    @ManyToOne
    @JoinColumn(name = "id_pais", insertable = false,updatable = false)
    private Paises paises;

    public Integer getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    public Paises getPaises() {
        return paises;
    }

    public void setPaises(Paises paises) {
        this.paises = paises;
    }
}
