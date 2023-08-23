package com.formation.TPFormation.persistence.repository;
import com.formation.TPFormation.persistence.entity.POI;
import org.springframework.data.jpa.repository.JpaRepository;

public interface POIRepository extends JpaRepository<POI, Long> {
}
