/*package com.example.StudentExample.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentEntity")
public class StudentEntity {
	@Id
	@Column(name="sid")
	private int sid;
	public StudentEntity(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	@Column(name="sname")
	private String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public StudentEntity () {
		
		
	}
}*/
package com.example.StudentExample.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Books")
public class StudentEntity {
	@Id
	@Column(name="bookid")
	private int bookid;
	
   @Column(name="bname")
   private String bname;
   
   @Column(name="price")
   private String price;
   
   @Column(name="authorname")
   private String authorname;
   
   @Column(name="booktype")
   private String booktype;
   
   @Column(name="bookissue")
   private String bookissue;
   
   
   
public int getBookid() {
	return bookid;
}



public void setBookid(int bookid) {
	this.bookid = bookid;
}



public String getBname() {
	return bname;
}



public void setBname(String bname) {
	this.bname = bname;
}



public String getPrice() {
	return price;
}



public void setPrice(String price) {
	this.price = price;
}



public String getAuthorname() {
	return authorname;
}



public void setAuthorname(String authorname) {
	this.authorname = authorname;
}



public String getBooktype() {
	return booktype;
}



public void setBooktype(String booktype) {
	this.booktype = booktype;
}



public String getBookissue() {
	return bookissue;
}



public void setBookissue(String bookissue) {
	this.bookissue = bookissue;
}



public StudentEntity(int bookid, String bname, String price, String authorname, String booktype, String bookissue) {
	super();
	this.bookid = bookid;
	this.bname = bname;
	this.price = price;
	this.authorname = authorname;
	this.booktype = booktype;
	this.bookissue = bookissue;
}



public StudentEntity () {
		
		
   }



   
   
   
   
}