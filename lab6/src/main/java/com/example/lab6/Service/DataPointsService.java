package com.example.lab6.Service;

import com.example.lab6.Entity.DataPoints;
import com.example.lab6.Repository.DataPointsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DataPointsService {

    @Autowired
    private DataPointsRepository dataPointsRepository;

    public List<DataPoints> getAllDataPoints() {
        return dataPointsRepository.findAll();
    }

    public Optional<DataPoints> getDataPointsById(Integer id) {
        return dataPointsRepository.findById(id);
    }

    public DataPoints saveDataPoints(DataPoints dataPoints) {
        return dataPointsRepository.save(dataPoints);
    }

    public void deleteDataPoints(Integer id) {
        dataPointsRepository.deleteById(id);
    }
}
