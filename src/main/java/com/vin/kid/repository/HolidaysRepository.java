package com.vin.kid.repository;

import com.vin.kid.model.Holiday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HolidaysRepository extends JpaRepository<Holiday, String> {
}
