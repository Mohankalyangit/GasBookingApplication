package com.gasbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gasbooking.entity.SurrenderCylinder;
@Repository
public interface ISurrenderCylinder extends JpaRepository<SurrenderCylinder,Integer>{
	
	

}
