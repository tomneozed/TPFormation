package com.formation.TPFormation.controllers;

import com.formation.TPFormation.exceptions.NotFoundException;
import com.formation.TPFormation.persistence.entity.POI;
import com.formation.TPFormation.persistence.repository.POIRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/poi")
public class POIController {

    private final POIRepository poiRepository;

    public POIController(POIRepository poiRepository) {
        this.poiRepository = poiRepository;
    }

    @PostMapping
    POI save(@RequestBody POI entity) {
        return poiRepository.save(entity);
    }

    @GetMapping(path = "/{id}")
    POI findOne(@PathVariable(name = "id") Long id) {
        return poiRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("POI d'id " + id + " n'existe pas"));
    }

    @GetMapping
    List<POI> findAll() {
        return poiRepository.findAll();
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    void delete(@PathVariable(name = "id") Long id) {
        POI poi = poiRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("POI d'id " + id + " n'existe pas"));
        poiRepository.delete(poi);

        // poiRepository.deleteById(id);
    }
}
