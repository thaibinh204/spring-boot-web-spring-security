package com.mkyong.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mkyong.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
