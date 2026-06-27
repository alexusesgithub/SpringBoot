package com.ngp.projectspring;

import com.ngp.projectspring.entities.tracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
public interface trackerRepository extends JpaRepository<tracker,Integer> {

}
