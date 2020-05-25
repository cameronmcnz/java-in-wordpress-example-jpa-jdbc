package com.mcnz.wordpress;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the wp_usermeta database table.
 * 
 */
@Entity
@Table(name="wp_usermeta")
@NamedQuery(name="Usermeta.findAll", query="SELECT u FROM Usermeta u")
public class Usermeta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="umeta_id")
	private String umetaId;

	@Column(name="meta_key")
	private String metaKey;

	@Lob
	@Column(name="meta_value")
	private String metaValue;

	@Column(name="user_id")
	private BigInteger userId;

	public Usermeta() {
	}

	public String getUmetaId() {
		return this.umetaId;
	}

	public void setUmetaId(String umetaId) {
		this.umetaId = umetaId;
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

	public BigInteger getUserId() {
		return this.userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

}
