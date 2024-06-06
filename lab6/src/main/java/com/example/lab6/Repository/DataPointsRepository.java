package com.example.lab6.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.lab6.Entity.DataPoints;

@Repository
public interface DataPointsRepository extends JpaRepository<DataPoints, Integer> {
}
