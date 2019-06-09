package com.company;

public class Main {

    public static void main(String[] args) {

        carro car = new carro();
        System.out.println("o fabricante " + car.getFabricante());
        System.out.println("produz um modelo chamado: " + car.getModelo());
        System.out.println("cujo nome é: " + car.getNome());
        System.out.println("com Id: " + car.getId());


    }
}
