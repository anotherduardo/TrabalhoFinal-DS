package br.com.FlowTime.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="TB_ACHIEVEMENTS")
@XmlRootElement
public class Achievement implements Serializable {

	/* ATTRIBUTES */
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CD_ACHIEVEMENT")
	private Integer id;
	
	@Column(name="DESC_ACHIEVEMENT",nullable=false)
	private String description;
	
	@Column(name="LV_IMPACT",nullable=false)
	private Integer impact;
	
	@ManyToOne
	@JoinColumn(name="CD_REFPAPER",referencedColumnName="CD_ARTICLE")
	private Article refPaper;
	
	/* BUILDERS */
	
	public Achievement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/* METHODS */

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getImpact() {
		return impact;
	}

	public void setImpact(Integer impact) {
		this.impact = impact;
	}

	public Article getRefPaper() {
		return refPaper;
	}

	public void setRefPaper(Article refPaper) {
		this.refPaper = refPaper;
	}
	
	
}//end[Achievements]
