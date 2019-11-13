package com.hcl.ingbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.ingbank.entity.TranscationDetails;

@Repository
public interface TranscationRepository extends JpaRepository<TranscationDetails, Long> {

}
