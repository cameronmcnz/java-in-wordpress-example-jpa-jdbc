package com.mcnz.wordpress;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the wp_options database table.
 * 
 */
@Entity
@Table(name="wp_options")
@NamedQuery(name="Option.findAll", query="SELECT o FROM Option o")
public class Option implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="option_id")
	private String optionId;

	private String autoload;

	@Column(name="option_name")
	private String optionName;

	@Lob
	@Column(name="option_value")
	private String optionValue;

	public Option() {
	}

	public String getOptionId() {
		return this.optionId;
	}

	public void setOptionId(String optionId) {
		this.optionId = optionId;
	}

	public String getAutoload() {
		return this.autoload;
	}

	public void setAutoload(String autoload) {
		this.autoload = autoload;
	}

	public String getOptionName() {
		return this.optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	public String getOptionValue() {
		return this.optionValue;
	}

	public void setOptionValue(String optionValue) {
		this.optionValue = optionValue;
	}

}
