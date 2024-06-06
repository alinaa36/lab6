package com.example.lab6.Repository;

import com.example.lab6.Entity.ObjectControl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ObjectControlRepository extends JpaRepository<ObjectControl, Integer> {
}

