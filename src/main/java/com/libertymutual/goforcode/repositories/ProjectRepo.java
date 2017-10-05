package com.libertymutual.goforcode.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libertymutual.goforcode.models.Project;

public interface ProjectRepo extends JpaRepository<Project, Long>{

}
