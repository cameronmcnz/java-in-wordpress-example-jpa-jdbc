package com.mcnz.wordpress;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the wp_posts database table.
 * 
 */
@Entity
@Table(name="wp_posts")
@NamedQuery(name="Post.findAll", query="SELECT p FROM Post p")
public class Post implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="comment_count")
	private BigInteger commentCount;

	@Column(name="comment_status")
	private String commentStatus;

	private String guid;

	@Column(name="menu_order")
	private int menuOrder;

	@Column(name="ping_status")
	private String pingStatus;

	@Lob
	private String pinged;

	@Column(name="post_author")
	private BigInteger postAuthor;

	@Lob
	@Column(name="post_content")
	private String postContent;

	@Lob
	@Column(name="post_content_filtered")
	private String postContentFiltered;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="post_date")
	private Date postDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="post_date_gmt")
	private Date postDateGmt;

	@Lob
	@Column(name="post_excerpt")
	private String postExcerpt;

	@Column(name="post_mime_type")
	private String postMimeType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="post_modified")
	private Date postModified;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="post_modified_gmt")
	private Date postModifiedGmt;

	@Column(name="post_name")
	private String postName;

	@Column(name="post_parent")
	private BigInteger postParent;

	@Column(name="post_password")
	private String postPassword;

	@Column(name="post_status")
	private String postStatus;

	@Lob
	@Column(name="post_title")
	private String postTitle;

	@Column(name="post_type")
	private String postType;

	@Lob
	@Column(name="to_ping")
	private String toPing;

	public Post() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigInteger getCommentCount() {
		return this.commentCount;
	}

	public void setCommentCount(BigInteger commentCount) {
		this.commentCount = commentCount;
	}

	public String getCommentStatus() {
		return this.commentStatus;
	}

	public void setCommentStatus(String commentStatus) {
		this.commentStatus = commentStatus;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public int getMenuOrder() {
		return this.menuOrder;
	}

	public void setMenuOrder(int menuOrder) {
		this.menuOrder = menuOrder;
	}

	public String getPingStatus() {
		return this.pingStatus;
	}

	public void setPingStatus(String pingStatus) {
		this.pingStatus = pingStatus;
	}

	public String getPinged() {
		return this.pinged;
	}

	public void setPinged(String pinged) {
		this.pinged = pinged;
	}

	public BigInteger getPostAuthor() {
		return this.postAuthor;
	}

	public void setPostAuthor(BigInteger postAuthor) {
		this.postAuthor = postAuthor;
	}

	public String getPostContent() {
		return this.postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public String getPostContentFiltered() {
		return this.postContentFiltered;
	}

	public void setPostContentFiltered(String postContentFiltered) {
		this.postContentFiltered = postContentFiltered;
	}

	public Date getPostDate() {
		return this.postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public Date getPostDateGmt() {
		return this.postDateGmt;
	}

	public void setPostDateGmt(Date postDateGmt) {
		this.postDateGmt = postDateGmt;
	}

	public String getPostExcerpt() {
		return this.postExcerpt;
	}

	public void setPostExcerpt(String postExcerpt) {
		this.postExcerpt = postExcerpt;
	}

	public String getPostMimeType() {
		return this.postMimeType;
	}

	public void setPostMimeType(String postMimeType) {
		this.postMimeType = postMimeType;
	}

	public Date getPostModified() {
		return this.postModified;
	}

	public void setPostModified(Date postModified) {
		this.postModified = postModified;
	}

	public Date getPostModifiedGmt() {
		return this.postModifiedGmt;
	}

	public void setPostModifiedGmt(Date postModifiedGmt) {
		this.postModifiedGmt = postModifiedGmt;
	}

	public String getPostName() {
		return this.postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public BigInteger getPostParent() {
		return this.postParent;
	}

	public void setPostParent(BigInteger postParent) {
		this.postParent = postParent;
	}

	public String getPostPassword() {
		return this.postPassword;
	}

	public void setPostPassword(String postPassword) {
		this.postPassword = postPassword;
	}

	public String getPostStatus() {
		return this.postStatus;
	}

	public void setPostStatus(String postStatus) {
		this.postStatus = postStatus;
	}

	public String getPostTitle() {
		return this.postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostType() {
		return this.postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

	public String getToPing() {
		return this.toPing;
	}

	public void setToPing(String toPing) {
		this.toPing = toPing;
	}

}
