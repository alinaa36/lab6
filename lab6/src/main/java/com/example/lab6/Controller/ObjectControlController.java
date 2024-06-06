package com.example.lab6.Controller;

import com.example.lab6.Entity.ObjectControl;
import com.example.lab6.Service.ObjectControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/object-controls")
public class ObjectControlController {

    @Autowired
    private ObjectControlService objectControlService;

    @GetMapping
    public List<ObjectControl> getAllObjectControls() {
        return objectControlService.getAllObjectControls();
    }

    @GetMapping("/{id}")
    public Optional<ObjectControl> getObjectControlById(@PathVariable Integer id) {
        return objectControlService.getObjectControlById(id);
    }

    @PostMapping
    public ObjectControl createObjectControl(@RequestBody ObjectControl objectControl) {
        return objectControlService.saveObjectControl(objectControl);
    }

    @PutMapping("/{id}")
    public ObjectControl updateObjectControl(@PathVariable Integer id, @RequestBody ObjectControl objectControl) {
        objectControl.setObjectControlId(id);
        return objectControlService.saveObjectControl(objectControl);
    }

    @DeleteMapping("/{id}")
    public void deleteObjectControl(@PathVariable Integer id) {
        objectControlService.deleteObjectControl(id);
    }
}
