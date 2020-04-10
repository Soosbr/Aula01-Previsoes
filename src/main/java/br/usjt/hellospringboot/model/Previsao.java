package br.usjt.hellospringboot.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Previsao implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String diaSemana;
	private Double tempMinima;
	private Double tempMaxima;
	private Double umidadeAr;
	private String descricao;
	private String dataHora;
	private String latitude;
	private String longitude;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	public Double getTempMinima() {
		return tempMinima;
	}
	public void setTempMinima(Double tempMinima) {
		this.tempMinima = tempMinima;
	}
	public Double getTempMaxima() {
		return tempMaxima;
	}
	public void setTempMaxima(Double tempMaxima) {
		this.tempMaxima = tempMaxima;
	}
	public Double getUmidadeAr() {
		return umidadeAr;
	}
	public void setUmidadeAr(Double umidadeAr) {
		this.umidadeAr = umidadeAr;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDataHora() {
		return dataHora;
	}
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
