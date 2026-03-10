package br.com.fiapride.main;

import br.com.fiapride.model.Caneta;

public class TesteCaneta {
    public static void main(String[] args){

        System.out.println("--- Teste do Meu Projeto Pessoal ---");

        Caneta minhaCaneta = new Caneta("Azul", "Plástico", true, false);
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
