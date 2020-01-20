package com.example.amazonlist;

public class Producto {

    private String nombre,proveedor,recibe,envio,urlFoto,otros,resenias,stock,fechaLLegada;
    private Integer precio;
    private Float rate;

    public Producto(String nombre, String proveedor, String recibe, String envio, String urlFoto, String otros, String resenias, String stock, String fechaLLegada, Integer precio, Float rate) {
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.recibe = recibe;
        this.envio = envio;
        this.urlFoto = urlFoto;
        this.otros = otros;
        this.resenias = resenias;
        this.stock = stock;
        this.fechaLLegada = fechaLLegada;
        this.precio = precio;
        this.rate = rate;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getRecibe() {
        return recibe;
    }

    public void setRecibe(String recibe) {
        this.recibe = recibe;
    }

    public String getEnvio() {
        return envio;
    }

    public void setEnvio(String envio) {
        this.envio = envio;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public String getResenias() {
        return resenias;
    }

    public void setResenias(String resenias) {
        this.resenias = resenias;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getFechaLLegada() {
        return fechaLLegada;
    }

    public void setFechaLLegada(String fechaLLegada) {
        this.fechaLLegada = fechaLLegada;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }
}
