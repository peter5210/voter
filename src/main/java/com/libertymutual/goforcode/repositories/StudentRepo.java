package com.libertymutual.goforcode.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libertymutual.goforcode.models.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
