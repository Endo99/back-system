package br.com.unifil.sistemaBriefing.repository;

import br.com.unifil.sistemaBriefing.models.Cargos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CargosRepositorio  extends JpaRepository<Cargos, Long> {
}
