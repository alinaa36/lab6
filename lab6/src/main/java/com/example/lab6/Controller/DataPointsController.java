package com.example.lab6.Controller;

import com.example.lab6.Entity.DataPoints;
import com.example.lab6.Service.DataPointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/data-points")
public class DataPointsController {

    @Autowired
    private DataPointsService dataPointsService;

    @GetMapping
    public List<DataPoints> getAllDataPoints() {
        return dataPointsService.getAllDataPoints();
    }

    @GetMapping("/{id}")
    public Optional<DataPoints> getDataPointsById(@PathVariable Integer id) {
        return dataPointsService.getDataPointsById(id);
    }

    @PostMapping
    public DataPoints createDataPoints(@RequestBody DataPoints dataPoints) {
        return dataPointsService.saveDataPoints(dataPoints);
    }

    @PutMapping("/{id}")
    public DataPoints updateDataPoints(@PathVariable Integer id, @RequestBody DataPoints dataPoints) {
        dataPoints.setData_points_id(id);
        return dataPointsService.saveDataPoints(dataPoints);
    }

    @DeleteMapping("/{id}")
    public void deleteDataPoints(@PathVariable Integer id) {
        dataPointsService.deleteDataPoints(id);
    }
}

