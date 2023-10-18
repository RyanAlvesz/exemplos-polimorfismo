package br.senai.sp.jandira.model;

public class Jetski implements Veiculo{

    @Override
    public void freair() {
        System.out.println("O Jetski freiou");
    }

    @Override
    public void acelerar() {
        System.out.println("O Jetski acelerou");
    }

    @Override
    public void buzinar() {
        System.out.println("O Jetski buzinou");
    }

}
