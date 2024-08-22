package br.edu.infnet.concessionaria.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.concessionaria.model.domain.Automovel;

@Repository
public interface AutomovelRepository extends JpaRepository<Automovel, Integer> {

}
