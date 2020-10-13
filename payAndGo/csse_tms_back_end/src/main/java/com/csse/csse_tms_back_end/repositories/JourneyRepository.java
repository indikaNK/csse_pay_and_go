package com.csse.csse_tms_back_end.repositories;

import com.csse.csse_tms_back_end.model.Journey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JourneyRepository extends CrudRepository<Journey, Long> {

    @Override
    Iterable<Journey> findAll();
}
