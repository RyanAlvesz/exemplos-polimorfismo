package br.senai.sp.jandira;

import br.senai.sp.jandira.model.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pessoas pessoas = new Pessoas();
        pessoas.setNome("Ryan");
        System.out.println("O nome é " + pessoas.getNome());

        Jogador jogador1 = new Jogador();
        jogador1.cadastrarJogador();
        jogador1.exibirInformacoes();

        Vaca vaca = new Vaca();
        vaca.fazerSom();

        Gato gato = new Gato();
        gato.fazerSom();

        Caminhao caminhao = new Caminhao();
        Jetski jetski = new Jetski();

        caminhao.acelerar();
        jetski.buzinar();

    }

}
