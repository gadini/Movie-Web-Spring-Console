package br.com.github.gadini.movieweb;

import br.com.github.gadini.movieweb.main.Main;
import br.com.github.gadini.movieweb.model.DadosEpisodio;
import br.com.github.gadini.movieweb.model.DadosSerie;
import br.com.github.gadini.movieweb.model.DadosTemporada;
import br.com.github.gadini.movieweb.service.ConsumoAPI;
import br.com.github.gadini.movieweb.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class MoviewebApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MoviewebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Main main = new Main();
		main.exibeMenu();

	}
}
