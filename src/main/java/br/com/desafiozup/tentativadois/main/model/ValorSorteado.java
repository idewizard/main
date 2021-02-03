package br.com.desafiozup.tentativadois.main.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "valor_sorteado")
public class ValorSorteado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idvalor_sorteado")
	private long id;
	
	@Column(name = "valor_sorteado")
	private String valorSorteado;
	
	@OneToMany(mappedBy = "valorSorteado" , cascade = CascadeType.ALL)
	//@JoinColumn(name = "fk_idregra_sorteio" , foreignKey = @ForeignKey( name = "fk_idregra_sorteio"))
	private List<RegraSorteio> regraSorteio;
	
}
