package com.luv2code.springsecurity.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="user_details")
public class User_details {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name="vencimento_mensal_bruto")
	private String vencimentoBrutoMensal;
	
	@Column(name="vencimento_anual_bruto")
	private String vencimentoBrutoAnual;
	
	@Column(name="vencimento_mensal_liquido")
	private String vencimentoLiquidoMensal;
	
	@Column(name="vencimento_anual_liquido")
	private String vencimentoliquidoAnual;
	
	@Column(name="desconto_seguranca_social")
	private String descontoSegurancaSocial;

	public User_details(int id, String vencimentoBrutoMensal, String vencimentoBrutoAnual,
			String vencimentoLiquidoMensal, String vencimentoliquidoAnual, String descontoSegurancaSocial) {
		this.id = id;
		this.vencimentoBrutoMensal = vencimentoBrutoMensal;
		this.vencimentoBrutoAnual = vencimentoBrutoAnual;
		this.vencimentoLiquidoMensal = vencimentoLiquidoMensal;
		this.vencimentoliquidoAnual = vencimentoliquidoAnual;
		this.descontoSegurancaSocial = descontoSegurancaSocial;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVencimentoBrutoMensal() {
		return vencimentoBrutoMensal;
	}

	public void setVencimentoBrutoMensal(String vencimentoBrutoMensal) {
		this.vencimentoBrutoMensal = vencimentoBrutoMensal;
	}

	public String getVencimentoBrutoAnual() {
		return vencimentoBrutoAnual;
	}

	public void setVencimentoBrutoAnual(String vencimentoBrutoAnual) {
		this.vencimentoBrutoAnual = vencimentoBrutoAnual;
	}

	public String getVencimentoLiquidoMensal() {
		return vencimentoLiquidoMensal;
	}

	public void setVencimentoLiquidoMensal(String vencimentoLiquidoMensal) {
		this.vencimentoLiquidoMensal = vencimentoLiquidoMensal;
	}

	public String getVencimentoliquidoAnual() {
		return vencimentoliquidoAnual;
	}

	public void setVencimentoliquidoAnual(String vencimentoliquidoAnual) {
		this.vencimentoliquidoAnual = vencimentoliquidoAnual;
	}

	public String getDescontoSegurancaSocial() {
		return descontoSegurancaSocial;
	}

	public void setDescontoSegurancaSocial(String descontoSegurancaSocial) {
		this.descontoSegurancaSocial = descontoSegurancaSocial;
	}

	@Override
	public String toString() {
		return "User_details [id=" + id + ", vencimentoBrutoMensal=" + vencimentoBrutoMensal + ", vencimentoBrutoAnual="
				+ vencimentoBrutoAnual + ", vencimentoLiquidoMensal=" + vencimentoLiquidoMensal
				+ ", vencimentoliquidoAnual=" + vencimentoliquidoAnual + ", descontoSegurancaSocial="
				+ descontoSegurancaSocial + "]";
	}

	

}
