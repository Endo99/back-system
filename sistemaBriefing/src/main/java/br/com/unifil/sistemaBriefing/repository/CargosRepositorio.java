package br.com.unifil.sistemaBriefing.repository;

import br.com.unifil.sistemaBriefing.models.Cargos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CargosRepositorio  extends JpaRepository<Cargos, Long> {
}