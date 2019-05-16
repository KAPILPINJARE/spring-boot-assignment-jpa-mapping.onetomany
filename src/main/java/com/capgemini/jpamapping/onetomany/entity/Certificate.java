package com.capgemini.jpamapping.onetomany.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="certificate")
public class Certificate {
	@Id
	private int certId;
	private String certificate;
	
	@ManyToOne
	private Person person;

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(int certId, String certificate) {
		super();
		this.certId = certId;
		this.certificate = certificate;
	}

	
	
	public int getCertId() {
		return certId;
	}

	public void setCertId(int certId) {
		this.certId = certId;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "Certificate [certId=" + certId + ", certificate=" + certificate + "]";
	}

	
	
}
