package com.example.demo.repo.modelo;

import java.time.LocalDate;

public class MatriculaTo {
	
	private String cedula;
	private String codigo;
	private LocalDate fecha;
	private String hilo;
	private String mate1;
	private String mate2;
	private String mate3;
	private String mate4;
	
	public MatriculaTo() {
		
	}

	public MatriculaTo(String cedula, String codigo, LocalDate fecha, String hilo) {
		super();
		this.cedula = cedula;
		this.codigo = codigo;
		this.fecha = fecha;
		this.hilo = hilo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getHilo() {
		return hilo;
	}

	public void setHilo(String hilo) {
		this.hilo = hilo;
	}

	public String getMate1() {
		return mate1;
	}

	public void setMate1(String mate1) {
		this.mate1 = mate1;
	}

	public String getMate2() {
		return mate2;
	}

	public void setMate2(String mate2) {
		this.mate2 = mate2;
	}

	public String getMate3() {
		return mate3;
	}

	public void setMate3(String mate3) {
		this.mate3 = mate3;
	}

	public String getMate4() {
		return mate4;
	}

	public void setMate4(String mate4) {
		this.mate4 = mate4;
	}

	@Override
	public String toString() {
		return "MatriculaTo [cedula=" + cedula + ", codigo=" + codigo + ", fecha=" + fecha + ", hilo=" + hilo + "]";
	}

	
	
	
	
	
	

}
