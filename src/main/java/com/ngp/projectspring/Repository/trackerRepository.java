package com.ngp.projectspring.Repository;

import com.ngp.projectspring.entities.tracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface trackerRepository extends JpaRepository<tracker,Integer> {

}
