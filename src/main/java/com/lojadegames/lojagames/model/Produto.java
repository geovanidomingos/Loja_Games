package com.lojadegames.lojagames.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.UpdateTimestamp;

import java.security.PrivilegedAction;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O atributo nome é Obrigatório!")
    @Size(min = 3, max = 100, message = "O atributo nome previsar ter no min 5 e no máximo 100 caracteres.")
    private String nome;

    @NotBlank(message = "O atributo descrição é obrigatório!")
    @Size(min = 3, max = 100, message = "O atributo nome previsar ter no min 5 e no máximo 100 caracteres.")
    private String descricao;

    @NotBlank(message = "O atributo console é obrigatório!")
    @Size(min = 3, max = 100, message = "O atributo nome previsar ter no min 5 e no máximo 100 caracteres.")
    private String console;

    @NotNull(message = "O Atributo quantidade é obrigatório")
    private int quantidade;

    @NotNull(message = "O Atributo valor é obrigatório")
    private double preco;

    @Size(max = 5000, message = "O Likn da Foto não pode ser maior do que 5000 caracteres.")
    private String foto;

    @UpdateTimestamp // configura a data com relação a data do sistema
    private LocalDateTime data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
