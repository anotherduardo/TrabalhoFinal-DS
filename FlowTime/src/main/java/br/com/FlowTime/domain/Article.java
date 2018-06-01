package br.com.FlowTime.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="TB_ARTICLE")
@XmlRootElement
public class Article implements Serializable {
	
	/* ATTRIBUTES */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CD_ARTICLE")
	private Integer id;
	
	@Column(name="TL_ARTICLE",nullable=false,length=200)
	private String title;
	
	@Column(name="NM_PUBLISHER",nullable=false,length=100)
	private String publisher;
	
	@Column(name="COD_DOI",nullable=true,length=100)
	private String doi;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATE")
	private Date date;
	
	@OneToMany(mappedBy="refPaper")
	private List<Achievement> contribs;
	
	@ManyToMany(mappedBy="papers")
	private List<Researcher> authors;
	
	/* BUILDERS */
	
	public Article() {
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Achievement> getContribs() {
		return contribs;
	}

	public void setContribs(List<Achievement> contribs) {
		this.contribs = contribs;
	}

	public List<Researcher> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Researcher> authors) {
		this.authors = authors;
	}

}//end[Article]