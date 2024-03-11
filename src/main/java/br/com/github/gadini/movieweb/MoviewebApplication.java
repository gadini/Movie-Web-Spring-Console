package br.com.github.gadini.movieweb;

import br.com.github.gadini.movieweb.model.DadosSerie;
import br.com.github.gadini.movieweb.service.ConsumoAPI;
import br.com.github.gadini.movieweb.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviewebApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MoviewebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumoAPI consumoAPI = new ConsumoAPI();
		var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=d4944769");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
