package br.com.desafiozup.tentativadois.main.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
}
