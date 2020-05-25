package com.mcnz.wordpress;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the wp_term_relationships database table.
 * 
 */
@Entity
@Table(name="wp_term_relationships")
@NamedQuery(name="TermRelationship.findAll", query="SELECT t FROM TermRelationship t")
public class TermRelationship implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TermRelationshipPK id;

	@Column(name="term_order")
	private int termOrder;

	public TermRelationship() {
	}

	public TermRelationshipPK getId() {
		return this.id;
	}

	public void setId(TermRelationshipPK id) {
		this.id = id;
	}

	public int getTermOrder() {
		return this.termOrder;
	}

	public void setTermOrder(int termOrder) {
		this.termOrder = termOrder;
	}

}
