package br.edu.infnet.concessionaria.loader;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.concessionaria.model.domain.Automovel;
import br.edu.infnet.concessionaria.model.domain.Concessionaria;
import br.edu.infnet.concessionaria.model.domain.Motocicleta;
import br.edu.infnet.concessionaria.model.service.ConcessionariaService;

@Component
@Order(1)
public class ConcessionariaLoader implements ApplicationRunner {
	
	@Autowired
	private ConcessionariaService concessionariaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		FileReader file = new FileReader("files/concessionaria.txt");
		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();
		String[] campos = null;
		
		Concessionaria concessionaria = null;
		
		while(linha != null) {
			
			campos = linha.split(";");

			switch (campos[0].toUpperCase()) {
				
				case "C":
					concessionaria = new Concessionaria();
					concessionaria.setNome(campos[1]);
					concessionaria.setAtiva(Boolean.valueOf(campos[2]));
					concessionaria.setCep(campos[3]);
					concessionariaService.salvar(concessionaria);
					
					break;
	
				case "A":
					Automovel automovel = new Automovel();
					automovel.setMarca(campos[1]);
					automovel.setModelo(campos[2]);
					automovel.setAnoFabricacao(Integer.valueOf(campos[3]));
					automovel.setAnoModelo(Integer.valueOf(campos[4]));
					automovel.setDescricao(campos[5]);
					automovel.setValor(Float.valueOf(campos[6]));
					automovel.setUtilitario(Boolean.valueOf(campos[7]));
					automovel.setMotorizacao(campos[8]);
					automovel.setCapacidadePassageiro(Integer.valueOf(campos[9]));
					automovel.setCapacidadeCarga(Integer.valueOf(campos[10]));
					
					concessionaria.getVeiculos().add(automovel);
					
					break;
					
				case "M":
					Motocicleta motocicleta = new Motocicleta();
					motocicleta.setMarca(campos[1]);
					motocicleta.setModelo(campos[2]);
					motocicleta.setAnoFabricacao(Integer.valueOf(campos[3]));
					motocicleta.setAnoModelo(Integer.valueOf(campos[4]));
					motocicleta.setDescricao(campos[5]);
					motocicleta.setValor(Float.valueOf(campos[6]));
					motocicleta.setCilindrada(Integer.valueOf(campos[7]));
					motocicleta.setTransmissao(campos[8]);
					motocicleta.setTipoTerreno(campos[9]);
					
					concessionaria.getVeiculos().add(motocicleta);
	
					break;
	
				default:
					break;
			}
//			System.out.println(concessionaria);
			linha = leitura.readLine();
		}
		
		for(Concessionaria c : concessionariaService.obterLista()) {
			System.out.println("[CONCESSIONARIA] " + c);			
		}
		
		leitura.close();
		
	}

	
}
