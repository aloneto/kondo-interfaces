package com.company;

class carro implements veiculo, Motor {

    @Override
    public String getNome() {

        return "Turbo";
    }

    @Override
    public int getId() {
        return 123;
    }

    @Override
    public String getModelo() {
        return "Uno";
    }

    @Override
    public String getFabricante() {
        return "Fiat";
    }
}

interface veiculo {
    public String getNome();
    public int getId();
}
interface Motor {

    public String getModelo();

    public String getFabricante();
}




