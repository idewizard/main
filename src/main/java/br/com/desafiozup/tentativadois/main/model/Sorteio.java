package br.com.desafiozup.tentativadois.main.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "sorteio")
public class Sorteio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idsorteio")
	private long id;
	
	@Column(name = "data_sorteio")
	private Date dataSorteio;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( name = "fk_idpessoa" , foreignKey = @ForeignKey(name = "fk_idpessoa"))
	private Pessoa pessoa;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( name = "fk_idvalor_sorteado" , foreignKey = @ForeignKey ( name = "fk_idvalor_sorteado") , unique = true)
	private ValorSorteado valorSorteado;
	
}
