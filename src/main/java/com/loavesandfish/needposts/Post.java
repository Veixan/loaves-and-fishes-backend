package com.loavesandfish.needposts;

import javax.persistence.*;

@Entity
@Table(name="post")
public class Post {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String name;
private String postContent;
private String city;
private String catagory;
private Integer amount;
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
public String getPostContent() {
	return postContent;
}
public void setPostContent(String postContent) {
	this.postContent = postContent;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCatagory() {
	return catagory;
}
public void setCatagory(String catagory) {
	this.catagory = catagory;
}
public Integer getAmount() {
	return amount;
}
public void setAmount(Integer amount) {
	this.amount = amount;
} 

}
