package com.coders.DairyDelight.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.coders.DairyDelight.entity.Customer;

import jakarta.persistence.NamedQuery;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	
	@Query(nativeQuery = true, value= "select * from customer c where c.contact_no =  :contactNo")
	Optional<List<Customer>> getCustomerBycontactNo(@Param("contactNo") Long contactNo);

}
