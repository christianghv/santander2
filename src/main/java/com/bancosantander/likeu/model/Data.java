package com.bancosantander.likeu.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Data implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String contract_key;
	private java.lang.String activation_date;
	private java.lang.String type;
	private java.lang.String status;
	private java.lang.String last_evaluation_date;
	private java.lang.String cut_of_date;
	private com.bancosantander.likeu.model.CardDetail card;

	public Data() {
	}

	public java.lang.String getContract_key() {
		return this.contract_key;
	}

	public void setContract_key(java.lang.String contract_key) {
		this.contract_key = contract_key;
	}

	public java.lang.String getActivation_date() {
		return this.activation_date;
	}

	public void setActivation_date(java.lang.String activation_date) {
		this.activation_date = activation_date;
	}

	public java.lang.String getType() {
		return this.type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.String getLast_evaluation_date() {
		return this.last_evaluation_date;
	}

	public void setLast_evaluation_date(java.lang.String last_evaluation_date) {
		this.last_evaluation_date = last_evaluation_date;
	}

	public java.lang.String getCut_of_date() {
		return this.cut_of_date;
	}

	public void setCut_of_date(java.lang.String cut_of_date) {
		this.cut_of_date = cut_of_date;
	}

	public com.bancosantander.likeu.model.CardDetail getCard() {
		return this.card;
	}

	public void setCard(com.bancosantander.likeu.model.CardDetail card) {
		this.card = card;
	}

	public Data(java.lang.String contract_key,
			java.lang.String activation_date, java.lang.String type,
			java.lang.String status, java.lang.String last_evaluation_date,
			java.lang.String cut_of_date,
			com.bancosantander.likeu.model.CardDetail card) {
		this.contract_key = contract_key;
		this.activation_date = activation_date;
		this.type = type;
		this.status = status;
		this.last_evaluation_date = last_evaluation_date;
		this.cut_of_date = cut_of_date;
		this.card = card;
	}

}