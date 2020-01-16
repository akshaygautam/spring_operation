package com.akshay.demo1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepo1 extends DemoRepo1Custom, JpaRepository<DemoDTO, Long>{
	DemoDTO getDemoSuper();
}
