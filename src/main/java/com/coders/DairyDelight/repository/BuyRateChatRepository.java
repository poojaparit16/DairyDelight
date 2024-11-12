package com.coders.DairyDelight.repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.coders.DairyDelight.entity.Buyratechat;
import com.coders.DairyDelight.entity.Customer;

@Repository
public interface BuyRateChatRepository extends JpaRepository<Buyratechat,Long>{
	
	@Query(nativeQuery = true, value= "select * from Buyratechat b where b.date =  :date")
	List<Buyratechat> getBuyRateChatSearchByDate(@Param("date") Date date);

}
