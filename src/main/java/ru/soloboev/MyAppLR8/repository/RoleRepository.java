package ru.soloboev.MyAppLR8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.soloboev.MyAppLR8.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
