package io.github.ketellin.api.controller;

import io.github.ketellin.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RestController
public class ClienteController {

    @PersistenceContext //Injeta uma instancia  de EntityManager nessa vairável de instancia
    private EntityManager manager; //Do Jakarta Persistense.

    @GetMapping("/clientes")
    public List<Cliente> listar() {

        return manager.createQuery("from Cliente", Cliente.class)
                .getResultList();
    }
}
