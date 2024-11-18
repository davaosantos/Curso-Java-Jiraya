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

        //Caso o objeto seja nulo , não tem como ser igual
        if (obj == null) return false;

        //Caso façam referencia para o msm objeto , retorna true tbm
        if (this == obj) return true;

        if (this.getClass() != obj.getClass()) return false; // Verificar se é a mesma classe , no caso Smartphone

        SmartPhone smartph = (SmartPhone) obj; // como não caiu no return , sei que é um tipo Smarthpone

        return this.serialNumber != null && this.serialNumber.equals(smartph.serialNumber); // Caso não seja nulo o serialNumber e seja igual ao do parametro , true
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
