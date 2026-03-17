package br.com.fiapride.main;

import br.com.fiapride.model.Caneta;

public class TesteCaneta {

    public static void main(String[] args) {

        System.out.println("--- Teste do Meu Projeto Pessoal ---");

        Caneta minhaCaneta = new Caneta("Azul", "Plástico", true, false);
        Caneta canetaDoProfessor = new Caneta("Preto", "Metal", false, true);

        System.out.println("\n--- Status das Canetas ---");
        System.out.println("Minha Caneta - Cor: " + minhaCaneta.getCor() + "Material: " + minhaCaneta.getMaterial());
        System.out.println("Caneta do Professor - Cor: " + canetaDoProfessor.getCor() + "Material: " + canetaDoProfessor.getMaterial());

    }
}
