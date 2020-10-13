package com.csse.csse_tms_back_end.web;

import com.csse.csse_tms_back_end.model.Journey;
import com.csse.csse_tms_back_end.model.Passenger;
import com.csse.csse_tms_back_end.services.JourneyService;
import com.csse.csse_tms_back_end.services.MapValidationErrorService;
import com.csse.csse_tms_back_end.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/journey")
@CrossOrigin
public class JourneyController {

    @Autowired
    private JourneyService journeyService;

    @Autowired
    private MapValidationErrorService mapValidationErrorService;

    @PostMapping("")
    public ResponseEntity<?> createNewJourney(@Valid @RequestBody Journey journey, BindingResult result){

        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if(errorMap!=null) return errorMap;

        Journey journeyObj = journeyService.saveOrUpdateJourney(journey);
        return new ResponseEntity<Journey>(journeyObj, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public Iterable<Journey> getAllJournies(){return journeyService.findAllJournies();}

}
