package org.example.javacore.YColecoes.dominio;

public class SmartPhone {

    private String serialNumber;

    private String marca;


    public SmartPhone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Reflexivo : x.equals(x) tem que ser true para tudo que for diferente de null
    // Simetrico: para x e y diferenstes de null , se x.equals(y) == true logo , y.equals(x) == true

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
