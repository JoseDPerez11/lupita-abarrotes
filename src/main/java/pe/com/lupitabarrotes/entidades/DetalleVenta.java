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
@Entity(name = "DetalleVenta")
@Table(name = "detalleVenta")
public class DetalleVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "iddetalleventa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetalleventa;

    @Column(name = "cantdv")
    private int cantidaddv;

    @Column(name = "predv")
    private double preciodv;

    @Column(name = "descdv")
    private double descuentodv;

    @ManyToOne
    @JoinColumn(name = "idventa", nullable = false)
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "idproducto", nullable = false)
    private Producto producto;

}
