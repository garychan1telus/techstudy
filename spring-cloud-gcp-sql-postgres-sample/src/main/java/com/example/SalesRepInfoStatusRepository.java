package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

/** A sample repository for House entities. */
public interface SalesRepInfoStatusRepository extends JpaRepository<SalesRepInfoStatus, Long> {
}