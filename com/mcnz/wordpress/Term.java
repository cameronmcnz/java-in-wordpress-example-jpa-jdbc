package com.mcnz.wordpress;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the wp_terms database table.
 * 
 */
@Entity
@Table(name="wp_terms")
@NamedQuery(name="Term.findAll", query="SELECT t FROM Term t")
public class Term implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="term_id")
	private String termId;

	private String name;

	private String slug;

	@Column(name="term_group")
	private BigInteger termGroup;

	public Term() {
	}

	public String getTermId() {
		return this.termId;
	}

	public void setTermId(String termId) {
		this.termId = termId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSlug() {
		return this.slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public BigInteger getTermGroup() {
		return this.termGroup;
	}

	public void setTermGroup(BigInteger termGroup) {
		this.termGroup = termGroup;
	}

}
