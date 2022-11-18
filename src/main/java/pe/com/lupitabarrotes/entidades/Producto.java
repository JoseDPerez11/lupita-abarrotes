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
@Entity(name="Producto")
@Table(name ="producto")
public class Producto implements Serializable {
	private static final long serialVersionUID=1L;
	@Id
	@Column(name = "idproducto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProducto;
	
	@Column(name = "nompro")
	private String nombrepro;
	
	@Column(name = "prepro")
	private double precioventapro;
	
	@Column(name = "stockpro")
	private int stockpro;
	
	@Column(name = "despro")
	private String descripcionpro;
	
	@Column(name = "imagpro")
	private String imagenpro;
	
	@Column(name = "estpro")
	private boolean estadopro;
	
	@ManyToOne
    @JoinColumn(name = "idcategoria", nullable = false)
    private Categoria categoria;
}


