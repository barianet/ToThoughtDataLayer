package org.tothought.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;

@Entity
@Table(name="POST")
public class Post{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="POST_ID")
	Integer postId;
	
	@Column(name="TITLE")
	String title;
	
	@Column(name="AUTHOR")
	String author;
	
	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="POST_PART_ID")
	PostPart postPart;
	
	@Column(name="POSTED_DT")
	Date postedDt;
	
	@Column(name="SOURCE_CODE", columnDefinition="mediumtext")
	String sourceCode;
	
	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH}, targetEntity=Tag.class)
	@JoinTable(name="POST_TAG", joinColumns={@JoinColumn(name="POST_ID", referencedColumnName="POST_ID")},
	inverseJoinColumns={@JoinColumn(name="TAG_ID", referencedColumnName="TAG_ID")})
	private List<Tag> tags = new ArrayList<Tag>();

	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="POST_ID")
	@OrderBy("postedDt DESC")
	private List<Comment> comments = new ArrayList<Comment>();
	
	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public PostPart getPostPart() {
		return postPart;
	}

	public void setPostPart(PostPart postPart) {
		this.postPart = postPart;
	}

	public Date getPostedDt() {
		return postedDt;
	}

	public void setPostedDt(Date postedDt) {
		this.postedDt = postedDt;
	}

	public String getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	
	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((postPart == null) ? 0 : postPart.hashCode());
		result = prime * result + ((postedDt == null) ? 0 : postedDt.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (postPart == null) {
			if (other.postPart != null)
				return false;
		} else if (!postPart.equals(other.postPart))
			return false;
		if (postedDt == null) {
			if (other.postedDt != null)
				return false;
		} else if (!postedDt.equals(other.postedDt))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
}
