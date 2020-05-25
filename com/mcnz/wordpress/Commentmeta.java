package com.mcnz.wordpress;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the wp_commentmeta database table.
 * 
 */
@Entity
@Table(name="wp_commentmeta")
@NamedQuery(name="Commentmeta.findAll", query="SELECT c FROM Commentmeta c")
public class Commentmeta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="meta_id")
	private String metaId;

	@Column(name="comment_id")
	private BigInteger commentId;

	@Column(name="meta_key")
	private String metaKey;

	@Lob
	@Column(name="meta_value")
	private String metaValue;

	public Commentmeta() {
	}

	public String getMetaId() {
		return this.metaId;
	}

	public void setMetaId(String metaId) {
		this.metaId = metaId;
	}

	public BigInteger getCommentId() {
		return this.commentId;
	}

	public void setCommentId(BigInteger commentId) {
		this.commentId = commentId;
	}

	public String getMetaKey() {
		return this.metaKey;
	}

	public void setMetaKey(String metaKey) {
		this.metaKey = metaKey;
	}

	public String getMetaValue() {
		return this.metaValue;
	}

	public void setMetaValue(String metaValue) {
		this.metaValue = metaValue;
	}

}
