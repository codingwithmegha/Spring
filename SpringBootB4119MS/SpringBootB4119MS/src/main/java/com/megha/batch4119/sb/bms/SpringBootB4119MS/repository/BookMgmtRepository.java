package com.megha.batch4119.sb.bms.SpringBootB4119MS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megha.batch4119.sb.bms.SpringBootB4119MS.model.BookManagement;

@Repository
public interface BookMgmtRepository extends JpaRepository<BookManagement,Long>{
}
