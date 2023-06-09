package com.megha.batch4119.sb.bms.SpringBootB4119MS.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.megha.batch4119.sb.bms.SpringBootB4119MS.model.BookManagement;
import com.megha.batch4119.sb.bms.SpringBootB4119MS.repository.BookMgmtRepository;
@RestController
@RequestMapping("/book")
public class BookMgmtController {
@Autowired
BookMgmtRepository bmr;
@PostMapping("/save")
public void saveBook(@RequestBody BookManagement bm) {
bmr.save(bm);
}
@RequestMapping("/details")
public List<BookManagement> getBooks() {
return bmr.findAll();
}
@RequestMapping("/update/{id}/{bookName}")
public void updateBook(@PathVariable("id")Long id,@PathVariable("bookName")String bname) {
BookManagement bmt = bmr.findById(id).get();
bmt.setBookName(bname);
bmr.save(bmt);
}
@RequestMapping("/details/{id}")
public BookManagement getById(@PathVariable("id")Long id) {
return bmr.findById(id).get();
}
@RequestMapping("/delete/{id}")
public void deleteBook(@PathVariable("id")Long id) {
bmr.deleteById(id);
}
}
