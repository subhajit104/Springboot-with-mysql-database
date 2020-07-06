package com.cap_coder.Spring.Boot.With.MYSQL.Repository;

import com.cap_coder.Spring.Boot.With.MYSQL.model.products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepository extends JpaRepository<products,Integer> {

}