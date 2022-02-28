package projeto.bootcamp;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição: Esse é um curso java");
        curso1.getCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição: Esse é um curso de Java Script");
        curso2.getCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Essa mentoria é de Java");
        mentoria1.getData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Gabriel" + devGabriel.getConteudoInseridos());
        devGabriel.progredir();
        System.out.println(".");
        System.out.println("Conteudos Inscritos Gabriel" + devGabriel.getConteudoInseridos());
        System.out.println("Conteudos Concluidos Gabriel" + devGabriel.getConteudosConcluidos());
        System.out.println("Xp:" + devGabriel.calcularTotalXp());

        System.out.println("----------------");

        Dev devBia = new Dev();
        devBia.setNome("Bia");
        devBia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devBia.getConteudoInseridos());
        devBia.progredir();
        devBia.progredir();
        devBia.progredir();
        System.out.println(".");
        System.out.println("Conteudos Inscritos" + devBia.getConteudoInseridos());
        System.out.println("Conteudos Concluidos Bia" + devBia.getConteudosConcluidos());
        System.out.println("XP:" + devBia.calcularTotalXp());

    }
}
