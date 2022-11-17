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
@Entity(name="Rol")
@Table(name ="rol")
public class Rol implements Serializable {
	private static final long serialVersionUID=1L;
	@Id
	@Column(name = "idrol")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRol;
	
	@Column(name = "nomcat")
	private String nombrerol;
	
	@Column(name = "descrol")
	private String descripcionrol;
	
	@Column(name = "estrol")
	private boolean estadorol;
	
}





