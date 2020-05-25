package com.mcnz.wordpress;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the wp_term_taxonomy database table.
 * 
 */
@Entity
@Table(name="wp_term_taxonomy")
@NamedQuery(name="TermTaxonomy.findAll", query="SELECT t FROM TermTaxonomy t")
public class TermTaxonomy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="term_taxonomy_id")
	private String termTaxonomyId;

	private BigInteger count;

	@Lob
	private String description;

	private BigInteger parent;

	private String taxonomy;

	@Column(name="term_id")
	private BigInteger termId;

	public TermTaxonomy() {
	}

	public String getTermTaxonomyId() {
		return this.termTaxonomyId;
	}

	public void setTermTaxonomyId(String termTaxonomyId) {
		this.termTaxonomyId = termTaxonomyId;
	}

	public BigInteger getCount() {
		return this.count;
	}

	public void setCount(BigInteger count) {
		this.count = count;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigInteger getParent() {
		return this.parent;
	}

	public void setParent(BigInteger parent) {
		this.parent = parent;
	}

	public String getTaxonomy() {
		return this.taxonomy;
	}

	public void setTaxonomy(String taxonomy) {
		this.taxonomy = taxonomy;
	}

	public BigInteger getTermId() {
		return this.termId;
	}

	public void setTermId(BigInteger termId) {
		this.termId = termId;
	}

}
