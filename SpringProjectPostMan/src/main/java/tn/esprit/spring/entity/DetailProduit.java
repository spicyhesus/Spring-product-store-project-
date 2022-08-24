package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
//@Temporal (TemporalType.DATE)
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data

@Table(name="DetailProduit")
public class DetailProduit implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idDetailProduit")
	private long idDetailProduit; // Clé primaire
	@Temporal (TemporalType.DATE)
	private Date datecreation;
	@Temporal (TemporalType.DATE)
	private Date dateDerniereModification;
	@Enumerated(EnumType.STRING)
	private Categorie categorie;
	@OneToOne(mappedBy="detailproduit")
	private Produit produit;
}
