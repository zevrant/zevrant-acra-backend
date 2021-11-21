package com.zevrant.services.zevrantacrabackend.repositories;

import com.zevrant.services.zevrantacrabackend.entities.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ReportsRepository extends JpaRepository<Report, UUID> {
}
