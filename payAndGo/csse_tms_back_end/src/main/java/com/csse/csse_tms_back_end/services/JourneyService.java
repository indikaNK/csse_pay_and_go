package com.csse.csse_tms_back_end.services;

import com.csse.csse_tms_back_end.exceptions.JourneyIdException;
import com.csse.csse_tms_back_end.exceptions.PassengerIdException;
import com.csse.csse_tms_back_end.model.Journey;
import com.csse.csse_tms_back_end.repositories.JourneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JourneyService {

    @Autowired
    private JourneyRepository journeyRepository;

    public Journey saveOrUpdateJourney(Journey journey){

        try{
            journey.setJourneyIdentifier(journey.getJourneyIdentifier().toUpperCase());
            return journeyRepository.save(journey);
        }catch (Exception e){
            throw new JourneyIdException("Journey ID '"+journey.getJourneyIdentifier().toUpperCase()+"' already exists");
        }
    }

    public Iterable<Journey> findAllJournies(){
        return journeyRepository.findAll();
    }
}
