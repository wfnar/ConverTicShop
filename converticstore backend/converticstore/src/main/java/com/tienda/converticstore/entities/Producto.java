package com.tienda.converticstore.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    @Column(name = "id_marca")
    private Integer idMarca;
    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "id_talla")
    private Integer idTalla;

    @Column(name = "id_color")
    private Integer idColor;

    @Column(name = "id_genero")
    private Integer idGenero;

    @Column(name = "precio_unitario")
    private Double precioUnitario;

    @Column(name = "stock")
    private Integer stock;

    @Column(name = "numero_busquedas")
    private Integer numeroBusquedas;

    @Column(name = "descripcion")
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_marca", insertable = false, updatable = false)
    private Marcas marca;
    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "id_talla", insertable = false, updatable = false)
    private Tallas talla;

    @ManyToOne
    @JoinColumn(name = "id_color", insertable = false, updatable = false)
    private Colores color;

    @ManyToOne
    @JoinColumn(name = "id_genero", insertable = false, updatable = false)
    private Generos genero;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getIdTalla() {
        return idTalla;
    }

    public void setIdTalla(Integer idTalla) {
        this.idTalla = idTalla;
    }

    public Integer getIdColor() {
        return idColor;
    }

    public void setIdColor(Integer idColor) {
        this.idColor = idColor;
    }

    public Integer getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getNumeroBusquedas() {
        return numeroBusquedas;
    }

    public void setNumeroBusquedas(Integer numeroBusquedas) {
        this.numeroBusquedas = numeroBusquedas;
    }

    public Marcas getMarca() {
        return marca;
    }

    public void setMarca(Marcas marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Tallas getTalla() {
        return talla;
    }

    public void setTalla(Tallas talla) {
        this.talla = talla;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public Generos getGenero() {
        return genero;
    }

    public void setGenero(Generos genero) {
        this.genero = genero;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
