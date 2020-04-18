package br.usjt.hellospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.usjt.hellospringboot.model.DiaSemana;

public interface DiaSemanaRepository extends JpaRepository<DiaSemana, Long> {

}
