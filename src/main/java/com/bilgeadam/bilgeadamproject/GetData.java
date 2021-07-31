package com.bilgeadam.bilgeadamproject;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.bilgeadam.bilgeadamproject.Employees;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional

public interface GetData extends JpaRepository<Employees, Integer> {
    List<Employees> findAll();

}



