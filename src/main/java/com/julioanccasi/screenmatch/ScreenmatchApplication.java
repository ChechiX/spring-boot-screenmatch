package com.julioanccasi.screenmatch;

import com.julioanccasi.screenmatch.model.DatosEpisodio;
import com.julioanccasi.screenmatch.model.DatosSerie;
import com.julioanccasi.screenmatch.model.DatosTemporadas;
import com.julioanccasi.screenmatch.principal.Principal;
import com.julioanccasi.screenmatch.service.ConsumoApi;
import com.julioanccasi.screenmatch.service.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.muestraElMenu();
	}
}
