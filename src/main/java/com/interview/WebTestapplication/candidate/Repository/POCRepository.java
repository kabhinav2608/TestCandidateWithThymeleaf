package com.interview.WebTestapplication.candidate.Repository;

import com.interview.WebTestapplication.candidate.Entity.POC;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface POCRepository extends CrudRepository<POC, Long> {
    List<POC> findByFullName(String fullName);

    List<POC> findByService(String service);
}
