package com.julioanccasi.screenmatch;

import com.julioanccasi.screenmatch.principal.Principal;
import com.julioanccasi.screenmatch.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	@Autowired
	private SerieRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repository);
		principal.muestraElMenu();
//		EjemploStreams ejemploStreams = new EjemploStreams();
//		ejemploStreams.muestraEjemplo();
	}
}
