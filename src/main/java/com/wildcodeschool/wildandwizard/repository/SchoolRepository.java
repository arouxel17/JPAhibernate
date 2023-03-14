package com.wildcodeschool.wildandwizard.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.wildcodeschool.wildandwizard.entity.School;

// TODO : update this interface

@Repository
public interface SchoolRepository extends JpaRepository<School, Long>{
}
