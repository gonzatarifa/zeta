package modelo;

import java.util.Objects;

public class Empleado {
	private String apellido;
	private String nombre;
	private String nroLegajo;
	private double valorHora;
	
	public Empleado(String apellido, String nombre, String nroLegajo, double valorHora) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.nroLegajo = nroLegajo;
		this.valorHora = valorHora;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNroLegajo() {
		return nroLegajo;
	}

	public void setNroLegajo(String nroLegajo) {
		this.nroLegajo = nroLegajo;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	@Override
	public String toString() {
		return "Empleado [apellido=" + apellido + ", nombre=" + nombre + ", nroLegajo=" + nroLegajo + ", valorHora="
				+ valorHora + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		return ((Empleado)obj).getNroLegajo().equals(this.getNroLegajo());
	}
}
