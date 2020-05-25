package com.mcnz.wordpress;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the wp_postmeta database table.
 * 
 */
@Entity
@Table(name="wp_postmeta")
@NamedQuery(name="Postmeta.findAll", query="SELECT p FROM Postmeta p")
public class Postmeta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="meta_id")
	private String metaId;

	@Column(name="meta_key")
	private String metaKey;

	@Lob
	@Column(name="meta_value")
	private String metaValue;

	@Column(name="post_id")
	private BigInteger postId;

	public Postmeta() {
	}

	public String getMetaId() {
		return this.metaId;
	}

	public void setMetaId(String metaId) {
		this.metaId = metaId;
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

	public BigInteger getPostId() {
		return this.postId;
	}

	public void setPostId(BigInteger postId) {
		this.postId = postId;
	}

}
