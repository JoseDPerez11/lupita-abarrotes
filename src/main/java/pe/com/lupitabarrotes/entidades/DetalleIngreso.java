package pe.com.lupitabarrotes.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="DetalleIngreso")
@Table(name ="detalleIngreso")
public class DetalleIngreso implements Serializable {
	private static final long serialVersionUID=1L;
	@Id
	@Column(name = "iddetalleingreso")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDetalleingreso;
	
	@Column(name = "cantdi")
	private int cantidaddi;
	
	@Column(name = "predi")
	private double preciodi;
	
	@ManyToOne
    @JoinColumn(name = "idingreso", nullable = false)
    private Ingreso ingreso;
	
	@ManyToOne
	@JoinColumn(name = "idproducto", nullable = false)
	private Producto producto;
}
