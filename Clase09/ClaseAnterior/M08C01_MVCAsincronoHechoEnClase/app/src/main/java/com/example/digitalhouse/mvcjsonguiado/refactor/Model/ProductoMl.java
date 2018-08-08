package com.example.digitalhouse.mvcjsonguiado.refactor.Model;

public class ProductoMl {
    private String id;
    private String title;
    private String price;
    private Boolean accepts_mercadopago;

    public ProductoMl(String id, String title, String price, Boolean accepts_mercadopago) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.accepts_mercadopago = accepts_mercadopago;
    }

    public ProductoMl(){}

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }

    public Boolean getAccepts_mercadopago() {
        return accepts_mercadopago;
    }
}
