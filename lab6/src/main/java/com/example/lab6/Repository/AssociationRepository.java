package com.example.lab6.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.lab6.Entity.Association;
@Repository
public interface AssociationRepository extends JpaRepository<Association, Integer> {
}
