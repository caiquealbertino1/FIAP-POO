package br.com.fiapride.main;

import br.com.fiapride.model.Caneta;
import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

    public static void main(String[] args) {
        Passageiro passageiro1 = new Passageiro();
        passageiro1.nome = "Ana Silva";
        passageiro1.saldo = 50.0;

        Passageiro passageiro2 = new Passageiro();
        passageiro2.nome = "Carlos Souza";
        passageiro2.saldo = 12.50;

        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);


        Caneta minhaCaneta = new Caneta("Azul", "Plastico", true, false);
        Caneta canetaDoProfessor = new Caneta("Preto", "Metal", false, true);


        System.out.println("Minha caneta é da cor: " + minhaCaneta.cor);
        System.out.println("A do professor é da cor: " + canetaDoProfessor.cor);
        System.out.println("Minha caneta é do material: " + minhaCaneta.material);
        System.out.println("A do professor é do material: " + canetaDoProfessor.material);
        System.out.println("Minha caneta está tampada: " + minhaCaneta.tampa);
        System.out.println("A do professor está tampada: " + canetaDoProfessor.tampa);
        System.out.println("Minha caneta tem tinta: " + minhaCaneta.tinta);
        System.out.println("A do professor tem tinta: " + canetaDoProfessor.tinta);
    }
}