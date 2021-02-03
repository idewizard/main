package br.com.desafiozup.tentativadois.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "regra_sorteio")
public class RegraSorteio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idregra_sorteio")
	private long id;
	
	@Column(name = "tipo_sorteio" , nullable = false , unique = true)
	private String tipoSorteio;
	
	@Column(name = "qt_valor_sorteado" , nullable = false)
	private String qtValorSorteado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private ValorSorteado valorSorteado;

}
