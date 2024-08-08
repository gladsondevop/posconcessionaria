package br.edu.infnet.concessionaria.loader;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.concessionaria.model.domain.Motocicleta;
import br.edu.infnet.concessionaria.model.service.MotocicletaService;

@Component
public class MotocicletaLoader implements ApplicationRunner{
	
	@Autowired
	private MotocicletaService motocicletaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("files/motocicleta.txt");
		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();
		String[] campos = null;
		
		while(linha != null) {
			campos = linha.split(";");
			
			Motocicleta motocicleta = new Motocicleta();
			motocicleta.setMarca(campos[0]);
			motocicleta.setModelo(campos[1]);
			motocicleta.setAnoFabricacao(Integer.valueOf(campos[2]));
			motocicleta.setAnoModelo(Integer.valueOf(campos[3]));
			motocicleta.setDescricao(campos[4]);
			motocicleta.setValor(Float.valueOf(campos[5]));
			motocicleta.setCilindrada(Integer.valueOf(campos[6]));
			motocicleta.setTransmissao(campos[7]);
			motocicleta.setTipoTerreno(campos[8]);
			
			motocicletaService.incluir(motocicleta);
			
			linha = leitura.readLine();
		}
		
		for(Motocicleta m : motocicletaService.obterLista()) {
			System.out.println("[MOTOCICLETA] " + m);
		}
		
		leitura.close();
	}

}
