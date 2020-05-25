package com.mcnz.wordpress;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the wp_term_relationships database table.
 * 
 */
@Embeddable
public class TermRelationshipPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="object_id")
	private String objectId;

	@Column(name="term_taxonomy_id")
	private String termTaxonomyId;

	public TermRelationshipPK() {
	}
	public String getObjectId() {
		return this.objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public String getTermTaxonomyId() {
		return this.termTaxonomyId;
	}
	public void setTermTaxonomyId(String termTaxonomyId) {
		this.termTaxonomyId = termTaxonomyId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TermRelationshipPK)) {
			return false;
		}
		TermRelationshipPK castOther = (TermRelationshipPK)other;
		return 
			this.objectId.equals(castOther.objectId)
			&& this.termTaxonomyId.equals(castOther.termTaxonomyId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.objectId.hashCode();
		hash = hash * prime + this.termTaxonomyId.hashCode();
		
		return hash;
	}
}
