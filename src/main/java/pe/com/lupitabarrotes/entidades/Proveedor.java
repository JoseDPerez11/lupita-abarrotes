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
@Entity(name="Proveedor")
@Table(name ="proveedor")
public class Proveedor implements Serializable {
	private static final long serialVersionUID=1L;
	@Id
	@Column(name = "idproveedor")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProveedor;
	
	@Column(name = "nomprov")
	private String nombreprov;
	
	@Column(name = "direccion")
	private String direccionprov;
	
	@Column(name = "telprov")
	private String telefonoprov;
	
	@Column(name = "emailprov")
	private String emailprov;
	
	@Column(name = "rucprov")
	private String rucprov;
	
	@Column(name = "estprov")
	private String estadoprov;
}


