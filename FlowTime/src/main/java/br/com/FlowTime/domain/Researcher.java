package br.com.FlowTime.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="TB_RESEARCHER")
@XmlRootElement
public class Researcher  implements Serializable {
	
	/* ATTRIBUTES */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CD_RESEARCHER")
	private Integer id;
	
	@Column(name="RS_NAME",nullable=false,length=200)
	private String name;
	
	@Column(name="NM_NACIONAL",nullable=false,length=100)
	private String nationality;
	
	@Column(name="NM_INST",nullable=false,length=100)
	private String institution;
	
	@ManyToMany
	@JoinTable(name="TB_RESEARCHER_PAPERS",
    		   joinColumns= @JoinColumn(name="CD_RESEARCHER"),
    		   inverseJoinColumns = @JoinColumn(name="CD_ARTICLE"))
	private List<Article> papers;
	
	/* BUILDERS */
	public Researcher() {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public List<Article> getPapers() {
		return papers;
	}

	public void setPapers(List<Article> papers) {
		this.papers = papers;
	}

}//end[Researcher]
