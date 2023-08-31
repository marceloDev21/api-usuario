package br.com.apiusuario.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String sobrenome;
	
	private Integer idade;
	
	private Boolean emUso;
	
//	private String dtNascimento;
	
	private LocalDateTime dtCadastro;
	
	private Double Salario;
	
//	@Embedded
//	private Endereco endereco;
	
	
	

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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Boolean getEmUso() {
		return emUso;
	}

	public void setEmUso(Boolean emUso) {
		this.emUso = emUso;
	}


//	public String getDtNascimento() {
//		return dtNascimento;
//	}
//
//	public void setDtNascimento(String dtNascimento) {
//		this.dtNascimento = dtNascimento;
//	}

	public Double getSalario() {
		return Salario;
	}

	public void setSalario(Double salario) {
		Salario = salario;
	}

	public LocalDateTime getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(LocalDateTime dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	
	
	
	
}
