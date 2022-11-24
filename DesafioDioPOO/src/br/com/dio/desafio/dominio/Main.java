package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso java");
		curso1.setDescricao("Descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso js");
		curso2.setDescricao("Descrição curso js");
		curso2.setCargaHoraria(4);
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria java");
		mentoria.setDescricao("Descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp JAVA Developer");
		bootcamp.setDescricao("Descrição Bootcamp JAVA Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devFilipe = new Dev();
		devFilipe.setNome("Filipe");
		devFilipe.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Filipe" + 	devFilipe.getConteudosInscritos());
		devFilipe.progredir();
		devFilipe.progredir();
		System.out.println("Conteúdos inscritos Filipe" + 	devFilipe.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Filipe" + 	devFilipe.getConteudosConcluidos());
		System.out.println("XP: " + devFilipe.calculaTotalXp());
		
		System.out.println("...............");
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos João" + 	devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("Conteúdos inscritos João" + 	devJoao.getConteudosInscritos());
		System.out.println("Conteúdos concluídos João" + 	devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calculaTotalXp());
	}

}
