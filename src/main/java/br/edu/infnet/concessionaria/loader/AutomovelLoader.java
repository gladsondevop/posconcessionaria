package br.edu.infnet.concessionaria.loader;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.concessionaria.model.domain.Automovel;
import br.edu.infnet.concessionaria.model.service.AutomovelService;

@Component
public class AutomovelLoader implements ApplicationRunner {
	
	@Autowired
	private AutomovelService automovelService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("files/automovel.txt");
		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();
		String[] campos = null;
		
		while(linha != null) {
			campos = linha.split(";");
			
			Automovel automovel = new Automovel();
			automovel.setMarca(campos[0]);
			automovel.setModelo(campos[1]);
			automovel.setAnoFabricacao(Integer.valueOf(campos[2]));
			automovel.setAnoModelo(Integer.valueOf(campos[3]));
			automovel.setDescricao(campos[4]);
			automovel.setValor(Float.valueOf(campos[5]));
			automovel.setUtilitario(Boolean.valueOf(campos[6]));
			automovel.setMotorizacao(campos[7]);
			automovel.setCapacidadePassageiro(Integer.valueOf(campos[8]));
			automovel.setCapacidadeCarga(Integer.valueOf(campos[9]));

			automovelService.incluir(automovel);
			
			linha = leitura.readLine();
		}
		
		for(Automovel a : automovelService.obterLista()) {			
			System.out.println("[AUTOMOVEL] " + a);
		}
		
		leitura.close();
	}

}
