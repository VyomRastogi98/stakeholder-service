package com.axis.stakeholderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.stakeholderservice.entity.Stakeholder;

@Repository
public interface StakeholderRepository extends JpaRepository<Stakeholder, Integer>{

}
