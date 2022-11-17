package pe.com.lupitabarrotes.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Cliente")
@Table(name ="cliente")
public class Cliente implements Serializable { 
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "idcliente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCliente;
	
	@Column(name = "nomcli")
	private String nombrecli;
	
	@Column(name = "tipodoccli")
	private String tipodocumentocli;
	
	@Column(name = "numdoccli")
	private String numerodocumentocli;
	
	@Column(name = "dircli")
	private String direccioncli;
	
	@Column(name = "telcli")
	private String telefonocli;
	
	@Column(name = "emailcli")
	private String emailcli;
	
	@Column(name = "estcli")
	private boolean estadocli;
	
}


