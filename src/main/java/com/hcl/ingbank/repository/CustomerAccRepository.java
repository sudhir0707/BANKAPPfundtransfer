package com.hcl.ingbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.hcl.ingbank.entity.CustmoreAccDetails;

@Repository
public interface CustomerAccRepository extends JpaRepository<CustmoreAccDetails, Integer> {

}
