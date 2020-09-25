package com.spring.boot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.entities.Project;
import com.spring.boot.entities.User;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
	

}
