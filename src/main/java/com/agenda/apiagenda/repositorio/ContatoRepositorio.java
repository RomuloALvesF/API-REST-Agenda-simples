package com.agenda.apiagenda.repositorio;

import com.agenda.apiagenda.modelo.ContatoModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "contato", path = "contato")
public interface ContatoRepositorio extends JpaRepository<ContatoModelo, Long> {


}
