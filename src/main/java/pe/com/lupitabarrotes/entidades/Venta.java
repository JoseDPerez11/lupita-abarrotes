package pe.com.lupitabarrotes.entidades;

import java.io.Serializable;
import java.sql.Date;

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
@Entity(name="Venta")
@Table(name ="venta")
public class Venta implements Serializable  {
	private static final long serialVersionUID=1L;
	@Id
	@Column(name = "idventa")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVenta;
	
	@Column(name = "tipocomven")
	private String tipocomprobanteven;
	
	@Column(name = "numcomven")
	private String numerocomprobanteven;
	
	@Column(name = "fechaven")
	private Date fechaven;
	
	@Column(name = "impven")
	private double impuestoven;
	
	@Column(name = "totven")
	private double totalven;
	
	@Column(name = "estven")
	private String estadoven;
}
