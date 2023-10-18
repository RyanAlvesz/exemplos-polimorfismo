package br.senai.sp.jandira.model;

public class Caminhao implements Veiculo{


    @Override
    public void freair() {
        System.out.println("O caminhão freiou");
    }

    @Override
    public void acelerar() {
        System.out.println("O caminhão acelerou");
    }

    @Override
    public void buzinar() {
        System.out.println("O caminhão buzinou");
    }

}
