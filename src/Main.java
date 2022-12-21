import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso apresentando conceitos sobre a linguagem Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java POO");
        curso2.setDescricao("Curso apresentando conceitos sobre programação orientada a objetos em java");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTais = new Dev();
        devTais.setNome("Taís");
        devTais.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Taís: " + devTais.getConteudosInscritos());
        devTais.progredir();
        devTais.progredir();
        devTais.progredir();
        System.out.println("Conteúdos inscritos Taís: " + devTais.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Taís: " + devTais.getConteudosConcluidos());
        System.out.println("XP: " + devTais.calcularTotalXp());

        Dev devDiogo = new Dev();
        devDiogo.setNome("Diogo");
        devDiogo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Diogo: " + devDiogo.getConteudosInscritos());
        devDiogo.progredir();
        System.out.println("Conteúdos inscritos Diogo: " + devDiogo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Diogo: " + devDiogo.getConteudosConcluidos());
        System.out.println("XP: " + devDiogo.calcularTotalXp());
    }
}