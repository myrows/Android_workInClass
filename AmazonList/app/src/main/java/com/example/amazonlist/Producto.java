package com.example.amazonlist;

public class Producto {

    private String nombre,proveedor,recibe,envio,urlFoto,urlLogo,urlPrime,otros,resenias,stock,fechaLLegada, precio;
    private Float rate;

    public Producto(String nombre, String proveedor, String recibe, String envio, String urlFoto, String urlLogo, String urlPrime, String otros, String resenias, String stock, String fechaLLegada, String precio, Float rate) {
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.recibe = recibe;
        this.envio = envio;
        this.urlFoto = urlFoto;
        this.urlLogo = urlLogo;
        this.urlPrime = urlPrime;
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

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }

    public String getUrlPrime() {
        return urlPrime;
    }

    public void setUrlPrime(String urlPrime) {
        this.urlPrime = urlPrime;
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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }
}
