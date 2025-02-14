package ru.soloboev.MyAppLR8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.soloboev.MyAppLR8.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
