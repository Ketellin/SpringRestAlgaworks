package io.github.ketellin.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Entity
public class Cliente {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    //Como criamos a tabela de cliente como auto increment, vamos utilizar a estratégia sendo a
    //nativa do banco de dados, ou seja, deixo a responsabilidade de gerar o id, para o banco
    private long id;
    private String nome;
    private String email;
    @Column(name="fone")
    private String telefone;
}
