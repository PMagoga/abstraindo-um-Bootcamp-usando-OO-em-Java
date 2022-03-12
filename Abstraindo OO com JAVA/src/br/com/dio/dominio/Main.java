package br.com.dio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descri��o curso java");
		curso1.setCargaHoraria(0);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso JS");
		curso2.setDescricao("descri��o curso JS");
		curso2.setCargaHoraria(5);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descri��o mentoria java");
		mentoria.setData(LocalDate.now());
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devPablo = new Dev();
		devPablo.setNome("Pablo");
		devPablo.increverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos Pablo" + devPablo.getConteudosInscritos());
		System.out.println("Conte�dos Conclu�dos Pablo" + devPablo.getConteudosConcluidos());
		
		Dev devJose = new Dev();
		devJose.setNome("Jos�");
		devJose.increverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos Jos�" + devJose.getConteudosInscritos());
		System.out.println("Conte�dos Conclu�dos Jos�" + devJose.getConteudosConcluidos());
	}
	
}
