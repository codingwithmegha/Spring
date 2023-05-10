package com.megha.batch4119.sb.bms.SpringBootB4119MS.model;

import javax.persistence.*;

@Entity
@Table(name="book_mgmt")
public class BookManagement {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="book_mgmt_id")
private Long id;
@Column(name="book_name")
private String bookName;
private int bookId;
private String authName;
public Long getId() {
return id;
}
public void setId(Long id) {
this.id = id;
}
public String getBookName() {
return bookName;
}
public void setBookName(String bookName) {
this.bookName = bookName;
}
public int getBookId() {
return bookId;
}
public void setBookId(int bookId) {
this.bookId = bookId;
}
public String getAuthName() {
return authName;
}
public void setAuthName(String authName) {
this.authName = authName;
}
public BookManagement(String bookName, int bookId, String authName) {
super();
this.bookName = bookName;
this.bookId = bookId;
this.authName = authName;
}
public BookManagement() {
}
}
